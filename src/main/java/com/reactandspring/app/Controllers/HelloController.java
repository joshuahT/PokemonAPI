package com.reactandspring.app.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class HelloController {
        @RequestMapping(value = "/hello", method=RequestMethod.GET)
        public ResponseEntity<Object> hello(){
            Map<String, String> str = new HashMap<>();
            str.put("Message","Hello");
            return new ResponseEntity<>(str, HttpStatus.OK);
        }

}
