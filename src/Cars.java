public class Cars {
    private String god, probeg, cena, marka, kuzov, korobka, dvigatel, privod, obyom;
    private Person owner;

    public Cars(String god, String probeg, String cena, String marka, String kuzov, String korobka, String dvigatel, String privod, String obyom){
        this.god = god;
        this.probeg = probeg;
        this.cena = cena;
        this.marka = marka;
        this.kuzov = kuzov;
        this.korobka = korobka;
        this.dvigatel = dvigatel;
        this.privod = privod;
        this.obyom = obyom;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void Vivod() {
        System.out.println("Год: " + god + "\nПробег: " + probeg + "\nЦена: " + cena + "\nМарка: " + marka + "\nКузов: " + kuzov + "\nКоробка: " + korobka + "\nДвигатель: " + dvigatel + "\nПривод: " + privod + "\nОбъём: " + obyom + "\n");
        try{
            System.out.println("Владелец:");
            owner.Vivod();
        }
        catch (Exception exception){
            System.out.println("Нет владельца.");
        }
    }
}