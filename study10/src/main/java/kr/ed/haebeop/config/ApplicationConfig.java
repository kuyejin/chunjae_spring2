package kr.ed.haebeop.config;

import kr.ed.haebeop.persistence.TestMapper;
import kr.ed.haebeop.persistence.TestMapperImpl;
import kr.ed.haebeop.repository.TestRepository;
import kr.ed.haebeop.repository.TestRepositoryImpl;
import kr.ed.haebeop.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.ed.haebeop")
public class ApplicationConfig {
    @Bean
    public TestService testService(){
        return new TestServiceImpl();
    }

    @Bean
    public TestRepository testRepository(){
        return new TestRepositoryImpl();
    }



    @Bean
    public TestMapper testMapper(){ return new TestMapperImpl();}


    /*@Bean
    public TransactionRepository tranRepository() { return new TransactionRepository(); }

    @Bean
    public TransactionService tranService() { return new TransactionService(); }

    @Bean
    public CheckVO chk1() { return new CheckVO(); }

    @Bean
    public RestService restService() { return new RestService(); }

    @Bean
    public RestDAO restDao() { return new RestDAO(); }

    @Bean
    public SessionLocaleResolver localeResolver() { return new SessionLocaleResolver(); }

    @Bean
    public ObjectMapper mapper() { return new ObjectMapper(); }*/
}
