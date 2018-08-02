package com.niche.jhipster.service.mapper;

import com.niche.jhipster.domain.*;
import com.niche.jhipster.service.dto.PickListDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity PickList and its DTO PickListDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PickListMapper extends EntityMapper<PickListDTO, PickList> {


    @Mapping(target = "pickListValues", ignore = true)
    PickList toEntity(PickListDTO pickListDTO);

    default PickList fromId(Long id) {
        if (id == null) {
            return null;
        }
        PickList pickList = new PickList();
        pickList.setId(id);
        return pickList;
    }
}
