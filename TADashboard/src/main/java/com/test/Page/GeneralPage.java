package com.test.Page;

import com.logigear.control.common.imp.Button;
import com.logigear.control.common.imp.Label;
import com.logigear.driver.DriverUtils;
import com.test.Constant.Constant;

public class GeneralPage {
    //Elements
    Button btnLogout = new Button("//a[.='Logout']");

    // Method
    public boolean isLogoutBtnExist() {
        return btnLogout.isExist(Constant.TIMEOUT_IN_SECONDS);
    }
    public void goTo(){
        DriverUtils.navigate(Constant.DASHBOARD_URL);
    }
}
