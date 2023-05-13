package com.example.demo.constraints;

import com.example.demo.validations.NomeCandidato;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;




public class NomeCandidatoConstraint implements ConstraintValidator<NomeCandidato, String> {
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        try {
            if (!value.matches("[a-z]{5}[0-9]{2}")) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

}