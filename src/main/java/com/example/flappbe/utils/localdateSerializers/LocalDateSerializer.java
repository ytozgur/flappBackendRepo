package com.example.flappbe.utils.localdateSerializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSerializer extends StdSerializer<LocalDate> {

    private static final String LOCAL_DATE_FORMAT = "dd-MM-yyyy";

    public LocalDateSerializer(){super(LocalDate.class);}

    @Override
    public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider sp) throws IOException {
        gen.writeString(value.format(DateTimeFormatter.ofPattern(LOCAL_DATE_FORMAT)));
    }
}
