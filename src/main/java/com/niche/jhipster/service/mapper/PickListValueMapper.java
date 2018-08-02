package com.niche.jhipster.service.mapper;

import com.niche.jhipster.domain.*;
import com.niche.jhipster.service.dto.PickListValueDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity PickListValue and its DTO PickListValueDTO.
 */
@Mapper(componentModel = "spring", uses = {PickListMapper.class})
public interface PickListValueMapper extends EntityMapper<PickListValueDTO, PickListValue> {

    @Mapping(source = "pickList.id", target = "pickListId")
    @Mapping(source = "pickList.pickListName", target = "pickListPickListName")
    @Mapping(source = "pickValue.id", target = "pickValueId")
    @Mapping(source = "pickValue.pickListValue", target = "pickValuePickListValue")
    PickListValueDTO toDto(PickListValue pickListValue);

    @Mapping(target = "selfIds", ignore = true)
    @Mapping(target = "varietys", ignore = true)
    @Mapping(target = "categorys", ignore = true)
    @Mapping(source = "pickListId", target = "pickList")
    @Mapping(source = "pickValueId", target = "pickValue")
    PickListValue toEntity(PickListValueDTO pickListValueDTO);

    default PickListValue fromId(Long id) {
        if (id == null) {
            return null;
        }
        PickListValue pickListValue = new PickListValue();
        pickListValue.setId(id);
        return pickListValue;
    }
}
