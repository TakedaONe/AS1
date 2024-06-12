package com.example.hwas3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            ArrayList<Integer> points = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                points.add((int) (Math.random() * 10)); // Случайные очки от 0 до 9
            }
            players.add(new Player(i, "Player" + i, points));
        }

        ArrayList<Player> playerList = new ArrayList<>(players);

        playerList.forEach(System.out::println);

        playerList.sort((p1, p2) -> p2.getNumber().compareTo(p1.getNumber()));

        System.out.println("Отсортированные игроки:");
        playerList.forEach(System.out::println);
    }
}
