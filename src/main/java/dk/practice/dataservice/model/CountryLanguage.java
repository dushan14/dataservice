package dk.practice.dataservice.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "countrylanguage")
@IdClass(CountryLanguageId.class)
public class CountryLanguage implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Language", nullable = false)
    private String language = "";

    @Id
    @Column(name = "CountryCode", insertable = false, nullable = false)
    private String countryCode;

//    @EmbeddedId
//    CountryLanguageId id;

    @Column(name = "IsOfficial", nullable = false)
    private String isOfficial = "F";

    @Column(name = "Percentage", nullable = false)
    private BigDecimal percentage = BigDecimal.ZERO;

    @JsonManagedReference

    @MapsId("code")
    @ManyToOne
    @JoinColumn(name = "CountryCode", insertable = false, nullable = false)
    private Country country;

}