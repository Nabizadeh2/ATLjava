package lesson37;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JsonApp {

    public static final String RESOURCE="src/lesson37/resource/";
    public static final Path PATH= Paths.get(RESOURCE+"person.txt");
    public static void main(String[] args) {
        PersonCls personCls= new PersonCls("Xeyransa","Pashayeva",25);
        String personJson="";
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            personJson = objectMapper.writeValueAsString(personCls);
            byte[] jsonBytes = objectMapper.writeValueAsBytes(personJson);

            Files.write(PATH, jsonBytes);
        }catch (JsonProcessingException e ){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(personJson);

        try{
            Files.writeString(PATH,personJson);

        }catch (IIOException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            byte[] bytes = Files.readAllBytes(PATH);
            System.out.println(Arrays.toString(bytes));

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
