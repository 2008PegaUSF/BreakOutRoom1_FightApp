package DAO;

import java.sql.SQLException;
import java.util.List;

import beans.player;

public interface playerDao {
	public player getPlayer(int id) throws SQLException;
	public List<player> getAllPlayers() throws SQLException;
	
	public void increaseRecords(int winner, int loser) throws SQLException;
}
