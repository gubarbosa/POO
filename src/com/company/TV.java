package com.company;
import java.util.Scanner;

public class TV {
    private int canal;
    private int volume;

    public TV(int cn, int vol) {
        this.canal = cn;
        this.volume = vol;
    }

    public void informarCanal() {
        System.out.println("Informe o canal desejado: ");
        Scanner in = new Scanner(System.in);
        int cn = in.nextInt();
        if (cn > 50 || cn < 10) {
            System.out.println("Faixa de canal inválida!");
        } else {
            System.out.println("O canal desejado é " + cn);
        }
    }

    public void aumentarVolume() {
        this.volume ++;
        if (this.volume > 100) {
            this.volume = 100;
        }
        System.out.println("Volume: " + this.volume);
    }

    public void diminuirVolume() {
        this.volume --;
        if (this.volume < 0) {
            this.volume = 0;
        }
        System.out.println("Volume: " + this.volume);
    }
}