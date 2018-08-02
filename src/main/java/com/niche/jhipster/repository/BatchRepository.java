package com.niche.jhipster.repository;

import com.niche.jhipster.domain.Batch;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Batch entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BatchRepository extends JpaRepository<Batch, Long> {

}
