package edu.miumg.gt.clinicamedicas.config;

import com.zaxxer.hikari.HikariDataSource;
import edu.miumg.gt.clinicamedicas.util.Constant;
import java.util.Properties;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @author wilver
 */
@Configuration
@EnableJpaRepositories(
        entityManagerFactoryRef = "mysqlEntityManagerFactory",
        transactionManagerRef = "mysqlTransactionManager",
        basePackages = {"edu.miumg.gt.clinicamedicas"}
)
@EnableTransactionManagement
public class ApplicationConfig {
    
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationConfig.class);

    @Resource
    private Environment environment;
    
    @Bean(name = "mysqlDataSource")
    @Qualifier("mysqlDataSource")
    @Primary
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        LOG.debug(dataSource.toString());
        dataSource.setDriverClassName(environment.getRequiredProperty(Constant.PROPERTY_NAME_DATABASE_DRIVER));
        dataSource.setJdbcUrl(environment.getRequiredProperty(Constant.PROPERTY_NAME_DATABASE_URL));
        dataSource.setUsername(environment.getRequiredProperty(Constant.PROPERTY_NAME_DATABASE_USERNAME));
        dataSource.setPassword(environment.getRequiredProperty(Constant.PROPERTY_NAME_DATABASE_PASSWORD));
        dataSource.setMaximumPoolSize(Integer.parseInt(environment.getRequiredProperty(Constant.PROPERTY_NAME_DATA_SOURCER_MAXIMUN_POOLSIZE)));
        return dataSource;
    }
    
    @Bean(name = "mysqlEntityManager")
    @Qualifier(value = "mysqlEntityManager")
    public EntityManager entityManager() throws ClassNotFoundException {
        return entityManagerFactory().createEntityManager();
    }
    
    @Bean(name = "mysqlEntityManagerFactory")
    @Qualifier("mysqlEntityManagerFactory")
    public EntityManagerFactory entityManagerFactory() throws ClassNotFoundException {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        LOG.debug("urlToScan1 [{}]", environment.getRequiredProperty(Constant.PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN));
        entityManagerFactoryBean.setPackagesToScan(environment.getRequiredProperty(Constant.PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN));
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        Properties jpaProterties = new Properties();
        jpaProterties.put("hibernate.dialect", environment.getRequiredProperty(Constant.PROPERTY_NAME_HIBERNATE_DIALECT));
        jpaProterties.put("hibernate.format_sql", environment.getRequiredProperty(Constant.PROPERTY_NAME_HIBERNATE_FORMAT_SQL));
        jpaProterties.put("hibernate.show_sql", environment.getRequiredProperty(Constant.PROPERTY_NAME_HIBERNATE_SHOW_SQL));
        jpaProterties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty(Constant.PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO));
        
        /*Esto no aplica para MySQL*/
        //jpaProterties.put("hibernate.default_catalog", environment.getRequiredProperty(Constant.PROPERTY_NAME_HIBERNATE_DEFAULT_CATALOG));
        //jpaProterties.put("hibernate.default_schema", environment.getRequiredProperty(Constant.PROPERTY_NAME_HIBERNATE_DEFAULT_SCHEMA));
        
        /* ENVERS */
        /*
        jpaProterties.put("hibernate.auditable", environment.getRequiredProperty(Constant.PROPERTY_NAME_HIBERNATE_AUDITABLE));
        jpaProterties.put("org.hibernate.envers.storeDataAtDelete", environment.getRequiredProperty(Constant.PROPERTY_NAME_HIBERNATE_ENVERS_storeDataAtDelete));
        jpaProterties.put("org.hibernate.envers.default_schema", environment.getRequiredProperty(Constant.PROPERTY_NAME_HIBERNATE_ENVERS_default_schema));
        jpaProterties.put("org.hibernate.envers.default_catalog", environment.getRequiredProperty(Constant.PROPERTY_NAME_HIBERNATE_ENVERS_default_catalog));
        */
        entityManagerFactoryBean.setJpaProperties(jpaProterties);
        entityManagerFactoryBean.afterPropertiesSet();
        LOG.debug(entityManagerFactoryBean.toString());
        return entityManagerFactoryBean.getObject();
    }
    
    @Bean(name = "mysqlTransactionManager")
    @Qualifier("mysqlTransactionManager")
    @Primary
    public PlatformTransactionManager transactionManager() throws ClassNotFoundException {
        return new JpaTransactionManager(entityManagerFactory());
    }
    
    @Bean
    public JpaDialect jpaDialect() {
        return new HibernateJpaDialect();
    }
    
    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }
    
}