package com.niche.jhipster.service.mapper;

import com.niche.jhipster.domain.*;
import com.niche.jhipster.service.dto.DamageDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Damage and its DTO DamageDTO.
 */
@Mapper(componentModel = "spring", uses = {BatchMapper.class})
public interface DamageMapper extends EntityMapper<DamageDTO, Damage> {

    @Mapping(source = "batch.id", target = "batchId")
    @Mapping(source = "batch.batchName", target = "batchBatchName")
    DamageDTO toDto(Damage damage);

    @Mapping(source = "batchId", target = "batch")
    Damage toEntity(DamageDTO damageDTO);

    default Damage fromId(Long id) {
        if (id == null) {
            return null;
        }
        Damage damage = new Damage();
        damage.setId(id);
        return damage;
    }
}
