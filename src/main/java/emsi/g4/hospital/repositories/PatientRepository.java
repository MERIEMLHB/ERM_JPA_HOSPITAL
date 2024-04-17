package emsi.g4.hospital.repositories;

import emsi.g4.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    Patient findByNom(String name);

}

