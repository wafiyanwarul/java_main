import java.io.Console;

public class inputConsole {
    public static void main(String[] args) {
        mahasw mhs = new mahasw();
        mhs.inputData();
        mhs.showData();
    }
}

class mahasw {

    // INSTANCE VARIABLE
    private String name, department, faculty, university, nim;

    Console cn = System.console();

    // SETTER
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

    public void setNIM(String nim) {
        this.nim = nim;
    }

    // GETTER
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

    public String getNIM() {
        return nim;
    }

    public void inputData() {

        try {

            System.out.print("Masukkan nama mahasiswa : ");
            name = cn.readLine();

            System.out.print("Masukkan universitas mahasiswa : ");
            university = cn.readLine();

            System.out.print("Masukkan fakultas mahasiswa : ");
            faculty = cn.readLine();

            System.out.print("Masukkan departemen mahasiswa  : ");
            department = cn.readLine();

            System.out.print("Masukkan NIM mahasiswa : ");
            nim = cn.readLine();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Masukkan sesuai apa yang diminta !!!");
        }
    }

    public void showData() {
        System.out.println("Data Mahasiswa : ");
        System.out.println("Nama        : " + this.name);
        System.out.println("Universitas : " + this.university);
        System.out.println("Fakultas    : " + this.faculty);
        System.out.println("Departemen  : " + this.department);
        System.out.println("NIM         : " + this.nim);
    }

}