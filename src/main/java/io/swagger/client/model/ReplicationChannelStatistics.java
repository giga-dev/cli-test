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

/**
 * ReplicationChannelStatistics
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-15T10:53:27.384Z")
public class ReplicationChannelStatistics {
  @SerializedName("lastKeyToReplicate")
  private Long lastKeyToReplicate = null;

  @SerializedName("lastConfirmedKeyFromTarget")
  private Long lastConfirmedKeyFromTarget = null;

  /**
   * The replication channel state
   */
  @JsonAdapter(ChannelStateEnum.Adapter.class)
  public enum ChannelStateEnum {
    DISCONNECTED("DISCONNECTED"),
    
    CONNECTED("CONNECTED"),
    
    ACTIVE("ACTIVE");

    private String value;

    ChannelStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelStateEnum fromValue(String text) {
      for (ChannelStateEnum b : ChannelStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChannelStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChannelStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("channelState")
  private ChannelStateEnum channelState = null;

  /**
   * The replication mode
   */
  @JsonAdapter(ReplicationModeEnum.Adapter.class)
  public enum ReplicationModeEnum {
    SYNC("SYNC"),
    
    ASYNC("ASYNC"),
    
    MIRROR("MIRROR"),
    
    BACKUP_SPACE("BACKUP_SPACE"),
    
    ACTIVE_SPACE("ACTIVE_SPACE"),
    
    LOCAL_VIEW("LOCAL_VIEW"),
    
    GATEWAY("GATEWAY"),
    
    DURABLE_NOTIFICATION("DURABLE_NOTIFICATION");

    private String value;

    ReplicationModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReplicationModeEnum fromValue(String text) {
      for (ReplicationModeEnum b : ReplicationModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReplicationModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReplicationModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReplicationModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReplicationModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("replicationMode")
  private ReplicationModeEnum replicationMode = null;

  @SerializedName("throughput")
  private Integer throughput = null;

  @SerializedName("totalNumberOfReplicatedPackets")
  private Long totalNumberOfReplicatedPackets = null;

  @SerializedName("inconsistencyReason")
  private String inconsistencyReason = null;

  @SerializedName("generatedTrafficBytes")
  private Long generatedTrafficBytes = null;

  @SerializedName("receivedTrafficBytes")
  private Long receivedTrafficBytes = null;

  @SerializedName("generatedTrafficTP")
  private Long generatedTrafficTP = null;

  @SerializedName("receivedTrafficTP")
  private Long receivedTrafficTP = null;

  @SerializedName("generatedTrafficPerPacket")
  private Long generatedTrafficPerPacket = null;

  @SerializedName("redologRetainedSize")
  private Long redologRetainedSize = null;

  @SerializedName("redologRetainedWeight")
  private Long redologRetainedWeight = null;

  /**
   * The current mode this channel is operating in
   */
  @JsonAdapter(OperatingModeEnum.Adapter.class)
  public enum OperatingModeEnum {
    SYNC("SYNC"),
    
    ASYNC("ASYNC"),
    
    RELIABLE_ASYNC("RELIABLE_ASYNC");

    private String value;

    OperatingModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatingModeEnum fromValue(String text) {
      for (OperatingModeEnum b : OperatingModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperatingModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatingModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatingModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperatingModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("operatingMode")
  private OperatingModeEnum operatingMode = null;

  public ReplicationChannelStatistics lastKeyToReplicate(Long lastKeyToReplicate) {
    this.lastKeyToReplicate = lastKeyToReplicate;
    return this;
  }

   /**
   * The key of the last packet sent to target
   * @return lastKeyToReplicate
  **/
  @ApiModelProperty(required = true, value = "The key of the last packet sent to target")
  public Long getLastKeyToReplicate() {
    return lastKeyToReplicate;
  }

  public void setLastKeyToReplicate(Long lastKeyToReplicate) {
    this.lastKeyToReplicate = lastKeyToReplicate;
  }

  public ReplicationChannelStatistics lastConfirmedKeyFromTarget(Long lastConfirmedKeyFromTarget) {
    this.lastConfirmedKeyFromTarget = lastConfirmedKeyFromTarget;
    return this;
  }

   /**
   * The key of the last packet confirmed by target
   * @return lastConfirmedKeyFromTarget
  **/
  @ApiModelProperty(required = true, value = "The key of the last packet confirmed by target")
  public Long getLastConfirmedKeyFromTarget() {
    return lastConfirmedKeyFromTarget;
  }

  public void setLastConfirmedKeyFromTarget(Long lastConfirmedKeyFromTarget) {
    this.lastConfirmedKeyFromTarget = lastConfirmedKeyFromTarget;
  }

  public ReplicationChannelStatistics channelState(ChannelStateEnum channelState) {
    this.channelState = channelState;
    return this;
  }

   /**
   * The replication channel state
   * @return channelState
  **/
  @ApiModelProperty(required = true, value = "The replication channel state")
  public ChannelStateEnum getChannelState() {
    return channelState;
  }

  public void setChannelState(ChannelStateEnum channelState) {
    this.channelState = channelState;
  }

  public ReplicationChannelStatistics replicationMode(ReplicationModeEnum replicationMode) {
    this.replicationMode = replicationMode;
    return this;
  }

   /**
   * The replication mode
   * @return replicationMode
  **/
  @ApiModelProperty(required = true, value = "The replication mode")
  public ReplicationModeEnum getReplicationMode() {
    return replicationMode;
  }

  public void setReplicationMode(ReplicationModeEnum replicationMode) {
    this.replicationMode = replicationMode;
  }

  public ReplicationChannelStatistics throughput(Integer throughput) {
    this.throughput = throughput;
    return this;
  }

   /**
   * The current rate of packet being sent per second
   * @return throughput
  **/
  @ApiModelProperty(required = true, value = "The current rate of packet being sent per second")
  public Integer getThroughput() {
    return throughput;
  }

  public void setThroughput(Integer throughput) {
    this.throughput = throughput;
  }

  public ReplicationChannelStatistics totalNumberOfReplicatedPackets(Long totalNumberOfReplicatedPackets) {
    this.totalNumberOfReplicatedPackets = totalNumberOfReplicatedPackets;
    return this;
  }

   /**
   * An approximation of the total number of replicated packets through this channel
   * @return totalNumberOfReplicatedPackets
  **/
  @ApiModelProperty(required = true, value = "An approximation of the total number of replicated packets through this channel")
  public Long getTotalNumberOfReplicatedPackets() {
    return totalNumberOfReplicatedPackets;
  }

  public void setTotalNumberOfReplicatedPackets(Long totalNumberOfReplicatedPackets) {
    this.totalNumberOfReplicatedPackets = totalNumberOfReplicatedPackets;
  }

  public ReplicationChannelStatistics inconsistencyReason(String inconsistencyReason) {
    this.inconsistencyReason = inconsistencyReason;
    return this;
  }

   /**
   * The channel inconsistency reason or null if the channel is consistent
   * @return inconsistencyReason
  **/
  @ApiModelProperty(required = true, value = "The channel inconsistency reason or null if the channel is consistent")
  public String getInconsistencyReason() {
    return inconsistencyReason;
  }

  public void setInconsistencyReason(String inconsistencyReason) {
    this.inconsistencyReason = inconsistencyReason;
  }

  public ReplicationChannelStatistics generatedTrafficBytes(Long generatedTrafficBytes) {
    this.generatedTrafficBytes = generatedTrafficBytes;
    return this;
  }

   /**
   * The total number of bytes sent
   * @return generatedTrafficBytes
  **/
  @ApiModelProperty(required = true, value = "The total number of bytes sent")
  public Long getGeneratedTrafficBytes() {
    return generatedTrafficBytes;
  }

  public void setGeneratedTrafficBytes(Long generatedTrafficBytes) {
    this.generatedTrafficBytes = generatedTrafficBytes;
  }

  public ReplicationChannelStatistics receivedTrafficBytes(Long receivedTrafficBytes) {
    this.receivedTrafficBytes = receivedTrafficBytes;
    return this;
  }

   /**
   * The total number of bytes received
   * @return receivedTrafficBytes
  **/
  @ApiModelProperty(required = true, value = "The total number of bytes received")
  public Long getReceivedTrafficBytes() {
    return receivedTrafficBytes;
  }

  public void setReceivedTrafficBytes(Long receivedTrafficBytes) {
    this.receivedTrafficBytes = receivedTrafficBytes;
  }

  public ReplicationChannelStatistics generatedTrafficTP(Long generatedTrafficTP) {
    this.generatedTrafficTP = generatedTrafficTP;
    return this;
  }

   /**
   * The current rate of bytes being sent per second
   * @return generatedTrafficTP
  **/
  @ApiModelProperty(required = true, value = "The current rate of bytes being sent per second")
  public Long getGeneratedTrafficTP() {
    return generatedTrafficTP;
  }

  public void setGeneratedTrafficTP(Long generatedTrafficTP) {
    this.generatedTrafficTP = generatedTrafficTP;
  }

  public ReplicationChannelStatistics receivedTrafficTP(Long receivedTrafficTP) {
    this.receivedTrafficTP = receivedTrafficTP;
    return this;
  }

   /**
   * The current rate of bytes being received per second
   * @return receivedTrafficTP
  **/
  @ApiModelProperty(required = true, value = "The current rate of bytes being received per second")
  public Long getReceivedTrafficTP() {
    return receivedTrafficTP;
  }

  public void setReceivedTrafficTP(Long receivedTrafficTP) {
    this.receivedTrafficTP = receivedTrafficTP;
  }

  public ReplicationChannelStatistics generatedTrafficPerPacket(Long generatedTrafficPerPacket) {
    this.generatedTrafficPerPacket = generatedTrafficPerPacket;
    return this;
  }

   /**
   * The current rate of bytes being sent per replication packet
   * @return generatedTrafficPerPacket
  **/
  @ApiModelProperty(required = true, value = "The current rate of bytes being sent per replication packet")
  public Long getGeneratedTrafficPerPacket() {
    return generatedTrafficPerPacket;
  }

  public void setGeneratedTrafficPerPacket(Long generatedTrafficPerPacket) {
    this.generatedTrafficPerPacket = generatedTrafficPerPacket;
  }

  public ReplicationChannelStatistics redologRetainedSize(Long redologRetainedSize) {
    this.redologRetainedSize = redologRetainedSize;
    return this;
  }

   /**
   * The number of packets that are kept in the redolog for this channel
   * @return redologRetainedSize
  **/
  @ApiModelProperty(required = true, value = "The number of packets that are kept in the redolog for this channel")
  public Long getRedologRetainedSize() {
    return redologRetainedSize;
  }

  public void setRedologRetainedSize(Long redologRetainedSize) {
    this.redologRetainedSize = redologRetainedSize;
  }

  public ReplicationChannelStatistics redologRetainedWeight(Long redologRetainedWeight) {
    this.redologRetainedWeight = redologRetainedWeight;
    return this;
  }

   /**
   * The accumulated weight of packets that are kept in the redolog for this channel
   * @return redologRetainedWeight
  **/
  @ApiModelProperty(required = true, value = "The accumulated weight of packets that are kept in the redolog for this channel")
  public Long getRedologRetainedWeight() {
    return redologRetainedWeight;
  }

  public void setRedologRetainedWeight(Long redologRetainedWeight) {
    this.redologRetainedWeight = redologRetainedWeight;
  }

  public ReplicationChannelStatistics operatingMode(OperatingModeEnum operatingMode) {
    this.operatingMode = operatingMode;
    return this;
  }

   /**
   * The current mode this channel is operating in
   * @return operatingMode
  **/
  @ApiModelProperty(required = true, value = "The current mode this channel is operating in")
  public OperatingModeEnum getOperatingMode() {
    return operatingMode;
  }

  public void setOperatingMode(OperatingModeEnum operatingMode) {
    this.operatingMode = operatingMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplicationChannelStatistics replicationChannelStatistics = (ReplicationChannelStatistics) o;
    return Objects.equals(this.lastKeyToReplicate, replicationChannelStatistics.lastKeyToReplicate) &&
        Objects.equals(this.lastConfirmedKeyFromTarget, replicationChannelStatistics.lastConfirmedKeyFromTarget) &&
        Objects.equals(this.channelState, replicationChannelStatistics.channelState) &&
        Objects.equals(this.replicationMode, replicationChannelStatistics.replicationMode) &&
        Objects.equals(this.throughput, replicationChannelStatistics.throughput) &&
        Objects.equals(this.totalNumberOfReplicatedPackets, replicationChannelStatistics.totalNumberOfReplicatedPackets) &&
        Objects.equals(this.inconsistencyReason, replicationChannelStatistics.inconsistencyReason) &&
        Objects.equals(this.generatedTrafficBytes, replicationChannelStatistics.generatedTrafficBytes) &&
        Objects.equals(this.receivedTrafficBytes, replicationChannelStatistics.receivedTrafficBytes) &&
        Objects.equals(this.generatedTrafficTP, replicationChannelStatistics.generatedTrafficTP) &&
        Objects.equals(this.receivedTrafficTP, replicationChannelStatistics.receivedTrafficTP) &&
        Objects.equals(this.generatedTrafficPerPacket, replicationChannelStatistics.generatedTrafficPerPacket) &&
        Objects.equals(this.redologRetainedSize, replicationChannelStatistics.redologRetainedSize) &&
        Objects.equals(this.redologRetainedWeight, replicationChannelStatistics.redologRetainedWeight) &&
        Objects.equals(this.operatingMode, replicationChannelStatistics.operatingMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastKeyToReplicate, lastConfirmedKeyFromTarget, channelState, replicationMode, throughput, totalNumberOfReplicatedPackets, inconsistencyReason, generatedTrafficBytes, receivedTrafficBytes, generatedTrafficTP, receivedTrafficTP, generatedTrafficPerPacket, redologRetainedSize, redologRetainedWeight, operatingMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplicationChannelStatistics {\n");
    
    sb.append("    lastKeyToReplicate: ").append(toIndentedString(lastKeyToReplicate)).append("\n");
    sb.append("    lastConfirmedKeyFromTarget: ").append(toIndentedString(lastConfirmedKeyFromTarget)).append("\n");
    sb.append("    channelState: ").append(toIndentedString(channelState)).append("\n");
    sb.append("    replicationMode: ").append(toIndentedString(replicationMode)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
    sb.append("    totalNumberOfReplicatedPackets: ").append(toIndentedString(totalNumberOfReplicatedPackets)).append("\n");
    sb.append("    inconsistencyReason: ").append(toIndentedString(inconsistencyReason)).append("\n");
    sb.append("    generatedTrafficBytes: ").append(toIndentedString(generatedTrafficBytes)).append("\n");
    sb.append("    receivedTrafficBytes: ").append(toIndentedString(receivedTrafficBytes)).append("\n");
    sb.append("    generatedTrafficTP: ").append(toIndentedString(generatedTrafficTP)).append("\n");
    sb.append("    receivedTrafficTP: ").append(toIndentedString(receivedTrafficTP)).append("\n");
    sb.append("    generatedTrafficPerPacket: ").append(toIndentedString(generatedTrafficPerPacket)).append("\n");
    sb.append("    redologRetainedSize: ").append(toIndentedString(redologRetainedSize)).append("\n");
    sb.append("    redologRetainedWeight: ").append(toIndentedString(redologRetainedWeight)).append("\n");
    sb.append("    operatingMode: ").append(toIndentedString(operatingMode)).append("\n");
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

