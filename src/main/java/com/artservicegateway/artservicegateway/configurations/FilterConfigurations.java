package com.artservicegateway.artservicegateway.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.artservicegateway.artservicegateway.filters.LoggingFilter;

/**
 * Configuration to supply all filter beans
 */
@Configuration
public class FilterConfigurations {

    /**
     * Bean representing the logging filter
     *
     * @return New instance of the logging filter bean
     */
    @Bean
    public LoggingFilter loggingFilter() {
        return new LoggingFilter();
    }

}
