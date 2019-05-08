package net.boomerangplatform.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Issue {

	@JsonProperty("summary")
	private String summary;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("issue_type")
	private String issueType;
	
	@JsonProperty("severity")
	private String severity;
	
	@JsonProperty("provider")
	private String provider;
	
	@JsonProperty("cves")
	private List<Cfe> cves;
	
	@JsonProperty("created")
	private String created;
	
	@JsonProperty("impact_path")
	private List<String> impactPath;
	
	public Issue() {		
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public List<Cfe> getCves() {
		return cves;
	}

	public void setCves(List<Cfe> cves) {
		this.cves = cves;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public List<String> getImpactPath() {
		return impactPath;
	}

	public void setImpactPath(List<String> impactPath) {
		if (impactPath == null) {
			impactPath = new ArrayList<String>();
		}
		this.impactPath = impactPath;
	}
}
