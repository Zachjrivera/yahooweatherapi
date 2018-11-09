package com.zach.yahooweatherapi.Schedual;

import com.zach.yahooweatherapi.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class QuerySchedule {
    private static final Logger log = LoggerFactory.getLogger(QuerySchedule.class);

    @Scheduled(fixedRate = 15000)
    public void weather(){
        RestTemplate restTemplate = new RestTemplate();
       Weather weather = restTemplate.getForObject("https://query.yahooapis.com/v1/public/yql?q=select item.condition from weather.forecast where woeid = 12765775&format=json&env=store://datatables.org/alltableswithkeys", Weather.class);
        log.info(weather.toString());
    }


}
