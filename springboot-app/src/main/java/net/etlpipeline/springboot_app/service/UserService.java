package net.etlpipeline.springboot_app.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.etlpipeline.springboot_app.models.UserData;

public class UserService {
    public static void main(String[] args) throws JsonMappingException, JsonProcessingException{
        // Test json data
        String jsonString = "{\r\n" +
        " \"name\": \"Amod\", \r\n" +
        " \"age\": 30, \r\n" +
        " \"married\": true, \r\n" + 
        " \"address\": \"NY\", \r\n" +
        " \"mobileNo\": \"2324324\"\r\n"+
        "}";

        ObjectMapper omap = new ObjectMapper();
        UserData data = omap.readValue(jsonString, UserData.class);
    }
}
