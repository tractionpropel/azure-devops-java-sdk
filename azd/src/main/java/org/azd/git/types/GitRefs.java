package org.azd.git.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/***
 * List of refs (branches).
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitRefs {

    /***
     * List of refs (branches).
     */
    @JsonProperty("value")
    private List<GitRef> value;

    public List<GitRef> getBranches() {
        return value;
    }

    public void setBranches(List<GitRef> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GitRefs{" + "value=" + value + '}';
    }
}
