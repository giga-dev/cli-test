package org.niv.commands;

import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.InformationApi;
import io.swagger.client.model.EnvironmentInfo;
import org.niv.CliCommandException;
import org.niv.InsightEdgeRestCommand;
import picocli.CommandLine;

import java.net.ConnectException;

@CommandLine.Command(name="info", header = "Retrieves information from the management server")
public class InfoCommand extends InsightEdgeRestCommand {
    @Override
    protected void execute() throws Exception {
        try {
            ApiResponse<EnvironmentInfo> response = new InformationApi().infoGetWithHttpInfo();
            if (response.getStatusCode() == 200) {
                System.out.println(response.getData());
            } else {
                System.out.println("Unexpected HTTP response code: " + response.getStatusCode());
            }
        } catch (ApiException e) {
            if (e.getCause() instanceof ConnectException)
                throw new CliCommandException(e.getCause().getMessage()).exitCode(2);
            throw e;
        }
    }
}
