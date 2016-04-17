package Console;

import Model.Application;
import Controller.*;
import java.io.*;
import java.util.ArrayList;

public class Driver {
    
    public static void main(String [] args) {
        Application app = new Application();
        //app = app.loadData();
        //Console console = new Console(app);
        //console.mainMenu();      
        Controller controller = new Controller(app);
    }
}
