package com.fullcycle.admin.catalogo.domain.validation;

import com.fullcycle.admin.catalogo.domain.exceptions.DomainException;

import java.util.List;

public interface ValidationHandler {
    ValidationHandler append(Error anError);
    ValidationHandler append(ValidationHandler anHandler);
    ValidationHandler validate(Validation aValidation) throws DomainException;
    List<Error> getErrors();
    default boolean hasError() {
        return (getErrors() != null) && !getErrors().isEmpty();
    }

    default Error firstError() {
        if ((getErrors() != null) && !getErrors().isEmpty()) {
            return getErrors().get(0);
        } else {
            return null;
        }

    }
    public interface Validation {
        void validate();
    }

}
