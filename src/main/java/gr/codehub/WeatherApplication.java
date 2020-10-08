package gr.codehub;


import org.restlet.engine.Engine;
import java.util.logging.Logger;


public class WeatherApplication {

    public static final Logger LOGGER = Engine.getLogger(WeatherApplication.class);

    public static void main(String[] args) {
        LOGGER.info("hello world");
        double temperature =23.9;
        LOGGER.info("hello world 2" );

    }
}
