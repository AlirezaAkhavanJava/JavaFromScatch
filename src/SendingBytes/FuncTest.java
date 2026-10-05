package SendingBytes;

public class FuncTest {
    static void main() {
        SenderApplication senderApplication = new SenderApplication();
        senderApplication.send();
        ReadApplication readApplication = new ReadApplication();
        readApplication.read();

    }

}
