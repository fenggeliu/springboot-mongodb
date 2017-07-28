package tonytest.springbootmongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanctuaryRepository extends MongoRepository<Sanctuary,String> {
    Sanctuary findById(String id);
    List<Sanctuary> findByPricePerNightLessThan(int maxPrice);

    @Query(value = "{address.city:?0}")
    List<Sanctuary> findByCity(String City);
}
