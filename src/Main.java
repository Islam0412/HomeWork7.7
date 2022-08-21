public class Main {
    public static void main(String[] args) {
        Warrior von = new Warrior();
        Magic Asuna = new Magic();
        Magic Kirito = new Magic();
        Hero[] i = {von, Asuna, Kirito};
        for (Hero num : i) {
            num.applySuperAbility();
        }
    }
}