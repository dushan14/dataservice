package dk.practice.dataservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CountryLanguageId implements Serializable {

    @Column(name = "CountryCode", insertable = false, nullable = false)
    private String countryCode;

    @Column(name = "Language", nullable = false)
    private String language = "";

    @Override
    public String toString() {
        return countryCode + '-' +language ;
    }
}
