package algorithms;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;


public class CountriesMain {

    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("src/resources/countries.json");
        String content = "{}";

        content = Files.readString(fileName);

//        JSONObject jsonroot = new JSONObject(getJson());
        JSONObject jsonroot = new JSONObject(content);
        JSONArray jsonArray = jsonroot.getJSONArray("data");
        HashMap<String, Integer> countries = new HashMap<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject js = jsonArray.getJSONObject(i);
            countries.put(js.getString("name"), js.getInt("population"));
        }


        System.out.println(jsonroot.toString());
        for (Map.Entry<String, Integer> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + "  population: " + entry.getValue());
        }


    }

    public static String getJson() {
        String strUrl = "https://jsonmock.hackerrank.com/api/countries";
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(strUrl);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}

