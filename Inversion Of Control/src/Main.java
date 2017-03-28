
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//User usr = new User(1);
        User usr = new User(new MySqlDAL());
        usr.Add();

	}
	
	
}
