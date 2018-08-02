package com.niche.jhipster.service.impl;

import com.niche.jhipster.service.ShadeAreaService;
import com.niche.jhipster.domain.ShadeArea;
import com.niche.jhipster.repository.ShadeAreaRepository;
import com.niche.jhipster.service.dto.ShadeAreaDTO;
import com.niche.jhipster.service.mapper.ShadeAreaMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;
/**
 * Service Implementation for managing ShadeArea.
 */
@Service
@Transactional
public class ShadeAreaServiceImpl implements ShadeAreaService {

    private final Logger log = LoggerFactory.getLogger(ShadeAreaServiceImpl.class);

    private final ShadeAreaRepository shadeAreaRepository;

    private final ShadeAreaMapper shadeAreaMapper;

    public ShadeAreaServiceImpl(ShadeAreaRepository shadeAreaRepository, ShadeAreaMapper shadeAreaMapper) {
        this.shadeAreaRepository = shadeAreaRepository;
        this.shadeAreaMapper = shadeAreaMapper;
    }

    /**
     * Save a shadeArea.
     *
     * @param shadeAreaDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public ShadeAreaDTO save(ShadeAreaDTO shadeAreaDTO) {
        log.debug("Request to save ShadeArea : {}", shadeAreaDTO);
        ShadeArea shadeArea = shadeAreaMapper.toEntity(shadeAreaDTO);
        shadeArea = shadeAreaRepository.save(shadeArea);
        return shadeAreaMapper.toDto(shadeArea);
    }

    /**
     * Get all the shadeAreas.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<ShadeAreaDTO> findAll(Pageable pageable) {
        log.debug("Request to get all ShadeAreas");
        return shadeAreaRepository.findAll(pageable)
            .map(shadeAreaMapper::toDto);
    }


    /**
     * Get one shadeArea by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<ShadeAreaDTO> findOne(Long id) {
        log.debug("Request to get ShadeArea : {}", id);
        return shadeAreaRepository.findById(id)
            .map(shadeAreaMapper::toDto);
    }

    /**
     * Delete the shadeArea by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete ShadeArea : {}", id);
        shadeAreaRepository.deleteById(id);
    }
}
