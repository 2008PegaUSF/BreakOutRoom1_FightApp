package daoImplements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.playerDao;
import beans.player;
import connection.ConnFactory;

public class implementPlayerDao implements playerDao{
	public static ConnFactory cf = ConnFactory.getInstance();

	public player getPlayer(int id) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "select * from \"players\" where \"playerId\"= ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		player u = null;
		while(rs.next()) {
			u = new player(rs.getInt(1), rs.getInt(2), rs.getInt(3));
		}

		return u;
		
	}

	public List<player> getAllPlayers() throws SQLException {
		List<player> playerList = new ArrayList<player>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from \"players\"");
		player u = null;
		while(rs.next()) {
			u = new player(rs.getInt(1), rs.getInt(2), rs.getInt(3));
			playerList.add(u);
		}

		return playerList;
	}

	public void increaseRecords(int winner, int loser) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "update players set wins = wins + 1 where playerid = ?";
		String sql2 = "update players set losses = losses + 1 where playerid = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		PreparedStatement ps2 = conn.prepareStatement(sql2);
		ps.setInt(1, winner);
		ps2.setInt(1, loser);
		ps.executeUpdate();
		ps2.executeUpdate();
		
	}

}
