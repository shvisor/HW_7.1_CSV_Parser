import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Writer {

    public void writeString(String json, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(json);
            writer.append('\n');
            writer.flush();
        } catch (FileAlreadyExistsException e) {
            System.out.println(e.getMessage() + "Файл уже существует.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
