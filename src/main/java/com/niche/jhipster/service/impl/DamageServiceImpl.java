package com.niche.jhipster.service.impl;

import com.niche.jhipster.service.DamageService;
import com.niche.jhipster.domain.Damage;
import com.niche.jhipster.repository.DamageRepository;
import com.niche.jhipster.service.dto.DamageDTO;
import com.niche.jhipster.service.mapper.DamageMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;
/**
 * Service Implementation for managing Damage.
 */
@Service
@Transactional
public class DamageServiceImpl implements DamageService {

    private final Logger log = LoggerFactory.getLogger(DamageServiceImpl.class);

    private final DamageRepository damageRepository;

    private final DamageMapper damageMapper;

    public DamageServiceImpl(DamageRepository damageRepository, DamageMapper damageMapper) {
        this.damageRepository = damageRepository;
        this.damageMapper = damageMapper;
    }

    /**
     * Save a damage.
     *
     * @param damageDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public DamageDTO save(DamageDTO damageDTO) {
        log.debug("Request to save Damage : {}", damageDTO);
        Damage damage = damageMapper.toEntity(damageDTO);
        damage = damageRepository.save(damage);
        return damageMapper.toDto(damage);
    }

    /**
     * Get all the damages.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<DamageDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Damages");
        return damageRepository.findAll(pageable)
            .map(damageMapper::toDto);
    }


    /**
     * Get one damage by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<DamageDTO> findOne(Long id) {
        log.debug("Request to get Damage : {}", id);
        return damageRepository.findById(id)
            .map(damageMapper::toDto);
    }

    /**
     * Delete the damage by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Damage : {}", id);
        damageRepository.deleteById(id);
    }
}
