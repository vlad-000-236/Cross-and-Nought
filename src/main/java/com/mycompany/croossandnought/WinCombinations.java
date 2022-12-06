package com.mycompany.croossandnought;
/**
 *
 * @author vlad__236
 */

/*
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Описание:
Данный класс проверяет доску на составление выйгрышной комбинации.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Принцип работы: 
Данный класс содержит 8 выйгрышных комбинаций для крестика и 
8 выйгрышных комбинаций для нолика. По ходу игры методы этого класса получают
ответы, вводимые игроками и сравнивают их с числами, входящими в каждую конкретную
победную комбинацию (метод "xWinChecker" проверяет комбинации для крестика, а метода 
"оWinChecker" дял нолика. Каждая комбинация тут представленна в виде байтовой
переменной, которая заполняется по мере ввода частей комбинации (горизонтальная
средняя линия состоить из комбинации 4, 5 и 6, вертикальная средняя - 8, 5, 6 и т.д.).
Изначально все переменные равняются = 0, по ходу ввода ответов соответсвующие переменные
повышаются на единицу. По достижению любой из переменных значения "3", 
булёвая перменная "win" принимает значение "true", что становится причиной 
завершения игры.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Переменные:
boolean win - переменная, которая принимает значение "true", в случае, если одна из 
победных;

int j - переменная, которая принимает значение, введённое игроками;

byte xWinHDown - переменная для победной комбинации "крестик, горизонатальная нижняя линия";
byte xWinHMidle- переменная для победной комбинации "крестик, горизонтальная средняя линия";
byte xWinHUp - переменная для победной комбинации "крестик, горизонтальная верхняя линия";
byte xWinVLeft - переменная для победной комбинации "крестик, вертикальная левая линия";
byte xWinVMidle - переменная для победной комбинации "крестик, вертикальная средняя линия";
byte xWinVRight - переменная для победной комбинации "крестик, вертикальная правая линия";
byte xWinDLeftToRighrt - переменная для победной комбинации "крестик, диагональ сверху слева на право";
byte xWinDRightToLeft - переменная для победной комбинации "крестик, диагональ сверху справа на лево"; 

byte оWinHDown - переменная для победной комбинации "нолик, горизонатальная нижняя линия";
byte оWinHMidle- переменная для победной комбинации "нолик, горизонтальная средняя линия";
byte оWinHUp - переменная для победной комбинации "нолик, горизонтальная верхняя линия";
byte оWinVLeft - переменная для победной комбинации "нолик, вертикальная левая линия";
byte оWinVMidle - переменная для победной комбинации "нолик, вертикальная средняя линия";
byte оWinVRight - переменная для победной комбинации "нолик, вертикальная правая линия";
byte оWinDLeftToRighrt - переменная для победной комбинации "нолик, диагональ сверху слева на право";
byte оWinDRightToLeft - переменная для победной комбинации "нолик, диагональ сверху справа на лево";
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Методы:
public boolean getWin() - возвращает значение переменной "win" в класс "Game";

void xWinChecker(int j) - отслеживает сбор победной комбинации игроком-крестиком, 
присваивает перменной "win" значение "true";

void oWinChecker(int j) - отслеживает сбор победной комбинации игроком-ноликом,
присваивает перменной "win" значение "true".
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/
public class WinCombinations {

    boolean win;
    
    byte xWinHDown;
    byte xWinHMidle;
    byte xWinHUp;
    byte xWinVLeft;
    byte xWinVMidle;
    byte xWinVRight;
    byte xWinDLeftToRighrt;
    byte xWinDRightToLeft;
    
    byte oWinHDown;
    byte oWinHMidle;
    byte oWinHUp;
    byte oWinVLeft;
    byte oWinVMidle;
    byte oWinVRight;
    byte oWinDLeftToRighrt;
    byte oWinDRightToLeft;
    
    public boolean getWin(){
        return win;
    }
    
    void xWinChecker(int j){
            
            switch (j){
                case 1: 
                    xWinHDown++;
                    if (xWinHDown == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Нижняя горизонтальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinVLeft++;
                    if (xWinVLeft == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Вертикальная левая линия. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinDRightToLeft++;
                    if (xWinDRightToLeft == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Диагонаяль справа налево. "
                                + "Спасибо за игру.");
                    }
                    break;
                    
                    
                case 2: 
                    xWinHDown++;
                    if (xWinHDown == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Нижняя горизонтальная линия. "
                                + "Спасибо за игру.");
                    }  
                    
                    xWinVMidle++;
                    if (xWinVMidle == 3){
                        win = true;
                        System.out.println("Игрок крестик победил!"
                                + " Вертикальная средняя линия. "
                                + "Спасибо за игру.");
                    }
                    break;
                    
                    
                case 3: 
                    xWinHDown++;
                    if (xWinHDown == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Нижняя горизонтальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinVRight++;
                    if (xWinVRight == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Вертикальная правая линия. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinDLeftToRighrt++;
                    if (xWinDLeftToRighrt == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Диагонаяль слева на право. "
                                + "Спасибо за игру.");
                    }
                    break;
                    
                    
                case 4: 
                    xWinHMidle++;
                    if (xWinHMidle == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Вертикальная средняя линия. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinVLeft++;
                    if (xWinVLeft == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Вертикальная левая линия. "
                                + "Спасибо за игру.");
                    }
                    break;
                    
                    
                case 5: 
                    xWinHMidle++;
                    if (xWinHMidle == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Вертикальная средняя линия. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinVMidle++;
                    if (xWinVMidle == 3){
                        win = true;
                        System.out.println("Игрок крестик победил!"
                                + " Вертикальная средняя линия. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinDLeftToRighrt++;
                    if (xWinDLeftToRighrt == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Диагонаяль слева на право. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinDRightToLeft++;
                    if (xWinDRightToLeft == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Диагонаяль справа налево. "
                                + "Спасибо за игру.");
                    }
                    break;
                
                    
                case 6:
                    xWinHMidle++;
                    if (xWinHMidle == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Вертикальная средняя линия. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinVRight++;
                    if (xWinVRight == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Вертикальная правая линия. "
                                + "Спасибо за игру.");
                    }
                    break;
                    
                    
                case 7: 
                    xWinHUp++;
                    if (xWinHUp == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Горизонтальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinVLeft++;
                    if (xWinVLeft == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Вертикальная левая линия. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinDLeftToRighrt++;
                    if (xWinDLeftToRighrt == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Диагонаяль слева на право. "
                                + "Спасибо за игру.");
                    }
                    break;
                    
                    
                case 8:
                    xWinHUp++;
                    if (xWinHUp == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Горизонтальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinVMidle++;
                    if (xWinVMidle == 3){
                        win = true;
                        System.out.println("Игрок крестик победил!"
                                + " Вертикальная средняя линия. "
                                + "Спасибо за игру.");
                    }
                    break;
                    
                    
                case 9:
                    xWinHUp++;
                    if (xWinHUp == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Горизонтальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinVRight++;
                    if (xWinVRight == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Вертикальная правая линия. "
                                + "Спасибо за игру.");
                    }
                    
                    xWinDRightToLeft++;
                    if (xWinDRightToLeft == 3){
                        win = true;
                        System.out.println("Игрок крестик победил! "
                                + "Диагонаяль справа налево. "
                                + "Спасибо за игру.");
                    }
                    break;    
            }
        }

    
    void oWinChecker(int j){
            
            switch (j){    
                
                case 1: 
                    oWinHDown++;
                        if (oWinHDown == 3){
                            win = true;
                            System.out.println("Игрок нолик победил! "
                                    + "Нижняя горизонтальная линия."
                                    + " Спасибо за игру.");
                        }
                        
                    oWinVLeft++;
                    if (oWinVLeft == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Левая вертикальная лини. "
                                + "Спасибо за игру.");
                    }
                    
                    oWinDRightToLeft++;
                    if (oWinDRightToLeft == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Диагональ справа на лево. "
                                + "Спасибо за игру.");
                    }
                    break;
                    
        
                case 2:
                    oWinHDown++;
                    if (oWinHDown == 3){
                        win = true;
                            System.out.println("Игрок нолик победил! "
                                    + "Нижняя горизонтальная линия."
                                    + " Спасибо за игру.");
                    }
                    
                    oWinVMidle++;
                    if (oWinVMidle == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Средняя вертикальная линия. "
                                + "Спасибо за игру.");
                    }
                    break;
                    
        
                case 3:
                    oWinHDown++;
                    if (oWinHDown == 3){
                        win = true;
                            System.out.println("Игрок нолик победил! "
                                    + "Нижняя горизонтальная линия."
                                    + " Спасибо за игру.");
                    }
                    
                    oWinVRight++;
                    if (oWinVRight == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Правая вертикальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    oWinDLeftToRighrt++;
                    if (oWinDLeftToRighrt == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Диагональ слева на права. "
                                + "Спасибо за игру.");
                    }
                    break;
                    
        
                case 4:
                    oWinHMidle++;
                    if (oWinHMidle == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Средняя горизонтальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    oWinVLeft++;
                    if (oWinVLeft == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Левая вертикальная лини. "
                                + "Спасибо за игру.");
                    }
                    break;
                    
        
                case 5:
                    oWinHMidle++;
                    if (oWinHMidle == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Средняя горизонтальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    oWinVMidle++;
                    if (oWinVMidle == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Средняя вертикальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    oWinDLeftToRighrt++;
                    if (oWinDLeftToRighrt == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Диагональ слева на права. "
                                + "Спасибо за игру.");
                    }
                    
                    oWinDRightToLeft++;
                    if(oWinDRightToLeft == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Диагональ справа на лево. "
                                + "Спасибо за игру.");
                    }
                    break;
        
                    
                case 6:
                    oWinHMidle++;
                    if (oWinHMidle == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Средняя горизонтальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    oWinVRight++;
                    if (oWinVRight == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Правая вертикальная линия. "
                                + "Спасибо за игру.");
                    }
                    break;
                    

                case 7:
                    oWinHUp++;
                    if (oWinHUp == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Верхняя горизонтальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    oWinVLeft++;
                    if (oWinVLeft == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Левая вертикальная лини. "
                                + "Спасибо за игру.");
                    }
                    
                    oWinDLeftToRighrt++;
                    if (oWinDLeftToRighrt == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Диагональ слева на права. "
                                + "Спасибо за игру.");
                    }
                    break;
                    
        
                case 8:
                    oWinHUp++;
                    if (oWinHUp == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Верхняя горизонтальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    oWinVMidle++;
                    if (oWinVMidle == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Средняя вертикальная линия. "
                                + "Спасибо за игру.");
                    }
                    break;
                    
        
                case 9:
                    oWinHUp++;
                    if (oWinHUp == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Верхняя горизонтальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    oWinVRight++;
                    if (oWinVRight == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Правая вертикальная линия. "
                                + "Спасибо за игру.");
                    }
                    
                    oWinDRightToLeft++;
                    if (oWinDRightToLeft == 3){
                        win = true;
                        System.out.println("Игрок нолик победил! "
                                + "Диагональ справа на лево. "
                                + "Спасибо за игру.");
                    }
                break;
        }
    }
}
