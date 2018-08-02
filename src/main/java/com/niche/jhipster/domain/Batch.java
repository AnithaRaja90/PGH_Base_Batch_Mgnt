package com.niche.jhipster.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Batch.
 */
@Entity
@Table(name = "batch")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Batch implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "batch_no", nullable = false)
    private String batchNo;

    @NotNull
    @Column(name = "batch_name", nullable = false)
    private String batchName;

    @NotNull
    @Column(name = "quantity", nullable = false)
    private Long quantity;

    @Column(name = "mother_bed")
    private String motherBed;

    @NotNull
    @Column(name = "showing_type", nullable = false)
    private Integer showingType;

    @NotNull
    @Column(name = "sowing_date", nullable = false)
    private LocalDate sowingDate;

    @Column(name = "closed_date")
    private LocalDate closedDate;

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

    @OneToMany(mappedBy = "batch")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Damage> damages = new HashSet<>();

    @OneToMany(mappedBy = "batch")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ShadeArea> shadeAreas = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties("batchs")
    private Nursery nursery;

    @ManyToOne
    @JsonIgnoreProperties("varietys")
    private PickListValue pickListVariety;

    @ManyToOne
    @JsonIgnoreProperties("categorys")
    private PickListValue pickListCategory;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public Batch batchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getBatchName() {
        return batchName;
    }

    public Batch batchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Batch quantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getMotherBed() {
        return motherBed;
    }

    public Batch motherBed(String motherBed) {
        this.motherBed = motherBed;
        return this;
    }

    public void setMotherBed(String motherBed) {
        this.motherBed = motherBed;
    }

    public Integer getShowingType() {
        return showingType;
    }

    public Batch showingType(Integer showingType) {
        this.showingType = showingType;
        return this;
    }

    public void setShowingType(Integer showingType) {
        this.showingType = showingType;
    }

    public LocalDate getSowingDate() {
        return sowingDate;
    }

    public Batch sowingDate(LocalDate sowingDate) {
        this.sowingDate = sowingDate;
        return this;
    }

    public void setSowingDate(LocalDate sowingDate) {
        this.sowingDate = sowingDate;
    }

    public LocalDate getClosedDate() {
        return closedDate;
    }

    public Batch closedDate(LocalDate closedDate) {
        this.closedDate = closedDate;
        return this;
    }

    public void setClosedDate(LocalDate closedDate) {
        this.closedDate = closedDate;
    }

    public Integer getStatus() {
        return status;
    }

    public Batch status(Integer status) {
        this.status = status;
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public Batch createdBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public Batch modifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Batch createdAt(Instant createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Batch updatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Set<Damage> getDamages() {
        return damages;
    }

    public Batch damages(Set<Damage> damages) {
        this.damages = damages;
        return this;
    }

    public Batch addDamage(Damage damage) {
        this.damages.add(damage);
        damage.setBatch(this);
        return this;
    }

    public Batch removeDamage(Damage damage) {
        this.damages.remove(damage);
        damage.setBatch(null);
        return this;
    }

    public void setDamages(Set<Damage> damages) {
        this.damages = damages;
    }

    public Set<ShadeArea> getShadeAreas() {
        return shadeAreas;
    }

    public Batch shadeAreas(Set<ShadeArea> shadeAreas) {
        this.shadeAreas = shadeAreas;
        return this;
    }

    public Batch addShadeArea(ShadeArea shadeArea) {
        this.shadeAreas.add(shadeArea);
        shadeArea.setBatch(this);
        return this;
    }

    public Batch removeShadeArea(ShadeArea shadeArea) {
        this.shadeAreas.remove(shadeArea);
        shadeArea.setBatch(null);
        return this;
    }

    public void setShadeAreas(Set<ShadeArea> shadeAreas) {
        this.shadeAreas = shadeAreas;
    }

    public Nursery getNursery() {
        return nursery;
    }

    public Batch nursery(Nursery nursery) {
        this.nursery = nursery;
        return this;
    }

    public void setNursery(Nursery nursery) {
        this.nursery = nursery;
    }

    public PickListValue getPickListVariety() {
        return pickListVariety;
    }

    public Batch pickListVariety(PickListValue pickListValue) {
        this.pickListVariety = pickListValue;
        return this;
    }

    public void setPickListVariety(PickListValue pickListValue) {
        this.pickListVariety = pickListValue;
    }

    public PickListValue getPickListCategory() {
        return pickListCategory;
    }

    public Batch pickListCategory(PickListValue pickListValue) {
        this.pickListCategory = pickListValue;
        return this;
    }

    public void setPickListCategory(PickListValue pickListValue) {
        this.pickListCategory = pickListValue;
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
        Batch batch = (Batch) o;
        if (batch.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), batch.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Batch{" +
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
            "}";
    }
}
