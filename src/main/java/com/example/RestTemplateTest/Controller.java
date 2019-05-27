package com.example.RestTemplateTest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class Controller {



    @PostMapping("/test/{id}")
    public ResponseEntity<String> testPost3 (@PathVariable String id, @RequestBody String body) {
        if (id.equals("0"))
            return new ResponseEntity<>("{ \"result\" = \"OK\" }" , HttpStatus.OK);
        else
            return new ResponseEntity<>("{ \"result\" = \"NOT OK\" }" , HttpStatus.BAD_REQUEST);
    }

}
