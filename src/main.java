import Attacks.*;
import Characters.*;
import Defence.*;

import java.util.ArrayList;
import java.util.List;
public class main {
    public static void main(String[] args) {
        main setup = new main();
        setup.setupCharacters();
    }

    public void setupCharacters() {
        AttackStrategy swordAttack = new SwingSword();
        AttackStrategy castSpell = new CastSpell();
        AttackStrategy shootArrow = new ShootArrow();
        DefenseStrategy shieldDefense = new Shield();
        DefenseStrategy createMagic = new CreateMagic();
        DefenseStrategy dodge = new Dodge();

        List<DefenseStrategy> defenseStrategies = new ArrayList<>();
        defenseStrategies.add(shieldDefense);
        defenseStrategies.add(createMagic);
        defenseStrategies.add(dodge);

        Knight knight = new Knight(swordAttack, defenseStrategies);
        Archer archer = new Archer(shootArrow, dodge);
        Wizard wizard = new Wizard(castSpell, createMagic);

        Context context = new Context();
        context.action(knight, archer, wizard);
    }
}