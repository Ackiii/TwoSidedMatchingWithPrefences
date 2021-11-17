import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.prefs.Preferences;

public class Testmypydata {

    public static ArrayList<int[]> preferences = new ArrayList<int[]>();
    public static ArrayList<SeminarPreference> sempref = new ArrayList<SeminarPreference>();
    public static ArrayList<StudentPreference> students = new ArrayList<StudentPreference>();

    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("testdata.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] substirngs = line.split(";");
                int stdid = Integer.parseInt(substirngs[0]);
                for (int i = 1; i < 6; i++) {
                    String[] temp = substirngs[i].split(",");
                    int[] a = { Integer.parseInt(temp[0]), Integer.parseInt(temp[1]) };
                    preferences.add(a);
                }
                StudentPreference s = new StudentPreference(stdid, preferences.get(0), preferences.get(1),
                        preferences.get(2), preferences.get(3), preferences.get(4));
                students.add(s);
                preferences.clear();
                // students.get(0).print();
            }

            for (StudentPreference s : students) {
                s.print();
            }

            br.close();
            preferences.clear();
            BufferedReader br2 = new BufferedReader(new FileReader("seminarpreference.txt"));

            while ((line = br2.readLine()) != null) {
                String[] substirngs = line.split(";");
                int stdid = Integer.parseInt(substirngs[0]);
                for (int i = 1; i < 6; i++) {
                    String[] temp = substirngs[i].split(",");
                    int[] a = { Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]),
                            Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]),
                            Integer.parseInt(temp[6]), Integer.parseInt(temp[7]), Integer.parseInt(temp[8]),
                            Integer.parseInt(temp[9]), Integer.parseInt(temp[10]), Integer.parseInt(temp[11]),
                            Integer.parseInt(temp[12]), Integer.parseInt(temp[13]), Integer.parseInt(temp[14]),
                            Integer.parseInt(temp[15]), Integer.parseInt(temp[16]), Integer.parseInt(temp[17]),
                            Integer.parseInt(temp[18]), Integer.parseInt(temp[19]) };
                    preferences.add(a);
                }
                SeminarPreference s = new SeminarPreference(stdid, preferences.get(0), preferences.get(1),
                        preferences.get(2), preferences.get(3), preferences.get(4));
                sempref.add(s);
                preferences.clear();
                // students.get(0).print();
            }

            for (SeminarPreference s : sempref) {
                s.print();
            }

            br2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
