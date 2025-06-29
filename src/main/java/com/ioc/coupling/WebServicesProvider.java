package com.ioc.coupling;

public class WebServicesProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Web Services";
    }
}
