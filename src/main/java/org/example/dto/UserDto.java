package org.example.dto;
import lombok.Data;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Data
@JacksonXmlRootElement(localName = "User")
public class UserDto {
    @JacksonXmlProperty(localName = "Name")
    private final String name;

    @JacksonXmlProperty(localName = "Age")
    private final int age;
}
