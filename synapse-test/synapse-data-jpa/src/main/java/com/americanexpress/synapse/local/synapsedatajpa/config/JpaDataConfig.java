package com.americanexpress.synapse.local.synapsedatajpa.config;

import io.americanexpress.synapse.data.jpa.config.InstantJpaAuditingDataConfig;
import io.americanexpress.synapse.data.jpa.config.SynapseJpaDataConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.americanexpress.synapse.local.synapsedatajpa")
@PropertySource("/pg-application.properties")
@Import({SynapseJpaDataConfig.class, InstantJpaAuditingDataConfig.class})
public class JpaDataConfig {
}
