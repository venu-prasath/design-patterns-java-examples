package xyz.venuprasath.creational.builder;

class UrlBuilder {
    String protocol;
    String subdomain;
    String domain;
    String tld;
    String port;
    String subdirectory;

    UrlBuilder protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    UrlBuilder subdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }

    UrlBuilder domain(String domain) {
        this.domain = domain;
        return this;
    }

    UrlBuilder tld(String tld) {
        this.tld = tld;
        return this;
    }

    UrlBuilder port(String port) {
        this.port = port;
        return this;
    }

    UrlBuilder subdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
        return this;
    }

    Url build() {
        return new Url(protocol, subdomain, domain, tld, port, subdirectory);
    }
}