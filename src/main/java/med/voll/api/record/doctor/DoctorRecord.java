package med.voll.api.record.doctor;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.entity.DoctorEntity;
import med.voll.api.record.address.AddressRecord;

public record DoctorRecord(
        @NotBlank
        String name,
        @Email
        String email,
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        Specialty specialty,
        @NotNull @Valid
        AddressRecord address) {

    public DoctorEntity toEntity () {
        DoctorEntity entity = new DoctorEntity();

        entity.setName(this.name);
        entity.setEmail(this.email);
        entity.setCrm(this.crm);
        entity.setSpecialty(this.specialty);
        entity.setAddress(this.address().toEntity());

        return entity;
    }
}
