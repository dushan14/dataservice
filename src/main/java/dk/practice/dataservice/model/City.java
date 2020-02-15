package dk.practice.dataservice.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
@Table(name = "city")
@Data
@Entity
public class City implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false)
    private String name = "";

//    @JsonManagedReference(value = "city-country")
    @ManyToOne
    @JoinColumn(name = "CountryCode", insertable = false, nullable = false)
    private Country country;

    @Column(name = "District", nullable = false)
    private String district = "";

    @Column(name = "Population", nullable = false)
    private Integer population = 0;

}