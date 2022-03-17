package com.revature.controllers;

import com.revature.models.Cat;
import com.revature.services.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class CatController {

    @Autowired
    private CatService catService;

    @GetMapping("/cats/{id}")
    public ResponseEntity<Cat> getCatById(@PathVariable("id") int id) {
        return ResponseEntity.of(catService.findById(id));
    }

    @PostMapping("/cats/")
    public Cat createCat(@RequestBody Cat cat) {
        return catService.save(cat);
    }
}
