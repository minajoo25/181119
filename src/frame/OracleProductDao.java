package frame;

public class OracleProductDao implements Dao {

	@Override
	public void insert() {
		System.out.println("Oracle Product Dao Inserted ...");
	}

	@Override
	public void delete() {
		System.out.println("Oracle Product Dao Deleted ...");
	}

	@Override
	public void update() {
		System.out.println("Oracle Product Dao Updated ...");
	}	

}
