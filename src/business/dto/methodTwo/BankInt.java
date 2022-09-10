package business.dto.methodTwo;

public class BankInt {

    private String name;
    private int nit;
    private Boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "BankInt{" +
                "name='" + name + '\'' +
                ", nit=" + nit +
                ", active=" + active +
                '}';
    }
}
