package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Erb")
@Slf4j
public class NativeController {

    @PostMapping
    public ResponseEntity<String> createErb(@RequestBody String name,
                                            @RequestHeader HttpHeaders headers)  {
        log.info("request: {}", name);
        return ResponseEntity.ok("name");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getErb(@PathVariable String id,
                                         @RequestHeader HttpHeaders headers)  {
        log.info("request: {}", id);
        return ResponseEntity.ok(id);
    }



}

