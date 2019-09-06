package net.boomerangplatform.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class General {

  private String name;

  private String path;

  @JsonProperty("pkg_type")
  private String pkgType;

  private String sha256;

  @JsonProperty("component_id")
  private String componentId;

  public General() {
    // Do nothing
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getPkgType() {
    return pkgType;
  }

  public void setPkgType(String pkgType) {
    this.pkgType = pkgType;
  }

  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }

  public String getComponentId() {
    return componentId;
  }

  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }
}
