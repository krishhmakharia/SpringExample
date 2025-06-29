// Here use Interface to achieve Loose Coupling. With that we can easily use multiple services(Db,Web services) with just UserManger component
package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String [] args){
        UserDataProvider userDataProviderWithDB = new UserDataBaseProvider(); //instance of Interface UserProvider but constructor of UserDataBaseProvider Class
        UserManager userManager = new UserManager(userDataProviderWithDB);
        System.out.println(userManager.sendInfo());//User Information

        //example of adding another services to show loose coupling Scalability
        UserDataProvider userDataProviderWithWS = new WebServicesProvider();
        UserManager userManager1 = new UserManager(userDataProviderWithWS);
        System.out.println(userManager1.sendInfo());//Web Services

        //Adding another db
        UserDataProvider NewDataBaseProvider = new NewDataBase();
        UserManager userManager2 = new UserManager(NewDataBaseProvider);
        System.out.println(userManager2.sendInfo());//Fetching new DataBase
    }
}
