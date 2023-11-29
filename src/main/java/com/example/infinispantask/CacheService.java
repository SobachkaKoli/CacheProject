package com.example.infinispantask;


import lombok.SneakyThrows;
import org.infinispan.manager.EmbeddedCacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CacheService {

    private final EmbeddedCacheManager embeddedCacheManager;

    public CacheService(EmbeddedCacheManager embeddedCacheManager) {
        this.embeddedCacheManager = embeddedCacheManager;
    }

    @SneakyThrows
    @Cacheable("user")
    public Object get() {
        System.out.println("Fetching from method for user cache");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/api/user", String.class);
        return response.getBody();
    }

    @CachePut("user")
    public Object put() {
        System.out.println("Putting into user cache");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/api/user", String.class);
        return response.getBody();
    }

    @CacheEvict("user")
    public void evictUserCache() {


    }
//    @SneakyThrows
//    @Scheduled(fixedDelay = 5000)
//    public void scheduledTask() {
//        System.out.println("Executing scheduled task every 5 seconds");
//        System.out.println(put());
//    }
}
