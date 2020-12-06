package ru.geekbrains.new_project;

public class Main {

    public static void main(String[] args) {
        int count = 1;
	int[][] table = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++){
                    table[i][j] = count;
                    System.out.print(table [i][j] + " ");
                }
                 System.out.println();
            }
        }


    }

