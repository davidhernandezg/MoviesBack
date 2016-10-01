package com.movies.repository.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.movies.repository")
@EnableJpaRepositories("com.movies.repository")
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
			entityManagerFactoryBean.setPackagesToScan(new String[] {"com.movies.domain"});
			
			HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
			vendorAdapter.setShowSql(true);
			entityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
			
			Properties jpaProperties = new Properties();
			jpaProperties.put("hibernate.hbm2ddl.auto", "update");
			jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
			jpaProperties.put("hibernate.show_sql", "true");
	
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
