package com.silveryark.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public enum ObjectMapper {
    JSON(new com.fasterxml.jackson.databind.ObjectMapper()), XML(new XmlMapper());

    private final com.fasterxml.jackson.databind.ObjectMapper innerObjectMapper;

    ObjectMapper(com.fasterxml.jackson.databind.ObjectMapper innerObjectMapper) {
        innerObjectMapper.enable(JsonGenerator.Feature.IGNORE_UNKNOWN);
        this.innerObjectMapper = innerObjectMapper;
    }

    public String writeObject(Object obj) throws IOException {
        return innerObjectMapper.writeValueAsString(obj);
    }

    public <T> T readObject(String data, Class<T> clz) throws IOException {
        return innerObjectMapper.readValue(data, clz);
    }

}
