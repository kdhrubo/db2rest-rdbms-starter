package com.homihq.db2rest;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("external.api")
public record RdbmsConfigurationProperties (){
}
