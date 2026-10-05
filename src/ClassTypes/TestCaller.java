package ClassTypes;

public class TestCaller {
    static void main() {
        Computer gpu = Computer.GPU;
        System.out.println(gpu.name());
        System.out.println(gpu.ordinal());
        System.out.printf("%.2f" , gpu.overAllPrice());
        System.out.println();
    }
}
