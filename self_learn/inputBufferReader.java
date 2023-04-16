//coba input dengan Scanner mengimplementasikan OOP dan Enkapsulasi
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputBufferReader{
    public static void main(String[] args) throws IOException{
        //membuat variabel untuk kelas Mahasiswa agar dapat mengakses method di dalamnya
        Mahasiswa mhs = new Mahasiswa();
        //mengakses method pada Kelas Mahasiswa
        mhs.inputData();
        mhs.showData();
    }
}

class Mahasiswa{

    //instance variable
    private String name, department, faculty, university, nim;

    //deklarasi buffer reader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //SETTER
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

    //GETTER
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

    //method untuk memasukkan data mahasiswa 
    public void inputData() {
        try {

            System.out.print("Masukkan nama mahasiswa : ");
            name = br.readLine();

            System.out.print("Masukkan universitas mahasiswa : ");
            university = br.readLine();

            System.out.print("Masukkan fakultas mahasiswa : ");
            faculty = br.readLine();

            System.out.print("Masukkan departemen mahasiswa  : ");
            department = br.readLine();

            System.out.print("Masukkan NIM mahasiswa : ");
            nim = br.readLine();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Masukkan sesuai apa yang diminta !!!");
            inputData();
        }
    }

    //method untuk menampilkan data mahasiswa setelah dilakukan input data
    public void showData() {
        System.out.println("Data Mahasiswa : ");
        System.out.println("Nama        : " + this.name);
        System.out.println("Universitas : " + this.university);
        System.out.println("Fakultas    : " + this.faculty);
        System.out.println("Departemen  : " + this.department);
        System.out.println("NIM         : " + this.nim);
    }
}