package com.niche.jhipster.service.impl;

import com.niche.jhipster.service.NurseryService;
import com.niche.jhipster.domain.Nursery;
import com.niche.jhipster.repository.NurseryRepository;
import com.niche.jhipster.service.dto.NurseryDTO;
import com.niche.jhipster.service.mapper.NurseryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;
/**
 * Service Implementation for managing Nursery.
 */
@Service
@Transactional
public class NurseryServiceImpl implements NurseryService {

    private final Logger log = LoggerFactory.getLogger(NurseryServiceImpl.class);

    private final NurseryRepository nurseryRepository;

    private final NurseryMapper nurseryMapper;

    public NurseryServiceImpl(NurseryRepository nurseryRepository, NurseryMapper nurseryMapper) {
        this.nurseryRepository = nurseryRepository;
        this.nurseryMapper = nurseryMapper;
    }

    /**
     * Save a nursery.
     *
     * @param nurseryDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public NurseryDTO save(NurseryDTO nurseryDTO) {
        log.debug("Request to save Nursery : {}", nurseryDTO);
        Nursery nursery = nurseryMapper.toEntity(nurseryDTO);
        nursery = nurseryRepository.save(nursery);
        return nurseryMapper.toDto(nursery);
    }

    /**
     * Get all the nurseries.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<NurseryDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Nurseries");
        return nurseryRepository.findAll(pageable)
            .map(nurseryMapper::toDto);
    }


    /**
     * Get one nursery by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<NurseryDTO> findOne(Long id) {
        log.debug("Request to get Nursery : {}", id);
        return nurseryRepository.findById(id)
            .map(nurseryMapper::toDto);
    }

    /**
     * Delete the nursery by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Nursery : {}", id);
        nurseryRepository.deleteById(id);
    }
}
