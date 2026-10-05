package SendingBytes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SenderApplication {
    private final Person p = new Person("John", 83);
    private final File path = new File("/mnt/hdd/Home/Programming Files/Java/DumJava/recieved.ser");

    public void send() {
        try (var out = new ObjectOutputStream(new FileOutputStream(path))) {
            out.writeObject(p);
            System.out.println("FILE SAVED");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
