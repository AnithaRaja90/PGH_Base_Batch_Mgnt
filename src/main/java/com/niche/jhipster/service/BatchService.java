package com.niche.jhipster.service;

import com.niche.jhipster.service.dto.BatchDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing Batch.
 */
public interface BatchService {

    /**
     * Save a batch.
     *
     * @param batchDTO the entity to save
     * @return the persisted entity
     */
    BatchDTO save(BatchDTO batchDTO);

    /**
     * Get all the batches.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<BatchDTO> findAll(Pageable pageable);


    /**
     * Get the "id" batch.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<BatchDTO> findOne(Long id);

    /**
     * Delete the "id" batch.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
