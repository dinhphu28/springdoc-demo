package com.ndp.demospringdoc.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/demos")
public class DemoController {
    
    @GetMapping(
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> getDemo() {
        ResponseEntity<Object> entity;

        entity = new ResponseEntity<>("{ \"Notice\": \"OK\" }", HttpStatus.OK);

        return entity;
    }
}
