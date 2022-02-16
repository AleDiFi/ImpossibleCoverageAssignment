package com.example.impossiblecoverageassignment;

import java.util.Objects;

public class OSCheck {

    public static void main(String[] args){
        OSCheck oSName = new OSCheck();
        String osN = oSName.getOSName();
        oSName.checkOsSpecifics(osN);
    }

    public String getOSName(){
        return System.getProperty("os.name");
    }

    public String checkOsSpecifics(String osName){
        String alertMessage = null;
        if(Objects.equals(osName, "Windows 10")){
            alertMessage = "Il sistema operativo è Windows 10";
        } else{
            alertMessage = "Il sistema operativo non è Windows 10";
        }
        return alertMessage;
    }
}