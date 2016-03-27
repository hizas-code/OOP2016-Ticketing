import java.io.*;

public class Driver {
    
    public static void main(String [] args) {
        Application app = new Application();
        //app = app.loadData();
        Console console = new Console(app);
        console.mainMenu();
        //app.saveData(app);
    }
}
