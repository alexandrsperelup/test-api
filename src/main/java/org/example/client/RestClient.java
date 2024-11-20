package org.example.client;

public class RestClient extends BaseRestClient {

    public RestClient(String baseUrl) {
        super(baseUrl);
    }

    public static RestClient create(String baseUrl) {
        return new RestClient(baseUrl);
    }
}
