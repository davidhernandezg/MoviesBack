package com.movies.repository.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@EnableJpaRepositories(basePackages = "com.movies.repository")
public class RepositoryConfig {

		@Bean
		public DriverManagerDataSource dataSource() {
	
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/db_movies?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
			dataSource.setUsername("root");
			dataSource.setPassword("root");
			return dataSource;
		}
	
		@Bean
		public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	
			LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
			entityManagerFactoryBean.setDataSource(dataSource());
			entityManagerFactoryBean.setPackagesToScan(new String[] {"com.movies.repository"});
			
			HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
			vendorAdapter.setShowSql(false);
			entityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
			
			Properties jpaProperties = new Properties();
			jpaProperties.put("spring.jpa.hibernate.ddl-auto", "create-drop");
			jpaProperties.put("cachePrepStmts", "true");
			jpaProperties.put("prepStmtCacheSize", "250");
			jpaProperties.put("prepStmtCacheSqlLimit", "2048");
			jpaProperties.put("useServerPrepStmts", "true");
			jpaProperties.put("spring.jpa.hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
			jpaProperties.put("spring.jpa.hibernate.naming_strategy", "org.hibernate.cfg.ImprovedNamingStrategy");
			jpaProperties.put("spring.jpa.show-sql", "false");
	
			entityManagerFactoryBean.setJpaProperties(jpaProperties);
	
			return entityManagerFactoryBean;
		}
		
		@Bean
		public JpaTransactionManager transactionManager() {
	        JpaTransactionManager transactionManager = new JpaTransactionManager();
	        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
	        return transactionManager;
	    }
	
}
