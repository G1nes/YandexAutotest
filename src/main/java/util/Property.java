package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Property {
    private static Property INSTANCE = null;
    private Properties properties = new Properties();
    private Property(){
        try {
            properties.load(new FileInputStream(new File("C:\\Program Files\\Repositories\\YandexAutotest\\src\\main\\java\\util\\settings.properties")));
        }catch (Exception e){
            e.getStackTrace();
        }
    }
    public static Property getInstance(){
        if (INSTANCE==null){
            INSTANCE = new Property();
        }
        return INSTANCE;
    }
    public Properties getProperties (){
        return properties;
    }
}
