/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPBank.main;

import TPBank.GetAccountInfo.GetAccountInfo;
import java.util.Locale;
/**
 *
 * @author HI
 */
public class Model {
    public void runTPBank() {
        TPBank.validation.Validate validate = new TPBank.validation.Validate();
        
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1. English");
            System.out.println("2. Vietnam");
            System.out.println("3. Exit");
            System.out.println("Please choose 1-3: ");
            int choose = validate.getInt(1, 3);

            switch (choose) {
                case 1:
                    Locale.setDefault(new Locale("en", "US"));
                    display();
                    break;
                case 2:
                    Locale.setDefault(new Locale("vi", "VN"));
                    display();
                    break;
                case 3:
                    isRunning = false;
                    break;
            }
        }
    }
    
    
    /** 
     * ask user to input account info
     */
    public void display() {
        GetAccountInfo gainfo = new GetAccountInfo();
        gainfo.getAccount();
        gainfo.getPassword();
        gainfo.getCaptcha();
        gainfo.loginSuccess();

    }
}
