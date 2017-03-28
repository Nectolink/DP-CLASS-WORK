
public class User {

	IDAL dal;

	public User(IDAL dalType) {
		dal = dalType;
	}
	// public User(int IdalType)
	// {
	// if (IdalType == 1)
	// {
	// dal = new MySqlDAL();
	// }
	// else { dal = new SqlServerDAL(); }
	// }

	public void Add() {

		dal.Add(this);

	}

}
