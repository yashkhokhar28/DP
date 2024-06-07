import java.io.*;

public class FileProgram {

    public static void main(String[] args) {
        String filename = "FileProgram.java";
        String newfilename = "cade.txt";
        try {
            File file = new File(filename);
            File newfile = new File(newfilename);
            FileOutputStream fos;
            try (FileInputStream fis = new FileInputStream(file)) {
                fos = new FileOutputStream(newfile);
                byte[] buffer = new byte[1024];
                int len;
                while ((len = fis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
            }
            fos.close();
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}