public class Juego {
    public static void main(String[] args) {
        Weapon sword = new Weapon(new Espada(), 50);
        Weapon bow = new Weapon(new Arco(), 30); 
        Weapon axe = new Weapon(new Hacha(), 25);
        
        DamageCalculator calculator = new DamageCalculator();
        
        int swordDamage = calculator.calculateDamage(sword, 10);
        int bowDamage = calculator.calculateDamage(bow, 10);
        int axeDamage = calculator.calculateDamage(axe, 10);
        
        System.out.println("Daño de espada: " + swordDamage);
        System.out.println("Daño de arco: " + bowDamage);
        System.out.println("Daño de hacha: " + axeDamage);
    }
}
