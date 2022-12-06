package com.mycompany.croossandnought;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vlad__236
 */

/*
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Описание:
Данный класс принимает варианты хода игроков и проверяет их на соответствие ответов.
Принцип работы:
Используем класс Scanner, для считывания ответов игроков, которые вводятся с клавиатуры.
Вводимый ответ сохраняется в переменную "playerTurn". Далее "playerTurn" 
проходит проверки:
1) Является ли введенный ответ целочисленным числом в промежуток от 1 до 9 включительно;
2) Является ли введенный ответ целочисленной цифрой, а не любым иным символом. 
В случае провала любой из них - класс выдаёт соответсвующую ошибку 
(посторонний символ или ответ, выходящий за пределы промежутка от 1 до 9).
В случае успешного прохождения всех проверок, класс "Game" вызывает метод 
"public int getPlayerTurn()", который возвращает значение "playerTurn".
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Переменные:
private int playerTurn - переменная, которая хранит ответ, введённый игроком.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Методы:
void turnOfPlayer() - метод, принимающий ответ игрока и проводящий проврки на 
соответсвие;

public int getPlayerTurn() - метод, возвращающий значение "playerTurn" в 
класс "Game".
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Scanner;

    public class Player {
        
    private int playerTurn;
    
        void turnOfPlayer(){
            try {Scanner sc = new Scanner (System.in);
                 playerTurn = sc.nextInt();
                 if (playerTurn < 1){
                    System.out.println ("Такой клетки нет на доске, "
                            + "пожалуйста, введите другую клетку.");
                    turnOfPlayer();
                }
                else if (playerTurn > 9){
                    System.out.println("Такой клетки нет на доске, "
                            + "пожалуйста, введите другую клетку.");
                    turnOfPlayer();
                }
            }catch (java.util.InputMismatchException ex){
                    System.out.println ("Вы ввели посторонний символ. "
                            + "Пожалуйста введите номер клетки.");
                    turnOfPlayer();
                }
    }
    
    public int getPlayerTurn(){
        return playerTurn;
    }
}