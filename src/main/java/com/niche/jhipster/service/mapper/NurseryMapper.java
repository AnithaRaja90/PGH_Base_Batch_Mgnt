package com.niche.jhipster.service.mapper;

import com.niche.jhipster.domain.*;
import com.niche.jhipster.service.dto.NurseryDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Nursery and its DTO NurseryDTO.
 */
@Mapper(componentModel = "spring", uses = {SectorMapper.class})
public interface NurseryMapper extends EntityMapper<NurseryDTO, Nursery> {

    @Mapping(source = "sector.id", target = "sectorId")
    @Mapping(source = "sector.sectorName", target = "sectorSectorName")
    NurseryDTO toDto(Nursery nursery);

    @Mapping(target = "batchs", ignore = true)
    @Mapping(source = "sectorId", target = "sector")
    Nursery toEntity(NurseryDTO nurseryDTO);

    default Nursery fromId(Long id) {
        if (id == null) {
            return null;
        }
        Nursery nursery = new Nursery();
        nursery.setId(id);
        return nursery;
    }
}
