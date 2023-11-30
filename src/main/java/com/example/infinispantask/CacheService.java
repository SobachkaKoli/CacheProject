package com.example.infinispantask;


import lombok.SneakyThrows;
import org.infinispan.manager.EmbeddedCacheManager;
import org.infinispan.spring.embedded.provider.SpringEmbeddedCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CacheService {

    private final SpringEmbeddedCacheManager myCacheManager;

    @Autowired
    public CacheService(SpringEmbeddedCacheManager myCacheManager) {
        this.myCacheManager = myCacheManager;
    }


    @SneakyThrows
    @Cacheable(value = "myCache")
    public Object get() {
        System.out.println("Fetching from method for user cache");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/api/user", String.class);
        myCacheManager.getCache("myCache");
        return response.getBody();
    }

    @CachePut(value = "myCache")
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
