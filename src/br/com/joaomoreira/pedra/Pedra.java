/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaomoreira.pedra;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 * Curso de Java - Jogo Pedra, Papel, tesoura;
 *
 * @author padilha
 */
public class Pedra {

    public static void main(String[] args) {
        //logica do jogador
        int jogador;
        Scanner mao = new Scanner(System.in);
        System.out.println("_______Jogo_______");
        System.out.println("__________________");
        System.out.println("__________________");
        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");
        System.out.println("Digite a opcao desejada");
        jogador = mao.nextInt();

//logica do jogador
        switch (jogador) {

            case 1:
                System.out.println("jogador escolheu PEDRA");
                break;
            case 2:
                System.out.println("jogador escolheu PAPEL");
                break;
            case 3:
                System.out.println("jogador escolheu TESOURA");
                break;
            default:
                System.out.println("opcao invalida");
                break;
        }

        //logica do computador
        int computador = (int) (Math.random() * 3 + 1);

        switch (computador) {

            case 1:
                System.out.println("computador escolheu PEDRA");
                break;
            case 2:
                System.out.println("computador escolheu PAPEL");
                break;
            case 3:
                System.out.println("computador escolheu TESOURA");
                break;

        }
        //logica para determinar o vencedor
        if (jogador != computador) {
            if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
                System.out.println("JOGADOR VENCEU");
            } else {
                System.out.println("COMPUTADOR VENCEU");
            }
        } else {
            System.out.println("EMPATE");
        }

    }

}
