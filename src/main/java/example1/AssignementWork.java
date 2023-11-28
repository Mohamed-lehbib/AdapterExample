package example1;

public class AssignementWork {

    private IPen p;

    public void writeAssignment(String str) {
        p.write(str);
    }

    public IPen getP() {
        return p;
    }

    public void setP(IPen p) {
        this.p = p;
    }
}
