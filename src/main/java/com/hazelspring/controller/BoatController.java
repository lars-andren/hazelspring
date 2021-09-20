package com.hazelspring.controller;

import com.hazelspring.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boats")
public class BoatController {

    @Autowired
    private BoatService boatService;

    @GetMapping("/{name}")
    public String getBoatModelByName(@PathVariable("name") String name) {
        return boatService.getBoatModelByName(name);
    }
}
