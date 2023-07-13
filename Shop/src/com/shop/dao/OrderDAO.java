package com.shop.dao;

import java.util.List;

import com.shop.db.DBHelper;
import com.shop.vo.OrderVO;

public class OrderDAO extends DBHelper {
	
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	
	private OrderDAO() {}
	
	public int insertOrder(OrderVO vo) {
		return 0;
	}
	
	public OrderVO selectOrder(String custId) {
		return null;
	}
	
	public List<OrderVO> selectOrders() {
		return null;
	}
	
	public int updateOrder(OrderVO vo) {
		return 0;
	}
	
	public int deleteOrder(String custId) {
		return 0;
	}
}
