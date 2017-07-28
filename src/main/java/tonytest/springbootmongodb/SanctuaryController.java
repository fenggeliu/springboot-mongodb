package tonytest.springbootmongodb;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sanctuaries")
public class SanctuaryController {
    private SanctuaryRepository sanctuaryRepository;

    public SanctuaryController(SanctuaryRepository sanctuaryRepository) {
        this.sanctuaryRepository = sanctuaryRepository;
    }

    @GetMapping("/all")
    public List<Sanctuary> getAll(){
        List<Sanctuary> sanctuaries = this.sanctuaryRepository.findAll();

        return sanctuaries;
    }

    @PutMapping
    public void insert(@RequestBody Sanctuary sanctuary){
        this.sanctuaryRepository.insert(sanctuary);
    }

    @PostMapping
    public void update(@RequestBody Sanctuary sanctuary){
        this.sanctuaryRepository.save(sanctuary);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        this.sanctuaryRepository.delete(id);
    }

    @GetMapping("/{id}")
    public Sanctuary getById(@PathVariable("id") String id){
        Sanctuary sanctuary = this. sanctuaryRepository.findById(id);

        return sanctuary;
    }

    @GetMapping("/price/{maxPrice}")
    public  List<Sanctuary> getByPricePerNight(@PathVariable("maxPrice") int maxPrice){
        List<Sanctuary> sanctuaries = this.sanctuaryRepository.findByPricePerNightLessThan(maxPrice);

        return sanctuaries;
    }

    @GetMapping("/address/{city}")
    public List<Sanctuary> getByCity(@PathVariable("city") String city){
        List<Sanctuary> sanctuaries = this.sanctuaryRepository.findByCity(city);

        return sanctuaries;
    }

}
