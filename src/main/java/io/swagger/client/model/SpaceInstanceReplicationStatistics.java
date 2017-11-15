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
import io.swagger.client.model.ReplicationChannels;
import java.io.IOException;

/**
 * SpaceInstanceReplicationStatistics
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-15T10:53:27.384Z")
public class SpaceInstanceReplicationStatistics {
  @SerializedName("lastKeyInRedoLog")
  private Long lastKeyInRedoLog = null;

  @SerializedName("firstKeyInRedoLog")
  private Long firstKeyInRedoLog = null;

  @SerializedName("lastConfirmedKey")
  private Long lastConfirmedKey = null;

  @SerializedName("redoLogSize")
  private Long redoLogSize = null;

  @SerializedName("memoryPacketsCount")
  private Long memoryPacketsCount = null;

  @SerializedName("externalStoragePacketsCount")
  private Long externalStoragePacketsCount = null;

  @SerializedName("externalStorageSpaceUsed")
  private Long externalStorageSpaceUsed = null;

  @SerializedName("channels")
  private ReplicationChannels channels = null;

  public SpaceInstanceReplicationStatistics lastKeyInRedoLog(Long lastKeyInRedoLog) {
    this.lastKeyInRedoLog = lastKeyInRedoLog;
    return this;
  }

   /**
   * The key of the last packet inserted into the redolog
   * @return lastKeyInRedoLog
  **/
  @ApiModelProperty(required = true, value = "The key of the last packet inserted into the redolog")
  public Long getLastKeyInRedoLog() {
    return lastKeyInRedoLog;
  }

  public void setLastKeyInRedoLog(Long lastKeyInRedoLog) {
    this.lastKeyInRedoLog = lastKeyInRedoLog;
  }

  public SpaceInstanceReplicationStatistics firstKeyInRedoLog(Long firstKeyInRedoLog) {
    this.firstKeyInRedoLog = firstKeyInRedoLog;
    return this;
  }

   /**
   * The key of the oldest packet that is kept in the redolog
   * @return firstKeyInRedoLog
  **/
  @ApiModelProperty(required = true, value = "The key of the oldest packet that is kept in the redolog")
  public Long getFirstKeyInRedoLog() {
    return firstKeyInRedoLog;
  }

  public void setFirstKeyInRedoLog(Long firstKeyInRedoLog) {
    this.firstKeyInRedoLog = firstKeyInRedoLog;
  }

  public SpaceInstanceReplicationStatistics lastConfirmedKey(Long lastConfirmedKey) {
    this.lastConfirmedKey = lastConfirmedKey;
    return this;
  }

   /**
   * The key of the most recent packet that was confirmed by some replication target
   * @return lastConfirmedKey
  **/
  @ApiModelProperty(required = true, value = "The key of the most recent packet that was confirmed by some replication target")
  public Long getLastConfirmedKey() {
    return lastConfirmedKey;
  }

  public void setLastConfirmedKey(Long lastConfirmedKey) {
    this.lastConfirmedKey = lastConfirmedKey;
  }

  public SpaceInstanceReplicationStatistics redoLogSize(Long redoLogSize) {
    this.redoLogSize = redoLogSize;
    return this;
  }

   /**
   * The accumulated weight of packets currently being kept in the redolog
   * @return redoLogSize
  **/
  @ApiModelProperty(required = true, value = "The accumulated weight of packets currently being kept in the redolog")
  public Long getRedoLogSize() {
    return redoLogSize;
  }

  public void setRedoLogSize(Long redoLogSize) {
    this.redoLogSize = redoLogSize;
  }

  public SpaceInstanceReplicationStatistics memoryPacketsCount(Long memoryPacketsCount) {
    this.memoryPacketsCount = memoryPacketsCount;
    return this;
  }

   /**
   * The number of packets currently being kept in memory
   * @return memoryPacketsCount
  **/
  @ApiModelProperty(required = true, value = "The number of packets currently being kept in memory")
  public Long getMemoryPacketsCount() {
    return memoryPacketsCount;
  }

  public void setMemoryPacketsCount(Long memoryPacketsCount) {
    this.memoryPacketsCount = memoryPacketsCount;
  }

  public SpaceInstanceReplicationStatistics externalStoragePacketsCount(Long externalStoragePacketsCount) {
    this.externalStoragePacketsCount = externalStoragePacketsCount;
    return this;
  }

   /**
   * The number of packets currently being kept in external storage
   * @return externalStoragePacketsCount
  **/
  @ApiModelProperty(required = true, value = "The number of packets currently being kept in external storage")
  public Long getExternalStoragePacketsCount() {
    return externalStoragePacketsCount;
  }

  public void setExternalStoragePacketsCount(Long externalStoragePacketsCount) {
    this.externalStoragePacketsCount = externalStoragePacketsCount;
  }

  public SpaceInstanceReplicationStatistics externalStorageSpaceUsed(Long externalStorageSpaceUsed) {
    this.externalStorageSpaceUsed = externalStorageSpaceUsed;
    return this;
  }

   /**
   * The space in bytes that consumed by packets in external storage
   * @return externalStorageSpaceUsed
  **/
  @ApiModelProperty(required = true, value = "The space in bytes that consumed by packets in external storage")
  public Long getExternalStorageSpaceUsed() {
    return externalStorageSpaceUsed;
  }

  public void setExternalStorageSpaceUsed(Long externalStorageSpaceUsed) {
    this.externalStorageSpaceUsed = externalStorageSpaceUsed;
  }

  public SpaceInstanceReplicationStatistics channels(ReplicationChannels channels) {
    this.channels = channels;
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @ApiModelProperty(required = true, value = "")
  public ReplicationChannels getChannels() {
    return channels;
  }

  public void setChannels(ReplicationChannels channels) {
    this.channels = channels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpaceInstanceReplicationStatistics spaceInstanceReplicationStatistics = (SpaceInstanceReplicationStatistics) o;
    return Objects.equals(this.lastKeyInRedoLog, spaceInstanceReplicationStatistics.lastKeyInRedoLog) &&
        Objects.equals(this.firstKeyInRedoLog, spaceInstanceReplicationStatistics.firstKeyInRedoLog) &&
        Objects.equals(this.lastConfirmedKey, spaceInstanceReplicationStatistics.lastConfirmedKey) &&
        Objects.equals(this.redoLogSize, spaceInstanceReplicationStatistics.redoLogSize) &&
        Objects.equals(this.memoryPacketsCount, spaceInstanceReplicationStatistics.memoryPacketsCount) &&
        Objects.equals(this.externalStoragePacketsCount, spaceInstanceReplicationStatistics.externalStoragePacketsCount) &&
        Objects.equals(this.externalStorageSpaceUsed, spaceInstanceReplicationStatistics.externalStorageSpaceUsed) &&
        Objects.equals(this.channels, spaceInstanceReplicationStatistics.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastKeyInRedoLog, firstKeyInRedoLog, lastConfirmedKey, redoLogSize, memoryPacketsCount, externalStoragePacketsCount, externalStorageSpaceUsed, channels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceInstanceReplicationStatistics {\n");
    
    sb.append("    lastKeyInRedoLog: ").append(toIndentedString(lastKeyInRedoLog)).append("\n");
    sb.append("    firstKeyInRedoLog: ").append(toIndentedString(firstKeyInRedoLog)).append("\n");
    sb.append("    lastConfirmedKey: ").append(toIndentedString(lastConfirmedKey)).append("\n");
    sb.append("    redoLogSize: ").append(toIndentedString(redoLogSize)).append("\n");
    sb.append("    memoryPacketsCount: ").append(toIndentedString(memoryPacketsCount)).append("\n");
    sb.append("    externalStoragePacketsCount: ").append(toIndentedString(externalStoragePacketsCount)).append("\n");
    sb.append("    externalStorageSpaceUsed: ").append(toIndentedString(externalStorageSpaceUsed)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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
