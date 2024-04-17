package emsi.g4.hospital.service;

import emsi.g4.hospital.entities.Consultation;
import emsi.g4.hospital.entities.Medecin;
import emsi.g4.hospital.entities.Patient;
import emsi.g4.hospital.entities.RendezVous;

public interface IHospitalService  {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);


}
