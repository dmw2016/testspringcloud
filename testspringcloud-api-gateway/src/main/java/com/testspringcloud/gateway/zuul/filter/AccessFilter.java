package com.testspringcloud.gateway.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccessFilter extends ZuulFilter {
    public static final Logger logger = LoggerFactory.getLogger(AccessFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        logger.info("this is AccessFilter ...");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        logger.info("filter code....");
        return null;
    }
}
