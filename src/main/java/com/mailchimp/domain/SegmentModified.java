package com.mailchimp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
/**
 * @author eamoralesl
 */

@Data
public class SegmentModified {
    @JsonProperty("error_count")
    private Integer errorCount;
    @JsonProperty("errors")
    private List<String> errors = null;
    @JsonProperty("members_added")
    private List<Member> membersAdded = null;
    @JsonProperty("members_removed")
    private List<Member> membersRemoved = null;
    @JsonProperty("total_added")
    private Integer totalAdded;
    @JsonProperty("total_removed")
    private Integer totalRemoved;

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public List<Member> getMembersAdded() {
        return membersAdded;
    }

    public void setMembersAdded(List<Member> membersAdded) {
        this.membersAdded = membersAdded;
    }

    public List<Member> getMembersRemoved() {
        return membersRemoved;
    }

    public void setMembersRemoved(List<Member> membersRemoved) {
        this.membersRemoved = membersRemoved;
    }

    public Integer getTotalAdded() {
        return totalAdded;
    }

    public void setTotalAdded(Integer totalAdded) {
        this.totalAdded = totalAdded;
    }

    public Integer getTotalRemoved() {
        return totalRemoved;
    }

    public void setTotalRemoved(Integer totalRemoved) {
        this.totalRemoved = totalRemoved;
    }
}
