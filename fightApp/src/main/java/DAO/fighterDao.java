package DAO;


import java.sql.SQLException;
import java.util.List;

import beans.fighter;

public interface fighterDao {
	public fighter getFighter(int id) throws SQLException;
	public List<fighter> getAllFighters() throws SQLException;
}
