package com.niche.jhipster.repository;

import com.niche.jhipster.domain.ShadeArea;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ShadeArea entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ShadeAreaRepository extends JpaRepository<ShadeArea, Long> {

}
