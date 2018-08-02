package com.niche.jhipster.service;

import com.niche.jhipster.service.dto.NurseryDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing Nursery.
 */
public interface NurseryService {

    /**
     * Save a nursery.
     *
     * @param nurseryDTO the entity to save
     * @return the persisted entity
     */
    NurseryDTO save(NurseryDTO nurseryDTO);

    /**
     * Get all the nurseries.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<NurseryDTO> findAll(Pageable pageable);


    /**
     * Get the "id" nursery.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<NurseryDTO> findOne(Long id);

    /**
     * Delete the "id" nursery.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
