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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SparkApplicationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-15T10:53:27.384Z")

public class SparkApplicationRequest {
  @SerializedName("mainClass")
  private String mainClass = null;

  @SerializedName("applicationJar")
  private String applicationJar = null;

  @SerializedName("applicationArguments")
  private List<String> applicationArguments = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sparkProperties")
  private Map<String, String> sparkProperties = null;

  public SparkApplicationRequest mainClass(String mainClass) {
    this.mainClass = mainClass;
    return this;
  }

   /**
   * Main class in jar
   * @return mainClass
  **/
  @ApiModelProperty(required = true, value = "Main class in jar")
  public String getMainClass() {
    return mainClass;
  }

  public void setMainClass(String mainClass) {
    this.mainClass = mainClass;
  }

  public SparkApplicationRequest applicationJar(String applicationJar) {
    this.applicationJar = applicationJar;
    return this;
  }

   /**
   * path to jar job
   * @return applicationJar
  **/
  @ApiModelProperty(required = true, value = "path to jar job")
  public String getApplicationJar() {
    return applicationJar;
  }

  public void setApplicationJar(String applicationJar) {
    this.applicationJar = applicationJar;
  }

  public SparkApplicationRequest applicationArguments(List<String> applicationArguments) {
    this.applicationArguments = applicationArguments;
    return this;
  }

  public SparkApplicationRequest addApplicationArgumentsItem(String applicationArgumentsItem) {
    if (this.applicationArguments == null) {
      this.applicationArguments = new ArrayList<String>();
    }
    this.applicationArguments.add(applicationArgumentsItem);
    return this;
  }

   /**
   * List of args to the application
   * @return applicationArguments
  **/
  @ApiModelProperty(value = "List of args to the application")
  public List<String> getApplicationArguments() {
    return applicationArguments;
  }

  public void setApplicationArguments(List<String> applicationArguments) {
    this.applicationArguments = applicationArguments;
  }

  public SparkApplicationRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Spark app name
   * @return name
  **/
  @ApiModelProperty(value = "Spark app name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SparkApplicationRequest sparkProperties(Map<String, String> sparkProperties) {
    this.sparkProperties = sparkProperties;
    return this;
  }

  public SparkApplicationRequest putSparkPropertiesItem(String key, String sparkPropertiesItem) {
    if (this.sparkProperties == null) {
      this.sparkProperties = new HashMap<String, String>();
    }
    this.sparkProperties.put(key, sparkPropertiesItem);
    return this;
  }

   /**
   * Spark configurations
   * @return sparkProperties
  **/
  @ApiModelProperty(value = "Spark configurations")
  public Map<String, String> getSparkProperties() {
    return sparkProperties;
  }

  public void setSparkProperties(Map<String, String> sparkProperties) {
    this.sparkProperties = sparkProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SparkApplicationRequest sparkApplicationRequest = (SparkApplicationRequest) o;
    return Objects.equals(this.mainClass, sparkApplicationRequest.mainClass) &&
        Objects.equals(this.applicationJar, sparkApplicationRequest.applicationJar) &&
        Objects.equals(this.applicationArguments, sparkApplicationRequest.applicationArguments) &&
        Objects.equals(this.name, sparkApplicationRequest.name) &&
        Objects.equals(this.sparkProperties, sparkApplicationRequest.sparkProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainClass, applicationJar, applicationArguments, name, sparkProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SparkApplicationRequest {\n");
    
    sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
    sb.append("    applicationJar: ").append(toIndentedString(applicationJar)).append("\n");
    sb.append("    applicationArguments: ").append(toIndentedString(applicationArguments)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sparkProperties: ").append(toIndentedString(sparkProperties)).append("\n");
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

