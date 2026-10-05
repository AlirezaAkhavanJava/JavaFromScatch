package Pack1;

public class ExceptionByPurpose {
    public void top() {
        second();
    }

    public void second() {
        try {
            theLast();
        }catch (IllegalArgumentException illegalArgumentException){
            System.out.println("Illegal argument ");
        }
    }

    public void theLast() throws IllegalArgumentException {
        String method = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName();

        throw new IllegalArgumentException(
                "\u001B[31m=========== Error occurred in: "
                        + method
                        + " ===========\u001B[0m"
        );
    }
}
