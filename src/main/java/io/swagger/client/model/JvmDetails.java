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
 * JvmDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-15T10:53:27.384Z")
public class JvmDetails {
  @SerializedName("startTime")
  private Long startTime = null;

  @SerializedName("jmxUrl")
  private String jmxUrl = null;

  @SerializedName("vmName")
  private String vmName = null;

  @SerializedName("vmVersion")
  private String vmVersion = null;

  @SerializedName("vmVendor")
  private String vmVendor = null;

  @SerializedName("pid")
  private Long pid = null;

  @SerializedName("inputArguments")
  private List<String> inputArguments = new ArrayList<String>();

  @SerializedName("bootClassPath")
  private String bootClassPath = null;

  @SerializedName("classPath")
  private String classPath = null;

  @SerializedName("memoryHeapInitInBytes")
  private Long memoryHeapInitInBytes = null;

  @SerializedName("memoryHeapMaxInBytes")
  private Long memoryHeapMaxInBytes = null;

  @SerializedName("memoryNonHeapInitInBytes")
  private Long memoryNonHeapInitInBytes = null;

  @SerializedName("memoryNonHeapMaxInBytes")
  private Long memoryNonHeapMaxInBytes = null;

  @SerializedName("systemProperties")
  private Map<String, String> systemProperties = new HashMap<String, String>();

  @SerializedName("environmentVariables")
  private Map<String, String> environmentVariables = new HashMap<String, String>();

  public JvmDetails startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public JvmDetails jmxUrl(String jmxUrl) {
    this.jmxUrl = jmxUrl;
    return this;
  }

   /**
   * url to JMX API connector server
   * @return jmxUrl
  **/
  @ApiModelProperty(required = true, value = "url to JMX API connector server")
  public String getJmxUrl() {
    return jmxUrl;
  }

  public void setJmxUrl(String jmxUrl) {
    this.jmxUrl = jmxUrl;
  }

  public JvmDetails vmName(String vmName) {
    this.vmName = vmName;
    return this;
  }

   /**
   * virtual machine vname
   * @return vmName
  **/
  @ApiModelProperty(required = true, value = "virtual machine vname")
  public String getVmName() {
    return vmName;
  }

  public void setVmName(String vmName) {
    this.vmName = vmName;
  }

  public JvmDetails vmVersion(String vmVersion) {
    this.vmVersion = vmVersion;
    return this;
  }

   /**
   * virtual machine version
   * @return vmVersion
  **/
  @ApiModelProperty(required = true, value = "virtual machine version")
  public String getVmVersion() {
    return vmVersion;
  }

  public void setVmVersion(String vmVersion) {
    this.vmVersion = vmVersion;
  }

  public JvmDetails vmVendor(String vmVendor) {
    this.vmVendor = vmVendor;
    return this;
  }

   /**
   * virtual machine vendor
   * @return vmVendor
  **/
  @ApiModelProperty(required = true, value = "virtual machine vendor")
  public String getVmVendor() {
    return vmVendor;
  }

  public void setVmVendor(String vmVendor) {
    this.vmVendor = vmVendor;
  }

  public JvmDetails pid(Long pid) {
    this.pid = pid;
    return this;
  }

   /**
   * process id of the virtual machine
   * @return pid
  **/
  @ApiModelProperty(required = true, value = "process id of the virtual machine")
  public Long getPid() {
    return pid;
  }

  public void setPid(Long pid) {
    this.pid = pid;
  }

  public JvmDetails inputArguments(List<String> inputArguments) {
    this.inputArguments = inputArguments;
    return this;
  }

  public JvmDetails addInputArgumentsItem(String inputArgumentsItem) {
    this.inputArguments.add(inputArgumentsItem);
    return this;
  }

   /**
   * Get inputArguments
   * @return inputArguments
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getInputArguments() {
    return inputArguments;
  }

  public void setInputArguments(List<String> inputArguments) {
    this.inputArguments = inputArguments;
  }

  public JvmDetails bootClassPath(String bootClassPath) {
    this.bootClassPath = bootClassPath;
    return this;
  }

   /**
   * boot classpath
   * @return bootClassPath
  **/
  @ApiModelProperty(required = true, value = "boot classpath")
  public String getBootClassPath() {
    return bootClassPath;
  }

  public void setBootClassPath(String bootClassPath) {
    this.bootClassPath = bootClassPath;
  }

  public JvmDetails classPath(String classPath) {
    this.classPath = classPath;
    return this;
  }

   /**
   * classpath
   * @return classPath
  **/
  @ApiModelProperty(required = true, value = "classpath")
  public String getClassPath() {
    return classPath;
  }

  public void setClassPath(String classPath) {
    this.classPath = classPath;
  }

  public JvmDetails memoryHeapInitInBytes(Long memoryHeapInitInBytes) {
    this.memoryHeapInitInBytes = memoryHeapInitInBytes;
    return this;
  }

   /**
   * Get memoryHeapInitInBytes
   * @return memoryHeapInitInBytes
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getMemoryHeapInitInBytes() {
    return memoryHeapInitInBytes;
  }

  public void setMemoryHeapInitInBytes(Long memoryHeapInitInBytes) {
    this.memoryHeapInitInBytes = memoryHeapInitInBytes;
  }

  public JvmDetails memoryHeapMaxInBytes(Long memoryHeapMaxInBytes) {
    this.memoryHeapMaxInBytes = memoryHeapMaxInBytes;
    return this;
  }

   /**
   * Get memoryHeapMaxInBytes
   * @return memoryHeapMaxInBytes
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getMemoryHeapMaxInBytes() {
    return memoryHeapMaxInBytes;
  }

  public void setMemoryHeapMaxInBytes(Long memoryHeapMaxInBytes) {
    this.memoryHeapMaxInBytes = memoryHeapMaxInBytes;
  }

  public JvmDetails memoryNonHeapInitInBytes(Long memoryNonHeapInitInBytes) {
    this.memoryNonHeapInitInBytes = memoryNonHeapInitInBytes;
    return this;
  }

   /**
   * Get memoryNonHeapInitInBytes
   * @return memoryNonHeapInitInBytes
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getMemoryNonHeapInitInBytes() {
    return memoryNonHeapInitInBytes;
  }

  public void setMemoryNonHeapInitInBytes(Long memoryNonHeapInitInBytes) {
    this.memoryNonHeapInitInBytes = memoryNonHeapInitInBytes;
  }

  public JvmDetails memoryNonHeapMaxInBytes(Long memoryNonHeapMaxInBytes) {
    this.memoryNonHeapMaxInBytes = memoryNonHeapMaxInBytes;
    return this;
  }

   /**
   * Get memoryNonHeapMaxInBytes
   * @return memoryNonHeapMaxInBytes
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getMemoryNonHeapMaxInBytes() {
    return memoryNonHeapMaxInBytes;
  }

  public void setMemoryNonHeapMaxInBytes(Long memoryNonHeapMaxInBytes) {
    this.memoryNonHeapMaxInBytes = memoryNonHeapMaxInBytes;
  }

  public JvmDetails systemProperties(Map<String, String> systemProperties) {
    this.systemProperties = systemProperties;
    return this;
  }

  public JvmDetails putSystemPropertiesItem(String key, String systemPropertiesItem) {
    this.systemProperties.put(key, systemPropertiesItem);
    return this;
  }

   /**
   * Get systemProperties
   * @return systemProperties
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, String> getSystemProperties() {
    return systemProperties;
  }

  public void setSystemProperties(Map<String, String> systemProperties) {
    this.systemProperties = systemProperties;
  }

  public JvmDetails environmentVariables(Map<String, String> environmentVariables) {
    this.environmentVariables = environmentVariables;
    return this;
  }

  public JvmDetails putEnvironmentVariablesItem(String key, String environmentVariablesItem) {
    this.environmentVariables.put(key, environmentVariablesItem);
    return this;
  }

   /**
   * Get environmentVariables
   * @return environmentVariables
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, String> getEnvironmentVariables() {
    return environmentVariables;
  }

  public void setEnvironmentVariables(Map<String, String> environmentVariables) {
    this.environmentVariables = environmentVariables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JvmDetails jvmDetails = (JvmDetails) o;
    return Objects.equals(this.startTime, jvmDetails.startTime) &&
        Objects.equals(this.jmxUrl, jvmDetails.jmxUrl) &&
        Objects.equals(this.vmName, jvmDetails.vmName) &&
        Objects.equals(this.vmVersion, jvmDetails.vmVersion) &&
        Objects.equals(this.vmVendor, jvmDetails.vmVendor) &&
        Objects.equals(this.pid, jvmDetails.pid) &&
        Objects.equals(this.inputArguments, jvmDetails.inputArguments) &&
        Objects.equals(this.bootClassPath, jvmDetails.bootClassPath) &&
        Objects.equals(this.classPath, jvmDetails.classPath) &&
        Objects.equals(this.memoryHeapInitInBytes, jvmDetails.memoryHeapInitInBytes) &&
        Objects.equals(this.memoryHeapMaxInBytes, jvmDetails.memoryHeapMaxInBytes) &&
        Objects.equals(this.memoryNonHeapInitInBytes, jvmDetails.memoryNonHeapInitInBytes) &&
        Objects.equals(this.memoryNonHeapMaxInBytes, jvmDetails.memoryNonHeapMaxInBytes) &&
        Objects.equals(this.systemProperties, jvmDetails.systemProperties) &&
        Objects.equals(this.environmentVariables, jvmDetails.environmentVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, jmxUrl, vmName, vmVersion, vmVendor, pid, inputArguments, bootClassPath, classPath, memoryHeapInitInBytes, memoryHeapMaxInBytes, memoryNonHeapInitInBytes, memoryNonHeapMaxInBytes, systemProperties, environmentVariables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JvmDetails {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    jmxUrl: ").append(toIndentedString(jmxUrl)).append("\n");
    sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
    sb.append("    vmVersion: ").append(toIndentedString(vmVersion)).append("\n");
    sb.append("    vmVendor: ").append(toIndentedString(vmVendor)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    inputArguments: ").append(toIndentedString(inputArguments)).append("\n");
    sb.append("    bootClassPath: ").append(toIndentedString(bootClassPath)).append("\n");
    sb.append("    classPath: ").append(toIndentedString(classPath)).append("\n");
    sb.append("    memoryHeapInitInBytes: ").append(toIndentedString(memoryHeapInitInBytes)).append("\n");
    sb.append("    memoryHeapMaxInBytes: ").append(toIndentedString(memoryHeapMaxInBytes)).append("\n");
    sb.append("    memoryNonHeapInitInBytes: ").append(toIndentedString(memoryNonHeapInitInBytes)).append("\n");
    sb.append("    memoryNonHeapMaxInBytes: ").append(toIndentedString(memoryNonHeapMaxInBytes)).append("\n");
    sb.append("    systemProperties: ").append(toIndentedString(systemProperties)).append("\n");
    sb.append("    environmentVariables: ").append(toIndentedString(environmentVariables)).append("\n");
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

