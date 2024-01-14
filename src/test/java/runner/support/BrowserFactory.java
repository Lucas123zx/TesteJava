package runner.support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {
    public static enum Browser {
        CHROME,
        CHROME_HEADLESS
    }
    public static WebDriver getBrowser() {
        //variaveis necessárias
        return getBrownser(Browser.CHROME); // Browser Default
    }
    public static WebDriver getBrownser(Browser browserUser) {
        ChromeOptions options;
        WebDriver resultBrowser;

        switch (browserUser) {
            case CHROME:
                options = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-crash-reporter");
                options.addArguments("--disable-extensions");
                options.addArguments("--disable-in-process-stack-traces");
                options.addArguments("--disable-logging");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--disable-notifications");
                options.addArguments("--log-level=3");
                options.addArguments("--output=/dev/null");
                resultBrowser = new ChromeDriver(options);
                resultBrowser.manage().window().maximize();
                break;
            case CHROME_HEADLESS:
                options = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                options.addArguments("--lang=pt-BR");
                options.addArguments("--headless");
                options.addArguments("--disable-gpu");
                options.addArguments("--window-size=1920,1080");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-crash-reporter");
                options.addArguments("--disable-extensions");
                options.addArguments("--disable-in-process-stack-traces");
                options.addArguments("--disable-logging");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--disable-notifications");
                options.addArguments("--log-level=3");
                options.addArguments("--output=/dev/null");
                resultBrowser = new ChromeDriver(options);
                break;
            default:
                resultBrowser = null;
                new Exception("Browser Nao Suportado");
        }
        return resultBrowser;
    }
}

