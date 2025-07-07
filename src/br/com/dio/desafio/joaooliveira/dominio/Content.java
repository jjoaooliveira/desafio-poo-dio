package br.com.dio.desafio.joaooliveira.dominio;

public abstract class Content {

    protected static final double DEFAULT_XP = 10d;

    private Title title;
    private Description description;

    public abstract double calculateXp();

    public Content(String title, String description) {
        this.title = new Title(title);
        this.description = new Description(description);
    }

    public String getTitle() {
        return title.getValue();
    }

    public String getDescription() {
        return description.getValue();
    }

    public void changeTitle(String title) {
        this.title = new Title(title);
    }

    public void changeDescription(String description) {
        this.description = new Description(description);
    }

}
