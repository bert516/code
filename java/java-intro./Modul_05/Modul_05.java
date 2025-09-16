 class Fluggesellschaft {
    public static void main(String[] args) {
        Flugzeug[] airline = new Flugzeug[5];

        for (int i = 0; i < 5; i++) {
            airline[i] = new Flugzeug();
        }
        airline[0].bezeichnung = "a380";
        airline[1].bezeichnung = "a320";
        airline[2].bezeichnung = "b747";
        airline[3].bezeichnung = "ar78";
        airline[4].bezeichnung = "a380b";
        for (int i = 0; i<5; i++) {
            airline[i].printInfo();
        }
    }
}

class Flugzeug {
    String bezeichnung;
    int idNummer;
    int sitze;
    double geschw;
    double reichweite;

    public void printInfo() {
        System.out.println("Bezeichnung: " + this.bezeichnung + " Sitze: " + this.sitze);
        //System.out.println(this.getTime(3000));
    }

    public double getTime(int distance) {
        return (double) distance/this.geschw;
    }
}
