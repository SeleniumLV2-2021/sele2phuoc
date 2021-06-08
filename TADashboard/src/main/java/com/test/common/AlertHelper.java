package com.test.common;

import com.logigear.driver.DriverUtils;

public class AlertHelper {

    /**
     * To click on the 'Cancel' button of the alert.
     */
    public static void dismissAlert() {
        DriverUtils.getWebDriver().switchTo().alert().dismiss();
    }

    /**
     * To click on the 'OK' button of the alert.
     */
    public static void acceptAlert() {
        DriverUtils.getWebDriver().switchTo().alert().accept();
    }

    /**
     * To get the alert message.
     */

    public static String getTextAlert() {
        return DriverUtils.getWebDriver().switchTo().alert().getText();
    }
}