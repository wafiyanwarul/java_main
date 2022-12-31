public class sumIndex {
    public static void main(String[] args) {
        int [] myArr = {6, 44, 3, 7};//deklarasi nilai element dari array
        int sum = 0;//deklarasi variabel
        for (int x=0; x<myArr.length; x++){//mengulangi penjumlahan elemen sebanyak indeks dalam Array
            sum += myArr[x];
        }
        System.out.println("Hasil penjumlahan semua elemen yang ada di dalam Array = " + sum);
    }
}
