package com.example.demo.validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.example.demo.constraints.CnpjEmpresaConstraint;

import jakarta.validation.Constraint;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = CnpjEmpresaConstraint.class)
public @interface CnpjEmpresa {
    
}
