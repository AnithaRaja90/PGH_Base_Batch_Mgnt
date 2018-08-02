package com.niche.jhipster.repository;

import com.niche.jhipster.domain.PickList;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PickList entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PickListRepository extends JpaRepository<PickList, Long> {

}
