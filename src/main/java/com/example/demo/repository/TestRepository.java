package com.example.demo.repository;

import com.example.demo.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TestRepository extends JpaRepository<Test, Integer> {

  @Modifying
  @Query(value = "insert into controllordinitest.dbo.Test (testo) Values(?)", nativeQuery = true)
  void saveText(String testo);

}
