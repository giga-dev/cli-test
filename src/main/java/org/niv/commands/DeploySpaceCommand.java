package org.niv.commands;

import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.RequestsApi;
import io.swagger.client.api.SpacesApi;
import io.swagger.client.model.Request;
import org.niv.InsightEdgeRestCommand;
import picocli.CommandLine.*;

@Command(name="deploy-space", header = "Deploys a space with the specified name and partitions/backups (Optional)")
public class DeploySpaceCommand extends InsightEdgeRestCommand {

    @Option(names = "--partitions", description = "Number of partitions")
    private Integer partitions;
    @Option(names = "--backups", description = "Should backups be used")
    private boolean backups;
    @Parameters(index = "0", description = "Name of space to deploy")
    private String spaceName;

    @Override
    protected void execute() throws Exception {
        System.out.println("deploy-space: partitions=" + partitions + " backups=" + backups + " " + spaceName);
        // Submit request:
        // TODO: Problem in generated code - manually modified long to string.
        ApiResponse<String> response = new SpacesApi().spacesPostWithHttpInfo(spaceName, partitions, backups, null);
        if (response.getStatusCode() == 202) {
            String requestId = response.getData();
            System.out.println("Submitted deploy space request, waiting for completion (requestId=" + requestId + ")..,");
            // TODO: Timeout
            // Wait for completion:
            Request request = waitForCompletion(requestId);
            // TODO: assert request completed successfully
            System.out.println("Request completed: " + request);
        } else {
            System.out.println("Unexpected HTTP response code: " + response.getStatusCode());
        }
    }

    private Request waitForCompletion(String requestId) throws ApiException, InterruptedException {
        // TODO: Add timeout notion
        int attempts = 0;
        long startTime = System.currentTimeMillis();
        while (true) {
            Request request = getRequest(requestId);
            attempts++;
            long duration = System.currentTimeMillis() - startTime;
            // TODO: bug in request status completed due to indescreprency in enum
            if (request.getCompletedAt() != null)
                return request;
            System.out.println("Request is " + request.getStatus() +
                    " (attempts=" + attempts +
                    ", duration=" + duration +
                    ", " + request.getResult() +
                    ")");
            Thread.sleep(1000);
        }
    }

    private Request getRequest(String requestId) throws ApiException {
        ApiResponse<Request> response = new RequestsApi().requestsIdGetWithHttpInfo(requestId);
        // TODO: Assert response.getStatusCode() == 200
        return response.getData();
    }
}
