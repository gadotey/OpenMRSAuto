package manager;

/**
 * Created by Gadotey on 2/25/2020
 */
public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type){

        DriverManager driverManager;

        //If a new Driver needs to be added to the tes you have to ass another case
        switch (type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
                break;

        }
        return driverManager;
    }
}