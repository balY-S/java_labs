package ru.mirea.lab13;

public class Student implements Comparable {

    private int iDNumber;
    private int GPA;

    public Student(int iDNumber, int GPA) {
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Студент: " +
                "ID - " + iDNumber +
                ", GPA - " + GPA;
    }

    public int getIdNum() {
        return iDNumber;
    }

    public void setIdNum(int idNum) {
        this.iDNumber = iDNumber;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Object o) {
        return this.iDNumber - ((Student) o).iDNumber;
    }
}
