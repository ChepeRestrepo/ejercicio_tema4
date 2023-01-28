class condicionales {
  public static void main(String[] args) {
    //Usando un if:
    int numeroIf = 1;
    if(numeroIf < 0){
      System.out.println("La variable es negativa");
    }else if(numeroIf > 0){
      System.out.println("La variable es positiva");
    }else{
      System.out.println("La variable es igual a 0");
    }
    //Usando un bucle while:
    int numeroWhile = 0;
    while(numeroWhile < 3){
      numeroWhile += 1;
      System.out.println("La variable numeroWhile ahora es: " + numeroWhile);
    }
    //Usando un bucle Do...While:
    do{
      System.out.println("La variable numeroWhile en el Do..While ahora es: " + numeroWhile);
    }while(numeroWhile < 1);
    //Usando un bucle for:
    for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
      System.out.println("El valor de la variable numeroFor es: " + numeroFor);
    }
    //Usando un switch:
    int num = 4;
    String estacion;
      // switch con tipo de datos int
    switch (num){
        case 1:  estacion = "Primavera";
                 break;
        case 2:  estacion = "Verano";
                 break;
        case 3:  estacion = "Otoño";
                 break;
        case 4:  estacion = "Invierno";
                 break;
        default: estacion = "No existe esa estacion";
                 break;
    }
    System.out.println("Nos encontramos en la estacion: " + estacion);
  }
}