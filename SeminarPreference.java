public class SeminarPreference {
    private final int seminarId;

    // arrays with student id's
    private final int[] P1;
    private final int[] P2;
    private final int[] P3;
    private final int[] P4;
    private final int[] P5;

    public SeminarPreference(int seminarId, int[] p1, int[] p2, int[] p3, int[] p4, int[] p5) {
        this.seminarId = seminarId;
        this.P1 = p1;
        this.P2 = p2;
        this.P3 = p3;
        this.P4 = p4;
        this.P5 = p5;
    }

    public void print() {
        System.out.println("My Seminarid is: " + this.seminarId);
        System.out.print("1: ");
        for (int i = 0; i < P1.length; i++) {
            if (i == P1.length - 1) {
                System.out.print(P1[i] + "\n");
            } else {
                System.out.print(P1[i] + ", ");
            }
        }
        System.out.print("2: ");
        for (int i = 0; i < P2.length; i++) {
            if (i == P2.length - 1) {
                System.out.print(P2[i] + "\n");
            } else {
                System.out.print(P2[i] + ", ");
            }
        }
        System.out.print("3: ");
        for (int i = 0; i < P3.length; i++) {
            if (i == P3.length - 1) {
                System.out.print(P3[i] + "\n");
            } else {
                System.out.print(P3[i] + ", ");
            }
        }
        System.out.print("4: ");
        for (int i = 0; i < P4.length; i++) {
            if (i == P4.length - 1) {
                System.out.print(P4[i] + "\n");
            } else {
                System.out.print(P4[i] + ", ");
            }
        }
        System.out.print("5: ");
        for (int i = 0; i < P5.length; i++) {
            if (i == P5.length - 1) {
                System.out.print(P5[i] + "\n");
            } else {
                System.out.print(P5[i] + ", ");
            }
        }
    }

}
