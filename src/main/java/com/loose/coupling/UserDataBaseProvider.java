package com.loose.coupling;

public class UserDataBaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "User information";
    }

}
