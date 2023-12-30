package com.murilohenzo.travelapp.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@Configuration
@EntityScan(basePackages = "com.murilohenzo.*.domain.entity")
@EnableJpaRepositories(basePackages = {"com.murilohenzo.*.infrastructure"})
public class TravelAppConfiguration {

    public TravelAppConfiguration() {
        log.info("Starting Application Module");
    }

}
