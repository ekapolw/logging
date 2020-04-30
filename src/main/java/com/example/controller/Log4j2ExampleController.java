package com.example.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4j2ExampleController {
  private static final Logger logger = LogManager.getLogger();

  @GetMapping("/")
  public String something() {

    ThreadContext.put("correlationId","9999");
    ThreadContext.put("userID","11049392");
    ThreadContext.put("requestAddress","127.0.0.99");
    ThreadContext.put("hostname","ekapol machine");
    ThreadContext.put("containerID","123456");

    logger.trace("This is the {} level message", "trace");
    logger.debug("This is the {} level message", "debug");
    logger.info("This is the {} level message", "info");
    logger.warn("This is the {} level message", "warn");
    logger.error("This is the {} level message", "error");
    logger.fatal("This is the {} level message", "fatal");

    return "Success";
  }

}
