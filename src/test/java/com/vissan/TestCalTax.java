package com.vissan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCalTax {

    @Test
    public void testTax() {
        List<Double> salary = new ArrayList<>();
        List<Double> expect = new ArrayList<>();
        salary.add(3499.0);
        salary.add(3500.0);
        salary.add(3501.0);
        salary.add(4999.0);
        salary.add(5000.0);
        salary.add(5001.0);
        salary.add(7999.0);
        salary.add(8000.0);
        salary.add(8001.0);
        salary.add(12499.0);
        salary.add(12500.0);
        salary.add(12501.0);
        salary.add(38499.0);
        salary.add(38500.0);
        salary.add(38501.0);
        salary.add(58499.0);
        salary.add(58500.0);
        salary.add(58501.0);
        salary.add(83499.0);
        salary.add(83500.0);
        salary.add(83501.0);

        expect.add(0.0);
        expect.add(0.0);
        expect.add(0.03);
        expect.add(44.97);
        expect.add(45.0);
        expect.add(45.1);
        expect.add(344.9);
        expect.add(345.0);
        expect.add(345.2);
        expect.add(1244.8);
        expect.add(1245.0);
        expect.add(1245.25);
        expect.add(7744.75);
        expect.add(7745.0);
        expect.add(7745.3);
        expect.add(13744.7);
        expect.add(13745.0);
        expect.add(13745.35);
        expect.add(22494.65);
        expect.add(22495.0);
        expect.add(22495.45);

        for (int i=0; i<salary.size(); i++) {
            Assertions.assertEquals(expect.get(i), new CalTax().calPersonTax(salary.get(i), 0), "测试出错");
        }
    }
}
