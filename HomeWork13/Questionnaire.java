package HomeWork13;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class Questionnaire {
    private HashMap<String, HashMap<String, String>> response;

    public Questionnaire() {
    }

    public Questionnaire(HashMap<String, HashMap<String, String>> response) {
        this.response = response;
    }

    public HashMap<String, HashMap<String, String>> getResponse() {
        return response;
    }

    public void setResponse(HashMap<String, HashMap<String, String>> response) {
        this.response = response;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        String questionOne = "Do you have fun (y/n): ";
        String questionTwo = "Do you agree (y/n): ";

        System.out.print("State you name: ");
        String name = scanner.next();
        System.out.print(questionOne);
        String responseOne = scanner.next();
        System.out.print(questionTwo);
        String responseTwo = scanner.next();

        HashMap<String, String> questionData = new HashMap<>();
        questionData.put(questionOne, responseOne);
        questionData.put(questionTwo, responseTwo);

        HashMap<String, HashMap<String, String>> allData = new HashMap<>();
        allData.put(name, questionData);

        setResponse(allData);
    }
    public void save() throws IOException {
        Path dirPath = Paths.get(Main.WORK_FILE);
        if (!Files.exists(dirPath.getParent())) {
            Files.createDirectories(dirPath.getParent());
        }
        FileWriter file = new FileWriter(Main.WORK_FILE, true);
        file.write(toString() + "\n");
        file.close();
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "response=" + response +
                '}';
    }
}
