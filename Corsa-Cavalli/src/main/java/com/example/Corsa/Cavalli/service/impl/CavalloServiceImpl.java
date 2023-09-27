package com.example.Corsa.Cavalli.service.impl;

import com.example.Corsa.Cavalli.model.Cavallo;
import com.example.Corsa.Cavalli.model.dto.ResponseDto;
import com.example.Corsa.Cavalli.repository.CavalloRepository;
import com.example.Corsa.Cavalli.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CavalloServiceImpl implements GenericService {

    @Autowired
    CavalloRepository cavalloRepository;

    @Override
    public <T> void save(T p) {
        cavalloRepository.save((Cavallo) p);
    }

    @Override
    public <T> List<T> findAll() {
        return (List<T>) cavalloRepository.findAll();
    }

    @Override
    public <T> Object findById(Integer id) {
        return cavalloRepository.findById(id);
    }



}