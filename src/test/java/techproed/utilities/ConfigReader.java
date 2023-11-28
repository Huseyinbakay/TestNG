package techproed.utilities;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String getProperty(String key) throws FileNotFoundException {


        Properties properties=new Properties();

        FileInputStream fis=new FileInputStream("configuration.properties");



        try {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return   properties.getProperty(key);
    }

}
