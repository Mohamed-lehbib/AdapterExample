package example1;

public class School {

    public static void main(String[] args) {
        IPen p = new PenAdapter();
        AssignementWork aw = new AssignementWork();
        aw.setP(p);
        aw.writeAssignment("I am bit tired to write an assignement");
    }
}
