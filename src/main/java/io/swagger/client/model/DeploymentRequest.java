/*
 * RESTful Manager API
 * This page provides an **interactive** documentation for RESTful Manager API. In addition to the typical information provided for each operation (parameters, responses, etc.), you can experiment with it by setting parameters and clicking the `Try it out!` button. The operation will be invoked, and you'll see the response code and body, as well as the `curl` command and request URL which were used to invoke the command.  Furthermore, since this API was created using [Swagger](http://swagger.io), you can also download its [specification](xap-manager-api.yaml) and use Swagger's [Online Editor](http://editor.swagger.io) to generate a client in your favorite language. 
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DeploymentSLA;
import io.swagger.client.model.DeploymentTopology;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DeploymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-15T10:53:27.384Z")

public class DeploymentRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("resource")
  private String resource = null;

  @SerializedName("topology")
  private DeploymentTopology topology = null;

  @SerializedName("sla")
  private DeploymentSLA sla = null;

  @SerializedName("contextProperties")
  private Map<String, String> contextProperties = null;

  public DeploymentRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Deployment unique name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Deployment unique name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeploymentRequest resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Name of resource which contains binary files for deployment (see /deployments/resources)
   * @return resource
  **/
  @ApiModelProperty(required = true, value = "Name of resource which contains binary files for deployment (see /deployments/resources)")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public DeploymentRequest topology(DeploymentTopology topology) {
    this.topology = topology;
    return this;
  }

   /**
   * Get topology
   * @return topology
  **/
  @ApiModelProperty(value = "")
  public DeploymentTopology getTopology() {
    return topology;
  }

  public void setTopology(DeploymentTopology topology) {
    this.topology = topology;
  }

  public DeploymentRequest sla(DeploymentSLA sla) {
    this.sla = sla;
    return this;
  }

   /**
   * Get sla
   * @return sla
  **/
  @ApiModelProperty(value = "")
  public DeploymentSLA getSla() {
    return sla;
  }

  public void setSla(DeploymentSLA sla) {
    this.sla = sla;
  }

  public DeploymentRequest contextProperties(Map<String, String> contextProperties) {
    this.contextProperties = contextProperties;
    return this;
  }

  public DeploymentRequest putContextPropertiesItem(String key, String contextPropertiesItem) {
    if (this.contextProperties == null) {
      this.contextProperties = new HashMap<String, String>();
    }
    this.contextProperties.put(key, contextPropertiesItem);
    return this;
  }

   /**
   * Context properties (overriding properties in pu.xml)
   * @return contextProperties
  **/
  @ApiModelProperty(value = "Context properties (overriding properties in pu.xml)")
  public Map<String, String> getContextProperties() {
    return contextProperties;
  }

  public void setContextProperties(Map<String, String> contextProperties) {
    this.contextProperties = contextProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentRequest deploymentRequest = (DeploymentRequest) o;
    return Objects.equals(this.name, deploymentRequest.name) &&
        Objects.equals(this.resource, deploymentRequest.resource) &&
        Objects.equals(this.topology, deploymentRequest.topology) &&
        Objects.equals(this.sla, deploymentRequest.sla) &&
        Objects.equals(this.contextProperties, deploymentRequest.contextProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, resource, topology, sla, contextProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    sla: ").append(toIndentedString(sla)).append("\n");
    sb.append("    contextProperties: ").append(toIndentedString(contextProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
