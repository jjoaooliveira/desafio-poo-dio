package br.com.dio.desafio.joaooliveira.dominio;

public class Name {
    private String value;

    public Name(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
