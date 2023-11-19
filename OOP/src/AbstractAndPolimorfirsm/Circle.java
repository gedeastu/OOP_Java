package AbstractAndPolimorfirsm;

// Kelas turunan yang mengimplementasikan metode abstrak
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}