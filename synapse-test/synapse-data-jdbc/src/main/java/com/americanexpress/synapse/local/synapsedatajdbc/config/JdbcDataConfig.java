package com.americanexpress.synapse.local.synapsedatajdbc.config;

import io.americanexpress.synapse.data.jdbc.config.InstantJdbcAuditingDataConfig;
import io.americanexpress.synapse.data.jdbc.config.SynapseJdbcDataConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("/pg-application.properties")
@ComponentScan(basePackages = "com.americanexpress.synapse.local.synapsedatajdbc")
@Import({SynapseJdbcDataConfig.class, InstantJdbcAuditingDataConfig.class})
public class JdbcDataConfig {
}
