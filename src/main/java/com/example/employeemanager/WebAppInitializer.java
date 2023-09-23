package com.example.employeemanager;

import com.example.employeemanager.config.WebAppConfig;
import com.example.employeemanager.config.WebAppRootConfig;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebAppRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new MysqlxDatatypes.Scalar.String[]{"/"};
    }
}
