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
 * A Nursery.
 */
@Entity
@Table(name = "nursery")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Nursery implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "nursery_name", nullable = false)
    private String nurseryName;

    @Column(name = "nursery_address")
    private String nurseryAddress;

    @Column(name = "nursery_incharge")
    private String nurseryIncharge;

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

    @OneToMany(mappedBy = "nursery")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Batch> batchs = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties("nurserys")
    private Sector sector;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNurseryName() {
        return nurseryName;
    }

    public Nursery nurseryName(String nurseryName) {
        this.nurseryName = nurseryName;
        return this;
    }

    public void setNurseryName(String nurseryName) {
        this.nurseryName = nurseryName;
    }

    public String getNurseryAddress() {
        return nurseryAddress;
    }

    public Nursery nurseryAddress(String nurseryAddress) {
        this.nurseryAddress = nurseryAddress;
        return this;
    }

    public void setNurseryAddress(String nurseryAddress) {
        this.nurseryAddress = nurseryAddress;
    }

    public String getNurseryIncharge() {
        return nurseryIncharge;
    }

    public Nursery nurseryIncharge(String nurseryIncharge) {
        this.nurseryIncharge = nurseryIncharge;
        return this;
    }

    public void setNurseryIncharge(String nurseryIncharge) {
        this.nurseryIncharge = nurseryIncharge;
    }

    public Integer getStatus() {
        return status;
    }

    public Nursery status(Integer status) {
        this.status = status;
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public Nursery createdBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public Nursery modifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Nursery createdAt(Instant createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Nursery updatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Set<Batch> getBatchs() {
        return batchs;
    }

    public Nursery batchs(Set<Batch> batches) {
        this.batchs = batches;
        return this;
    }

    public Nursery addBatchs(Batch batch) {
        this.batchs.add(batch);
        batch.setNursery(this);
        return this;
    }

    public Nursery removeBatchs(Batch batch) {
        this.batchs.remove(batch);
        batch.setNursery(null);
        return this;
    }

    public void setBatchs(Set<Batch> batches) {
        this.batchs = batches;
    }

    public Sector getSector() {
        return sector;
    }

    public Nursery sector(Sector sector) {
        this.sector = sector;
        return this;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
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
        Nursery nursery = (Nursery) o;
        if (nursery.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), nursery.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Nursery{" +
            "id=" + getId() +
            ", nurseryName='" + getNurseryName() + "'" +
            ", nurseryAddress='" + getNurseryAddress() + "'" +
            ", nurseryIncharge='" + getNurseryIncharge() + "'" +
            ", status=" + getStatus() +
            ", createdBy=" + getCreatedBy() +
            ", modifiedBy=" + getModifiedBy() +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            "}";
    }
}
