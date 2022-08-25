package com.jingyu.restws;

import com.jingyu.restws.model.Patient;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.util.*;


@Service
public class PatientServiceImpl implements PatientService {

    Map<Long, Patient> patients = new HashMap<>();
    long currentID = 123;

    public PatientServiceImpl() {
        init();
    }

    void init() {
        Patient patient = new Patient();
        patient.setId(currentID);
        patient.setName("John");
        patients.put(patient.getId(), patient);
    }

    public List<Patient> getPatients() {
        Collection<Patient> results = patients.values();
        return new ArrayList<>(results);
    }

    @Override
    public Patient getPatient(Long id) {
        return patients.get(id);
    }

    @Override
    public Response createPatient(Patient patient) {
        patient.setId(++currentID);
        patients.put(patient.getId(), patient);
        return Response.ok(patient).build();
    }

    @Override
    public Response updatePatient(Patient patient) {
        Patient currentPatient = patients.get(patient.getId());

        Response response;

        if (currentPatient != null) {
            patients.put(currentPatient.getId(), patient);
            response = Response.ok().build();
        } else {
            response = Response.notModified().build();
        }

        return response;
    }

    @Override
    public Response removePatient(Long id) {

        Patient currentPatient = patients.get(id);

        Response response;

        if (currentPatient != null) {
            patients.remove(id);
            response = Response.ok().build();
        } else {
            response = Response.notModified().build();
        }

        return response;
    }
}
