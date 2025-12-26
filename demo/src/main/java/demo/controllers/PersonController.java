package demo.controllers;



import demo.DTO.PersonDTO;
import demo.Service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/person")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    public PersonDTO create(@RequestBody PersonDTO dto) {
        System.out.println(dto);
        return service.createPerson(dto);
    }

    @GetMapping
    public List<PersonDTO> all() {
        return service.getAll();
    }

    @GetMapping("/{email}")
    public PersonDTO get(@PathVariable String email) {
        return service.getByEmail(email);
    }

    @DeleteMapping("/{email}")
    public String delete(@PathVariable String email) {
        service.deletePerson(email);
        return "Deleted: " + email;
    }
}