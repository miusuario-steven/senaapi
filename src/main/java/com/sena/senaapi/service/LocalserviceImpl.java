package com.sena.senaapi.service;
import com.sena.senaapi.entity.Local;
import com.sena.senaapi.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class LocalserviceImpl implements LocalService{

    @Autowired
    LocalRepository repository;

    @Override
    public List<Local> findAll() {
        return repository.findAll();
    }
    
}
