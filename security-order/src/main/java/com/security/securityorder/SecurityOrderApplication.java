package com.security.securityorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SecurityOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityOrderApplication.class, args);
    }

}
