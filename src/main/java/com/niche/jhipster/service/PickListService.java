package com.niche.jhipster.service;

import com.niche.jhipster.service.dto.PickListDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing PickList.
 */
public interface PickListService {

    /**
     * Save a pickList.
     *
     * @param pickListDTO the entity to save
     * @return the persisted entity
     */
    PickListDTO save(PickListDTO pickListDTO);

    /**
     * Get all the pickLists.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<PickListDTO> findAll(Pageable pageable);


    /**
     * Get the "id" pickList.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<PickListDTO> findOne(Long id);

    /**
     * Delete the "id" pickList.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
