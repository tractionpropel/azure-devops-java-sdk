package org.azd.build.types;
/**
 * ----------------------------------------------------------
 * GENERATED FILE, should be edited to suit the purpose.
 * ----------------------------------------------------------
 **/

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * None 
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValidationResult {

    @JsonProperty("error")
    private String error;

    @JsonProperty("ok")
    private String ok;

    @JsonProperty("warning")
    private String warning;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
                "error='" + error + '\'' +
                ", ok='" + ok + '\'' +
                ", warning='" + warning + '\'' +
                '}';
    }
}