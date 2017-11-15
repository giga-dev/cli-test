package org.niv;

import io.swagger.client.Configuration;

public abstract class InsightEdgeRestCommand extends CliCommand {
    @Override
    protected void beforeExecute() {
        super.beforeExecute();
        // TODO: get base path and port from gs config
        String basePath = "http://localhost:8090/v1";
        Configuration.getDefaultApiClient().setBasePath(basePath);
        // todo: Configure additional settings (e.g. username password)
    }
}
