package domain;

public class Course extends Content {
    protected int workload;

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", workload=" + workload +
                '}';
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP * workload;
    }
}
