package frame;

public class CustBiz implements Biz {
	
	Dao dao;
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		dao.insert();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		dao.delete();
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		dao.update();
	}

}
