package com.example.flappbe.utils.localdateSerializers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDeserializer extends StdDeserializer<LocalDate> {

    private static final String LOCAL_DATE_FORMAT = "dd-MM-yyyy";

    public LocalDateDeserializer(){super(LocalDate.class);}

    @Override
    public LocalDate deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return LocalDate.parse(ctxt.readValue(p, String.class), DateTimeFormatter.ofPattern(LOCAL_DATE_FORMAT));
    }


}