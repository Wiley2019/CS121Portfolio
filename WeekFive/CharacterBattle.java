package WeekFive;

import java.util.Random;
import java.util.Scanner;

class Character {
    String name;
    int hitPoints;
    int movePower;
    int attackSpeed;

    public Character(String name, int hitPoints, int movePower, int attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }
}

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter an odd number of rounds: ");
        int rounds = scanner.nextInt();

        while (rounds % 2 == 0) {
            System.out.print("Please enter an odd number of rounds: ");
            rounds = scanner.nextInt();
        }

        int player1Wins = 0;
        int player2Wins = 0;

        for (int i = 0; i < rounds; i++) {
            System.out.println("\nRound " + (i + 1));

            // Player 1 Character Input
            System.out.println("Player 1, enter your character's details:");
            System.out.print("Name: ");
            String p1Name = scanner.next();
            System.out.print("Hit Points: ");
            int p1HitPoints = scanner.nextInt();
            System.out.print("Move Power: ");
            int p1MovePower = scanner.nextInt();
            System.out.print("Attack Speed: ");
            int p1AttackSpeed = scanner.nextInt();
            Character player1 = new Character(p1Name, p1HitPoints, p1MovePower, p1AttackSpeed);

            // Player 2 Character Input
            System.out.println("Player 2, enter your character's details:");
            System.out.print("Name: ");
            String p2Name = scanner.next();
            System.out.print("Hit Points: ");
            int p2HitPoints = scanner.nextInt();
            System.out.print("Move Power: ");
            int p2MovePower = scanner.nextInt();
            System.out.print("Attack Speed: ");
            int p2AttackSpeed = scanner.nextInt();
            Character player2 = new Character(p2Name, p2HitPoints, p2MovePower, p2AttackSpeed);

            // Determine round winner
            while (player1.hitPoints > 0 && player2.hitPoints > 0) {
                if (player1.attackSpeed > player2.attackSpeed) {
                    // Player 1 attacks first
                    player2.hitPoints -= player1.movePower;
                    System.out.println(player1.name + " attacks first! " + player2.name + " now has " + player2.hitPoints + " HP left.");
                    if (player2.hitPoints <= 0) {
                        System.out.println(player1.name + " wins the round!");
                        player1Wins++;
                        break;
                    }

                    // Player 2 attacks
                    player1.hitPoints -= player2.movePower;
                    System.out.println(player2.name + " retaliates! " + player1.name + " now has " + player1.hitPoints + " HP left.");
                    if (player1.hitPoints <= 0) {
                        System.out.println(player2.name + " wins the round!");
                        player2Wins++;
                        break;
                    }
                } else if (player2.attackSpeed > player1.attackSpeed) {
                    // Player 2 attacks first
                    player1.hitPoints -= player2.movePower;
                    System.out.println(player2.name + " attacks first! " + player1.name + " now has " + player1.hitPoints + " HP left.");
                    if (player1.hitPoints <= 0) {
                        System.out.println(player2.name + " wins the round!");
                        player2Wins++;
                        break;
                    }

                    // Player 1 attacks
                    player2.hitPoints -= player1.movePower;
                    System.out.println(player1.name + " retaliates! " + player2.name + " now has " + player2.hitPoints + " HP left.");
                    if (player2.hitPoints <= 0) {
                        System.out.println(player1.name + " wins the round!");
                        player1Wins++;
                        break;
                    }
                } else {
                    // Speeds are equal, randomize who attacks first
                    if (random.nextBoolean()) {
                        // Player 1 attacks first
                        player2.hitPoints -= player1.movePower;
                        System.out.println(player1.name + " attacks first! " + player2.name + " now has " + player2.hitPoints + " HP left.");
                        if (player2.hitPoints <= 0) {
                            System.out.println(player1.name + " wins the round!");
                            player1Wins++;
                            break;
                        }

                        // Player 2 attacks
                        player1.hitPoints -= player2.movePower;
                        System.out.println(player2.name + " retaliates! " + player1.name + " now has " + player1.hitPoints + " HP left.");
                        if (player1.hitPoints <= 0) {
                            System.out.println(player2.name + " wins the round!");
                            player2Wins++;
                            break;
                        }
                    } else {
                        // Player 2 attacks first
                        player1.hitPoints -= player2.movePower;
                        System.out.println(player2.name + " attacks first! " + player1.name + " now has " + player1.hitPoints + " HP left.");
                        if (player1.hitPoints <= 0) {
                            System.out.println(player2.name + " wins the round!");
                            player2Wins++;
                            break;
                        }

                        // Player 1 attacks
                        player2.hitPoints -= player1.movePower;
                        System.out.println(player1.name + " retaliates! " + player2.name + " now has " + player2.hitPoints + " HP left.");
                        if (player2.hitPoints <= 0) {
                            System.out.println(player1.name + " wins the round!");
                            player1Wins++;
                            break;
                        }
                    }
                }
            }
        }

        // Final scores
        System.out.println("\nFinal Scores:");
        System.out.println("Player 1 Wins: " + player1Wins);
        System.out.println("Player 2 Wins: " + player2Wins);

        // Determine overall winner
        if (player1Wins > player2Wins) {
            System.out.println("Player 1 has won the battle!");
        } else if (player2Wins > player1Wins) {
            System.out.println("Player 2 has won the battle!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}