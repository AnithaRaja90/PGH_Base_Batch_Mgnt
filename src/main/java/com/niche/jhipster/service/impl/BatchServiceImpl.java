package com.niche.jhipster.service.impl;

import com.niche.jhipster.service.BatchService;
import com.niche.jhipster.domain.Batch;
import com.niche.jhipster.repository.BatchRepository;
import com.niche.jhipster.service.dto.BatchDTO;
import com.niche.jhipster.service.mapper.BatchMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;
/**
 * Service Implementation for managing Batch.
 */
@Service
@Transactional
public class BatchServiceImpl implements BatchService {

    private final Logger log = LoggerFactory.getLogger(BatchServiceImpl.class);

    private final BatchRepository batchRepository;

    private final BatchMapper batchMapper;

    public BatchServiceImpl(BatchRepository batchRepository, BatchMapper batchMapper) {
        this.batchRepository = batchRepository;
        this.batchMapper = batchMapper;
    }

    /**
     * Save a batch.
     *
     * @param batchDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public BatchDTO save(BatchDTO batchDTO) {
        log.debug("Request to save Batch : {}", batchDTO);
        Batch batch = batchMapper.toEntity(batchDTO);
        batch = batchRepository.save(batch);
        return batchMapper.toDto(batch);
    }

    /**
     * Get all the batches.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<BatchDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Batches");
        return batchRepository.findAll(pageable)
            .map(batchMapper::toDto);
    }


    /**
     * Get one batch by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<BatchDTO> findOne(Long id) {
        log.debug("Request to get Batch : {}", id);
        return batchRepository.findById(id)
            .map(batchMapper::toDto);
    }

    /**
     * Delete the batch by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Batch : {}", id);
        batchRepository.deleteById(id);
    }
}
