package com.example.demo.constraints;

import com.example.demo.validations.CnpjEmpresa;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class CnpjEmpresaConstraint implements ConstraintValidator<CnpjEmpresa, String> {
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        try {
            if (!value.matches("^[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}\\/[0-9]{4}\\-[0-9]{2}$")) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }}