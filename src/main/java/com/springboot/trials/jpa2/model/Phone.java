package com.springboot.trials.jpa2.model;

import javax.persistence.Embeddable;

@Embeddable
public class Phone {

    private Integer internationalCode;
    private Integer localNumber;

    public Integer getInternationalCode() {
        return internationalCode;
    }

    public void setInternationalCode(Integer internationalCode) {
        this.internationalCode = internationalCode;
    }

    public Integer getLocalNumber() {
        return localNumber;
    }

    public void setLocalNumber(Integer localNumber) {
        this.localNumber = localNumber;
    }
}
