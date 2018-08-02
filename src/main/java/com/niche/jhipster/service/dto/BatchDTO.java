package com.niche.jhipster.service.dto;

import java.time.Instant;
import java.time.LocalDate;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Batch entity.
 */
public class BatchDTO implements Serializable {

    private Long id;

    @NotNull
    private String batchNo;

    @NotNull
    private String batchName;

    @NotNull
    private Long quantity;

    private String motherBed;

    @NotNull
    private Integer showingType;

    @NotNull
    private LocalDate sowingDate;

    private LocalDate closedDate;

    private Integer status;

    private Long createdBy;

    private Long modifiedBy;

    private Instant createdAt;

    private Instant updatedAt;

    private Long nurseryId;

    private String nurseryNurseryName;

    private Long pickListVarietyId;

    private String pickListVarietyPickListValue;

    private Long pickListCategoryId;

    private String pickListCategoryPickListValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getMotherBed() {
        return motherBed;
    }

    public void setMotherBed(String motherBed) {
        this.motherBed = motherBed;
    }

    public Integer getShowingType() {
        return showingType;
    }

    public void setShowingType(Integer showingType) {
        this.showingType = showingType;
    }

    public LocalDate getSowingDate() {
        return sowingDate;
    }

    public void setSowingDate(LocalDate sowingDate) {
        this.sowingDate = sowingDate;
    }

    public LocalDate getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(LocalDate closedDate) {
        this.closedDate = closedDate;
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

    public Long getNurseryId() {
        return nurseryId;
    }

    public void setNurseryId(Long nurseryId) {
        this.nurseryId = nurseryId;
    }

    public String getNurseryNurseryName() {
        return nurseryNurseryName;
    }

    public void setNurseryNurseryName(String nurseryNurseryName) {
        this.nurseryNurseryName = nurseryNurseryName;
    }

    public Long getPickListVarietyId() {
        return pickListVarietyId;
    }

    public void setPickListVarietyId(Long pickListValueId) {
        this.pickListVarietyId = pickListValueId;
    }

    public String getPickListVarietyPickListValue() {
        return pickListVarietyPickListValue;
    }

    public void setPickListVarietyPickListValue(String pickListValuePickListValue) {
        this.pickListVarietyPickListValue = pickListValuePickListValue;
    }

    public Long getPickListCategoryId() {
        return pickListCategoryId;
    }

    public void setPickListCategoryId(Long pickListValueId) {
        this.pickListCategoryId = pickListValueId;
    }

    public String getPickListCategoryPickListValue() {
        return pickListCategoryPickListValue;
    }

    public void setPickListCategoryPickListValue(String pickListValuePickListValue) {
        this.pickListCategoryPickListValue = pickListValuePickListValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BatchDTO batchDTO = (BatchDTO) o;
        if (batchDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), batchDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "BatchDTO{" +
            "id=" + getId() +
            ", batchNo='" + getBatchNo() + "'" +
            ", batchName='" + getBatchName() + "'" +
            ", quantity=" + getQuantity() +
            ", motherBed='" + getMotherBed() + "'" +
            ", showingType=" + getShowingType() +
            ", sowingDate='" + getSowingDate() + "'" +
            ", closedDate='" + getClosedDate() + "'" +
            ", status=" + getStatus() +
            ", createdBy=" + getCreatedBy() +
            ", modifiedBy=" + getModifiedBy() +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            ", nursery=" + getNurseryId() +
            ", nursery='" + getNurseryNurseryName() + "'" +
            ", pickListVariety=" + getPickListVarietyId() +
            ", pickListVariety='" + getPickListVarietyPickListValue() + "'" +
            ", pickListCategory=" + getPickListCategoryId() +
            ", pickListCategory='" + getPickListCategoryPickListValue() + "'" +
            "}";
    }
}
