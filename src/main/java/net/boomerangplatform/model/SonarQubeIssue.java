package net.boomerangplatform.model;

import static net.boomerangplatform.util.ListUtil.sanityNullList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SonarQubeIssue { // NOSONAR

  private String key;
  private String rule;
  private String severity;
  private String component;
  private String project;
  private Integer line;
  private String hash;
  private TextRange textRange;
  private List<Flow> flows;
  private String status;
  private String message;
  private String effort;
  private String debt;
  private String author;
  private List<String> tags;
  private String creationDate;
  private String updateDate;
  private String type;
  private String organization;
  private Boolean fromHotspot;
  private String resolution;
  private String closeDate;

  public SonarQubeIssue() {
    // Do nothing
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
    this.line = line;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public TextRange getTextRange() {
    return textRange;
  }

  public void setTextRange(TextRange textRange) {
    this.textRange = textRange;
  }

  public List<Flow> getFlows() {
    return sanityNullList(flows);
  }

  public void setFlows(List<Flow> flows) {
    this.flows = sanityNullList(flows);
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getEffort() {
    return effort;
  }

  public void setEffort(String effort) {
    this.effort = effort;
  }

  public String getDebt() {
    return debt;
  }

  public void setDebt(String debt) {
    this.debt = debt;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public List<String> getTags() {
    return sanityNullList(tags);
  }

  public void setTags(List<String> tags) {
    this.tags = sanityNullList(tags);
  }

  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public Boolean getFromHotspot() {
    return fromHotspot;
  }

  public void setFromHotspot(Boolean fromHotspot) {
    this.fromHotspot = fromHotspot;
  }

  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  public String getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(String closeDate) {
    this.closeDate = closeDate;
  }
}
