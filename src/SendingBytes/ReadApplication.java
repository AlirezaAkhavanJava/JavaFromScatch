package SendingBytes;

import java.io.*;

public class ReadApplication {
    private final File path = new File("/mnt/hdd/Home/Programming Files/Java/DumJava/recieved.ser");

    public void read() {
        try (var in = new ObjectInputStream(new FileInputStream(path))) {
            Person john = (Person) in.readObject();
            System.out.println(john.toString());
        } catch (IOException | ClassNotFoundException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
