package com.shm.service.impl;

import com.shm.entity.Studentt;
import com.shm.mapper.GoupMapper;
import com.shm.service.GoupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoupServiceImpl implements GoupService {
    @Autowired
    private GoupMapper mapper;

    @Override
    public List<Studentt> getList() {
        return mapper.getList();
    }
}
