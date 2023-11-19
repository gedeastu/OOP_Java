package AbstractAndPolimorfirsm;

// Kelas turunan lain yang mengimplementasikan metode abstrak
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
