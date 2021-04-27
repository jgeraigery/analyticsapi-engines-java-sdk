/*
 * Engines API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package factset.analyticsapi.engines.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import factset.analyticsapi.engines.models.SPARDateParameters;
import factset.analyticsapi.engines.models.SPARIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import factset.analyticsapi.engines.JSON;


/**
 * SPARCalculationParameters
 */
@JsonPropertyOrder({
  SPARCalculationParameters.JSON_PROPERTY_COMPONENTID,
  SPARCalculationParameters.JSON_PROPERTY_ACCOUNTS,
  SPARCalculationParameters.JSON_PROPERTY_BENCHMARK,
  SPARCalculationParameters.JSON_PROPERTY_DATES
})
@javax.annotation.Generated(value = "CustomJavaClientCodegen")
public class SPARCalculationParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COMPONENTID = "componentid";
  private String componentid;

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private java.util.List<SPARIdentifier> accounts = null;

  public static final String JSON_PROPERTY_BENCHMARK = "benchmark";
  private SPARIdentifier benchmark;

  public static final String JSON_PROPERTY_DATES = "dates";
  private SPARDateParameters dates;


  public SPARCalculationParameters componentid(String componentid) {
    this.componentid = componentid;
    return this;
  }

   /**
   * The SPAR Engine component identifier to analyze.
   * @return componentid
  **/
  @ApiModelProperty(required = true, value = "The SPAR Engine component identifier to analyze.")
  @JsonProperty(JSON_PROPERTY_COMPONENTID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getComponentid() {
    return componentid;
  }


  public void setComponentid(String componentid) {
    this.componentid = componentid;
  }


  public SPARCalculationParameters accounts(java.util.List<SPARIdentifier> accounts) {
    this.accounts = accounts;
    return this;
  }

  public SPARCalculationParameters addAccountsItem(SPARIdentifier accountsItem) {
    if (this.accounts == null) {
      this.accounts = new java.util.ArrayList<SPARIdentifier>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * List of accounts for SPAR calculation.
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of accounts for SPAR calculation.")
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<SPARIdentifier> getAccounts() {
    return accounts;
  }


  public void setAccounts(java.util.List<SPARIdentifier> accounts) {
    this.accounts = accounts;
  }


  public SPARCalculationParameters benchmark(SPARIdentifier benchmark) {
    this.benchmark = benchmark;
    return this;
  }

   /**
   * Get benchmark
   * @return benchmark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BENCHMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SPARIdentifier getBenchmark() {
    return benchmark;
  }


  public void setBenchmark(SPARIdentifier benchmark) {
    this.benchmark = benchmark;
  }


  public SPARCalculationParameters dates(SPARDateParameters dates) {
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SPARDateParameters getDates() {
    return dates;
  }


  public void setDates(SPARDateParameters dates) {
    this.dates = dates;
  }


  /**
   * Return true if this SPARCalculationParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SPARCalculationParameters spARCalculationParameters = (SPARCalculationParameters) o;
    return Objects.equals(this.componentid, spARCalculationParameters.componentid) &&
        Objects.equals(this.accounts, spARCalculationParameters.accounts) &&
        Objects.equals(this.benchmark, spARCalculationParameters.benchmark) &&
        Objects.equals(this.dates, spARCalculationParameters.dates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentid, accounts, benchmark, dates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SPARCalculationParameters {\n");
    sb.append("    componentid: ").append(toIndentedString(componentid)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    benchmark: ").append(toIndentedString(benchmark)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

