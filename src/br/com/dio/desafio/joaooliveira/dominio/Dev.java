package br.com.dio.desafio.joaooliveira.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private Name name;
    private Set<Content> subscribedContents;
    private Set<Content> completedContents;

    public Dev(String name) {
        this.name = new Name(name);
        this.subscribedContents = new LinkedHashSet<>();
        this.completedContents = new LinkedHashSet<>();
    }

    public void subscribeToBootcamp(Bootcamp bootcamp) {
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void makeProgress() {
        Optional<Content> content = this.subscribedContents.stream().findFirst();
        if (content.isPresent()) {
            this.completedContents.add(content.get());
            this.subscribedContents.remove(content.get());
        } else {
            System.err.println("You are not subscribed to any content!");
        }
    }

    public double calculateTotalXp() {
        return this.completedContents
            .stream()
            .mapToDouble(Content::calculateXp)
            .sum();
    }

    public String getName() {
        return name.getValue();
    }

    public void setName(String name) {
        this.name = new Name(name);
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, completedContents);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if(obj instanceof Dev dev) {
            if(name.equals(dev.name)) {
                return true;
            }

            if(this.hashCode() == dev.hashCode()) {
                return true;
            }
        }
        return false;
    }
}
