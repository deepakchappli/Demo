package Demo;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import com.applitools.eyes.visualgrid.services.RunnerOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class DemoApplitools {
//this is a example.
    public static void main(String[] args) {
        // Create a new chrome web driver
        WebDriver webDriver = new ChromeDriver();

        // Create a runner with concurrency of 1
        VisualGridRunner runner = new VisualGridRunner(new RunnerOptions().testConcurrency(5));

        // Create Eyes object with the runner, meaning it'll be a Visual Grid eyes.
        Eyes eyes = new Eyes(runner);

        setUp(eyes);

        try {
            // ⭐️ Note to see visual bugs, run the test using the above URL for the 1st run.
            // but then change the above URL to https://demo.applitools.com/index_v2.html
            // (for the 2nd run)
            ultraFastTest(webDriver, eyes);

        } finally {
            tearDown(webDriver, runner);
        }

    }

    public static void setUp(Eyes eyes) {

        // Initialize eyes Configuration
        Configuration config = eyes.getConfiguration();

        // You can get your api key from the Applitools dashboard
        config.setApiKey("eAcV2Ms8Z1Lno7dlbQL9es9QpxWCkMKL34RlXRLNPik110"); //My API key
        //config.setApiKey("Ukw1VB3104G0A4ur0h2cvy7eLXzXrjd3YLi4yWUs19vW4110");

        // create a new batch info instance and set it to the configuration
        config.setBatch(new BatchInfo("Ultrafast Batch"));

        // Add browsers with different viewports
        config.addBrowser(1200, 600, BrowserType.CHROME);
        config.addBrowser(2560, 1440, BrowserType.CHROME);
        config.addBrowser(1366, 768, BrowserType.CHROME_TWO_VERSIONS_BACK);
        config.addBrowser(1200, 800, BrowserType.CHROME_ONE_VERSION_BACK);
        config.addBrowser(1300, 500, BrowserType.FIREFOX);
        config.addBrowser(1920, 1080, BrowserType.FIREFOX_ONE_VERSION_BACK);
        config.addBrowser(1200, 600, BrowserType.FIREFOX_TWO_VERSIONS_BACK);
        config.addBrowser(1024, 768, BrowserType.EDGE_CHROMIUM);
        config.addBrowser(2560, 1440, BrowserType.EDGE_CHROMIUM);
        config.addBrowser(1366, 768, BrowserType.EDGE_CHROMIUM);
        config.addBrowser(1200, 800, BrowserType.EDGE_CHROMIUM);
        config.addBrowser(800, 600, BrowserType.SAFARI);
        config.addBrowser(1920, 1080, BrowserType.SAFARI_TWO_VERSIONS_BACK);
        config.addBrowser(1200, 800, BrowserType.SAFARI_ONE_VERSION_BACK);
        config.addBrowser(1600, 1200, BrowserType.IE_11);
        config.addBrowser(1600, 1080, BrowserType.IE_11);
        config.addBrowser(1920, 800, BrowserType.IE_11);
        config.addBrowser(1200, 600, BrowserType.FIREFOX);
        config.addBrowser(1100, 600, BrowserType.IE_11);
        config.addBrowser(1200, 600, BrowserType.SAFARI_TWO_VERSIONS_BACK);
        config.addBrowser(1200, 600, BrowserType.FIREFOX_ONE_VERSION_BACK);
        config.addBrowser(1200, 600, BrowserType.CHROME_ONE_VERSION_BACK);
        config.addBrowser(1200, 600, BrowserType.CHROME_TWO_VERSIONS_BACK);
        config.addBrowser(1200, 600, BrowserType.IE_11);
        config.addBrowser(1200, 600, BrowserType.IE_10);
        config.addBrowser(1600, 1080, BrowserType.IE_10);
        config.addBrowser(1920, 800, BrowserType.IE_10);
        config.addBrowser(1920, 800, BrowserType.CHROME);
        config.addBrowser(1920, 800, BrowserType.SAFARI);
        config.addBrowser(1920, 800, BrowserType.FIREFOX);
        config.addBrowser(1920, 800, BrowserType.CHROME_ONE_VERSION_BACK);
        config.addBrowser(1300, 500, BrowserType.CHROME_ONE_VERSION_BACK);
        config.addBrowser(1920, 1080, BrowserType.CHROME);
        config.addBrowser(1200, 600, BrowserType.SAFARI);
        config.addBrowser(1024, 768, BrowserType.SAFARI_ONE_VERSION_BACK);
        config.addBrowser(2560, 1440, BrowserType.SAFARI_TWO_VERSIONS_BACK);
        config.addBrowser(1366, 768, BrowserType.CHROME_ONE_VERSION_BACK);
        config.addBrowser(1200, 800, BrowserType.EDGE_CHROMIUM);
        config.addBrowser(1300, 500, BrowserType.IE_11);
        config.addBrowser(1920, 1080, BrowserType.CHROME);
        config.addBrowser(1200, 600, BrowserType.EDGE_CHROMIUM);
        config.addBrowser(1024, 768, BrowserType.SAFARI);
        config.addBrowser(2560, 1440, BrowserType.CHROME_TWO_VERSIONS_BACK);
        config.addBrowser(1366, 768, BrowserType.FIREFOX_ONE_VERSION_BACK);
        config.addBrowser(1200, 800, BrowserType.FIREFOX);



        // Add mobile emulation devices in Portrait mode
        config.addDeviceEmulation(DeviceName.Pixel_2, ScreenOrientation.PORTRAIT);
        config.addDeviceEmulation(DeviceName.iPad_Air_2, ScreenOrientation.PORTRAIT);
        config.addDeviceEmulation(DeviceName.Galaxy_S20, ScreenOrientation.PORTRAIT);
        config.addDeviceEmulation(DeviceName.iPhone_11_Pro_Max, ScreenOrientation.PORTRAIT);
        config.addDeviceEmulation(DeviceName.iPhone_XR, ScreenOrientation.PORTRAIT);
        config.addDeviceEmulation(DeviceName.iPhone_XS, ScreenOrientation.PORTRAIT);
        config.addDeviceEmulation(DeviceName.Pixel_4, ScreenOrientation.PORTRAIT);
        config.addDeviceEmulation(DeviceName.iPad_Mini, ScreenOrientation.PORTRAIT);
        config.addDeviceEmulation(DeviceName.iPad_Pro, ScreenOrientation.PORTRAIT);
        config.addDeviceEmulation(DeviceName.OnePlus_7T_Pro, ScreenOrientation.LANDSCAPE);
        config.addDeviceEmulation(DeviceName.Galaxy_S10_Plus, ScreenOrientation.LANDSCAPE);
        config.addDeviceEmulation(DeviceName.Galaxy_Note_10_Plus, ScreenOrientation.LANDSCAPE);
        config.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT);

        // Set the configuration object to eyes
        eyes.setConfiguration(config);

    }

    public static void ultraFastTest(WebDriver webDriver, Eyes eyes) {

        try {

            // Navigate to the url we want to test
            //webDriver.get("https://demo.applitools.com"); //main application
            webDriver.get("https://demo.applitools.com/index_v2.html"); //checkpoint application

            // Call Open on eyes to initialize a test session
            eyes.open(webDriver, "Demo App Applitools", "Ultrafast grid demo", new RectangleSize(800, 600));

            // check the login page with fluent api, see more info here
            // https://applitools.com/docs/topics/sdk/the-eyes-sdk-check-fluent-api.html
            eyes.check(Target.window().fully().withName("Login page"));

            webDriver.findElement(By.id("log-in")).click();

            // Check the app page
            eyes.check(Target.window().fully().withName("App page"));
            eyes.check(Target.region(By.cssSelector("body > div > div.layout-w > div.content-w > div > div > div:nth-child(2) > div > div > table > tbody > tr:nth-child(2) > td.cell-with-media")).withName("Stripe"));

            // Call Close on eyes to let the server know it should display the results
            eyes.closeAsync();

        } finally  {
            eyes.abortAsync();
        }

    }

    private static void tearDown(WebDriver webDriver, VisualGridRunner runner) {
        // Close the browser
        webDriver.quit();

        // we pass false to this method to suppress the exception that is thrown if we
        // find visual differences
        TestResultsSummary allTestResults = runner.getAllTestResults(false);
        System.out.println(allTestResults);
    }

}

