package com.jenkins.Jenkins.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication
        implements CommandLineRunner {

    public static final Logger LOGGER = LoggerFactory.getLogger(JenkinsTestApplication.class);

    public static void main(String[] args) {
        LOGGER.info("It's a continuous Integration Job");
        SpringApplication.run(JenkinsTestApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("It's my second logger");
    }
}
