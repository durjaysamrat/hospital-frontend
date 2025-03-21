package com.app.service;

import com.app.model.Doctor;
import com.app.repo.DoctorusersRepository;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorusersService {

	private final DoctorusersRepository doctorusersRepository;

    public DoctorusersService(DoctorusersRepository doctorusersRepository) {
        this.doctorusersRepository = doctorusersRepository;
    }

    public List<Doctor> getAllUsers() {
        return doctorusersRepository.findAll();
    }

    public Optional<Doctor> getUserById(Long id) {
        return doctorusersRepository.findById(id);
    }

    public Doctor addUser(Doctor doctor) {
        return doctorusersRepository.save(doctor);
    }

    public Doctor updateUser(Doctor Doctor) {
        return doctorusersRepository.save(Doctor);
    }

    public boolean deleteUser(Long id) {
        if (doctorusersRepository.existsById(id)) {
            doctorusersRepository.deleteById(id);
            return true;  
        } else {
            return false;
        }
    }
}

