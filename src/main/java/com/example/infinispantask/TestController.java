package com.example.infinispantask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//instead of this controller you should provide your own socket-controller
@RestController
@RequestMapping(path ="/cache")
public class TestController {


    @Autowired
    private CacheService cacheService;

    @GetMapping("/user")
    public Object getUserCache() {
        return cacheService.get();
    }

    @GetMapping("/update")
    public Object updateUserCache() {
        return cacheService.put();
    }

    @GetMapping("/evict")
    public void evictUserCache() {
        cacheService.evictUserCache();
    }
}
