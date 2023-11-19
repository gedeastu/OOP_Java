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

// Kelas turunan yang mengimplementasikan metode abstrak
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Kelas turunan lain yang mengimplementasikan metode abstrak
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class AbstractAndPolimorforism {

    // Metode yang menggunakan polimorfisme
    public static void drawAndDisplay(Shape shape) {
        // Memanggil metode draw yang diimplementasikan oleh objek, bisa berupa Circle atau Rectangle
        shape.draw();

        // Memanggil metode display yang diwarisi dari kelas abstrak
        shape.display();
    }

    public static void main(String[] args) {

        // Membuat objek dari kelas turunan
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Memanggil metode drawAndDisplay menggunakan polimorfisme
        drawAndDisplay(circle);
        drawAndDisplay(rectangle);
        
    }
}

