package com.leetcode;

public class ConvertTemperature2469 {
    public double[] convertTemperature(double celsius) {
        double val[] = new double[2];
        double kelvin = celsius + 273.15;
        double farenheit = (celsius * 1.80) + 32.00;
        val[0] = kelvin;
        val[1] = farenheit;
        return val;
    }
    public static void main(String[] args) {
        double celsius = 36.50;
        ConvertTemperature2469 convertTemperature2469 = new ConvertTemperature2469();
        double[] result = convertTemperature2469.convertTemperature(celsius);
        for(int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
