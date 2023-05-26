package com.example.fitnes.service;

import com.example.fitnes.model.Record;
import com.example.fitnes.repository.RecordRepository;
import com.example.fitnes.web.dto.RecordDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements RecordService{

    @Autowired
    private RecordRepository recordRepository;


    @Override
    public void save(Record record) {
        recordRepository.save(record);
    }
}
