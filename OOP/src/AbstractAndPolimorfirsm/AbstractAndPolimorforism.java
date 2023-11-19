package AbstractAndPolimorfirsm;

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

