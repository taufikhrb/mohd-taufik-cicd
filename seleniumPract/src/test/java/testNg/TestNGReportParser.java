package testNg;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.util.*;

public class TestNGReportParser {

    private static final String REPORT_FILE = "test-output/testng-results.xml";

    public static List<Map<String, String>> getFailedTests() {
        List<Map<String, String>> failedTests = new ArrayList<>();
        try {
            File xmlFile = new File(REPORT_FILE);
            if (!xmlFile.exists()) return failedTests;

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);

            NodeList testNodes = doc.getElementsByTagName("test-method");

            for (int i = 0; i < testNodes.getLength(); i++) {
                Element test = (Element) testNodes.item(i);
                if ("FAIL".equals(test.getAttribute("status"))) {
                    Map<String, String> t = new HashMap<>();
                    t.put("name", test.getAttribute("name"));
                    t.put("class", test.getAttribute("class"));
                    t.put("duration", test.getAttribute("duration-ms"));
                    failedTests.add(t);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return failedTests;
    }
}

