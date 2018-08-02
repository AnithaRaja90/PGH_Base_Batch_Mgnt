package com.niche.jhipster.repository;

import com.niche.jhipster.domain.PickListValue;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PickListValue entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PickListValueRepository extends JpaRepository<PickListValue, Long> {

}
