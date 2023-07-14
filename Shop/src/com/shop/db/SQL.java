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
	public static final String SELECT_ORDERS = "SELECT "
											+ "a.*,"
											+ "b.`name`,"
											+ "c.`prodName` "
											+ "FROM `Order` AS a "
											+ "JOIN `Customer` AS b ON a.orderId = b.custId "
											+ "JOIN `Product` AS c ON a.orderProduct = c.prodNo "
											+ "WHERE `orderId`=?";
											
	public static final String INSERT_ORDER = "INSERT INTO `Order` SET "
											+ "`orderId` =?," 
											+ "`orderProduct` =?," 
											+ "`orderCount` =?," 
											+ "`orderDate` =NOW()";
	
	
	// product
	public static final String SELECT_PRODUCTS = "SELECT * FROM `Product` WHERE `stock` >0";
	public static final String SELECT_PRODUCT = "SELECT * FROM `Product` WHERE `prodNo =?`";
	public static final String UPDATE_PRODUCT_STOCK_COUNT = "UPDATE `Product` SET `stock` = `stock`-? WHERE `prodNo` =?";
}
