package com.murilohenzo.hotel.infrastructure.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class HotelConfiguration {

    public HotelConfiguration() {
        log.info("Starting Hotel Module");
    }

}
