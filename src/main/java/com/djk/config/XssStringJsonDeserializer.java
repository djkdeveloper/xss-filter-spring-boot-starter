package com.djk.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.springframework.web.util.HtmlUtils;

import java.io.IOException;

/**
 * Created by dujinkai on 2018/5/23.
 * 基于xss的JsonDeserializer
 */
public class XssStringJsonDeserializer extends JsonDeserializer<String> {


    @Override
    public Class<String> handledType() {
        return String.class;
    }

    @Override
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return HtmlUtils.htmlEscape(jsonParser.getValueAsString());
    }
}
