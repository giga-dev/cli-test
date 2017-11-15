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
import io.swagger.client.model.DeploymentTopology;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Space
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-15T10:53:27.384Z")
public class Space {
  @SerializedName("name")
  private String name = null;

  @SerializedName("deploymentName")
  private String deploymentName = null;

  @SerializedName("topology")
  private DeploymentTopology topology = null;

  @SerializedName("instancesIds")
  private List<String> instancesIds = new ArrayList<String>();

  public Space name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Space name (unique)
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Space name (unique)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Space deploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
    return this;
  }

   /**
   * Name of deployment which hosts this space
   * @return deploymentName
  **/
  @ApiModelProperty(required = true, value = "Name of deployment which hosts this space")
  public String getDeploymentName() {
    return deploymentName;
  }

  public void setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
  }

  public Space topology(DeploymentTopology topology) {
    this.topology = topology;
    return this;
  }

   /**
   * Get topology
   * @return topology
  **/
  @ApiModelProperty(required = true, value = "")
  public DeploymentTopology getTopology() {
    return topology;
  }

  public void setTopology(DeploymentTopology topology) {
    this.topology = topology;
  }

  public Space instancesIds(List<String> instancesIds) {
    this.instancesIds = instancesIds;
    return this;
  }

  public Space addInstancesIdsItem(String instancesIdsItem) {
    this.instancesIds.add(instancesIdsItem);
    return this;
  }

   /**
   * List of space instance ids
   * @return instancesIds
  **/
  @ApiModelProperty(required = true, value = "List of space instance ids")
  public List<String> getInstancesIds() {
    return instancesIds;
  }

  public void setInstancesIds(List<String> instancesIds) {
    this.instancesIds = instancesIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Space space = (Space) o;
    return Objects.equals(this.name, space.name) &&
        Objects.equals(this.deploymentName, space.deploymentName) &&
        Objects.equals(this.topology, space.topology) &&
        Objects.equals(this.instancesIds, space.instancesIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, deploymentName, topology, instancesIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Space {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deploymentName: ").append(toIndentedString(deploymentName)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    instancesIds: ").append(toIndentedString(instancesIds)).append("\n");
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

