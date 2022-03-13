/*
 * Jiayu Li
 * 2022/02/23
 * This class converts from celsius to fahrenheit and vise versa according to the inputted value.
 */

public class JiayuLi_CFConverter_2022 {

    static double celsiusToFahrenheit(double celsius) {
        //celsius to Fahrenheit, return double
        return (9.0 / 5.0) * celsius + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        //fahrenheit to Celsius, return double
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
}