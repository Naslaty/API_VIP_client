/*
 * CARMIN a Common web API for Remote pipeline INvocation
 * FLI/IAM REST API for exchanging data and remote calling pipelines.
 *
 * OpenAPI spec version: 0.2.1
 * Contact: carmin@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Execution
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T16:32:03.970+02:00")
public class Execution {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("pipelineIdentifier")
  private String pipelineIdentifier = null;

  @SerializedName("timeout")
  private Long timeout = null;

  /**
   * The status of the execution. Must always be present in responses.
   */
  public enum StatusEnum {
    @SerializedName("initializing")
    INITIALIZING("initializing"),
    
    @SerializedName("ready")
    READY("ready"),
    
    @SerializedName("running")
    RUNNING("running"),
    
    @SerializedName("finished")
    FINISHED("finished"),
    
    @SerializedName("initialization_failed")
    INITIALIZATION_FAILED("initialization_failed"),
    
    @SerializedName("execution_failed")
    EXECUTION_FAILED("execution_failed"),
    
    @SerializedName("unknown")
    UNKNOWN("unknown"),
    
    @SerializedName("killed")
    KILLED("killed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("inputValues")
  private Map<String, Object> inputValues = new HashMap<String, Object>();

  @SerializedName("returnedFiles")
  private Map<String, List<String>> returnedFiles = new HashMap<String, List<String>>();

  @SerializedName("studyIdentifier")
  private String studyIdentifier = null;

  @SerializedName("errorCode")
  private Long errorCode = null;

  @SerializedName("startDate")
  private Long startDate = null;

  @SerializedName("endDate")
  private Long endDate = null;

   /**
   * execution id. Must always be present in responses.
   * @return identifier
  **/
  @ApiModelProperty(example = "null", value = "execution id. Must always be present in responses.")
  public String getIdentifier() {
    return identifier;
  }

  public Execution name(String name) {
    this.name = name;
    return this;
  }

   /**
   * execution name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "execution name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Execution pipelineIdentifier(String pipelineIdentifier) {
    this.pipelineIdentifier = pipelineIdentifier;
    return this;
  }

   /**
   * which pipeline that started this execution
   * @return pipelineIdentifier
  **/
  @ApiModelProperty(example = "null", required = true, value = "which pipeline that started this execution")
  public String getPipelineIdentifier() {
    return pipelineIdentifier;
  }

  public void setPipelineIdentifier(String pipelineIdentifier) {
    this.pipelineIdentifier = pipelineIdentifier;
  }

  public Execution timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * The timeout in seconds until which the execution is killed and deleted with all its files. 0 or absense means no timeout
   * @return timeout
  **/
  @ApiModelProperty(example = "null", value = "The timeout in seconds until which the execution is killed and deleted with all its files. 0 or absense means no timeout")
  public Long getTimeout() {
    return timeout;
  }

  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }

   /**
   * The status of the execution. Must always be present in responses.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The status of the execution. Must always be present in responses.")
  public StatusEnum getStatus() {
    return status;
  }

  public Execution inputValues(Map<String, Object> inputValues) {
    this.inputValues = inputValues;
    return this;
  }

   /**
   * Represents the input as a key/value object. The types should respect the parameters of the pipeline used for the execution.
   * @return inputValues
  **/
  @ApiModelProperty(example = "null", required = true, value = "Represents the input as a key/value object. The types should respect the parameters of the pipeline used for the execution.")
  public Map<String, Object> getInputValues() {
    return inputValues;
  }

  public void setInputValues(Map<String, Object> inputValues) {
    this.inputValues = inputValues;
  }

  public Execution returnedFiles(Map<String, List<String>> returnedFiles) {
    this.returnedFiles = returnedFiles;
    return this;
  }

  public Execution putReturnedFilesItem(String key, List<String> returnedFilesItem) {
    this.returnedFiles.put(key, returnedFilesItem);
    return this;
  }

   /**
   * Absent when not available (e.g. execution still running). Empty if no returned file is produced. Each key/value of the \"returnedFiles\" object corresponds to an output pipeline parameter (with \"isReturnedValue\" set to true) and the key must be the parameter name. The value must be an array of valid URL strings. A value array can be empty if the output parameter produces no value. It can have several URLs entries when the output is a directory with several files, a big file split in several download links, several files or any other implementation specific design.
   * @return returnedFiles
  **/
  @ApiModelProperty(example = "null", value = "Absent when not available (e.g. execution still running). Empty if no returned file is produced. Each key/value of the \"returnedFiles\" object corresponds to an output pipeline parameter (with \"isReturnedValue\" set to true) and the key must be the parameter name. The value must be an array of valid URL strings. A value array can be empty if the output parameter produces no value. It can have several URLs entries when the output is a directory with several files, a big file split in several download links, several files or any other implementation specific design.")
  public Map<String, List<String>> getReturnedFiles() {
    return returnedFiles;
  }

  public void setReturnedFiles(Map<String, List<String>> returnedFiles) {
    this.returnedFiles = returnedFiles;
  }

  public Execution studyIdentifier(String studyIdentifier) {
    this.studyIdentifier = studyIdentifier;
    return this;
  }

   /**
   * Get studyIdentifier
   * @return studyIdentifier
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStudyIdentifier() {
    return studyIdentifier;
  }

  public void setStudyIdentifier(String studyIdentifier) {
    this.studyIdentifier = studyIdentifier;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getErrorCode() {
    return errorCode;
  }

   /**
   * Time in seconds since Unix epoch
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "Time in seconds since Unix epoch")
  public Long getStartDate() {
    return startDate;
  }

   /**
   * Time in seconds since Unix epoch
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "Time in seconds since Unix epoch")
  public Long getEndDate() {
    return endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Execution execution = (Execution) o;
    return Objects.equals(this.identifier, execution.identifier) &&
        Objects.equals(this.name, execution.name) &&
        Objects.equals(this.pipelineIdentifier, execution.pipelineIdentifier) &&
        Objects.equals(this.timeout, execution.timeout) &&
        Objects.equals(this.status, execution.status) &&
        Objects.equals(this.inputValues, execution.inputValues) &&
        Objects.equals(this.returnedFiles, execution.returnedFiles) &&
        Objects.equals(this.studyIdentifier, execution.studyIdentifier) &&
        Objects.equals(this.errorCode, execution.errorCode) &&
        Objects.equals(this.startDate, execution.startDate) &&
        Objects.equals(this.endDate, execution.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, pipelineIdentifier, timeout, status, inputValues, returnedFiles, studyIdentifier, errorCode, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Execution {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pipelineIdentifier: ").append(toIndentedString(pipelineIdentifier)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    inputValues: ").append(toIndentedString(inputValues)).append("\n");
    sb.append("    returnedFiles: ").append(toIndentedString(returnedFiles)).append("\n");
    sb.append("    studyIdentifier: ").append(toIndentedString(studyIdentifier)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

