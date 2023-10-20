package lab2p1_joseseron;

import java.util.Scanner;

public class Lab2P1_JoseSeron {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //menu principal
        boolean bandera1 = true;
        while (bandera1) {
            System.out.println("Elija un ejercicio de los siguientes:");
            System.out.println("1--> Dibujando Triangulos");
            System.out.println("2--> Area de Figuras");
            System.out.println("3--> Evaluando numeros");
            int opcion = input.nextInt();

            if (opcion == 1) { //Dibujando Triangulos
                System.out.println("DIBUJANDO TRIANGULOS");
                boolean bandera2 = true;
                while (bandera2) {
                    System.out.println("Ingrese a: ");
                    int ladoa = input.nextInt();
                    System.out.println("Ingrese b: ");
                    int ladob = input.nextInt();
                    System.out.println("Ingrese c: ");
                    int ladoc = input.nextInt();

                    //validar
                    if (ladoa >= 0 && ladob >= 0 && ladoc >= 0) {

                        int suma1 = ladoa + ladob; //c
                        int suma2 = ladob + ladoc; //a
                        int suma3 = ladoa + ladoc; //b

                        if (suma1 > ladoc && suma2 > ladoa && suma3 > ladob) {
                            System.out.println("El longitudes ingresadas forman un triangulo");
                        } else {
                            System.out.println("Las longitudes no forman un triangulo");
                        }

                    } else {
                        System.out.println("Las longitudes no pueden ser negativas");
                    }

                    //Exit
                    System.out.println("Desea Continuar? 1:SI  2:NO");
                    int opcion2 = input.nextInt();
                    if (opcion2 == 2) {
                        bandera2 = false;
                    }
                }
                System.out.println("");

            } else if (opcion == 2) { //Area de figuras
                boolean bandera3 = true;
                boolean bandera5 = true;
                int opcion2 = 0;
                System.out.println("AREA DE FIGURAS");

                while (bandera3) {

                    System.out.println("Que figura desea calcular?");
                    System.out.println("Rectangulo");
                    System.out.println("Triangulo");
                    System.out.println("Circulo");
                    opcion2 = input.nextInt();

                    if (opcion2 == 1) {
                        System.out.print("Ingrese la longitud de la base:");
                        double baserec = input.nextInt();
                        System.out.print("Ingrese la logitud de la altura:");
                        double altrec = input.nextInt();

                        double arearec = baserec * altrec;
                        System.out.println("El area del rectangulo es: " + arearec);

                        //Exit
                        System.out.println("Desea calcular el area de otra figura? 1. SI  2. NO");
                        int exit = input.nextInt();
                        if (exit == 2) {
                            bandera3 = false;
                        }

                    } else if (opcion2 == 2) {
                        System.out.print("Ingrese la longitud de la base:");
                        double basetrg = input.nextInt();
                        System.out.print("Ingrese la logitud de la altura:");
                        double alttrg = input.nextInt();

                        double areatrg = 0.5 * (basetrg * alttrg);
                        System.out.println("El area del triangulo es: " + areatrg);

                        System.out.println("Desea calcular el area de otra figura? 1. SI  2. NO");
                        int exit = input.nextInt();
                        if (exit == 2) {
                            bandera3 = false;
                        }

                    } else if (opcion2 == 3) {
                        System.out.print("Ingrese la longitud del radio: ");
                        double rad = input.nextInt();
                        double cuadrado = rad * rad;

                        double areacir = Math.PI * cuadrado;
                        System.out.println("El area del circulo es: " + areacir);

                        System.out.println("Desea calcular el area de otra figura? 1. SI  2. NO");
                        int exit = input.nextInt();
                        if (exit == 2) {
                            bandera3 = false;
                        }

                    }

                }
                System.out.println("");

            } else if (opcion == 3) { // Evaluando numeros
                boolean bandera4 = true;
                System.out.println("EVALUANDO NUMEROS");

                while (bandera4) {
                    System.out.print("Ingrese un numero a evaluar: ");
                    int num = input.nextInt();
                    int contDivisores=0;
                    int cont=1;
               
                    if (num <= 0) {
                        System.out.println("Ingrese un numero positivo mayor a cero");

                    } else {
                        while (cont <= num) {
                            int comparar = num % cont;
                            if (comparar == 0) {
                                contDivisores++;
                            }
                            cont++;
                        }
                        System.out.println(contDivisores);
                        if (num == 2) {
                            System.out.println("El numero es par y primo");
                        } else if (num % 2 == 0) {
                            System.out.println("El nuero es par");
                        } else if (((num % 2) != 0) && (contDivisores == 2)) {
                            System.out.println("El numero es impar y primo");
                        } else if ((num % 2) != 0) {
                            System.out.println("El numero es impar");
                        }
                    }

                    //Exit
                    System.out.println("Desea Continuar? 1:SI  2:NO");
                    int opcion2 = input.nextInt();
                    if (opcion2 == 2) {
                        bandera4 = false;
                    }
                }

            } else if (opcion == 4) {
                System.out.println("Saliendo del programa...");
            }
        }
    }

}
