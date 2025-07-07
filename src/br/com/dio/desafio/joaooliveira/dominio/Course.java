package br.com.dio.desafio.joaooliveira.dominio;

public class Course extends Content {

    private final int workload;

    public Course(String title, String description, int workload) {
        super(title, description);
        this.workload = workload;
    }

    @Override
    public double calculateXp() {
        return DEFAULT_XP + workload;
    }

    public int getWorkload() {
        return workload;
    }

    @Override
    public String toString() {
        return "Course {" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }

}
