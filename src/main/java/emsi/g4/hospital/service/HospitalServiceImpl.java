package emsi.g4.hospital.service;

import emsi.g4.hospital.entities.Consultation;
import emsi.g4.hospital.entities.Medecin;
import emsi.g4.hospital.entities.Patient;
import emsi.g4.hospital.entities.RendezVous;
import emsi.g4.hospital.repositories.ConsultationRepository;
import emsi.g4.hospital.repositories.MedecinRepository;
import emsi.g4.hospital.repositories.PatientRepository;
import emsi.g4.hospital.repositories.RendezVousRepository;
import jakarta.persistence.Temporal;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService{
    @Autowired
    private PatientRepository  patientRepository;
    private MedecinRepository   medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository,
                               MedecinRepository medecinRepository,
                               RendezVousRepository rendezVousRepository,
                               ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);
    }
    @Override
    public Medecin saveMedecin(Medecin medecin){
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
