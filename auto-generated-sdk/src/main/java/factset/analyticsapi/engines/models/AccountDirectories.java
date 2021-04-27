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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import factset.analyticsapi.engines.JSON;


/**
 * AccountDirectories
 */
@JsonPropertyOrder({
  AccountDirectories.JSON_PROPERTY_ACCOUNTS,
  AccountDirectories.JSON_PROPERTY_DIRECTORIES
})
@javax.annotation.Generated(value = "CustomJavaClientCodegen")
public class AccountDirectories implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private java.util.List<String> accounts = null;

  public static final String JSON_PROPERTY_DIRECTORIES = "directories";
  private java.util.List<String> directories = null;


  public AccountDirectories accounts(java.util.List<String> accounts) {
    this.accounts = accounts;
    return this;
  }

  public AccountDirectories addAccountsItem(String accountsItem) {
    if (this.accounts == null) {
      this.accounts = new java.util.ArrayList<String>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * List of account and composite files.
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of account and composite files.")
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getAccounts() {
    return accounts;
  }


  public void setAccounts(java.util.List<String> accounts) {
    this.accounts = accounts;
  }


  public AccountDirectories directories(java.util.List<String> directories) {
    this.directories = directories;
    return this;
  }

  public AccountDirectories addDirectoriesItem(String directoriesItem) {
    if (this.directories == null) {
      this.directories = new java.util.ArrayList<String>();
    }
    this.directories.add(directoriesItem);
    return this;
  }

   /**
   * List of directories.
   * @return directories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of directories.")
  @JsonProperty(JSON_PROPERTY_DIRECTORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getDirectories() {
    return directories;
  }


  public void setDirectories(java.util.List<String> directories) {
    this.directories = directories;
  }


  /**
   * Return true if this AccountDirectories object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDirectories accountDirectories = (AccountDirectories) o;
    return Objects.equals(this.accounts, accountDirectories.accounts) &&
        Objects.equals(this.directories, accountDirectories.directories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, directories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDirectories {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    directories: ").append(toIndentedString(directories)).append("\n");
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

