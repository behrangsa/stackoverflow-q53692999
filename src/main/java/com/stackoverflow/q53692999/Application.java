package com.stackoverflow.q53692999;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import javax.persistence.EntityManager;

public class Application implements CommandLineRunner {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void run(String... args) throws Exception {

    }

}
