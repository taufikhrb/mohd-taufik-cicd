package testNg;



import org.springframework.web.bind.annotation.*;
import java.io.File;
import java.util.*;

@RestController
@RequestMapping("/mcp")
public class MCPController {

    private static final String SCREENSHOT_DIR = "test-output/screenshots/";

    @GetMapping("/failed_tests")
    public List<Map<String, String>> failedTests() {
        return TestNGReportParser.getFailedTests();
    }

    @GetMapping("/screenshot/{testName}")
    public Map<String, String> getScreenshot(@PathVariable String testName) {
        String path = SCREENSHOT_DIR + testName + ".png";
        File f = new File(path);
        if (f.exists()) return Map.of("screenshot_path", f.getAbsolutePath());
        else return Map.of("error", "Screenshot not found");
    }

    @PostMapping("/ticket")
    public String createTicket(@RequestBody Map<String, String> body) {
        // TODO: Add Jira REST API integration
        return "Ticket created for " + body.get("testName");
    }
}

