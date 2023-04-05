package med.voll.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Embeddable
public class AddressEntity {

    private String streetName;
    private String neighborhood;
    private String postCode;
    private String city;
    private String fu;
    private String complement;
    private String number;

}
