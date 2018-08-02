package com.niche.jhipster.repository;

import com.niche.jhipster.domain.Damage;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Damage entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DamageRepository extends JpaRepository<Damage, Long> {

}
