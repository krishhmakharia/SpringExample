package com.loose.coupling;

public class NewDataBase implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "Fetching New Data Base ";
    }
}
