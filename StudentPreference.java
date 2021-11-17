public class StudentPreference {
    private final int studentId;

    // arrays with seminar ids
    private final int[] P1;
    private final int[] P2;
    private final int[] P3;
    private final int[] P4;
    private final int[] P5;

    public StudentPreference(int studentId, int[] p1, int[] p2, int[] p3, int[] p4, int[] p5) {
        this.studentId = studentId;
        this.P1 = p1;
        this.P2 = p2;
        this.P3 = p3;
        this.P4 = p4;
        this.P5 = p5;
    }

    public void print() {
        System.out.println("My Studentid is: " + this.studentId);
        System.out.println("1: " + this.P1[0] + "," + this.P1[1]);
        System.out.println("2: " + this.P2[0] + "," + this.P2[1]);
        System.out.println("3: " + this.P3[0] + "," + this.P3[1]);
        System.out.println("4: " + this.P4[0] + "," + this.P4[1]);
        System.out.println("5: " + this.P5[0] + "," + this.P5[1]);
    }
}
