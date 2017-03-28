
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("DIP");
	}

//High-level modules should not depend on low-level modules. Both should depend on abstractions.
//Abstractions should not depend on details. Details should depend on abstractions.
// Dependency Inversion Principle - Good example
	interface IWorker {
		public void work();
	}

	class Worker implements IWorker{
		public void work() {
			// ....working
		}
	}

	class SuperWorker  implements IWorker{
		public void work() {
			//.... working much more
		}
	}

	class Manager {
		IWorker worker;

		public void setWorker(IWorker w) {
			worker = w;
		}

		public void manage() {
			worker.work();
		}
	}


}
