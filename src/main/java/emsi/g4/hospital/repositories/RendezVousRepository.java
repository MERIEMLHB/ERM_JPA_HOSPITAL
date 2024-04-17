package emsi.g4.hospital.repositories;

import emsi.g4.hospital.entities.Medecin;
import emsi.g4.hospital.entities.Patient;
import emsi.g4.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,String>{
}
