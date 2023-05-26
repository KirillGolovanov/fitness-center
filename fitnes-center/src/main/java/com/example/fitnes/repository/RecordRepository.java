package com.example.fitnes.repository;

import com.example.fitnes.model.Record;
import com.example.fitnes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
    List<Record> findAllByUser(User user);
}
