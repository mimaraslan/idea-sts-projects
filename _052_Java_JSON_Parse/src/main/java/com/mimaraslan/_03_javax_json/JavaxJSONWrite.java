package com.mimaraslan._03_javax_json;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class JavaxJSONWrite {

    public static void main(String[] args) {
        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();

        jsonObjectBuilder.add("calisanId", 2);
        jsonObjectBuilder.add("adi", "Ünal Gani");
        jsonObjectBuilder.add("soyadi", "Berk");
        jsonObjectBuilder.add("departman", "Yazılım");
        jsonObjectBuilder.add("maas", 37500);

        JsonObject calisanlarObj = jsonObjectBuilder.build();

        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = Json.createWriter(stringWriter);
        jsonWriter.writeObject(calisanlarObj);
        jsonWriter.close();

        System.out.println(stringWriter.toString());
        //------------------------------------------------

        try (FileWriter file = new FileWriter("calisanlar3.json") ) {
            file.write(String.valueOf(stringWriter));
            file.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
