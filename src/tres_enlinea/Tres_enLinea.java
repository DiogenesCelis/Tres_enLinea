package tres_enlinea;

import java.util.Scanner;

/**
 *
 * @author diogenes.celis
 */
public class Tres_enLinea {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String coordenadas, num2;
        char triqui[][] = new char[3][3];
        char num1;
        int ejeY = 0, ejeX = 0, sw, wn = 0;

        //iniciar la matriz en espacio en blanco
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                triqui[i][j] = ' ';
            }
        }
        // Hola

        System.out.println("\n\033[32mINSTRUCCIONES:\nCada jugador en su turno debera ingresar\nlas coordenadas de la poscicion deseada\nescribiendo primero la letra seguido del numero.\nEj: A1 - B2 - C3 ");
        System.out.println("----------------------------------------------------\n\n");

        do {

            do {
                //verificar coordenadas jugador A
                System.out.println("**Jugador A** \n" + "ingrese coordenadas");
                coordenadas = x.nextLine();
                num1 = coordenadas.toUpperCase().charAt(0);
                num2 = coordenadas.substring(1);

                ejeX = (Integer.parseInt(num2)) - 1;

                switch (num1) {
                    case 'A':
                        ejeY = 0;
                        sw = 1;

                        break;
                    case 'B':
                        ejeY = 1;
                        sw = 1;
                        break;
                    case 'C':
                        ejeY = 2;
                        sw = 1;
                        break;

                    default:
                        sw = 0;
                        System.out.println("Valor no permitido,debe ser una letra de la A a la C, intente de nuevo\n");
                }
                if (ejeX > 2) {

                    sw = 0;
                    System.out.println("Valor no permitido,debe ser un numero entre 1 y 3, intente de nuevo\n");
                } else {
                    if (triqui[ejeY][ejeX] == ' ') {
                        triqui[ejeY][ejeX] = 'X';
                    } else {
                        System.out.println("\nLa poscion elegida ya esta ocupada\nporfavor eliga otra que esté libre\n");
                        sw = 0;
                    }
                }
            } while (sw == 0);//termina verificar coordenadas jugador A
            //<editor-fold defaultstate="collapsed" desc="WIN CONDITION A">

            if ((triqui[0][0] == 'X') && (triqui[1][0] == 'X') && (triqui[2][0] == 'X')) {
                System.out.println("\n");
                System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR A**\033[37m
                                   -----------------------------------------""");
                System.out.println("	    1	    2	    3	\n"
                        + "\n"
                        + "		|	|	\n"
                        + "A    	    \033[32m" + triqui[0][0] + "\033[37m   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                        + "	 _______|_______|_______\n"
                        + "		|	|	\n"
                        + "B	    \033[32m" + triqui[1][0] + "\033[37m	|   " + triqui[1][1] + "	|   " + triqui[1][2] + "	\n"
                        + "	 _______|_______|_______\n"
                        + "		|	|	\n"
                        + "C	    \033[32m" + triqui[2][0] + "\033[37m	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                        + "		|	|	");//ganador en 1
                System.out.println("\n\033[30m**Gracias por Jugar**\n");
                wn = 1;
                sw = 1;
            } else {
                if ((triqui[0][1] == 'X') && (triqui[1][1] == 'X') && (triqui[2][1] == 'X')) {
                    System.out.println("\n");
                    System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR A**\033[37m
                                   -----------------------------------------""");
                    System.out.println("	    1	    2	    3	\n"
                            + "\n"
                            + "		|	|	\n"
                            + "A    	    " + triqui[0][0] + "   |   \033[32m" + triqui[0][1] + "\033[37m	|   " + triqui[0][2] + "  	\n"
                            + "	 _______|_______|_______\n"
                            + "		|	|	\n"
                            + "B	    " + triqui[1][0] + "	|   \033[32m" + triqui[1][1] + "\033[37m	|   " + triqui[1][2] + "	\n"
                            + "	 _______|_______|_______\n"
                            + "		|	|	\n"
                            + "C	    " + triqui[2][0] + "	|   \033[32m" + triqui[2][1] + "\033[37m	|   " + triqui[2][2] + "	\n"
                            + "		|	|	");//ganador en 2

                    System.out.println("\n\033[30m**Gracias por Jugar**\n");
                    wn = 1;
                    sw = 1;
                } else {
                    if ((triqui[0][2] == 'X') && (triqui[1][2] == 'X') && (triqui[2][2] == 'X')) {
                        System.out.println("\n");
                        System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR A**\033[37m
                                   -----------------------------------------""");
                        System.out.println("	    1	    2	    3	\n"
                                + "\n"
                                + "		|	|	\n"
                                + "A    	    " + triqui[0][0] + "   |   " + triqui[0][1] + "	|   \033[32m" + triqui[0][2] + "\033[37m  	\n"
                                + "	 _______|_______|_______\n"
                                + "		|	|	\n"
                                + "B	    " + triqui[1][0] + "	|   " + triqui[1][1] + "	|   \033[32m" + triqui[1][2] + "\033[37m	\n"
                                + "	 _______|_______|_______\n"
                                + "		|	|	\n"
                                + "C	    " + triqui[2][0] + "	|   " + triqui[2][1] + "	|   \033[32m" + triqui[2][2] + "\033[37m	\n"
                                + "		|	|	");//ganador en 3
                        System.out.println("\n\033[30m**Gracias por Jugar**\n");
                        wn = 1;
                        sw = 1;
                    }
                }
            }
            if ((triqui[0][0] == 'X') && (triqui[0][1] == 'X') && (triqui[0][2] == 'X')) {
                System.out.println("\n");
                System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR A**\033[37m
                                   -----------------------------------------""");
                System.out.println("	    1	    2	    3	\n"
                        + "\n"
                        + "		|	|	\n"
                        + "A    	    \033[32m" + triqui[0][0] + "\033[37m   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                        + "	 _______|_______|_______\n"
                        + "		|	|	\n"
                        + "B	    \033[37m" + triqui[1][0] + "	|   " + triqui[1][1] + "	|   " + triqui[1][2] + "	\n"
                        + "	 _______|_______|_______\n"
                        + "		|	|	\n"
                        + "C	    \033[37m" + triqui[2][0] + "	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                        + "		|	|	");//ganador en A
                System.out.println("\n\033[30m**Gracias por Jugar**\n");
                wn = 1;
                sw = 1;
            } else {
                if ((triqui[1][0] == 'X') && (triqui[1][1] == 'X') && (triqui[1][2] == 'X')) {
                    System.out.println("\n");
                    System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR A**\033[37m
                                   -----------------------------------------""");
                    System.out.println("	    1	    2	    3	\n"
                            + "\n"
                            + "		|	|	\n"
                            + "A    	    \033[37m" + triqui[0][0] + "\033[37m   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                            + "	 _______|_______|_______\n"
                            + "		|	|	\n"
                            + "B	    \033[32m" + triqui[1][0] + "	|   " + triqui[1][1] + "	|   " + triqui[1][2] + "	\n"
                            + "	 _______|_______|_______\n"
                            + "		|	|	\n"
                            + "C	    \033[37m" + triqui[2][0] + "	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                            + "		|	|	");//ganador en B
                    System.out.println("\n\033[30m**Gracias por Jugar**\n");
                    wn = 1;
                    sw = 1;
                } else {
                    if ((triqui[2][0] == 'X') && (triqui[2][1] == 'X') && (triqui[2][2] == 'X')) {
                        System.out.println("\n");
                        System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR A**\033[37m
                                   -----------------------------------------""");
                        System.out.println("	    1	    2	    3	\n"
                                + "\n"
                                + "		|	|	\n"
                                + "A    	    \033[37m" + triqui[0][0] + "\033[37m   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                                + "	 _______|_______|_______\n"
                                + "		|	|	\n"
                                + "B	    \033[37m" + triqui[1][0] + "	|   " + triqui[1][1] + "	|   " + triqui[1][2] + "	\n"
                                + "	 _______|_______|_______\n"
                                + "		|	|	\n"
                                + "\033[32mC	    " + triqui[2][0] + "	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                                + "		|	|	");//ganador en C
                        System.out.println("\n\033[30m**Gracias por Jugar**\n");
                        wn = 1;
                        sw = 1;
                    } else {
                        if ((triqui[0][0] == 'X') && (triqui[1][1] == 'X') && (triqui[2][2] == 'X')) {
                            System.out.println("\n");
                            System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR A**\033[37m
                                   -----------------------------------------""");
                            System.out.println("	    1	    2	    3	\n"
                                    + "\n"
                                    + "		|	|	\n"
                                    + "A    	    \033[32m" + triqui[0][0] + "\033[37m   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                                    + "	 _______|_______|_______\n"
                                    + "		|	|	\n"
                                    + "B	    " + triqui[1][0] + "	|   \033[32m" + triqui[1][1] + "\033[37m	|   " + triqui[1][2] + "	\n"
                                    + "	 _______|_______|_______\n"
                                    + "		|	|	\n"
                                    + "C	    " + triqui[2][0] + "	|   " + triqui[2][1] + "	|   \033[32m" + triqui[2][2] + "\033[37m	\n"
                                    + "		|	|	");//ganador en diagonal 0,0 - 2,2
                            System.out.println("\n\033[30m**Gracias por Jugar**\n");
                            wn = 1;
                            sw = 1;
                        } else {
                            if ((triqui[0][2] == 'X') && (triqui[1][1] == 'X') && (triqui[2][0] == 'X')) {

                                System.out.println("\n");
                                System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR A**\033[37m
                                   -----------------------------------------""");
                                System.out.println("	    1	    2	    3	\n"
                                        + "\n"
                                        + "		|	|	\n"
                                        + "A    	    " + triqui[0][0] + "   |   " + triqui[0][1] + "	|   \033[32m" + triqui[0][2] + "\033[37m  	\n"
                                        + "	 _______|_______|_______\n"
                                        + "		|	|	\n"
                                        + "B	    " + triqui[1][0] + "	|   \033[32m" + triqui[1][1] + "\033[37m	|   " + triqui[1][2] + "	\n"
                                        + "	 _______|_______|_______\n"
                                        + "		|	|	\n"
                                        + "C	    \033[32m" + triqui[2][0] + "\033[37m	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                                        + "		|	|	");//ganador en diagonal 0,2 - 1,0

                                System.out.println("\n\033[30m**Gracias por Jugar**\n");;
                                wn = 1;
                                sw = 1;
                            }

                        }
                    }
                }
                if (wn == 0 && triqui[0][0] != ' ' && triqui[0][1] != ' ' && triqui[0][2] != ' ' && triqui[1][0] != ' ' && triqui[2][0] != ' ' && triqui[1][1] != ' ' && triqui[1][2] != ' ' && triqui[2][1] != ' ' && triqui[2][2] != ' ') {
                    System.out.println("-----------------------------------------\n"
                            + "	       \033[31m**EMPATE**\n\033[37m"
                            + "-----------------------------------------");
                    System.out.println("	    1	    2	    3	\n"
                            + "\n"
                            + "		|	|	\n"
                            + "A    	    " + triqui[0][0] + "   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                            + "	 _______|_______|_______\n"
                            + "		|	|	\n"
                            + "B	    " + triqui[1][0] + "	|   " + triqui[1][1] + "	|   " + triqui[1][2] + "	\n"
                            + "	 _______|_______|_______\n"
                            + "		|	|	\n"
                            + "C	    " + triqui[2][0] + "	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                            + "		|	|	");//Empate
                    System.out.println("\n\033[30m**Gracias por Jugar**\n");
                    wn = 1;
                    sw = 1;
                }

//</editor-fold>
//
                if (wn == 0) {
                    System.out.println("\n");
                    System.out.println("-----------------------------------------\n"
                            + "	       **EN JUEGO**\n"
                            + "-----------------------------------------");
                    System.out.println("	    1	    2	    3	\n"
                            + "\n"
                            + "		|	|	\n"
                            + "A    	    " + triqui[0][0] + "   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                            + "	 _______|_______|_______\n"
                            + "		|	|	\n"
                            + "B	    " + triqui[1][0] + "	|   " + triqui[1][1] + "	|   " + triqui[1][2] + "	\n"
                            + "	 _______|_______|_______\n"
                            + "		|	|	\n"
                            + "C	    " + triqui[2][0] + "	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                            + "		|	|	");//triqui en juego

                    System.out.println("\n");
                    sw = 0;
                }
                if (wn == 0) {
                    do {
                        //verificacion coordenadas jugador B
                        System.out.println("**Jugador B** \n" + "ingrese coordenadas");
                        coordenadas = x.nextLine();
                        num1 = coordenadas.toUpperCase().charAt(0);
                        num2 = coordenadas.substring(1);

                        ejeX = (Integer.parseInt(num2)) - 1;

                        switch (num1) {
                            case 'A':
                                ejeY = 0;
                                sw = 1;

                                break;
                            case 'B':
                                ejeY = 1;
                                sw = 1;
                                break;
                            case 'C':
                                ejeY = 2;
                                sw = 1;
                                break;

                            default:
                                sw = 0;
                                System.out.println("Valor no permitido, intente e nuevo\n");
                        }
                        if (ejeX > 2) {

                            sw = 0;
                            System.out.println("Valor no permitido,debe ser un numero entre 1 y 3, intente de nuevo\n");
                        } else {
                            if (triqui[ejeY][ejeX] == ' ') {
                                triqui[ejeY][ejeX] = 'O';
                            } else {
                                System.out.println("\nLa poscion elegida ya esta ocupada\nporfavor eliga otra que esté libre\n");
                                sw = 0;
                            }
                        }
                    } while (sw == 0);
                    //
                    //<editor-fold defaultstate="collapsed" desc="WIN CONDITION B">
                    if ((triqui[0][0] == 'O') && (triqui[1][0] == 'O') && (triqui[2][0] == 'O')) {
                        System.out.println("\n");
                        System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR B**\033[37m
                                   -----------------------------------------""");
                        System.out.println("	    1	    2	    3	\n"
                                + "\n"
                                + "		|	|	\n"
                                + "A    	    \033[32m" + triqui[0][0] + "\033[37m   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                                + "	 _______|_______|_______\n"
                                + "		|	|	\n"
                                + "B	    \033[32m" + triqui[1][0] + "\033[37m	|   " + triqui[1][1] + "	|   " + triqui[1][2] + "	\n"
                                + "	 _______|_______|_______\n"
                                + "		|	|	\n"
                                + "C	    \033[32m" + triqui[2][0] + "\033[37m	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                                + "		|	|	");//ganador en 1
                        System.out.println("\n\033[30m**Gracias por Jugar**\n");
                        wn = 1;
                        sw = 1;
                    } else {
                        if ((triqui[0][1] == 'O') && (triqui[1][1] == 'O') && (triqui[2][1] == 'O')) {
                            System.out.println("\n");
                            System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR B**\033[37m
                                   -----------------------------------------""");
                            System.out.println("	    1	    2	    3	\n"
                                    + "\n"
                                    + "		|	|	\n"
                                    + "A    	    " + triqui[0][0] + "   |   \033[32m" + triqui[0][1] + "\033[37m	|   " + triqui[0][2] + "  	\n"
                                    + "	 _______|_______|_______\n"
                                    + "		|	|	\n"
                                    + "B	    " + triqui[1][0] + "	|   \033[32m" + triqui[1][1] + "\033[37m	|   " + triqui[1][2] + "	\n"
                                    + "	 _______|_______|_______\n"
                                    + "		|	|	\n"
                                    + "C	    " + triqui[2][0] + "	|   \033[32m" + triqui[2][1] + "\033[37m	|   " + triqui[2][2] + "	\n"
                                    + "		|	|	");//ganador en 2

                            System.out.println("\n\033[30m**Gracias por Jugar**\n");
                            wn = 1;
                            sw = 1;
                        } else {
                            if ((triqui[0][2] == 'O') && (triqui[1][2] == 'O') && (triqui[2][2] == 'O')) {
                                System.out.println("\n");
                                System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR B**\033[37m
                                   -----------------------------------------""");
                                System.out.println("	    1	    2	    3	\n"
                                        + "\n"
                                        + "		|	|	\n"
                                        + "A    	    " + triqui[0][0] + "   |   " + triqui[0][1] + "	|   \033[32m" + triqui[0][2] + "\033[37m  	\n"
                                        + "	 _______|_______|_______\n"
                                        + "		|	|	\n"
                                        + "B	    " + triqui[1][0] + "	|   " + triqui[1][1] + "	|   \033[32m" + triqui[1][2] + "\033[37m	\n"
                                        + "	 _______|_______|_______\n"
                                        + "		|	|	\n"
                                        + "C	    " + triqui[2][0] + "	|   " + triqui[2][1] + "	|   \033[32m" + triqui[2][2] + "\033[37m	\n"
                                        + "		|	|	");//ganador en 3
                                System.out.println("\n\033[30m**Gracias por Jugar**\n");
                                wn = 1;
                                sw = 1;
                            }
                        }
                    }
                    if ((triqui[0][0] == 'O') && (triqui[0][1] == 'O') && (triqui[0][2] == 'O')) {
                        System.out.println("\n");
                        System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR B**\033[37m
                                   -----------------------------------------""");
                        System.out.println("	    1	    2	    3	\n"
                                + "\n"
                                + "		|	|	\n"
                                + "A    	    \033[32m" + triqui[0][0] + "\033[37m   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                                + "	 _______|_______|_______\n"
                                + "		|	|	\n"
                                + "B	    \033[37m" + triqui[1][0] + "	|   " + triqui[1][1] + "	|   " + triqui[1][2] + "	\n"
                                + "	 _______|_______|_______\n"
                                + "		|	|	\n"
                                + "C	    \033[37m" + triqui[2][0] + "	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                                + "		|	|	");//ganador en A
                        System.out.println("\n\033[30m**Gracias por Jugar**\n");
                        wn = 1;
                        sw = 1;
                    } else {
                        if ((triqui[1][0] == 'O') && (triqui[1][1] == 'O') && (triqui[1][2] == 'O')) {
                            System.out.println("\n");
                            System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR B**\033[37m
                                   -----------------------------------------""");
                            System.out.println("	    1	    2	    3	\n"
                                    + "\n"
                                    + "		|	|	\n"
                                    + "A    	    \033[37m" + triqui[0][0] + "\033[37m   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                                    + "	 _______|_______|_______\n"
                                    + "		|	|	\n"
                                    + "B	    \033[32m" + triqui[1][0] + "	|   " + triqui[1][1] + "	|   " + triqui[1][2] + "	\n"
                                    + "	 _______|_______|_______\n"
                                    + "		|	|	\n"
                                    + "C	    \033[37m" + triqui[2][0] + "	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                                    + "		|	|	");//ganador en B
                            System.out.println("\n\033[30m**Gracias por Jugar**\n");
                            wn = 1;
                            sw = 1;
                        } else {
                            if ((triqui[2][0] == 'O') && (triqui[2][1] == 'O') && (triqui[2][2] == 'O')) {
                                System.out.println("\n");
                                System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR B**\033[37m
                                   -----------------------------------------""");
                                System.out.println("	    1	    2	    3	\n"
                                        + "\n"
                                        + "		|	|	\n"
                                        + "A    	    \033[37m" + triqui[0][0] + "\033[37m   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                                        + "	 _______|_______|_______\n"
                                        + "		|	|	\n"
                                        + "B	    \033[37m" + triqui[1][0] + "	|   " + triqui[1][1] + "	|   " + triqui[1][2] + "	\n"
                                        + "	 _______|_______|_______\n"
                                        + "		|	|	\n"
                                        + "C	    \033[32m" + triqui[2][0] + "	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                                        + "		|	|	");//ganador en C
                                System.out.println("\n\033[30m**Gracias por Jugar**\n");
                                wn = 1;
                                sw = 1;
                            } else {
                                if ((triqui[0][0] == 'O') && (triqui[1][1] == 'O') && (triqui[2][2] == 'O')) {
                                    System.out.println("\n");
                                    System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR B**\033[37m
                                   -----------------------------------------""");
                                    System.out.println("	    1	    2	    3	\n"
                                            + "\n"
                                            + "		|	|	\n"
                                            + "A    	    \033[32m" + triqui[0][0] + "\033[37m   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                                            + "	 _______|_______|_______\n"
                                            + "		|	|	\n"
                                            + "B	    " + triqui[1][0] + "	|   \033[32m" + triqui[1][1] + "\033[37m	|   " + triqui[1][2] + "	\n"
                                            + "	 _______|_______|_______\n"
                                            + "		|	|	\n"
                                            + "C	    " + triqui[2][0] + "	|   " + triqui[2][1] + "	|   \033[32m" + triqui[2][2] + "\033[37m	\n"
                                            + "		|	|	");//ganador en diagonal 0,0 - 2,2
                                    System.out.println("\n\033[30m**Gracias por Jugar**\n");
                                    wn = 1;
                                    sw = 1;
                                } else {
                                    if ((triqui[0][2] == 'O') && (triqui[1][1] == 'O') && (triqui[2][0] == 'O')) {

                                        System.out.println("\n");
                                        System.out.println("""
                                   -----------------------------------------
                                   \t    \033[32m**GANÓ JUGADOR B**\033[37m
                                   -----------------------------------------""");
                                        System.out.println("	    1	    2	    3	\n"
                                                + "\n"
                                                + "		|	|	\n"
                                                + "A    	    " + triqui[0][0] + "   |   " + triqui[0][1] + "	|   \033[32m" + triqui[0][2] + "\033[37m  	\n"
                                                + "	 _______|_______|_______\n"
                                                + "		|	|	\n"
                                                + "B	    " + triqui[1][0] + "	|   \033[32m" + triqui[1][1] + "\033[37m	|   " + triqui[1][2] + "	\n"
                                                + "	 _______|_______|_______\n"
                                                + "		|	|	\n"
                                                + "C	    \033[32m" + triqui[2][0] + "\033[37m	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                                                + "		|	|	");//ganador en diagonal 0,2 - 1,0

                                        System.out.println("\n\033[30m**Gracias por Jugar**\n");
                                        wn = 1;
                                        sw = 1;
                                    }
                                }
                            }
                        }
                    }
                    if (wn == 0 && triqui[0][0] != ' ' && triqui[0][1] != ' ' && triqui[0][2] != ' ' && triqui[1][0] != ' ' && triqui[2][0] != ' ' && triqui[1][1] != ' ' && triqui[1][2] != ' ' && triqui[2][1] != ' ' && triqui[2][2] != ' ') {
                        System.out.println("-----------------------------------------\n"
                                + "	       \033[31m**EMPATE**\n\033[37m"
                                + "-----------------------------------------");
                        System.out.println("	    1	    2	    3	\n"
                                + "\n"
                                + "		|	|	\n"
                                + "A    	    " + triqui[0][0] + "   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                                + "	 _______|_______|_______\n"
                                + "		|	|	\n"
                                + "B	    " + triqui[1][0] + "	|   " + triqui[1][1] + "	|   " + triqui[1][2] + "	\n"
                                + "	 _______|_______|_______\n"
                                + "		|	|	\n"
                                + "C	    " + triqui[2][0] + "	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                                + "		|	|	");//Empate

                        System.out.println("\n\033[30m**Gracias por Jugar**\n");
                        wn = 1;
                        sw = 1;
                    }
//</editor-fold>  
                    if (wn == 0) {
                        System.out.println("\n");
                        System.out.println("""
                                   -----------------------------------------
                                   \t       **EN JUEGO**
                                   -----------------------------------------""");
                        System.out.println("	    1	    2	    3	\n"
                                + "\n"
                                + "		|	|	\n"
                                + "A    	    " + triqui[0][0] + "   |   " + triqui[0][1] + "	|   " + triqui[0][2] + "  	\n"
                                + "	 _______|_______|_______\n"
                                + "		|	|	\n"
                                + "B	    " + triqui[1][0] + "	|   " + triqui[1][1] + "	|   " + triqui[1][2] + "	\n"
                                + "	 _______|_______|_______\n"
                                + "		|	|	\n"
                                + "C	    " + triqui[2][0] + "	|   " + triqui[2][1] + "	|   " + triqui[2][2] + "	\n"
                                + "		|	|	");//triqui en juego
                    }
                }
            }

        } while (wn == 0);


    }
}
