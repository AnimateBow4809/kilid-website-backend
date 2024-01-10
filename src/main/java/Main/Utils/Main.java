package Main.Utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString
                (new Filter(null,null,"city 1","zone 1",54,150,
                        "resedential",4L,1L,10L,1L));
        System.out.println(json);
    }
}
