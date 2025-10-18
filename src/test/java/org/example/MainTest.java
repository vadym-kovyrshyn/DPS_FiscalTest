package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.dto.UserDto;
import org.junit.jupiter.api.Test;


public class MainTest {

    @Test
    void testMethod() throws JsonProcessingException {
        UserDto user = new UserDto("Test", 20);
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String xml = xmlMapper.writeValueAsString(user);
        System.out.println(xml);
    }
}
