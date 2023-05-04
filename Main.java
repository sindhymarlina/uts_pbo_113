//nomor 3

class Character {
    String nama;
    int heal;
    String weapon;
    int attackP;
    int mana;
    
    // Constructor
    Character(String nama, int heal, String weapon, int attackP, int mana) {
        this.nama = nama;
        this.heal = heal;
        this.weapon = weapon;
        this.attackP = attackP;
        this.mana = mana;
        print();
    }
    
    void attack() {
        this.mana -= 5;
        System.out.println(this.nama + " menyerang si sotong");
        // System.out.println("sotong terkena damage sebanyak " + this.attackP);
    }
    
    void damage(int attackP) {
        System.out.println("ucup terkena damage sebanyak " + attackP);
        this.heal -= attackP;
    }
    
    void print() {
        System.out.println("nama: " + nama);
        System.out.println("heal: " + heal);
        System.out.println("weapon: " + weapon);
        System.out.println("attack power: " + attackP);
        System.out.println("mana: " + mana);
    }
}

public class Main {
    public static void main(String[] args) {
        Character character1 = new Character("ucup", 100, "pedang excalibur", 5, 100);
        character1.attack();
        character1.damage(10);
        character1.print();
    }
}

                                    //PENJELASAN//

// Nama class harusnya Character bukan characterr.
// Nama constructor harus sama dengan nama class (Character).
// Tipe data yg benar untuk variabel string di Java adalah String (kapital 'S').
// Pada method attack(), saya memperbaiki decrement dari this.mana dengan mengganti 5a menjadi 5.
// Pada method print(), saya memperbaiki variabel nama attackkP menjadi attackP.
// Pada class Main, nama constructor untuk character1 harusnya Character, bukan character.
// Saya mengubah character1.demage(10); menjadi character1.damage(10); untuk menyamakan nama method.