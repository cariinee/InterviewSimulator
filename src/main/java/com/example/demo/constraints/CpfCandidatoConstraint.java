package com.example.demo.constraints;

import com.example.demo.validations.CpfCandidato;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class CpfCandidatoConstraint implements ConstraintValidator<CpfCandidato, String> {
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        try {
            if (!value.matches("[0-9]{11}")) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }}

