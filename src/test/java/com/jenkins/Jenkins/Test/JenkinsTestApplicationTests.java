package com.jenkins.Jenkins.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {
    public static final Logger LOGGER = LoggerFactory.getLogger(JenkinsTestApplicationTests.class);

    @Test
    void contextLoads() {
        LOGGER.info("It's a test class");
        Assertions.assertEquals(true, true);
    }

}
