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
import io.swagger.client.model.QuiesceDetails;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Deployment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-15T10:53:27.384Z")
public class Deployment {
  @SerializedName("name")
  private String name = null;

  /**
   * Deployment type
   */
  @JsonAdapter(DeploymentTypeEnum.Adapter.class)
  public enum DeploymentTypeEnum {
    UNKNOWN("unknown"),
    
    STATELESS("stateless"),
    
    STATEFUL("stateful"),
    
    MIRROR("mirror"),
    
    WEB("web"),
    
    UNIVERSAL("universal"),
    
    GATEWAY("gateway");

    private String value;

    DeploymentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeploymentTypeEnum fromValue(String text) {
      for (DeploymentTypeEnum b : DeploymentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeploymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeploymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeploymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeploymentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("deploymentType")
  private DeploymentTypeEnum deploymentType = null;

  @SerializedName("resource")
  private String resource = null;

  @SerializedName("topology")
  private DeploymentTopology topology = null;

  @SerializedName("sla")
  private DeploymentSLA sla = null;

  @SerializedName("spaces")
  private List<String> spaces = new ArrayList<String>();

  @SerializedName("scalable")
  private Boolean scalable = null;

  /**
   * Deployment status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NA("NA"),
    
    UNDEPLOYED("undeployed"),
    
    SCHEDULED("scheduled"),
    
    DEPLOYED("deployed"),
    
    BROKEN("broken"),
    
    COMPROMISED("compromised"),
    
    INTACT("intact");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("quiesceDetails")
  private QuiesceDetails quiesceDetails = null;

  @SerializedName("instances")
  private List<String> instances = new ArrayList<String>();

  public Deployment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Deployment name (unique)
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Deployment name (unique)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Deployment deploymentType(DeploymentTypeEnum deploymentType) {
    this.deploymentType = deploymentType;
    return this;
  }

   /**
   * Deployment type
   * @return deploymentType
  **/
  @ApiModelProperty(required = true, value = "Deployment type")
  public DeploymentTypeEnum getDeploymentType() {
    return deploymentType;
  }

  public void setDeploymentType(DeploymentTypeEnum deploymentType) {
    this.deploymentType = deploymentType;
  }

  public Deployment resource(String resource) {
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

  public Deployment topology(DeploymentTopology topology) {
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

  public Deployment sla(DeploymentSLA sla) {
    this.sla = sla;
    return this;
  }

   /**
   * Get sla
   * @return sla
  **/
  @ApiModelProperty(required = true, value = "")
  public DeploymentSLA getSla() {
    return sla;
  }

  public void setSla(DeploymentSLA sla) {
    this.sla = sla;
  }

  public Deployment spaces(List<String> spaces) {
    this.spaces = spaces;
    return this;
  }

  public Deployment addSpacesItem(String spacesItem) {
    this.spaces.add(spacesItem);
    return this;
  }

   /**
   * The names of spaces which were deployed within this deployment
   * @return spaces
  **/
  @ApiModelProperty(required = true, value = "The names of spaces which were deployed within this deployment")
  public List<String> getSpaces() {
    return spaces;
  }

  public void setSpaces(List<String> spaces) {
    this.spaces = spaces;
  }

  public Deployment scalable(Boolean scalable) {
    this.scalable = scalable;
    return this;
  }

   /**
   * Indicates if instances can be incremented/decremented on this deployment
   * @return scalable
  **/
  @ApiModelProperty(required = true, value = "Indicates if instances can be incremented/decremented on this deployment")
  public Boolean getScalable() {
    return scalable;
  }

  public void setScalable(Boolean scalable) {
    this.scalable = scalable;
  }

  public Deployment status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Deployment status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Deployment status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Deployment quiesceDetails(QuiesceDetails quiesceDetails) {
    this.quiesceDetails = quiesceDetails;
    return this;
  }

   /**
   * Get quiesceDetails
   * @return quiesceDetails
  **/
  @ApiModelProperty(required = true, value = "")
  public QuiesceDetails getQuiesceDetails() {
    return quiesceDetails;
  }

  public void setQuiesceDetails(QuiesceDetails quiesceDetails) {
    this.quiesceDetails = quiesceDetails;
  }

  public Deployment instances(List<String> instances) {
    this.instances = instances;
    return this;
  }

  public Deployment addInstancesItem(String instancesItem) {
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * List of this deployment&#39;s active instances
   * @return instances
  **/
  @ApiModelProperty(required = true, value = "List of this deployment's active instances")
  public List<String> getInstances() {
    return instances;
  }

  public void setInstances(List<String> instances) {
    this.instances = instances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deployment deployment = (Deployment) o;
    return Objects.equals(this.name, deployment.name) &&
        Objects.equals(this.deploymentType, deployment.deploymentType) &&
        Objects.equals(this.resource, deployment.resource) &&
        Objects.equals(this.topology, deployment.topology) &&
        Objects.equals(this.sla, deployment.sla) &&
        Objects.equals(this.spaces, deployment.spaces) &&
        Objects.equals(this.scalable, deployment.scalable) &&
        Objects.equals(this.status, deployment.status) &&
        Objects.equals(this.quiesceDetails, deployment.quiesceDetails) &&
        Objects.equals(this.instances, deployment.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, deploymentType, resource, topology, sla, spaces, scalable, status, quiesceDetails, instances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deployment {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deploymentType: ").append(toIndentedString(deploymentType)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    sla: ").append(toIndentedString(sla)).append("\n");
    sb.append("    spaces: ").append(toIndentedString(spaces)).append("\n");
    sb.append("    scalable: ").append(toIndentedString(scalable)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    quiesceDetails: ").append(toIndentedString(quiesceDetails)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
