package sub5;

public class SQL {
	
	public final static String INSERT_USER 	= "INSERT INTO `User3` VALUES (?, ?, ?, ?)";
	public final static String SELECT_USERS = "SELECT * FROM `User3`";
	public final static String SELECT_USER	= "SELECT * FROM `User3` WHERE `uid` = ?";
	public final static String UPDATE_USER	= "UPDATE `User3` SET "
										   	+ "`name` = ?,"
											+ "`hp` = ?,"
											+ "`age` = ? "
											+ "WHERE `uid` =?";
	public final static String DELETD_USER 	= "DELETE FROM `User3` WHERE `uid` =?";
}
