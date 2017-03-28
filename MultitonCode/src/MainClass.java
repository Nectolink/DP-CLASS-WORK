import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	      
	public static class Multiton {


		private Multiton(){

		}

		private static Multiton threadSafeSingleton[] = new Multiton[3];
		static int i = -1;

		public static Multiton getInstance(){
		    i++;
		    System.out.println("i is   ---> "+i);
		    if(i<3 && threadSafeSingleton[i]==null){
		        synchronized (Multiton.class) {
		            if(threadSafeSingleton[i]==null){
		                threadSafeSingleton[i] = new Multiton();
		                return threadSafeSingleton[i];
		            }
		        }

		    }

		     int j = randInt(0, 4);

		    return threadSafeSingleton[j];

		}

		private static int randInt(int min, int max) {

		    // Usually this can be a field rather than a method variable
		    Random rand = new Random();

		    // nextInt is normally exclusive of the top value,
		    // so add 1 to make it inclusive
		    int randomNum = rand.nextInt((max - min) + 1) + min;

		    return randomNum;
		}


		}			
			
			
		

}
		

