package kr.ed.haebeop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"kr.ed.haebeop"})
public class ServletContext implements WebMvcConfigurer {


    @Override
    public void configureViewResolvers(ViewResolverRegistry registry){
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/views");
        bean.setSuffix(".jsp");
        registry.viewResolver(bean);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/resource/**").addResourceLocations("/resource/");
        registry.addResourceHandler("/admin/**").addResourceLocations("/admin/");
        registry.addResourceHandler("/ajax/**").addResourceLocations("/ajax/");
        registry.addResourceHandler("/api/**").addResourceLocations("/api/");
        registry.addResourceHandler("/board/**").addResourceLocations("/board/");
        registry.addResourceHandler("/calendar/**").addResourceLocations("/calendar/");
        registry.addResourceHandler("/chat/**").addResourceLocations("/chat/");
        registry.addResourceHandler("/check/**").addResourceLocations("/check/");
        registry.addResourceHandler("/common/**").addResourceLocations("/common/");
        registry.addResourceHandler("/fileupload/**").addResourceLocations("/fileupload/");
        registry.addResourceHandler("/free/**").addResourceLocations("/free/");
        registry.addResourceHandler("/guestbook/**").addResourceLocations("/guestbook/");
        registry.addResourceHandler("/include/**").addResourceLocations("/include/");
        registry.addResourceHandler("/lect/**").addResourceLocations("/lect/");
        registry.addResourceHandler("/member/**").addResourceLocations("/member/");
        registry.addResourceHandler("/notice/**").addResourceLocations("/notice/");
        registry.addResourceHandler("/qna/**").addResourceLocations("/qna/");
        registry.addResourceHandler("/reserve/**").addResourceLocations("/reserve/");
        registry.addResourceHandler("/test/**").addResourceLocations("/test/");
        registry.addResourceHandler("/user/**").addResourceLocations("/user/");
    }



}
