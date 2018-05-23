package com.djk.config;

import org.springframework.core.MethodParameter;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.mvc.method.annotation.PathVariableMethodArgumentResolver;

import java.util.Objects;

/**
 * Created by dujinkai on 2018/5/23.
 */
public class XssPathVariablePadderMethodArgumentResolver extends PathVariableMethodArgumentResolver {

    @Override
    public Object resolveName(String name, MethodParameter parameter, NativeWebRequest request) throws Exception {

        Object param = super.resolveName(name, parameter, request);
        return (Objects.nonNull(param) && param instanceof String) ? XssUtil.cleanXSS((String) param) : param;

    }

}
