package org.azd.release.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import org.azd.common.types.Author;

import java.util.Arrays;
import java.util.List;

/***
 * Represents a Release
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Release {
    /***
     * Gets links to access the release.
     */
    @JsonProperty("_links")
    private Object _links;
    /***
     * Gets or sets the list of artifacts.
     */
    @JsonProperty("artifacts")
    private List<ReleaseArtifacts> artifacts;
    /***
     * Gets or sets comment.
     */
    @JsonProperty("comment")
    private String comment;
    /***
     * Gets or sets the identity who created.
     */
    @JsonProperty("createdBy")
    private Author createdBy;
    /***
     * Gets or sets the identity for whom release was created.
     */
    @JsonProperty("createdFor")
    private Author createdFor;
    /***
     * Gets date on which it got created.
     */
    @JsonProperty("createdOn")
    private String createdOn;
    /***
     * Gets revision number of definition snapshot.
     */
    @JsonProperty("definitionSnapshotRevision")
    private int definitionSnapshotRevision;
    /***
     * Gets or sets description of release.
     */
    @JsonProperty("description")
    private String description;
    /***
     * Gets list of environments.
     */
    @JsonProperty("environments")
    private List<ReleaseEnvironment> environments;
    /***
     * Gets the unique identifier of this field.
     */
    @JsonProperty("id")
    private int id;
    /***
     * Whether to exclude the release from retention policies.
     */
    @JsonProperty("keepForever")
    private boolean keepForever;
    /***
     * Gets logs container url.
     */
    @JsonProperty("logsContainerUrl")
    private String logsContainerUrl;
    /***
     * Gets or sets the identity who modified.
     */
    @JsonProperty("modifiedBy")
    private Author modifiedBy;
    /***
     * Gets date on which it got modified.
     */
    @JsonProperty("modifiedOn")
    private String modifiedOn;
    /***
     * Gets name.
     */
    @JsonProperty("name")
    private String name;
    /***
     * Gets pool name.
     */
    @JsonProperty("poolName")
    private String poolName;
    /***
     * Gets or sets project reference.
     */
    @JsonProperty("projectReference")
    private ProjectReference projectReference;
    /***
     * Gets reason of release.
     */
    @JsonProperty("reason")
    private String reason;
    /***
     * Gets releaseDefinitionReference which specifies the reference of the release definition to which this release is associated.
     */
    @JsonProperty("releaseDefinition")
    private ReleaseShallowReference releaseDefinition;
    /***
     * Gets or sets the release definition revision.
     */
    @JsonProperty("releaseDefinitionRevision")
    private int releaseDefinitionRevision;
    /***
     * Gets release name format.
     */
    @JsonProperty("releaseNameFormat")
    private String releaseNameFormat;
    /***
     * Gets status.
     */
    @JsonProperty("status")
    private String status;
    /***
     * Gets or sets list of tags.
     */
    @JsonProperty("tags")
    private String[] tags;
    /***
     * Triggering artifact alias
     */
    @JsonProperty("triggeringArtifactAlias")
    private String triggeringArtifactAlias;
    /***
     * Gets the list of variable groups.
     */
    @JsonProperty("variableGroups")
    private JsonNode variableGroups;
    /***
     * Gets or sets the dictionary of variables.
     */
    @JsonProperty("variables")
    private JsonNode variables;

    public Object get_links() {
        return _links;
    }

    public void set_links(Object _links) {
        this._links = _links;
    }

    public List<ReleaseArtifacts> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<ReleaseArtifacts> artifacts) {
        this.artifacts = artifacts;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Author getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Author createdBy) {
        this.createdBy = createdBy;
    }

    public Author getCreatedFor() {
        return createdFor;
    }

    public void setCreatedFor(Author createdFor) {
        this.createdFor = createdFor;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public int getDefinitionSnapshotRevision() {
        return definitionSnapshotRevision;
    }

    public void setDefinitionSnapshotRevision(int definitionSnapshotRevision) {
        this.definitionSnapshotRevision = definitionSnapshotRevision;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ReleaseEnvironment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(List<ReleaseEnvironment> environments) {
        this.environments = environments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isKeepForever() {
        return keepForever;
    }

    public void setKeepForever(boolean keepForever) {
        this.keepForever = keepForever;
    }

    public String getLogsContainerUrl() {
        return logsContainerUrl;
    }

    public void setLogsContainerUrl(String logsContainerUrl) {
        this.logsContainerUrl = logsContainerUrl;
    }

    public Author getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Author modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public ProjectReference getProjectReference() {
        return projectReference;
    }

    public void setProjectReference(ProjectReference projectReference) {
        this.projectReference = projectReference;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ReleaseShallowReference getReleaseDefinition() {
        return releaseDefinition;
    }

    public void setReleaseDefinition(ReleaseShallowReference releaseDefinition) {
        this.releaseDefinition = releaseDefinition;
    }

    public int getReleaseDefinitionRevision() {
        return releaseDefinitionRevision;
    }

    public void setReleaseDefinitionRevision(int releaseDefinitionRevision) {
        this.releaseDefinitionRevision = releaseDefinitionRevision;
    }

    public String getReleaseNameFormat() {
        return releaseNameFormat;
    }

    public void setReleaseNameFormat(String releaseNameFormat) {
        this.releaseNameFormat = releaseNameFormat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getTriggeringArtifactAlias() {
        return triggeringArtifactAlias;
    }

    public void setTriggeringArtifactAlias(String triggeringArtifactAlias) {
        this.triggeringArtifactAlias = triggeringArtifactAlias;
    }

    public JsonNode getVariableGroups() {
        return variableGroups;
    }

    public void setVariableGroups(JsonNode variableGroups) {
        this.variableGroups = variableGroups;
    }

    public JsonNode getVariables() {
        return variables;
    }

    public void setVariables(JsonNode variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        return "Release{" +
                "_links=" + _links +
                ", artifacts=" + artifacts +
                ", comment='" + comment + '\'' +
                ", createdBy=" + createdBy +
                ", createdFor=" + createdFor +
                ", createdOn='" + createdOn + '\'' +
                ", definitionSnapshotRevision=" + definitionSnapshotRevision +
                ", description='" + description + '\'' +
                ", environments=" + environments +
                ", id=" + id +
                ", keepForever=" + keepForever +
                ", logsContainerUrl='" + logsContainerUrl + '\'' +
                ", modifiedBy=" + modifiedBy +
                ", modifiedOn='" + modifiedOn + '\'' +
                ", name='" + name + '\'' +
                ", poolName='" + poolName + '\'' +
                ", projectReference=" + projectReference +
                ", reason='" + reason + '\'' +
                ", releaseDefinition=" + releaseDefinition +
                ", releaseDefinitionRevision=" + releaseDefinitionRevision +
                ", releaseNameFormat='" + releaseNameFormat + '\'' +
                ", status='" + status + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", triggeringArtifactAlias='" + triggeringArtifactAlias + '\'' +
                ", variableGroups=" + variableGroups +
                ", variables=" + variables +
                '}';
    }
}
