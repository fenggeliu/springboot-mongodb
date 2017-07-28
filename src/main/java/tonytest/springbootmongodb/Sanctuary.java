package tonytest.springbootmongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Sanctuaries")
public class Sanctuary {
    @Id
    private String id;
    private String name;
    @Indexed(direction = IndexDirection.ASCENDING)
    private int pricePerNight;
    private Address address;
    private List<Review> reviews;

    public Sanctuary(String name, int pricePerNight, Address address, List<Review> review) {
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.address = address;
        this.reviews = review;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public Address getAddress() {
        return address;
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
