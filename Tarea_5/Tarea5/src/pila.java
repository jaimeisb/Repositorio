import java.util.LinkedList;
import java.util.Queue;


public class pila {

	public static void main(String[] args) {
		
		Queue <Integer> cola= new LinkedList<Integer>();
		
		cola.add(5);
		cola.add(10);
		cola.add(20);
		
		Queue <Integer> cola2=new LinkedList<Integer>();
		int x;
		
		for( x=1;x<=cola.size();x++){
			while(cola.size()!=x)
				cola.remove();
				cola2.add(cola.remove());
				
		}
		
		
		while(cola2.isEmpty()==false){
			System.out.println(cola2.remove()); // No se porque se sale de for =(
		}
		
	
		
	}

}
