package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.record.doctor.DoctorRecord;
import med.voll.api.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    DoctorService service;

    @PostMapping
    @Transactional
    public ResponseEntity<String> register(@RequestBody @Valid DoctorRecord doctor) {
        service.register(doctor.toEntity());
        return ResponseEntity.ok("Okay");
    }
}
