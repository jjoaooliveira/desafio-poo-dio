package br.com.dio.desafio.joaooliveira.dominio;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    public Mentoring(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    @Override
    public double calculateXp() {
        return DEFAULT_XP + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void changeDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
