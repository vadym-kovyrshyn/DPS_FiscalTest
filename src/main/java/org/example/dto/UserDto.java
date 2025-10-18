package org.example.dto;
import lombok.Data;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Data
@JacksonXmlRootElement(localName = "user")
public class UserDto {
    @JacksonXmlProperty
    private final String name;

    @JacksonXmlProperty
    private final int age;
}
