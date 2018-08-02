package com.niche.jhipster.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A PickListValue.
 */
@Entity
@Table(name = "pick_list_value")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PickListValue implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "pick_list_value", nullable = false)
    private String pickListValue;

    @Column(name = "status")
    private Integer status;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "modified_by")
    private Long modifiedBy;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @OneToMany(mappedBy = "pickValue")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<PickListValue> selfIds = new HashSet<>();

    @OneToMany(mappedBy = "pickListVariety")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Batch> varietys = new HashSet<>();

    @OneToMany(mappedBy = "pickListCategory")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Batch> categorys = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties("pickListValues")
    private PickList pickList;

    @ManyToOne
    @JsonIgnoreProperties("selfIds")
    private PickListValue pickValue;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPickListValue() {
        return pickListValue;
    }

    public PickListValue pickListValue(String pickListValue) {
        this.pickListValue = pickListValue;
        return this;
    }

    public void setPickListValue(String pickListValue) {
        this.pickListValue = pickListValue;
    }

    public Integer getStatus() {
        return status;
    }

    public PickListValue status(Integer status) {
        this.status = status;
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public PickListValue createdBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public PickListValue modifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public PickListValue createdAt(Instant createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public PickListValue updatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Set<PickListValue> getSelfIds() {
        return selfIds;
    }

    public PickListValue selfIds(Set<PickListValue> pickListValues) {
        this.selfIds = pickListValues;
        return this;
    }

    public PickListValue addSelfId(PickListValue pickListValue) {
        this.selfIds.add(pickListValue);
        pickListValue.setPickValue(this);
        return this;
    }

    public PickListValue removeSelfId(PickListValue pickListValue) {
        this.selfIds.remove(pickListValue);
        pickListValue.setPickValue(null);
        return this;
    }

    public void setSelfIds(Set<PickListValue> pickListValues) {
        this.selfIds = pickListValues;
    }

    public Set<Batch> getVarietys() {
        return varietys;
    }

    public PickListValue varietys(Set<Batch> batches) {
        this.varietys = batches;
        return this;
    }

    public PickListValue addVarietys(Batch batch) {
        this.varietys.add(batch);
        batch.setPickListVariety(this);
        return this;
    }

    public PickListValue removeVarietys(Batch batch) {
        this.varietys.remove(batch);
        batch.setPickListVariety(null);
        return this;
    }

    public void setVarietys(Set<Batch> batches) {
        this.varietys = batches;
    }

    public Set<Batch> getCategorys() {
        return categorys;
    }

    public PickListValue categorys(Set<Batch> batches) {
        this.categorys = batches;
        return this;
    }

    public PickListValue addCategorys(Batch batch) {
        this.categorys.add(batch);
        batch.setPickListCategory(this);
        return this;
    }

    public PickListValue removeCategorys(Batch batch) {
        this.categorys.remove(batch);
        batch.setPickListCategory(null);
        return this;
    }

    public void setCategorys(Set<Batch> batches) {
        this.categorys = batches;
    }

    public PickList getPickList() {
        return pickList;
    }

    public PickListValue pickList(PickList pickList) {
        this.pickList = pickList;
        return this;
    }

    public void setPickList(PickList pickList) {
        this.pickList = pickList;
    }

    public PickListValue getPickValue() {
        return pickValue;
    }

    public PickListValue pickValue(PickListValue pickListValue) {
        this.pickValue = pickListValue;
        return this;
    }

    public void setPickValue(PickListValue pickListValue) {
        this.pickValue = pickListValue;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PickListValue pickListValue = (PickListValue) o;
        if (pickListValue.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), pickListValue.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PickListValue{" +
            "id=" + getId() +
            ", pickListValue='" + getPickListValue() + "'" +
            ", status=" + getStatus() +
            ", createdBy=" + getCreatedBy() +
            ", modifiedBy=" + getModifiedBy() +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            "}";
    }
}
