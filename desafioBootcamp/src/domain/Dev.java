package domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    protected String name;
    protected Set<Content> contentsSubscribed = new LinkedHashSet<>();
    protected Set<Content> contentsFinished = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.contentsSubscribed.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress() {
        Optional<Content> content = this.contentsSubscribed.stream().findFirst();
        if (content.isPresent()) {
            this.contentsFinished.add(content.get());
            this.contentsSubscribed.remove(content.get());
        } else {
            System.err.println("You are not subscribed to any content");
        }
    }

    public double calculateTotalXP() {
        return this.contentsFinished
                .stream()
                .mapToDouble(Content::calculateXP)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentsSubscribed() {
        return contentsSubscribed;
    }

    public void setContentsSubscribed(Set<Content> contentsSubscribed) {
        this.contentsSubscribed = contentsSubscribed;
    }

    public Set<Content> getContentsFinished() {
        return contentsFinished;
    }

    public void setContentsFinished(Set<Content> contentsFinished) {
        this.contentsFinished = contentsFinished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentsSubscribed, dev.contentsSubscribed) && Objects.equals(contentsFinished, dev.contentsFinished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsSubscribed, contentsFinished);
    }
}
