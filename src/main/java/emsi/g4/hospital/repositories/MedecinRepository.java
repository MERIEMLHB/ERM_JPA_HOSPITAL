package emsi.g4.hospital.repositories;

import emsi.g4.hospital.entities.Medecin;
import emsi.g4.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String nom);
}
