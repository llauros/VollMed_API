package med.voll.api.record.doctor;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.entity.DoctorEntity;
import med.voll.api.record.address.AddressRecord;

public record DoctorDtoList(
        String name,
        String email,
        String crm,
        Specialty specialty) {

    public DoctorDtoList (DoctorEntity entity){
        this(entity.getName(), entity.getEmail(), entity.getCrm(), entity.getSpecialty());
    }
}
