package xyz.venuprasath.builder;

public class Url {
    String protocol;
    String subdomain;
    String domain;
    String tld;
    String port;
    String subdirectory;

    public Url(String protocol, String subdomain, String domain, String tld, String port, String subdirectory) {
        this.protocol = protocol;
        this.subdomain = subdomain;
        this.domain = domain;
        this.tld = tld;
        this.port = port;
        this.subdirectory = subdirectory;
    }

    public String getString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(protocol);
        stringBuilder.append("://");
        if(subdomain != null) {
            stringBuilder.append(subdomain+".");
        }
        stringBuilder.append(domain);
        stringBuilder.append("."+tld);
        if(port != null) {
            stringBuilder.append(":"+port);
        }
        if(subdirectory != null) {
            stringBuilder.append("/"+subdirectory);
        }
        return stringBuilder.toString();
    }


}
