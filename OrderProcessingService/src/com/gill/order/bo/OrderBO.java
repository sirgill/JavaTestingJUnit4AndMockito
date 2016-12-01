package com.gill.order.bo;

import com.gill.order.bo.exception.BOException;
import com.gill.order.dto.Order;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException;

	boolean cancelOrder(int id) throws BOException;

	boolean deleteOrder(int id) throws BOException;

}
