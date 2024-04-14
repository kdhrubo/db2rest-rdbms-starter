package com.homihq.db2rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DB2restRdbmsStarterCommandLineStarter implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("DB2Rest Rdbms Starter loaded.");
    }
}
