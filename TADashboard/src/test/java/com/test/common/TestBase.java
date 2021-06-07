package com.test.common;

import com.logigear.driver.DriverUtils;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;

public class TestBase extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @BeforeMethod
    @Parameters("browser")
    public void setUpBrowser(@Optional("chrome.local") String browser) {
        BrowserHelper.setCurrentBrowser(browser);
        BrowserHelper.startBrowser(browser);
    }

    @AfterMethod
    public void closeBrowser() {
        DriverUtils.quitAllBrowsers();
    }
}