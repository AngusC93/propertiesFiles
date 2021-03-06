import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {

        try {
            Properties props = new Properties();
            String propertiesFileName = "application.properties";
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(propertiesFileName);

            String simProps = "another.properties";
            InputStream inStream = Main.class.getClassLoader().getResourceAsStream(simProps);

            if (inStream != null) {
            props.load(inStream);
            } else {
                throw new FileNotFoundException("property file '" + simProps + "' not found");
            }

            System.out.println(props.getProperty("sim.size"));
            System.out.println(props.getProperty("sim.host"));

            if (inputStream != null) {
                props.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propertiesFileName + "' not found");
            }

            System.out.println(props.getProperty("my.age"));
            System.out.println(props.getProperty("my.name"));

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

}
