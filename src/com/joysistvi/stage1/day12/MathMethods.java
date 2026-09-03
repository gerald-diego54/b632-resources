package com.joysistvi.stage1.day12;

public class MathMethods
{
    static void main(String[] args)
    {
        /*
         * Math.abs(value)
         * Description: Returns the absolute (non-negative) value of a number.
         * @param value the number to evaluate
         * @return the absolute value of value
         * @example Math.abs(-7) → 7
         */
        int abs = Math.abs(-7);
        System.out.println("Math.abs(-7) = " + abs);

        /*
         * Math.max(value1, value2)
         * Description: Returns the larger of two values.
         * @param value1 the first value
         * @param value2 the second value
         * @return the greater of value1 and value2
         * @example Math.max(4, 9) → 9
         */
        int max = Math.max(4, 9);
        System.out.println("Math.max(4, 9) = " + max);

        /*
         * Math.min(value1, value2)
         * Description: Returns the smaller of two values.
         * @param value1 the first value
         * @param value2 the second value
         * @return the smaller of value1 and value2
         * @example Math.min(4, 9) → 4
         */
        int min = Math.min(4, 9);
        System.out.println("Math.min(4, 9) = " + min);

        /*
         * Math.pow(base, exponent)
         * Description: Returns the value of the first argument raised to the power of the second.
         * @param base the base value
         * @param exponent the exponent value
         * @return base raised to the power of exponent
         * @example Math.pow(2, 5) → 32.0
         */
        double pow = Math.pow(2, 5);
        System.out.println("Math.pow(2, 5) = " + pow);

        /*
         * Math.sqrt(value)
         * Description: Returns the correctly rounded positive square root of a value.
         * @param value the value to take the square root of
         * @return the square root of value
         * @example Math.sqrt(49) → 7.0
         */
        double sqrt = Math.sqrt(49);
        System.out.println("Math.sqrt(49) = " + sqrt);

        /*
         * Math.round(value)
         * Description: Rounds a floating-point value to the nearest integer.
         * @param value the value to round
         * @return the nearest integer (as a long)
         * @example Math.round(4.6) → 5
         */
        long round = Math.round(4.6);
        System.out.println("Math.round(4.6) = " + round);

        /*
         * Math.ceil(value)
         * Description: Rounds a value up to the nearest integer (ceiling).
         * @param value the value to round up
         * @return the smallest integer value not less than value
         * @example Math.ceil(4.1) → 5.0
         */
        double ceil = Math.ceil(4.1);
        System.out.println("Math.ceil(4.1) = " + ceil);

        /*
         * Math.floor(value)
         * Description: Rounds a value down to the nearest integer (floor).
         * @param value the value to round down
         * @return the largest integer value not greater than value
         * @example Math.floor(4.9) → 4.0
         */
        double floor = Math.floor(4.9);
        System.out.println("Math.floor(4.9) = " + floor);

        /*
         * Math.random()
         * Description: Returns a random double value between 0.0 (inclusive) and 1.0 (exclusive).
         * @return a pseudorandom double in the range [0.0, 1.0)
         * @example Math.random() → e.g. 0.7321
         */
        double random = Math.random();
        System.out.println("Math.random() = " + random);

        /*
         * Math.log(value)
         * Description: Returns the natural logarithm (base e) of a value.
         * @param value the value to evaluate
         * @return the natural log of value
         * @example Math.log(Math.E) → 1.0
         */
        double log = Math.log(Math.E);
        System.out.println("Math.log(Math.E) = " + log);

        /*
         * Math.log10(value)
         * Description: Returns the base 10 logarithm of a value.
         * @param value the value to evaluate
         * @return the base-10 log of value
         * @example Math.log10(1000) → 3.0
         */
        double log10 = Math.log10(1000);
        System.out.println("Math.log10(1000) = " + log10);

        /*
         * Math.exp(value)
         * Description: Returns Euler's number e raised to the power of the given value.
         * @param value the exponent
         * @return e raised to the power of value
         * @example Math.exp(1) → 2.718...
         */
        double exp = Math.exp(1);
        System.out.println("Math.exp(1) = " + exp);

        /*
         * Math.sin(radians)
         * Description: Returns the sine of an angle given in radians.
         * @param radians the angle in radians
         * @return the sine of radians
         * @example Math.sin(Math.PI / 2) → 1.0
         */
        double sin = Math.sin(Math.PI / 2);
        System.out.println("Math.sin(PI/2) = " + sin);

        /*
         * Math.cos(radians)
         * Description: Returns the cosine of an angle given in radians.
         * @param radians the angle in radians
         * @return the cosine of radians
         * @example Math.cos(0) → 1.0
         */
        double cos = Math.cos(0);
        System.out.println("Math.cos(0) = " + cos);

        /*
         * Math.tan(radians)
         * Description: Returns the tangent of an angle given in radians.
         * @param radians the angle in radians
         * @return the tangent of radians
         * @example Math.tan(0) → 0.0
         */
        double tan = Math.tan(0);
        System.out.println("Math.tan(0) = " + tan);
    }
}