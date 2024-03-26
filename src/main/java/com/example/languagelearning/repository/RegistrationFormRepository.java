package com.example.languagelearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.languagelearning.model.RegistrationForm;

public interface RegistrationFormRepository extends JpaRepository<RegistrationForm, String> {

}
