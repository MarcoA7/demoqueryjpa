package com.example.demo.controller;

import com.example.demo.repository.TestRepository;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.repository.RecordsRepository;

@RestController
public class TestController {
	@Autowired
	EntityManager entityManager;
	@Autowired
	RecordsRepository recordsRepository;
	@Autowired
	TestRepository testRepository;
	
	@PostMapping("/test")
	@Transactional
	public ResponseEntity<?> test(@RequestPart("file") MultipartFile file) throws IOException {
		Path tempFile = Files.createTempFile("", file.getOriginalFilename());
        file.transferTo(tempFile.toFile());
        String path = tempFile.toString().replace("\\", "\\\\");
        recordsRepository.saveFile(path);
        //entityManager.
        //entityManager.createNativeQuery("INSERT INTO controllordinitest.dbo.Records(FSId, FSBlob) SELECT NEWID(), BulkColumn FROM OPENROWSET(BULK (?), SINGLE_BLOB) as f;").setParameter(1, path).executeUpdate();
		return ResponseEntity.ok(path);
	}

	@GetMapping("lol")
	@Transactional
	ResponseEntity<?> lol() {

		testRepository.saveText("eccomi");

		return ResponseEntity.ok().build();
	}
}
