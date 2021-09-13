package com.vissan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CalTax {

    public double calPersonTax(double salary, double ins) {
        double B = 3500;
        double beyond = salary - ins - B;
        double tax = 0;
        if (beyond <= 0) {
            tax = 0;
        } else if (beyond <= 1500) {
            tax = beyond * 0.03;
        } else if (beyond <= 4500) {
            tax = beyond * 0.1 - 105;
        } else if (beyond <= 9000) {
            tax = beyond * 0.2 - 555;
        } else if (beyond <= 35000) {
            tax = beyond * 0.25 - 1005;
        } else if (beyond <= 55000) {
            tax = beyond * 0.3 - 2755;
        } else if (beyond <= 80000) {
            tax = beyond * 0.35 - 5505;
        } else {
            tax = beyond * 0.45 - 13505;
        }
        return tax;
    }

}
