package com.niche.jhipster.service.mapper;

import com.niche.jhipster.domain.*;
import com.niche.jhipster.service.dto.BatchDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Batch and its DTO BatchDTO.
 */
@Mapper(componentModel = "spring", uses = {NurseryMapper.class, PickListValueMapper.class})
public interface BatchMapper extends EntityMapper<BatchDTO, Batch> {

    @Mapping(source = "nursery.id", target = "nurseryId")
    @Mapping(source = "nursery.nurseryName", target = "nurseryNurseryName")
    @Mapping(source = "pickListVariety.id", target = "pickListVarietyId")
    @Mapping(source = "pickListVariety.pickListValue", target = "pickListVarietyPickListValue")
    @Mapping(source = "pickListCategory.id", target = "pickListCategoryId")
    @Mapping(source = "pickListCategory.pickListValue", target = "pickListCategoryPickListValue")
    BatchDTO toDto(Batch batch);

    @Mapping(target = "damages", ignore = true)
    @Mapping(target = "shadeAreas", ignore = true)
    @Mapping(source = "nurseryId", target = "nursery")
    @Mapping(source = "pickListVarietyId", target = "pickListVariety")
    @Mapping(source = "pickListCategoryId", target = "pickListCategory")
    Batch toEntity(BatchDTO batchDTO);

    default Batch fromId(Long id) {
        if (id == null) {
            return null;
        }
        Batch batch = new Batch();
        batch.setId(id);
        return batch;
    }
}
