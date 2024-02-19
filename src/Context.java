import Characters.*;

public class Context {
    public void action(Knight knight, Archer archer, Wizard wizard) {
        System.out.println(knight.characterAttack());
        System.out.println(knight.characterDefend());

        System.out.println(archer.characterAttack());
        System.out.println(archer.characterDefend());
        System.out.println();

        System.out.println(wizard.characterAttack());
        System.out.println(wizard.characterDefend());
        System.out.println();
    }
}