package dk.practice.dataservice.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "code"
)
@Data
@Table(name = "country")
@Entity
public class Country implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(insertable = false, name = "Code", nullable = false)
    private String code = "";

    @Column(name = "Name", nullable = false)
    private String name = "";

    @Column(name = "Continent", nullable = false)
    private String continent = "Asia";

    @Column(name = "Region", nullable = false)
    private String region = "";

    @Column(name = "SurfaceArea", nullable = false)
    private BigDecimal surfaceArea = BigDecimal.ZERO;

    @Column(name = "IndepYear")
    private Integer indepYear;

    @Column(name = "Population", nullable = false)
    private Integer population = 0;

    @Column(name = "LifeExpectancy")
    private BigDecimal lifeExpectancy;

    @Column(name = "GNP")
    private BigDecimal gnp;

    @Column(name = "GNPOld")
    private BigDecimal gnpold;

    @Column(name = "LocalName", nullable = false)
    private String localName = "";

    @Column(name = "GovernmentForm", nullable = false)
    private String governmentForm = "";

    @Column(name = "HeadOfState")
    private String headOfState;

    @Column(name = "Capital")
    private Integer capital;

    @Column(name = "Code2", nullable = false)
    private String code2 = "";

    //    @JsonBackReference(value="city-country")
    @JsonIgnore
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<City> cities = new ArrayList<>();

    //    @JsonBackReference(value="lang-country")
    @JsonIgnore
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CountryLanguage> countryLanguages = new ArrayList<>();

}