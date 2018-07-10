package com.shm.service.impl;

import com.shm.entity.Studentt;
import com.shm.mapper.StuMapper;
import com.shm.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StuMapper mapper;

    @Override
    public List<Studentt> getList() {
        return mapper.getList();
    }
}
