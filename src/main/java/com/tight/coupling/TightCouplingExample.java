//In this program UserManager is tightly coupled with UserData means it highly depends on that.
package com.tight.coupling;

public class TightCouplingExample {
    public static void main(String [] args){
        UserManager userManager = new UserManager();
        System.out.println(userManager.sendInfo());
    }
}
