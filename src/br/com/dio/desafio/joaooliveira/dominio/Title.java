package br.com.dio.desafio.joaooliveira.dominio;

public class Title {
    private final String title;

    public Title(String value) {
        validate(value);
        this.title = value;
    }

    public String getValue() {
        return title;
    }

    private void validate(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
    }
}
