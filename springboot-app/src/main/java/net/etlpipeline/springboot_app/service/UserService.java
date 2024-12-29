package net.etlpipeline.springboot_app.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.etlpipeline.springboot_app.models.UserData;

public class UserService {
    public static void main(String[] args) throws JsonMappingException, JsonProcessingException{
        // Test json data
        String jsonString = "{\r\n" +
        " \"name\": \"John Doe\", \r\n" +
        " \"age\": 24, \r\n" +
        " \"married\": true, \r\n" + 
        " \"address\": \"Mexico\", \r\n" +
        " \"mobileNo\": \"18392304\"\r\n"+
        "}";

        ObjectMapper omap = new ObjectMapper();
        UserData data = omap.readValue(jsonString, UserData.class);
    }
}
