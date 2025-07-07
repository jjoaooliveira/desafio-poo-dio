package br.com.dio.desafio.joaooliveira.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private Name name;
    private Description description;
    private final LocalDate dataInicial;
    private final LocalDate dataFinal;
    private Set<Dev> subscribedDevs = new java.util.HashSet<>(); // set that facilitates query operations
    private Set<Content> contents = new LinkedHashSet<>(); // set that maintains insertion order

    public Bootcamp(String name, String description, Set<Content> contents) {
        this.name = new Name(name);
        this.description = new Description(description);
        this.dataInicial = LocalDate.now();
        this.dataFinal = dataInicial.plusDays(45);
        this.subscribedDevs = new HashSet<>();
        this.contents = contents;
    }

    public void addSubscribedDev(Dev dev) {
        this.subscribedDevs.add(dev);
    }

    public void addSetOfSubscribedDevs(Set<Dev> devs) {
        this.subscribedDevs.addAll(devs);
    }

    public void addContent(Content content) {
        this.contents.add(content);
    }

    public void addSetOfContents(Set<Content> contents) {
        this.contents.addAll(contents);
    }

    public Name getName() {
        return name;
    }

    public Description getDescription() {
        return description;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getSubscribedDevs() {
        return subscribedDevs;
    }

    public Set<Content> getContents() {
        return contents;
    }
}
