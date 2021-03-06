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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateContainerRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-15T10:53:27.384Z")
public class CreateContainerRequest {
  @SerializedName("host")
  private String host = null;

  @SerializedName("memory")
  private String memory = null;

  @SerializedName("zone")
  private String zone = null;

  @SerializedName("vmArguments")
  private List<String> vmArguments = null;

  public CreateContainerRequest host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Id of host to start container on
   * @return host
  **/
  @ApiModelProperty(required = true, value = "Id of host to start container on")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public CreateContainerRequest memory(String memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Heap size
   * @return memory
  **/
  @ApiModelProperty(value = "Heap size")
  public String getMemory() {
    return memory;
  }

  public void setMemory(String memory) {
    this.memory = memory;
  }

  public CreateContainerRequest zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Zone to start in
   * @return zone
  **/
  @ApiModelProperty(value = "Zone to start in")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  public CreateContainerRequest vmArguments(List<String> vmArguments) {
    this.vmArguments = vmArguments;
    return this;
  }

  public CreateContainerRequest addVmArgumentsItem(String vmArgumentsItem) {
    if (this.vmArguments == null) {
      this.vmArguments = new ArrayList<String>();
    }
    this.vmArguments.add(vmArgumentsItem);
    return this;
  }

   /**
   * Additional VM arguments
   * @return vmArguments
  **/
  @ApiModelProperty(value = "Additional VM arguments")
  public List<String> getVmArguments() {
    return vmArguments;
  }

  public void setVmArguments(List<String> vmArguments) {
    this.vmArguments = vmArguments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContainerRequest createContainerRequest = (CreateContainerRequest) o;
    return Objects.equals(this.host, createContainerRequest.host) &&
        Objects.equals(this.memory, createContainerRequest.memory) &&
        Objects.equals(this.zone, createContainerRequest.zone) &&
        Objects.equals(this.vmArguments, createContainerRequest.vmArguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, memory, zone, vmArguments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContainerRequest {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    vmArguments: ").append(toIndentedString(vmArguments)).append("\n");
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

