package daoImplements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.fighterDao;
import beans.fighter;
import beans.player;
import connection.ConnFactory;

public class implementFighterDao implements fighterDao{
	public static ConnFactory cf = ConnFactory.getInstance();

	public fighter getFighter(int id) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "select * from \"fighters\" where \"fighterId\"= ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		fighter u = null;
		while(rs.next()) {
			u = new fighter(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
		}

		return u;
	}

	public List<fighter> getAllFighters() throws SQLException {
		List<fighter> fighterList = new ArrayList<fighter>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from \"fighters\"");
		fighter u = null;
		while(rs.next()) {
			u = new fighter(rs.getInt(1), rs.getNString(2), rs.getInt(3), rs.getInt(4));
			fighterList.add(u);
		}

		return fighterList;
	}

}
