/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs;

/**
 *
 * @author Shakaw
 */
public class cpf {

    public static boolean cpf(int n[]) {
        if (n.length != 11){
            throw new IllegalArgumentException("Numero Invalido");
        }

        int sj = n[0] + 2 * n[1] + 3 * n[2] + 4 * n[3] + 5 * n[4] + 6 * n[5]
                + 7 * n[6] + 8 * n[7] + 9 * n[8];

        int sk = n[1] + 2 * n[2] + 3 * n[3] + 4 * n[4] + 5 * n[5] + 6 * n[6]
                + 7 * n[7] + 8 * n[8] + 9 * n[9];

        int j = mod(mod(sk, 11), 10);
        int k = mod(mod(sk, 11), 10);

        return j == n[10] && k == n[11];
    }

    public static boolean cpf2(int d[]) {
        int c = 8;
        int p = d[9];
        int s = d[9];
        
        if (d.length != 11){
            throw new IllegalArgumentException("Numero Invalido");
        }

        while (1 <= c) {
            p += d[c];
            s = s + p;
            c = c - 1;
        }
        int j = mod(mod(s, 11), 10);
        int k = mod(mod(s - p + 9 * j, 11), 10);

        return j == d[10] && k == d[11];

    }

    public static int mod(int x, int y) {

        if (y < 0 || x <= 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int s = x;

        while (y <= s) {
            s -= y;
        }

        return (s);
    }

}
