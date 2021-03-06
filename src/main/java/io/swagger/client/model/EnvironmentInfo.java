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
 * EnvironmentInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-15T10:53:27.384Z")
public class EnvironmentInfo {
  @SerializedName("version")
  private String version = null;

  @SerializedName("build")
  private String build = null;

  @SerializedName("revision")
  private String revision = null;

  @SerializedName("startedOn")
  private String startedOn = null;

  @SerializedName("lookupGroups")
  private String lookupGroups = null;

  @SerializedName("managers")
  private List<String> managers = new ArrayList<String>();

  public EnvironmentInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public EnvironmentInfo build(String build) {
    this.build = build;
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBuild() {
    return build;
  }

  public void setBuild(String build) {
    this.build = build;
  }

  public EnvironmentInfo revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public EnvironmentInfo startedOn(String startedOn) {
    this.startedOn = startedOn;
    return this;
  }

   /**
   * Get startedOn
   * @return startedOn
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStartedOn() {
    return startedOn;
  }

  public void setStartedOn(String startedOn) {
    this.startedOn = startedOn;
  }

  public EnvironmentInfo lookupGroups(String lookupGroups) {
    this.lookupGroups = lookupGroups;
    return this;
  }

   /**
   * Get lookupGroups
   * @return lookupGroups
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLookupGroups() {
    return lookupGroups;
  }

  public void setLookupGroups(String lookupGroups) {
    this.lookupGroups = lookupGroups;
  }

  public EnvironmentInfo managers(List<String> managers) {
    this.managers = managers;
    return this;
  }

  public EnvironmentInfo addManagersItem(String managersItem) {
    this.managers.add(managersItem);
    return this;
  }

   /**
   * Get managers
   * @return managers
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getManagers() {
    return managers;
  }

  public void setManagers(List<String> managers) {
    this.managers = managers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentInfo environmentInfo = (EnvironmentInfo) o;
    return Objects.equals(this.version, environmentInfo.version) &&
        Objects.equals(this.build, environmentInfo.build) &&
        Objects.equals(this.revision, environmentInfo.revision) &&
        Objects.equals(this.startedOn, environmentInfo.startedOn) &&
        Objects.equals(this.lookupGroups, environmentInfo.lookupGroups) &&
        Objects.equals(this.managers, environmentInfo.managers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, build, revision, startedOn, lookupGroups, managers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentInfo {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    lookupGroups: ").append(toIndentedString(lookupGroups)).append("\n");
    sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
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

