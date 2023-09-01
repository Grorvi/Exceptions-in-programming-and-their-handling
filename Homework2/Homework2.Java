import java.io.*;

public class FileManager {

    // Метод для чтения содержимого файла
    public String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("
");
            }
        }
        return content.toString();
    }

    // Метод для записи данных в файл
    public void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }

    // Метод для копирования файла
    public void copyFile(String sourceFilePath, String destinationFilePath) throws IOException {
        try (InputStream in = new FileInputStream(sourceFilePath);
             OutputStream out = new FileOutputStream(destinationFilePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }
}
