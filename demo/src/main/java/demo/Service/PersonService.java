package demo.Service;



import demo.DTO.PersonDTO;
import demo.Entity.Person;
import demo.Repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonRepository repo;

    public PersonService(PersonRepository repo) {
        this.repo = repo;
    }

    public PersonDTO createPerson(PersonDTO dto) {
        Person p = new Person(dto.getEmail(), dto.getUserId(), dto.getPassword());
        repo.save(p);
        return dto;
    }

    public List<PersonDTO> getAll() {
        return repo.findAll().stream()
                .map(p -> new PersonDTO(p.getEmail(), p.getUserId(), p.getPassword()))
                .collect(Collectors.toList());
    }

    public PersonDTO getByEmail(String email) {
        Person p = repo.findById(email)
                .orElseThrow(() -> new RuntimeException("Person not found"));
        return new PersonDTO(p.getEmail(), p.getUserId(), p.getPassword());
    }
    public PersonDTO getById(String Id){
        Person p = repo.findById(Id)
                .orElseThrow(() -> new RuntimeException("Person not found with this ID"));
        return new PersonDTO(p.getEmail(),p.getUserId(),p.getPassword());
    }

    public void deletePerson(String email) {
        repo.deleteById(email);
    }
}
