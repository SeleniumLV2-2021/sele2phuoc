package com.test.Constant;

import org.openqa.selenium.WebDriver;

public class Constant {
    public static final int TIMEOUT_IN_SECONDS = 5;
    public static final int DRIVER_TIMEOUT = 30;
    public static final int DRIVER_PAGE_LOAD_TIMEOUT = 60;
    public static final String BROWSER_SETTING_FILE = "src/main/resources/browsers.setting.ini";
    public static WebDriver WEBDRIVER;
    public static final String DASHBOARD_URL = "http://localhost/TADashboard/login.jsp";

    //Login Page
    public static final String SAMPLE_REPOSITORY = "SampleRepository";
    public static final String USERNAME = "Administrator";
    public static final String PASSWORD = "";
    public static final String INVALID_USERNAME = "Administra";
    public static final String INVALID_PASSWORD = "a";
}
