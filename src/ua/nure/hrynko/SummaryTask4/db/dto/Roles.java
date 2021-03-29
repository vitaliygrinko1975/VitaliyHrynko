package ua.nure.hrynko.SummaryTask4.db.dto;

public class Roles extends Entity {

    private static final long serialVersionUID = -6889036256149495388L;
    private Long id;
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Roles [id=" + getId() + ", name=" + name + "]";
    }

}

