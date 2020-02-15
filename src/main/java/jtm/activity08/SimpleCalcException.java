package jtm.activity08;

public class SimpleCalcException extends Exception {

   public SimpleCalcException(String msg){
        super(msg);
    }

    public SimpleCalcException(String msg, Throwable cause){
       super(msg,cause);
    }

}
