//coba input dengan Scanner mengimplementasikan OOP dan Enkapsulasi
import java.util.Scanner;

public class inputScanner {
    public static void main(String[] args) {
        //membuat variabel untuk kelas Mahasiswa agar dapat mengakses method di dalamnya
        Mahasiswa mhs = new Mahasiswa();
        //mengakses method pada Kelas Mahasiswa
        mhs.inputData();
        mhs.tampilData();
    }
}

class Mahasiswa {
    
    //instance variable
    private String name, department, faculty, university;
    private int nim;

    //deklarasi Scanner
    Scanner in = new Scanner(System.in);

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

    public void setNIM(int nim) {
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

    public int getNIM() {
        return nim;
    }

    //method untuk memasukkan data mahasiswa 
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
            // Muncul ketika user memasukkan input selain angka pada bagian input NIM mahasiswa
            System.out.println("Masukkan sesuai apa yang diminta !!!");
            inputData();// Setelah Pesan saat error ditampilkan, akan memanggil kelas inputData(); lagi
        }
    }

    //method untuk menampilkan data mahasiswa setelah dilakukan input data
    public void tampilData() {
        System.out.println("Data Mahasiswa : ");
        System.out.println("Nama        : " + this.name);
        System.out.println("Universitas : " + this.university);
        System.out.println("Fakultas    : " + this.faculty);
        System.out.println("Departemen  : " + this.department);
        System.out.println("NIM         : " + this.nim);
    }

}
