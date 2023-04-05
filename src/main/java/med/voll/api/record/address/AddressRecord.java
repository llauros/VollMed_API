package med.voll.api.record.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import med.voll.api.entity.AddressEntity;

public record AddressRecord(
        @NotBlank
        String streetName,
        String neighborhood,
        @Pattern(regexp = "\\d{8}")
        String postCode,
        String city,
        String fu,
        String complement,
        String number) {

    public AddressEntity toEntity() {
        AddressEntity entity = new AddressEntity();

        entity.setStreetName(this.streetName);
        entity.setNeighborhood(this.neighborhood);
        entity.setPostCode(this.postCode);
        entity.setCity(this.city);
        entity.setFu(this.fu);
        entity.setComplement(this.complement);
        entity.setNumber(this.number);

        return entity;
    }
}
