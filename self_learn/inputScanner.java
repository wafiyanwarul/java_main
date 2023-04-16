import java.util.Scanner;

public class inputScanner {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.inputData();
        mhs.tampilData();
    }
}

class Mahasiswa {
    private String name, department, faculty, university;
    private int nim;

    Scanner in = new Scanner(System.in);

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setNIM(int nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getUniversity() {
        return university;
    }

    public int getNIM() {
        return nim;
    }

    public void inputData() {
        try {

            System.out.print("Masukkan nama mahasiswa : ");
            name = in.nextLine();

            System.out.print("Masukkan universitas mahasiswa : ");
            university = in.nextLine();

            System.out.print("Masukkan fakultas mahasiswa : ");
            faculty = in.nextLine();

            System.out.print("Masukkan departemen mahasiswa  : ");
            department = in.nextLine();

            System.out.print("Masukkan NIM mahasiswa : ");
            nim = in.nextInt();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Masukkan sesuai apa yang diminta !!!");
            inputData();
        }
    }

    public void tampilData() {
        System.out.println("Data Mahasiswa : ");
        System.out.println("Nama        : " + this.name);
        System.out.println("Universitas : " + this.university);
        System.out.println("Fakultas    : " + this.faculty);
        System.out.println("Departemen  : " + this.department);
        System.out.println("NIM         : " + this.nim);
    }

}