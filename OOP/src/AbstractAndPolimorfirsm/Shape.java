package AbstractAndPolimorfirsm;

// Abstract class sebagai bentuk abstraksi
abstract class Shape {
    // Metode abstrak yang akan diimplementasikan oleh kelas turunan
    public abstract void draw();

    // Metode konkrit yang bisa digunakan langsung atau di-override
    public void display() {
        System.out.println("Displaying shape");
    }
}