import java.util.Stack;


public class colas {

	public static void main(String[] args) {
		Stack pila=new Stack();
		pila.push(5);
		pila.push(10);
		pila.push(20);
		pila.push(40);
		
		Stack pila2=new Stack();
		while (pila.empty()==false){
			pila2.push(pila.pop());
		
		
		}
		while (pila2.empty()==false){
			System.out.println(pila2.pop());
		}
	}	
}
