package HomeWork9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

final public class Admin extends User {
    private String accessGroup;

    public Admin() {
    }

    public Admin(String name, String surname, String mail, String password, String gender, String country, String accessGroup) {
        super(name, surname, mail, password, gender, country);
        this.accessGroup = accessGroup;
    }

    public void check(Boolean status) throws IOException {
        if (status) Files.deleteIfExists(Paths.get(Main.WORK_FILE));
    }

    public String getAccessGroup() {
        return accessGroup;
    }

    public void setAccessGroup(String accessGroup) {
        this.accessGroup = accessGroup;
    }
}
