package com.niche.jhipster.config;

import java.time.Duration;

import org.ehcache.config.builders.*;
import org.ehcache.jsr107.Eh107Configuration;

import io.github.jhipster.config.jcache.BeanClassLoaderAwareJCacheRegionFactory;
import io.github.jhipster.config.JHipsterProperties;

import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;

@Configuration
@EnableCaching
public class CacheConfiguration {

    private final javax.cache.configuration.Configuration<Object, Object> jcacheConfiguration;

    public CacheConfiguration(JHipsterProperties jHipsterProperties) {
        BeanClassLoaderAwareJCacheRegionFactory.setBeanClassLoader(this.getClass().getClassLoader());
        JHipsterProperties.Cache.Ehcache ehcache =
            jHipsterProperties.getCache().getEhcache();

        jcacheConfiguration = Eh107Configuration.fromEhcacheCacheConfiguration(
            CacheConfigurationBuilder.newCacheConfigurationBuilder(Object.class, Object.class,
                ResourcePoolsBuilder.heap(ehcache.getMaxEntries()))
                .withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(Duration.ofSeconds(ehcache.getTimeToLiveSeconds())))
                .build());
    }

    @Bean
    public JCacheManagerCustomizer cacheManagerCustomizer() {
        return cm -> {
            cm.createCache(com.niche.jhipster.repository.UserRepository.USERS_BY_LOGIN_CACHE, jcacheConfiguration);
            cm.createCache(com.niche.jhipster.repository.UserRepository.USERS_BY_EMAIL_CACHE, jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.User.class.getName(), jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.Authority.class.getName(), jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.User.class.getName() + ".authorities", jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.PersistentToken.class.getName(), jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.User.class.getName() + ".persistentTokens", jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.Zonal.class.getName(), jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.Zonal.class.getName() + ".sectors", jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.Sector.class.getName(), jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.Sector.class.getName() + ".nurserys", jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.Nursery.class.getName(), jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.Nursery.class.getName() + ".batchs", jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.PickList.class.getName(), jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.PickList.class.getName() + ".pickListValues", jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.PickListValue.class.getName(), jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.PickListValue.class.getName() + ".selfIds", jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.PickListValue.class.getName() + ".varietys", jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.PickListValue.class.getName() + ".categorys", jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.Batch.class.getName(), jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.Batch.class.getName() + ".damages", jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.Batch.class.getName() + ".shadeAreas", jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.Damage.class.getName(), jcacheConfiguration);
            cm.createCache(com.niche.jhipster.domain.ShadeArea.class.getName(), jcacheConfiguration);
            // jhipster-needle-ehcache-add-entry
        };
    }
}
