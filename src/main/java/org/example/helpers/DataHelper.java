package org.example.helpers;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class DataHelper {

    private static final String FILE_PATH = "src/resources/endpoints.json";

    public static List<String> getEndpoints(String key) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(new File(FILE_PATH));
        JsonNode endpointsNode = rootNode.path(key).path("endpoints");

        if (endpointsNode.isMissingNode() || !endpointsNode.isArray()) {
            throw new IllegalArgumentException("Invalid key or endpoints not found for: " + key);
        }

        return StreamSupport.stream(endpointsNode.spliterator(), false)
                .map(JsonNode::asText)
                .collect(Collectors.toList());
    }
}
