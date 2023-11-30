//package com.example.infinispantask;
//
//import org.infinispan.spring.embedded.provider.SpringEmbeddedCacheManagerFactoryBean;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//@Configuration
//@EnableCaching
//public class CacheConfig {
//
//    @Bean
//    @Primary
//    public CacheManager cacheManager(SpringEmbeddedCacheManagerFactoryBean factory) throws Exception {
//        return factory.getObject();
//    }
//
//    @Bean
//    public SpringEmbeddedCacheManagerFactoryBean springCache() {
//        return new SpringEmbeddedCacheManagerFactoryBean();
//    }
//
//}