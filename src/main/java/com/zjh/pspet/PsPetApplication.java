package com.zjh.pspet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class PsPetApplication {

  public static void main(String[] args) {
    SpringApplication.run(PsPetApplication.class, args);
  }
}
