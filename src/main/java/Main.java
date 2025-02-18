import java.util.List;

public class Main {
    private static final String FILE_NAME_CSV = "data.csv";
    private static final String FILE_NAME_XML = "data.xml";
    private static final String RESULT_CSV_TO_JSON = "data.json";
    private static final String RESULT_XML_TO_JSON = "data2.json";

    public static void main(String[] args) {
        Parcer parcer = new Parcer();
        Writer writer = new Writer();

        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};

        List<Employee> listCsv = parcer.parseCSV(columnMapping, FILE_NAME_CSV);
        String csvToJson = parcer.listToJson(listCsv);
        writer.writeString(csvToJson, RESULT_CSV_TO_JSON);

        List<Employee> listXml = parcer.parseXml(FILE_NAME_XML);
        String xmlToJson = parcer.listToJson(listXml);
        writer.writeString(xmlToJson, RESULT_XML_TO_JSON);
    }
}
