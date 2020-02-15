
package jtm.activity08;

public class SimpleCalc {

    // TODO
	/*
		Implement add, subtract, multiply, divide multiply methods
		Each method should first validate input that a and b values are in range [-10,10]
		Then perform the operation and validate result
		If inputs and outputs are in range, return result
		If validateInput or validateOutput method throws exception - catch it, print stacktrace and return null
	 */

    public static Integer add(int a, int b) {
        try {
            validateInput(a, b);
        } catch (SimpleCalcException e) {
            e.printStackTrace();
            return null;
        }
        int result = a + b;
        try {
            validateOutput(result);
        } catch (SimpleCalcException e) {
            e.printStackTrace();
            return null;
        }
        // TODO implement adding operation
        return result;
    }

    public static Integer subtract(int a, int b) {
        try {
            validateInput(a, b);
        } catch (SimpleCalcException e) {
            e.printStackTrace();
            return null;
        }
        int result = a - b;
        try {
            validateOutput(result);
        } catch (SimpleCalcException e) {
            e.printStackTrace();
            return null;
        }
        // TODO implement subtract operation
        return result;
    }

    public static Integer multiply(int a, int b) {
        // TODO implement multiply operation
        try {
            validateInput(a, b);
        } catch (SimpleCalcException e) {
            e.printStackTrace();
            return null;
        }
        int result = a * b;
        try {
            validateOutput(result);
        } catch (SimpleCalcException e) {
            e.printStackTrace();
            return null;
        }
        return result;
    }

    public static Integer divide(int a, int b) {
        // TODO implement divide operation
        try {
            validateInput(a, b);
        } catch (SimpleCalcException e) {
            e.printStackTrace();
            return null;
        }
        int result = a / b;
        try {
            validateOutput(result);
        } catch (SimpleCalcException e) {
            e.printStackTrace();
            return null;
        }
        return result;
    }

    // TODO
	/*
		1. Specify that method can throw SimpleCalcException
    	2. Check that both input values a and b are in range [-10 .. 10] if either
    		of values are out of range, throw SimpleCalcException with message
    		Input value <value> is out of range [-10,10]
    		where value is the value that's out of range, if a is out of range there's no
    		need to check value b
    */

    private static void validateInput(int a, int b) throws SimpleCalcException {
        //  boolean isACorrect = ((a >= -10) && (a <= 10));
        //boolean isBCorrect = ((b >= -10) && (b <= 10));
        if (a < -10 || a > 10) {
            throw new SimpleCalcException("Input value " + a + " is out of range [-10,10]");
        } else if (b < -10 || b > 10) {
            throw new SimpleCalcException("Input value " + b + " is out of range [-10,10]");
        }
    }

    // TODO
	/*
		1. Specify that method can throw SimpleCalcException
    	2. Check that result is in range [-10 .. 10] if it's out of range,
    		throw SimpleCalcException with message
    		Result <result> is out of range [-10,10]
    		where value is the result is result of executed operation
    */
    private static void validateOutput(int result) throws SimpleCalcException {
        //boolean isResultCorrect = ((result >= -10) && (result <= 10));
        if (result < -10 || result > 10) {
            throw new SimpleCalcException("Result " + result + " is out of range [-10,10]");
        }
    }
}
