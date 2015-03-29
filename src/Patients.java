/**
 * Created by Xileus on 23/03/2015.
 */
public class Patients {
    Patient[] records;
    int current;

    Patients(int maxSize) {
        records = new Patient[maxSize];
    }

    public void add(Patient patient) {
        records[current++] = patient;
    }

    public int count() {
        return current;
    }

    public Patient get(int i) {
        return records[i];
    }

    public boolean isFull() {
        if (current >= records.length) {
            return true;
        }
        else {return false;}
    }
}
