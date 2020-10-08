package gr.codehub.ui;


import gr.codehub.service.WeatherService;
import gr.codehub.service.impl.WeatherServiceImpl;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class WeatherApplication {
    private  WeatherService weatherService;

    public WeatherApplication(){
        weatherService = new WeatherServiceImpl();
    }

    public void getService() {
        log.info("start Service");
        double temperature = weatherService.getTemperature("Salonica");
        log.info("end service. return = {}", temperature );
    }
}
