package HomeWork14;

import java.io.FileNotFoundException;
import java.io.StreamCorruptedException;

public class IntermediateClass implements AutoCloseable{
    public void callFile() throws FileNotFoundException {
        new CustomErrors().fileException();
    }
    public void callClass() throws ClassNotFoundException {
        new CustomErrors().classException();
    }
    public void callStream() throws StreamCorruptedException {
        new CustomErrors().streamException();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Something closed!");
    }
}
