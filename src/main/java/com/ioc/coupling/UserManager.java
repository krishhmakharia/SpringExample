package com.ioc.coupling;

public class UserManager {
    private UserDataProvider userDataProvider;

    //Construction injection
    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String sendInfo(){
        return userDataProvider.getUserDetails();
    }
}
