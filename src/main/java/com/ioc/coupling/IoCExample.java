// Here use Interface to achieve Loose Coupling. With that we can easily use multiple services(Db,Web services) with just UserManger component
package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCExample {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCoupling.xml");
        UserManager userManager = (UserManager) context.getBean("userManagerWithUserDataProvider");
//        UserDataProvider userDataProviderWithDB = new UserDataBaseProvider(); //instance of Interface UserProvider but constructor of UserDataBaseProvider Class
//        UserManager userManager = new UserManager(userDataProviderWithDB);
        System.out.println(userManager.sendInfo());//User Information

        //example of adding another services to show loose coupling Scalability
        UserManager userManager1 = (UserManager) context.getBean("userManagerWithWebDataProvider");
//        UserDataProvider userDataProviderWithWS = new WebServicesProvider();
//        UserManager userManager1 = new UserManager(userDataProviderWithWS);
        System.out.println(userManager1.sendInfo());//Web Services

        //Adding another db
        UserManager userManager2 = (UserManager) context.getBean("userManagerWithNewDataProvider");
//        UserDataProvider NewDataBaseProvider = new NewDataBase();
//        UserManager userManager2 = new UserManager(NewDataBaseProvider);
        System.out.println(userManager2.sendInfo());//Fetching new DataBase
    }
}
