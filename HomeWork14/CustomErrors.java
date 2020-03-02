package HomeWork14;

import java.io.FileNotFoundException;
import java.io.StreamCorruptedException;

public class CustomErrors {
    public void fileException() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public void classException() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    public void streamException() throws StreamCorruptedException {
        throw new StreamCorruptedException();
    }
}
