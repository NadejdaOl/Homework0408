package org.example;

    public class Converter {
        public double runKelvinConverter(double celsius) {
            return celsius + 273.15;
        }

        public double runFahrenheitConverter(double celsius) {
            return celsius * 9 / 5 + 32;
        }
    }

