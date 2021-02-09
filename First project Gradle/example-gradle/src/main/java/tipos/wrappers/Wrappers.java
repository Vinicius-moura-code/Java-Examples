package tipos.wrappers;

public class Wrappers {
    public static void main(String[] args) {
        //Autoboxing

        Byte b = 127;  //byte
        Byte b1 = -128;
        Byte nullByte = null;

        Character c = 'A'; //char
        Character c1 = 15;

        Short s = 32767; //short
        Short s1 = -32768;

        Integer i = 2147483647;  //int
        Integer i1 = -2147483648;

        Long l = 9223372036854775807l;  //long
        Long l1 = -9223372036854775808l;

        Float f = 65f; //float
        Float f1 = 65.0f;

        Boolean bo = true;
        Boolean bo1 = false;

        Boolean bo2 = Boolean.getBoolean("false");  //OK
        Boolean bo3 = Boolean.valueOf("true");  //OK
    }
}
