package BaybeConcepts;

public class OverloadItUp {
    public String parameter(int a) {
        return "I have one string";
    }

    public String parameter(String a) {
        return "No i have string you have integer";
    }
}
