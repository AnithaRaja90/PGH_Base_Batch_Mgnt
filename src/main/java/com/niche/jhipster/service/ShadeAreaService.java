package com.niche.jhipster.service;

import com.niche.jhipster.service.dto.ShadeAreaDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing ShadeArea.
 */
public interface ShadeAreaService {

    /**
     * Save a shadeArea.
     *
     * @param shadeAreaDTO the entity to save
     * @return the persisted entity
     */
    ShadeAreaDTO save(ShadeAreaDTO shadeAreaDTO);

    /**
     * Get all the shadeAreas.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<ShadeAreaDTO> findAll(Pageable pageable);


    /**
     * Get the "id" shadeArea.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<ShadeAreaDTO> findOne(Long id);

    /**
     * Delete the "id" shadeArea.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
