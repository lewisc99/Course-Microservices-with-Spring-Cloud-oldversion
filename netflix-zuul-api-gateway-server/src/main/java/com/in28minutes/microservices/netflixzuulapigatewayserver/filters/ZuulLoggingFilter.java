package com.in28minutes.microservices.netflixzuulapigatewayserver.filters;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class ZuulLoggingFilter  extends ZuulFilter {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String filterType() {
        return "pre"; //indicate if the filter must be run before or after the request
    }

    @Override
    public int filterOrder() {
        return 1; //if have multiple filters you can order by number
    }

    @Override
    public boolean shouldFilter() {
        return true; //if filter must be run or not
    }

    @Override
    public Object run() throws ZuulException {
       HttpServletRequest request =  RequestContext.getCurrentContext().getRequest();

       logger.info("Request -> {} request uri -> {}", request,request.getRequestURI());


        return null;
    }
}
