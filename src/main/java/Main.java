import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {

        try {
            Properties props = new Properties();
            String propertiesFileName = "application.properties";

//            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(propertiesFileName);
            InputStreamReader in = new InputStreamReader(new FileInputStream("resources/application.properties"),
                    StandardCharsets.UTF_8);
            props.load(in);
//            String simProps = "another.properties";
//            InputStream inStream = Main.class.getClassLoader().getResourceAsStream(simProps);

//            if (inStream != null) {
//            props.load(inStream);
//            } else {
//                throw new FileNotFoundException("property file '" + simProps + "' not found");
//            }

            System.out.println(props.getProperty("my.name"));
            System.out.println(props.getProperty("my.age"));

//            if (inputStream != null) {
//                props.load(inputStream);
//            } else {
//                throw new FileNotFoundException("property file '" + propertiesFileName + "' not found");
//            }

//            System.out.println(props.getProperty("my.age"));
//            System.out.println(props.getProperty("my.name"));

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

//        try {
//            Properties props = new Properties();
//            String yamlFile = "test.yaml";
//            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(yamlFile);
//
//            if (inputStream != null) {
//                props.load(inputStream);
//            } else {
//                throw new FileNotFoundException("property file '" + yamlFile + "' not found");
//            }
//
//            System.out.println(props.getProperty("name"));
//            System.out.println(props.getProperty("wage"));
//        } catch (Exception e) {
//            System.out.println("Exception: " + e);
//        }
    }

}
