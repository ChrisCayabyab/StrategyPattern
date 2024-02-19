package Characters;

import Attacks.AttackStrategy;
import Defence.DefenseStrategy;

import java.util.List;

public class Knight implements Character {
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies;

    public Knight(AttackStrategy attackStrategy, List<DefenseStrategy> defenseStrategies) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = defenseStrategies;
    }

    @Override
    public String characterAttack() {
        return attackStrategy.attack();
    }

    @Override
    public String characterDefend() {
        StringBuilder knightDefend = new StringBuilder();
        for (DefenseStrategy defenseStrategy : defenseStrategies) {
            knightDefend.append(defenseStrategy.defend()).append("\n");
        }
        return knightDefend.toString();
    }
}