package com.gill.order.bo;

import java.sql.SQLException;

import com.gill.order.bo.exception.BOException;
import com.gill.order.dao.OrderDAO;
import com.gill.order.dto.Order;

public class OrderBOImpl implements OrderBO {

	private OrderDAO dao;

	@Override
	public boolean placeOrder(final Order order) throws BOException {
		try {
			final int result = dao.create(order);

			if (result == 0) {
				return false;
			}

		} catch (final SQLException e) {
			throw new BOException(e);
		}
		return true;
	}

	@Override
	public boolean cancelOrder(final int id) throws BOException {

		try {
			final Order order = dao.read(id);
			order.setStatus("Cancelled");
			final int result = dao.update(order);
			if (result == 0) {
				return false;
			}
		} catch (final SQLException e) {
			throw new BOException(e);
		}

		return true;
	}

	@Override
	public boolean deleteOrder(final int id) throws BOException {
		try {
			final int result = dao.delete(id);
			if (result == 0) {
				return false;
			}
		} catch (final SQLException e) {
			throw new BOException(e);
		}

		return true;
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(final OrderDAO dao) {
		this.dao = dao;
	}

}
