package com.korit.springboot_basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class DataController {

    @GetMapping("/api/names")
    public ResponseEntity<List<String>> getNames() {
        List<String> names = List.of("김준일", "김준이", "김준삼");
        return ResponseEntity.ok(names);
    }
    @GetMapping("/api/addresses")
    public ResponseEntity<List<String>> getAddresses() {
        List<String> addresses = List.of("부산진구", "동래구", "북구", "남구", "서구");
        return ResponseEntity.ok(addresses);
    }
}