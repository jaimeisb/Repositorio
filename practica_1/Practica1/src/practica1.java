import java.util.Scanner;


public class practica1 {

	
		 public static void menu() {
			 	System.out.println("Ingrese el numero del programa a ejecutar");
		        System.out.println("\t1. Rombo");
		        System.out.println("\t2. Promedio de notas");
		        System.out.println("\t3. Convertir la Hora");
		        System.out.println("\t4. Hacer medidas de circulo triangulo o cuadrado");
		        System.out.println("\t5. Diferencia entre fechas");
		        System.out.println("\t6. Mini calculadora");
		        System.out.println("\t7. Tablas de multiplicar");
		        System.out.println("\t8. Rangos");
		        System.out.println("\t9. Conversión de numeros de arabigos a romanos");
		        System.out.println("\t10. Piramide de numeros");
		        System.out.println("\t11. Numero mayo o menor de la lista");
		        System.out.println("\t12. Cadena de asteriscos");
		        System.out.println("\t13. Encontrar la letra del abecedario");
		        System.out.println("\t14. Cuadrado de asteriscos");
		        System.out.println("\t15. Total de numeros primos en un rango");
		
}

public static void rombo(){
	int i=0,j=0,k=0;{
		for(i=0;i<=9;i++){
			if(i%2==1){
				for(k=10;k>=i;k--){
					if(k%2==1){
						System.out.print(" ");
					}
				}
				for(j=0;j<i;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
//parte de abajo
for(i=9;i>1;i--){
	if((i%2)==1){
		for(k=i;k<=11;k++){
			if((k%2)==1){
				System.out.print(" ");
			}
		}
		for(j=i-2;j>0;j--){
			System.out.print("*");
		}
		System.out.println();
	}
}
}}

public static void promedio(){
	int a,b,c,d,e,f,p;{
	System.out.println("Ingrese las 6 notas a promediar");
	Scanner s= new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	d=s.nextInt();
	e=s.nextInt();
	f=s.nextInt();
	p=(a+b+c+d+e+f)/6;
	if(p>0 && p<59)
		System.out.println("El promedio es E");
	else if(p>89 && p<101)
		System.out.println("El promedio es A");
	else if(p>59 && p<70)
		System.out.println("El promedio es D");
	else if(p>69 && p<80)
		System.out.println("El promedio es c");
	else if(p>79 && p<90)
		System.out.println("El promedio es B");
}

}

public static void hora(){
		String hora;
		System.out.println("Ingrese hora");
		Scanner s=new Scanner(System.in);
		hora=s.nextLine();
		String []separador= hora.split(":");
		int entero = Integer.parseInt(separador[0]);
		if (entero>12 && entero<25){
			System.out.println("Son las "+(entero-12)+":"+separador[1]+" P.M.");
		}
		else if(entero<12 && entero>=0)
				System.out.println("Son las "+(entero)+":"+separador[1]+" A.M.");
}
	
		


public static void figuras(){
	int a;
	char letra; 
	System.out.println("Ingrese el tamano del lado del trianulo o cuadrado o del radio del circulo");
	Scanner s=new Scanner(System.in);
		a=s.nextInt();
	System.out.println("Ingrese C para un circulo, U para un cuadrado ó T para un triangulo");
	letra=s.next().charAt(0);
			if (letra=='c')
				System.out.println("El radio es:"+(a)+" el area es:"+(a*a*Math.PI)+" El perimetro es:"+(2*Math.PI*a));
			
			else if(letra=='t')
				System.out.println("El tamano del lado es:"+(a)+" el area es:"+((a/2)*(0.866*a/2))+" El perimetro es:"+(3*a));
			
			else if (letra=='u')
				System.out.println("El tamano del lado es:"+(a)+" el area es:"+(a*a)+" El perimetro es:"+(4*a));
					
			
}
public static void mes(){
	String fecha;
	String fecha2;
	System.out.println("Ingrese la primera fecha de la forma dd/mm/aaaa");
	Scanner s=new Scanner(System.in);
	fecha=s.nextLine();
	String []separador= fecha.split("/");
	int dia1 = Integer.parseInt(separador[0]);
	int mes1 = Integer.parseInt(separador[1]);
	int ano1 = Integer.parseInt(separador[2]);
	System.out.println("Ingrese la segunda fecha de la forma dd/mm/aaaa");
	fecha2=s.nextLine();
	String []separador2= fecha2.split("/");
	int dia2 = Integer.parseInt(separador2[0]);
	int mes2 = Integer.parseInt(separador2[1]);
	int ano2 = Integer.parseInt(separador2[2]);
	System.out.println("La diferencia de dias es de "+((dia2-dia1)+((mes2-mes1)*30)+((ano2-ano1)*360))+" dias");
	
	

}
public static void calculadora(){
	int a,b;
	char letra; 
	System.out.println("ingrese 2 numeros");
	Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
	System.out.println("Ingrese s para sumar, r para restar,m para multiplicar o d para dividir");
	letra=s.next().charAt(0);
	if (letra=='s')
		System.out.println("La suma es:"+(a+b));
	
	else if(letra=='r')
		System.out.println("La resta es:"+(a-b));
	
	else if (letra=='m')
		System.out.println("La multiplicacion es:"+(a*b));
	else if (letra=='d')
		System.out.println("La divicion es:"+(a/b));
}

public static void tabla(){
	int a,numero,resultado;
	System.out.println("Ingrese un numero para mostrar su tabla de multiplicar");
	Scanner s=new Scanner (System.in);
	numero=s.nextInt();
		for(a=10;a>0;a--){
			resultado=a*numero;
			System.out.println(numero+"x"+a+"="+resultado);
		}
		System.out.println();
	}

public static void rango(){
	int a,b;
	System.out.println("Ingrese limite inferior");
	Scanner s=new Scanner (System.in);
		a=s.nextInt();
	System.out.println("Ingrese limite superior");
		b=s.nextInt();
		int x = (int) (Math.random() *(b-a+1)+a); 
		if(x<30){
		switch(x){
			case 1: System.out.print("uno"); break;
			case 2: System.out.print("dos");break;
			case 3: System.out.print("tres");break;
			case 4: System.out.print("cuatro");break;
			case 5: System.out.print("cinco");break;
			case 6: System.out.print("seis");break;
			case 7: System.out.print("siete");break;
			case 8: System.out.print("ocho");break;
			case 9: System.out.print("nueve");break;
			case 10: System.out.print("diez");break;
			case 11: System.out.print("once");break;
			case 12: System.out.print("doce");break;
			case 13: System.out.print("trece");break;
			case 14: System.out.print("catorce");break;
			case 15: System.out.print("quince");break;
			case 16: System.out.print("dieciseis");break;
			case 17: System.out.print("diesisiete");break;
			case 18: System.out.print("diesiocho");break;
			case 19: System.out.print("diesinueve");break;
			case 20: System.out.print("veinte");break;
			case 21: System.out.print("veintiuno");break;
			case 22: System.out.print("veintidos");break;
			case 23: System.out.print("veintitres");break;
			case 24: System.out.print("veinticuatro");break;
			case 25: System.out.print("veinticinco");break;
			case 26: System.out.print("veintiseis");break;
			case 27: System.out.print("veintisiete");break;
			case 28: System.out.print("veintiocho");break;
			case 29: System.out.print("veintinueve");break;
			
		}
		}
		else{
		
		switch((x/100)%10){
			case 1: System.out.print("cien"); break;
		}
		switch((x/10)%10){
					
			case 3: System.out.print("treinta");break;
			case 4: System.out.print("cuarenta");break;
			case 5: System.out.print("cincuenta");break;
			case 6: System.out.print("sesenta");break;
			case 7: System.out.print("setenta");break;
			case 8: System.out.print("ochenta");break;
			case 9: System.out.print("noventa");break;
		}
		switch(x%10){
			case 1: System.out.print(" y uno"); break;
			case 2: System.out.print(" y dos");break;
			case 3: System.out.print(" y tres");break;
			case 4: System.out.print(" y cuatro");break;
			case 5: System.out.print(" y cinco");break;
			case 6: System.out.print(" y seis");break;
			case 7: System.out.print(" y siete");break;
			case 8: System.out.print(" y ocho");break;
			case 9: System.out.print(" y nueve");break;
			
		}
		
		}
		System.out.println(" = "+x);
}


public static void conversion(){
	int n;
	System.out.println("Ingrese el numero que desea convertir");
	Scanner s=new Scanner (System.in);
	n=s.nextInt();
	switch((n/1000)%10){
		case 1: System.out.print("M"); break;
		case 2: System.out.print("MM");break;
		case 3: System.out.print("MMM");break;
		case 4: System.out.print("__\nIV");break;
		case 5: System.out.print("_\nV");break;
		case 6: System.out.print("__\nVI");break;
		case 7: System.out.print("___\nVII");break;
		case 8: System.out.print("____\nVIII");break;
		case 9: System.out.print("__\nIX");break;
	}
	switch((n/100)%10){
		case 1: System.out.print("C");break;
		case 2: System.out.print("CC");break;
		case 3: System.out.print("CCC");break;
		case 4: System.out.print("CD");break;
		case 5: System.out.print("D");break;
		case 6: System.out.print("DC");break;
		case 7: System.out.print("DCC");break;
		case 8: System.out.print("DCCC");break;
		case 9: System.out.print("CM");break;
	}
	switch((n/10)%10){
		case 1: System.out.print("x");break;
		case 2: System.out.print("XX");break;
		case 3: System.out.print("XXX");break;
		case 4: System.out.print("XL");break;
		case 5: System.out.print("L");break;
		case 6: System.out.print("LX");break;
		case 7: System.out.print("LXX");break;
		case 8: System.out.print("LXXX");break;
		case 9: System.out.print("XC");break;
	}
	switch(n%10){
		case 1: System.out.print("I");break;
		case 2: System.out.print("II");break;
		case 3: System.out.print("III");break;
		case 4: System.out.print("IV");break;
		case 5: System.out.print("V");break;
		case 6: System.out.print("VI");break;
		case 7: System.out.print("VII");break;
		case 8: System.out.print("VIII");break;
		case 9: System.out.print("IX");break;
	}
	System.out.println(" = "+n);
}

public static void piramide(){
	 int n = 0,a=1,b=0;
     Scanner s=new Scanner(System.in);
     System.out.println("Ingrese un numero");
     n=s.nextInt();
	     for (int i=n;i>0;i--){
	    	 for(int j=n-i;j>0;j--)
	    		 System.out.print(" ");
	    	 for( int k=i-1;k>0;k--)			
	    		 System.out.print(a+" ");
    	 System.out.println(a++);
      }
 }
public static void lista(){
	
    int[] lista; 
    int longitud, cambio;

    String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
    String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        Scanner s = new Scanner(System.in);
 
    System.out.print(" Ingrese el tamano de la lista ");
    longitud = s.nextInt();
    lista = new int[longitud];
    System.out.println("Ingrese   - " + longitud + " -  Numeros : ");
    for(int i=0; i<longitud ; i++){
        lista[i] = s.nextInt();
    }
     for(int i=0; i<longitud-1 ; i++ )
        for(int j=i+1 ; j < longitud ; j++)
            if(lista[j]<lista[i]){
            
                cambio = lista[j];
                lista[j] = lista[i];
                 lista[i] = cambio;
            }

   
    for(int i=0; i<longitud ; i++);
    	
 
    System.out.println("El numero mayor es "+lista[longitud-1]);
    System.out.println("El numero menor es "+lista[0]);
}
public static void cadena(){

	        String palabra;
	        Scanner s=new Scanner(System.in);
	        System.out.println("Ingrese una palabra");
	        palabra=s.nextLine();
	       
	        	String[] asteriscos = palabra.split("");
	        	for(int i = 0; i < asteriscos.length; i++) 
	        		System.out.print("*");
}
	  
public static void cuadrado(){
	int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Ingrese un numero");
    n=s.nextInt();
    for(int i=1;i<=n;i++){
    	for(int j=1;j<=n;j++){
    		if(j==1||j==n||i==1||i==n){
    			System.out.print("* ");
    		}
    			else{
    				System.out.print("  ");
    			}
        }
    	System.out.println();
    }
}

public static void juego(){
	String abc="abcdefghijklmnopqrstuvwxyz";
	char m;
	char k;
	Scanner s=new Scanner(System.in);
	System.out.println("Ingrese la letra a buscar");
	m=s.next().charAt(0);
	for(int i=0; i < abc.length(); i++ ){
		if( abc.charAt(i)== m){
			//System.out.println("La posicion de la palabra es " + i);
			int z=i;
		
	System.out.println("Ingrese la letra que creas que es");
	k=s.next().charAt(0);
	for(int j=0; j < abc.length(); j++ ){
		if( abc.charAt(j)== k){
			//System.out.println("La posicion de la palabra es " + j);
			int y=j;
			do {
			if(y<z)
				System.out.println ("despues" );
			k=s.next().charAt(0);
			for( j=0; j < abc.length(); j++ ){
				if( abc.charAt(j)== k){
					//System.out.println("La posicion de la palabra es " + j);
					 y=j;}}
        	if(y>z)
        		System.out.println ("antes" );
          	k=s.next().charAt(0);
        	for( j=0; j < abc.length(); j++ ){
        		if( abc.charAt(j)== k){
        			//System.out.println("La posicion de la palabra es " + j);
        			 y=j;}}}
								
			while(y!=z);
			
				   
		}   
	}
		}
	
	}
	
}

public static void primo(){
	int n,x=0;
	Scanner s=new Scanner(System.in);
	System.out.println("ingrese un numero");
	n=s.nextInt();
	int v[]=new int[n];
	for (int i=2;i<n;i++){
		v[i]=i;
	}
		for(int i=2; i<n;i++){
			if (v[i]!=0);{
				for (int j=i*2;j<n;j=j+i){
					v[j]=0;
				}
			}
		}
		for(int i=2;i<n;i++){
			if (v[i]!=0)
			x++;
				
		}
	
		System.out.println("el total de numeros primos desde 1 hasta "+n+" es "+(x));
}



public static void main(String[] args) {
	menu();
	int num=0;
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
		switch(num){
		case 1: rombo();break;
		case 2: promedio();break;
		case 3: hora();break;
		case 4: figuras();break;
		case 5: mes();break;
		case 6: calculadora();break;
		case 7: tabla();break;
		case 8: rango();break;
		case 9: conversion();break;
		case 10: piramide();break;
		case 11: lista(); break;
		case 12: cadena();break;
		case 13: juego();break;
		case 14: cuadrado();break;
		case 15: primo(); break;
		}
}}