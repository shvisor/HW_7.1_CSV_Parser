import java.util.List;

public class Main {

    public static void main(String[] args) {
        Parcer parcer = new Parcer();
        Writer writer = new Writer();

        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "src/main/resources/data.csv";
        List<Employee> list = parcer.parseCSV(columnMapping, fileName);
        String json = parcer.listToJson(list);
        writer.writeString(json);
        System.out.println(json);
    }
}
