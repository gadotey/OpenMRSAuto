package utils;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by Gadotey on 2/26/2020
 */
public class RetryAnalyzer implements IRetryAnalyzer {

    int count = 0;
    int limit = 3;


    @Override
    public boolean retry(ITestResult result) {
        if (count < limit) {
            count++;
            return true;
        }
        return false;
    }
}