package cz.czechitas.java2webapps.ukol5.service;

import cz.czechitas.java2webapps.ukol5.controller.RegistrationForm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegistrationService {
    private final List<RegistrationForm> registrations = new ArrayList<>();

    public List<RegistrationForm> getAllRegistrations() {
        return new ArrayList<>(registrations);
    }

    public RegistrationForm getRegistrationByIndex(int index) {
        if (index >= 0 && index < registrations.size()) {
            return registrations.get(index);
        } else {
            return null;
        }
    }

    public void addRegistration(RegistrationForm registrationForm) {
        registrations.add(registrationForm);
    }
}
