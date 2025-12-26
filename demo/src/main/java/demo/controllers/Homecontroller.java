package demo.controllers;


import demo.DTO.PersonDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class Homecontroller {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello All";
    }

//    @PostMapping("/create")
//    public String creating(@RequestBody Notes student){
//        System.out.println(student);
//        return "created the student";
//    }

    @PostMapping("/validate")

    public boolean Validate(@RequestBody PersonDTO person){

    }
}
