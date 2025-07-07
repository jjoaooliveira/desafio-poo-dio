package br.com.dio.desafio.joaooliveira.dominio;

public class Description {
    private final String value;

    public Description(String value) {
        validate(value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    private void validate(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Description cannot be null or blank");
        }
    }
}
