package com.hazelspring.service;

import org.springframework.cache.annotation.*;
import org.springframework.stereotype.*;

@Service
public class BoatService {

    @Cacheable("boats")
    public String getBoatModelByName(String name) {
        return findBoatInStorage(name);
    }

    private String findBoatInStorage(String name) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (name.equals("grizzly")) {
            return "Tracker 1654";
        }

        return "Model not in storage";
    }
}
