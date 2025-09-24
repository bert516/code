class Ball {
    int radius;
    final double pi = 3.1415;

    public Ball() {
        this.radius = 1;
    }

    public Ball(int rad) {
        this.radius = rad;
    }

    public Ball(Ball b) {
        this.radius == b.radius;
    }

    public double volumen() {
        return (double) (this.pi * (4 / 3) * Math.pow(this.radius, 3));
    }

    public double oberflaeche() {
        return Math.pow(this.radius, 2) * this.pi * 4;
    }
    public void print() {
        System.out.println("Radius: " + this.radius + " Volumen: " + this.volumen() + " Oberfläche: " + this.oberflaeche());
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}