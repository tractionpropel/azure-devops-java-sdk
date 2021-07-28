package org.azd.accounts.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile {
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("publicAlias")
    private String publicAlias;
    @JsonProperty("emailAddress")
    private String emailAddress;
    @JsonProperty("coreRevision")
    private int coreRevision;
    @JsonProperty("timeStamp")
    private String timeStamp;
    @JsonProperty("id")
    private String id;
    @JsonProperty("revision")
    private int revision;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPublicAlias() {
        return publicAlias;
    }

    public void setPublicAlias(String publicAlias) {
        this.publicAlias = publicAlias;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getCoreRevision() {
        return coreRevision;
    }

    public void setCoreRevision(int coreRevision) {
        this.coreRevision = coreRevision;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "displayName='" + displayName + '\'' +
                ", publicAlias='" + publicAlias + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", coreRevision=" + coreRevision +
                ", timeStamp='" + timeStamp + '\'' +
                ", id='" + id + '\'' +
                ", revision=" + revision +
                '}';
    }
}
