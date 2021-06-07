package com.test.Page;


import com.logigear.control.common.imp.Button;
import com.logigear.control.common.imp.ComboBox;
import com.logigear.control.common.imp.TextBox;
import com.test.Constant.Constant;

public class LoginPage extends GeneralPage {
    private ComboBox cbbRepository = new ComboBox("//select[@id='repository']");
    private TextBox txtUserName = new TextBox("//input[@id='username']");
    private TextBox txtPassWord = new TextBox("//input[@id='password']");
    private Button btnLogin = new Button("//div[@class='btn-login']");

    //Method

    public void selectCbbRepository(String value) {
        cbbRepository.select(value);
    }

    public void inputUsername(String userName) {
        txtUserName.enter(userName);
    }

    public void inputPassWord(String passWord) {
        txtPassWord.enter(passWord);
    }

    public void clickLoginBtn() {
        btnLogin.click();
    }
}
