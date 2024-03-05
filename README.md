Magical Arena Design:

This project implements a Magical Arena where two players engage in turn-based combat. The design includes players with attributes such as health, strength, and attack. The game mechanics involve rolling dice for attack and defense, calculating damage, and updating player health accordingly.

Problem Statement:

Players engage in matches where they take turns attacking and defending. The attacker rolls the attacking dice, and the defender rolls the defending dice. The attack value is multiplied by the attacking dice roll, and the defender's strength value is multiplied by the defending dice roll. The damage caused by the attacker, in excess of the defender's defense, reduces the defender's health. The game ends when a player's health reaches 0.

Implementation Details

Player Class
Attributes: health, strength, attack.
Methods: reduceHealth (to handle damage).

Dice Class
Method: roll (simulates a dice roll).

Arena Class
Attributes: two players and two dice.
Method: playMatch (simulates the match).

GameManager Class
The main class to initialize players, the arena, and start the match.
