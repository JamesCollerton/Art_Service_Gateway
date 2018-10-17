package com.artservicegateway.artservicegateway.filters;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * This is a filter to provide some logging for all requests coming through the gateway.
 */
public class LoggingFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(LoggingFilter.class);

    /**
     * Establishes that the filter is applied before the request goes through
     *
     * @return String representing when the filter should be applied
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * Gives the order in which this filter will be executed, relative to other filters.
     *
     * @return Filter order
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * Logic for when the filter should be applied.
     *
     * @return Boolean of when the filter should be applied
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * Simple filter action to log the request coming through the gateway.
     *
     * @return Returns nothing
     *
     * @throws ZuulException Thrown when getting the current context
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        return null;
    }
}
