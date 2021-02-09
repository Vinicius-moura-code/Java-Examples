package tipos.primitivos;

public class Primitivos {
    public static void main(String[] args){
        //INTEIROS

        //byte nullByte = null;

        byte b;              //8bits
        byte b1 = 127;
        byte b2 = -128;
        //byte b3 = 129;    //To large

        char c;
        char c1 = 'A';
        char c2 = 15;
        //char c3 = 'AA';    //NOK
        //char c4 = -100;    //NOK

        short s;             //16bits
        short s1 = 32767;
        short s2 = -32768;

        int i = 2147483647;  //32bits
        int i1 = -2147483648;
        //int i2 = -2147483648; // To large

        long l = 9223372036854775807l;     //64bits
        long l1 = -9223372036854775808l;
        //long l2 = 9223372036854775808L; // To large

        //FLUTUANTES
        float f = 65f;       //32bits     3.402,823,5 E+38
        float f1 = 65.0f;
        float f2 = -0.5f;    //1.4 e -45

        double d = 1024.99;  //64bits
        double d1 = 10.2456;

        //BOOLEANO

        boolean bo = true;
        boolean bo2 = false;

        //void v; //palavra reservada

        //System.out.println("byte : " + b);  //ERROR

    }
}
