package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(1);
        float dollar = Converter.rubleToDollar(1);
        System.out.println("140 rubles are " + euro + " euro or " + dollar + " dollars.");
    }
}