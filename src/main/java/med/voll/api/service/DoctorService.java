package med.voll.api.service;

import med.voll.api.entity.DoctorEntity;
import med.voll.api.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DoctorService {

    @Autowired
    private DoctorRepository repository;

    public DoctorEntity register(DoctorEntity entity) {
        return repository.save(entity);
    }
}
