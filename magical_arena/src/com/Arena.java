package com;

public class Arena {
    private Player playerA;
    private Player playerB;
    private Dice attackDice;
    private Dice defendDice;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.attackDice = new Dice();
        this.defendDice = new Dice();
    }

    public void playMatch() {
        Player attacker, defender;

        // Determine the order of attack based on lower health
        if (playerA.getHealth() <= playerB.getHealth()) {
            attacker = playerA;
            defender = playerB;
        } else {
            attacker = playerB;
            defender = playerA;
        }

        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            int attackRoll = attackDice.roll();
            int defendRoll = defendDice.roll();

            int attackDamage = attackRoll * attacker.getAttack();
            int defendStrength = defendRoll * defender.getStrength();

            int damageTaken = Math.max(0, attackDamage - defendStrength);
            defender.reduceHealth(damageTaken);

            // Switch roles for the next round
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        // Game over, print the result
        System.out.println("Player A Health: " + playerA.getHealth());
        System.out.println("Player B Health: " + playerB.getHealth());
    }
}

