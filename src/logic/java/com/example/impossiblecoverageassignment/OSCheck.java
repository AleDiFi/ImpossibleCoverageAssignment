package com.example.impossiblecoverageassignment;

import java.util.Objects;

public class OSCheck {

    public static void main(String[] args){
        OSCheck oSName = new OSCheck();
        String os_name = oSName.getOSName();
        System.out.println(oSName.getOSName());
        oSName.checkOsSpecifics(os_name);
    }

    public String getOSName(){
        String os_name = System.getProperty("os.name");
        return os_name;
    }

    public String checkOsSpecifics(String os_name){
        String alertMessage = null;
        if(Objects.equals(os_name, "Windows 10")){
            alertMessage = "Il sistema operativo è Windows 10";
        } else{
            alertMessage = "Il sistema operativo non è Windows 10";
        }
        return alertMessage;
    }
}