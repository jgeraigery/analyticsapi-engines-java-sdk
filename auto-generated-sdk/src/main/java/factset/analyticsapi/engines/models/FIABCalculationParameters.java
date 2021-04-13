/*
 * Engines API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v3:[pa,spar,vault,pub,fi,axp,afi,npo,bpm,fpo,others],v1:[fiab]
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package factset.analyticsapi.engines.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import factset.analyticsapi.engines.models.FIABDateParameters;
import factset.analyticsapi.engines.models.FIABIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * FIABCalculationParameters
 */
@JsonPropertyOrder({
  FIABCalculationParameters.JSON_PROPERTY_FIABDOCUMENT,
  FIABCalculationParameters.JSON_PROPERTY_ACCOUNT,
  FIABCalculationParameters.JSON_PROPERTY_DATES,
  FIABCalculationParameters.JSON_PROPERTY_MSL,
  FIABCalculationParameters.JSON_PROPERTY_FISETTINGSDOCUMENT
})

public class FIABCalculationParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FIABDOCUMENT = "fiabdocument";
  private String fiabdocument;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private FIABIdentifier account;

  public static final String JSON_PROPERTY_DATES = "dates";
  private FIABDateParameters dates;

  public static final String JSON_PROPERTY_MSL = "msl";
  private String msl;

  public static final String JSON_PROPERTY_FISETTINGSDOCUMENT = "fisettingsdocument";
  private String fisettingsdocument;


  public FIABCalculationParameters fiabdocument(String fiabdocument) {
    
    this.fiabdocument = fiabdocument;
    return this;
  }

   /**
   * FiabDocument (optional) - FIAB document to use as a template. Should  be a path to a FIAB document. Expects a GUI-style path (Client:/foo/bar)
   * @return fiabdocument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FiabDocument (optional) - FIAB document to use as a template. Should  be a path to a FIAB document. Expects a GUI-style path (Client:/foo/bar)")
  @JsonProperty(JSON_PROPERTY_FIABDOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFiabdocument() {
    return fiabdocument;
  }


  public void setFiabdocument(String fiabdocument) {
    this.fiabdocument = fiabdocument;
  }


  public FIABCalculationParameters account(FIABIdentifier account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FIABIdentifier getAccount() {
    return account;
  }


  public void setAccount(FIABIdentifier account) {
    this.account = account;
  }


  public FIABCalculationParameters dates(FIABDateParameters dates) {
    
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FIABDateParameters getDates() {
    return dates;
  }


  public void setDates(FIABDateParameters dates) {
    this.dates = dates;
  }


  public FIABCalculationParameters msl(String msl) {
    
    this.msl = msl;
    return this;
  }

   /**
   * Master FISecurity List. Analytics results will be written to the selected MSL. Expects a GUI-style path (Client:/foo/bar)
   * @return msl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Master FISecurity List. Analytics results will be written to the selected MSL. Expects a GUI-style path (Client:/foo/bar)")
  @JsonProperty(JSON_PROPERTY_MSL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMsl() {
    return msl;
  }


  public void setMsl(String msl) {
    this.msl = msl;
  }


  public FIABCalculationParameters fisettingsdocument(String fisettingsdocument) {
    
    this.fisettingsdocument = fisettingsdocument;
    return this;
  }

   /**
   * FISettingsDocument (optional) - The given @FIS document will be used to  configure analytics assumptions and settings. Expects a GUI-style path (Client:/foo/bar)
   * @return fisettingsdocument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FISettingsDocument (optional) - The given @FIS document will be used to  configure analytics assumptions and settings. Expects a GUI-style path (Client:/foo/bar)")
  @JsonProperty(JSON_PROPERTY_FISETTINGSDOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFisettingsdocument() {
    return fisettingsdocument;
  }


  public void setFisettingsdocument(String fisettingsdocument) {
    this.fisettingsdocument = fisettingsdocument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FIABCalculationParameters fiABCalculationParameters = (FIABCalculationParameters) o;
    return Objects.equals(this.fiabdocument, fiABCalculationParameters.fiabdocument) &&
        Objects.equals(this.account, fiABCalculationParameters.account) &&
        Objects.equals(this.dates, fiABCalculationParameters.dates) &&
        Objects.equals(this.msl, fiABCalculationParameters.msl) &&
        Objects.equals(this.fisettingsdocument, fiABCalculationParameters.fisettingsdocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiabdocument, account, dates, msl, fisettingsdocument);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FIABCalculationParameters {\n");
    sb.append("    fiabdocument: ").append(toIndentedString(fiabdocument)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    msl: ").append(toIndentedString(msl)).append("\n");
    sb.append("    fisettingsdocument: ").append(toIndentedString(fisettingsdocument)).append("\n");
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

