package test;

import javax.security.sasl.SaslServer;

public class test {
    private String something;

    public test(){
        something = "";
    }

    public void print()
    {
        something = "hi";
        System.out.println(something);
    }
}
