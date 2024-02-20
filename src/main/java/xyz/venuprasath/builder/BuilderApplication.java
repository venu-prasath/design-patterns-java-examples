package xyz.venuprasath.builder;

public class BuilderApplication {

    public static void main(String[] args) {
        Url url = new UrlBuilder()
                .protocol("https")
                .subdomain("blog")
                .domain("venuprasath")
                .tld("xyz")
                .build();

        System.out.println(url.getString());
    }
}
