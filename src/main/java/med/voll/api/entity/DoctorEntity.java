package med.voll.api.entity;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.record.doctor.Specialty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString

@Entity(name = "Doctor")
@Table(name = "tb_doctors")
public class DoctorEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private AddressEntity address;
}
