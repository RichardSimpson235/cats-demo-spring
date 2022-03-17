package com.revature.services;

import com.revature.models.Cat;

import java.util.Optional;

public interface CatService {

    public Cat save(Cat cat);
    public Optional<Cat> findById(int id);
}
