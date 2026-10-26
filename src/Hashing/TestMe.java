package Hashing;

public class TestMe {
    static void main() {

        HashMe<String> me = new HashMe<>();
        HashMe<String> me1 = new HashMe<>();
        HashMe<String> me2 = new HashMe<>();

        //Reflexive
        System.out.println(me.equals(me));
        //Symmetric
        System.out.println(me.equals(me1) == me1.equals(me));




    }
}
