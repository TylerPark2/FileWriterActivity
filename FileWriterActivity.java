import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterActivity {
    
    public void createHiddenFileWithPassword(String password) {
        File hiddenFile = new File(".huluPassword.txt");

        try {
            if (!hiddenFile.exists()) {
                hiddenFile.createNewFile();
            }

            FileWriter writer = new FileWriter(hiddenFile);
            writer.write(password);
            writer.close();

            System.out.println("Hidden file '.huluPassword.txt' created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createFileInHiddenFolder(String topSecretData) {
        File hiddenFolder = new File(".uniqueClassifiedFolder");
        File regularFile = new File(hiddenFolder, "regularFile.dat");

        try {
            if (!hiddenFolder.exists()) {
                hiddenFolder.mkdir();
                System.out.println("Hidden folder '.uniqueClassifiedFolder' created successfully.");
            }

            if (!regularFile.exists()) {
                regularFile.createNewFile();
            }

            FileWriter fw = new FileWriter(regularFile);
            fw.write(topSecretData);
            fw.close();

            System.out.println("File 'regularFile.dat' created inside hidden folder '.uniqueClassifiedFolder' successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileWriterActivity fileWriterActivity = new FileWriterActivity();

        String password = "SuperSecretPassword!";
        fileWriterActivity.createHiddenFileWithPassword(password);

        String topSecretData = "This is top-secret information.";
        fileWriterActivity.createFileInHiddenFolder(topSecretData);
    }

    public static void printFileSize (String filename) {
        // code this ourselves
    }
}