package com.dsa_cracker._concept.basicPrograms.patterns;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /**
         *               i | j
         *   *           1   5
         *   **          2   4
         *   ***         3   3
         *   ****        4   2
         *   *****       5   1
         */
        System.out.println("First pattern");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         *              i | j
         *   *****      5   5
         *   ****       4   4
         *   ***        3   3
         *   **         2   2
         *   *          1   1
         */
        System.out.println("Second pattern");
        for(int i = n; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         *
         *                 space | star
         *      *           4        1
         *     **           3        2
         *    ***           2        3
         *   ****           1        4
         *  *****           0        5
         */
        System.out.println("Third pattern");
        int space = n - 1;
        int star = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= star; k++){
                System.out.print("*");
            }
            space--;
            star++;
            System.out.println();
        }

        /**
         *              star | space
         *  *****         5      0
         *   ****         4      1
         *    ***         3      2
         *     **         2      3
         *      *         1      4
         */
        System.out.println("Fourth pattern");
        space = 0;
        star = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= star; j++){
                System.out.print("*");
            }
            space++;
            star--;
            System.out.println();
        }

        /**
         *                  space | star
         *        *           2      1
         *       ***          1      3
         *      *****         0      5
         *       ***          1      3
         *        *           2      1
         */
        System.out.println("Fifth pattern");
        space = n/2;
        star = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= star; j++){
                System.out.print("*");
            }
            if(i > n/2){
                space++;
                star -= 2;
            }else{
                space--;
                star += 2;
            }
            System.out.println();
        }

        /**
         *                 starLeft | space | starRight
         *   *** ***          3         1        3
         *   **   **          2         3        2
         *   *     *          1         5        1
         *   **   **          2         3        2
         *   *** ***          3         1        3
         *
         *   Here col = row + 2
         *
         */
         System.out.println("Sixth pattern");
         star = n/2 + 1;
         space = 1;
         for(int i = 1; i <= n; i++){
             for(int j = 1; j <= star; j++){
                 System.out.print("*");
             }
             for(int j = 1; j <= space; j++){
                 System.out.print(" ");
             }
             for(int j = 1; j <= star; j++){
                 System.out.print("*");
             }
             if(i <= n/2){
                 star--;
                 space += 2;
             }else{
                 star++;
                 space -= 2;
             }
             System.out.println();
         }

        /**
         *
         *               space
         *     *           0
         *      *          1
         *       *         2
         */
        System.out.println("Pattern seven");
        space = 1;
        for(int i = 1; i <= n; i++){
            for(int j = space; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                if(i == j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        /**
         *      *
         *     *
         *    *
         *   *
         */
        System.out.println("Pattern 8");
        space = n-1;
        for(int i = 1; i <= n; i++){
            for(int j = space; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                if(i == j){
                    System.out.print("*");
                    continue;
                }
            }
            space--;
            System.out.println();
        }
    }
}
