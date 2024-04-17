package emsi.g4.hospital.repositories;

import emsi.g4.hospital.entities.Consultation;
import emsi.g4.hospital.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {

}
