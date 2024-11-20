package org.example.enums;

public enum Url {
    IPAPI("http://ip-api.com/json/");

    private final String url;

    Url(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
