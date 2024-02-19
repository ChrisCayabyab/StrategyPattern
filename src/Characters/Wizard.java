package Characters;

import Attacks.AttackStrategy;
import Defence.DefenseStrategy;

public class Wizard implements Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Wizard(AttackStrategy attackStrategy, DefenseStrategy defenseStrategy) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    @Override
    public String characterAttack() {
        return attackStrategy.attack();
    }

    @Override
    public String characterDefend() {
        return defenseStrategy.defend();
    }
}