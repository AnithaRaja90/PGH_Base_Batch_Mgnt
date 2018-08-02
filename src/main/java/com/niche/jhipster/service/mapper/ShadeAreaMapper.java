package com.niche.jhipster.service.mapper;

import com.niche.jhipster.domain.*;
import com.niche.jhipster.service.dto.ShadeAreaDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity ShadeArea and its DTO ShadeAreaDTO.
 */
@Mapper(componentModel = "spring", uses = {BatchMapper.class})
public interface ShadeAreaMapper extends EntityMapper<ShadeAreaDTO, ShadeArea> {

    @Mapping(source = "batch.id", target = "batchId")
    @Mapping(source = "batch.batchName", target = "batchBatchName")
    ShadeAreaDTO toDto(ShadeArea shadeArea);

    @Mapping(source = "batchId", target = "batch")
    ShadeArea toEntity(ShadeAreaDTO shadeAreaDTO);

    default ShadeArea fromId(Long id) {
        if (id == null) {
            return null;
        }
        ShadeArea shadeArea = new ShadeArea();
        shadeArea.setId(id);
        return shadeArea;
    }
}
