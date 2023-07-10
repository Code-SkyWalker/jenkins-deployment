package org.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Description TODO
 * @Author Code Skywalker
 * @Date 2023/7/10 15:23
 */
@SpringBootApplication
public class JenkinsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }
}
