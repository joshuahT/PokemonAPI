package com.reactandspring.app.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class PokemonController {
        @RequestMapping(value = "/hello", method=RequestMethod.GET)
        public ResponseEntity<Object> hello(){
            Map<String, String> str = new HashMap<>();
            str.put("Message","Pokemon");
            return new ResponseEntity<>(str, HttpStatus.OK);
        }

}
