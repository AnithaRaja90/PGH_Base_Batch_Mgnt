package com.niche.jhipster.service.dto;

import java.time.Instant;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the PickListValue entity.
 */
public class PickListValueDTO implements Serializable {

    private Long id;

    @NotNull
    private String pickListValue;

    private Integer status;

    private Long createdBy;

    private Long modifiedBy;

    private Instant createdAt;

    private Instant updatedAt;

    private Long pickListId;

    private String pickListPickListName;

    private Long pickValueId;

    private String pickValuePickListValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPickListValue() {
        return pickListValue;
    }

    public void setPickListValue(String pickListValue) {
        this.pickListValue = pickListValue;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getPickListId() {
        return pickListId;
    }

    public void setPickListId(Long pickListId) {
        this.pickListId = pickListId;
    }

    public String getPickListPickListName() {
        return pickListPickListName;
    }

    public void setPickListPickListName(String pickListPickListName) {
        this.pickListPickListName = pickListPickListName;
    }

    public Long getPickValueId() {
        return pickValueId;
    }

    public void setPickValueId(Long pickListValueId) {
        this.pickValueId = pickListValueId;
    }

    public String getPickValuePickListValue() {
        return pickValuePickListValue;
    }

    public void setPickValuePickListValue(String pickListValuePickListValue) {
        this.pickValuePickListValue = pickListValuePickListValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PickListValueDTO pickListValueDTO = (PickListValueDTO) o;
        if (pickListValueDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), pickListValueDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PickListValueDTO{" +
            "id=" + getId() +
            ", pickListValue='" + getPickListValue() + "'" +
            ", status=" + getStatus() +
            ", createdBy=" + getCreatedBy() +
            ", modifiedBy=" + getModifiedBy() +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            ", pickList=" + getPickListId() +
            ", pickList='" + getPickListPickListName() + "'" +
            ", pickValue=" + getPickValueId() +
            ", pickValue='" + getPickValuePickListValue() + "'" +
            "}";
    }
}
