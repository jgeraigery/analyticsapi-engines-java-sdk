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
import factset.analyticsapi.engines.models.PubDateParameters;
import factset.analyticsapi.engines.models.PubIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PubCalculationParameters
 */
@JsonPropertyOrder({
  PubCalculationParameters.JSON_PROPERTY_DOCUMENT,
  PubCalculationParameters.JSON_PROPERTY_ACCOUNT,
  PubCalculationParameters.JSON_PROPERTY_DATES
})

public class PubCalculationParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DOCUMENT = "document";
  private String document;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private PubIdentifier account;

  public static final String JSON_PROPERTY_DATES = "dates";
  private PubDateParameters dates;


  public PubCalculationParameters document(String document) {
    
    this.document = document;
    return this;
  }

   /**
   * The Publisher Engine document to analyze.
   * @return document
  **/
  @ApiModelProperty(required = true, value = "The Publisher Engine document to analyze.")
  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocument() {
    return document;
  }


  public void setDocument(String document) {
    this.document = document;
  }


  public PubCalculationParameters account(PubIdentifier account) {
    
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

  public PubIdentifier getAccount() {
    return account;
  }


  public void setAccount(PubIdentifier account) {
    this.account = account;
  }


  public PubCalculationParameters dates(PubDateParameters dates) {
    
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

  public PubDateParameters getDates() {
    return dates;
  }


  public void setDates(PubDateParameters dates) {
    this.dates = dates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PubCalculationParameters pubCalculationParameters = (PubCalculationParameters) o;
    return Objects.equals(this.document, pubCalculationParameters.document) &&
        Objects.equals(this.account, pubCalculationParameters.account) &&
        Objects.equals(this.dates, pubCalculationParameters.dates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, account, dates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PubCalculationParameters {\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
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

