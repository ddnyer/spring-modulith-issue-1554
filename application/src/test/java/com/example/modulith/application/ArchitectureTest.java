package com.example.modulith.application;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

class ArchitectureTest {

  private static final Logger log = LoggerFactory.getLogger(ArchitectureTest.class);

  @Test
  void verifyArchitecture() {
    var modules = ApplicationModules.of(ModulithicApplication.class);

    modules.forEach(m -> log.info("{}", m));

    modules.verify();
  }

}
