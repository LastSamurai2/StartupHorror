package com.company.projects;

public enum DaysToRealisation {
    FRONTEND(0),
    BACKEND(0),
    DATABASE(0),
    MOBILE(0),
    WORDPRESS(0),
    PRESTASHOP(0);

    private Integer daysNumber;

    DaysToRealisation(Integer daysNumber) {
        this.daysNumber = daysNumber;
    }
}
