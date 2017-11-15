package org.niv.commands;

import io.swagger.client.ApiResponse;
import io.swagger.client.api.DeploymentsApi;
import org.niv.CliCommand;
import org.niv.InsightEdgeRestCommand;
import picocli.CommandLine.*;

import java.io.File;

@Command(name="upload-resource", header = "Uploads the specified resource to the manager")
public class UploadResourceCommand extends InsightEdgeRestCommand {
    @Parameters(arity = "1..*", description = "File(s) to upload")
    File[] files;

    @Override
    protected void execute() throws Exception {
        for (int i=0 ; i < files.length ; i++) {
            File file = files[i];
            System.out.println("Uploading resource " + (i+1) + " of " + files.length + ": " + file);
            ApiResponse<Void> response = new DeploymentsApi().deploymentsResourcesPutWithHttpInfo(file);
            System.out.println("response code: " + response.getStatusCode());
        }
    }
}
