package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Records;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface RecordsRepository extends JpaRepository<Records, String>{
	
	@Query(value = "INSERT INTO controllordinitest.dbo.Records(FSId, FSBlob) SELECT NEWID(), BulkColumn FROM OPENROWSET(BULK ?, SINGLE_BLOB)  as f;", nativeQuery= true)
	@Modifying
	void saveFile(String path);

}
