package com.revature.services;

import com.revature.models.Cat;
import com.revature.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CatServiceImpl implements CatService {

    @Autowired
    private CatRepository catRepository;

    @Override
    public Cat save(Cat cat) {
        return catRepository.save(cat);
    }

    @Override
    public Optional<Cat> findById(int id) {
        return catRepository.findById(id);
    }
}
