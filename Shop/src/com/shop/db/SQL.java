package com.shop.db;

public class SQL {
	
	// customer
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId` =?";
	public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` SET "
												+ "`custId` =?,"
												+ "`name` =?,"
												+ "`hp`=?,"
												+ "`addr`=?,"
												+ "`rdate`=NOW()";
	
	
	
	// order
	
	// product
}
