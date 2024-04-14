package com.homihq.db2rest;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@AutoConfiguration
@EnableConfigurationProperties(RdbmsConfigurationProperties.class)
public class RdbmsConfiguration {
}
