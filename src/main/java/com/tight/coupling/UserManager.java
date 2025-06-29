package com.tight.coupling;

public class UserManager {
    private UserDataBase userDataBase = new UserDataBase();
    public String sendInfo(){
        return userDataBase.getUserData();
    }
}
