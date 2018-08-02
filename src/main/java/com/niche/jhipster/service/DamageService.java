package com.niche.jhipster.service;

import com.niche.jhipster.service.dto.DamageDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing Damage.
 */
public interface DamageService {

    /**
     * Save a damage.
     *
     * @param damageDTO the entity to save
     * @return the persisted entity
     */
    DamageDTO save(DamageDTO damageDTO);

    /**
     * Get all the damages.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<DamageDTO> findAll(Pageable pageable);


    /**
     * Get the "id" damage.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<DamageDTO> findOne(Long id);

    /**
     * Delete the "id" damage.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
