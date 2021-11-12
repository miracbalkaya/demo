package com.example.demo;

import com.example.demo.ogrenci.OgrenciService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;



@EnableAutoConfiguration
@ComponentScan
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


    }


    @Override
    public void run(String... args) throws Exception {

    }
}

