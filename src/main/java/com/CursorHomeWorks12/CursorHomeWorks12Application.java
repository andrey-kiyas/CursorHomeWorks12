package com.CursorHomeWorks12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1) Implement REST API for /products resource with 5 mappings:
 *    - GET /products
 *    - GET /products/{id}
 *    - POST /products
 *    - PUT /products/{id}
 *    - DELETE /products/{id}
 *
 * 2) Add Etag HTTP cache for GET /products and GET /products/{id} endpoints
 * (example: https://www.javacodegeeks.com/2018/10/http-cache-spring-examples.html)
 */

@SpringBootApplication
public class CursorHomeWorks12Application {

    public static void main(String[] args) {
        SpringApplication.run(CursorHomeWorks12Application.class, args);
    }

}
