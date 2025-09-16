class Ferienort {
    public static void main(String[] args) {
        Hotel[] ferienort = {
                new Hotel(5, 16, 43),
                new Hotel(4, 23, 54),
                new Hotel(9, 28, 70)
        };
        for (int i = 0; i < 3; i++) {
            ferienort[i].auschecken();
            ferienort[i].printinfo();
        }
    }
}

class Hotel {
    int stockwerke;
    int zimmerpro;
    int belegung;

    public Hotel(int stock, int zimmer, int belegung) {
        this.stockwerke = stock;
        this.zimmerpro = zimmer;
        this.belegung = belegung;
    }
    public int getfrei() {
        return (this.stockwerke * this.zimmerpro) - this.belegung;
    }

    public boolean einchecken() {
        if (this.belegung < this.zimmerpro * this.stockwerke) {
            this.belegung++;
            return true;
        }
        return false;
    }
    public boolean auschecken() {
        if (this.belegung == 0) {
            this.belegung--;
            return true;
        }
        return false;
    }

    public void printinfo() {
        System.out.println("Anzahl Zimmer: " + this.getfrei() + " davon belegt: " + this.belegung);
    }
}