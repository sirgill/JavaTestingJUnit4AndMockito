package com.gill.junit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gill.junit.spring.dao.TicketDAO;
import com.gill.junit.spring.dto.Ticket;

@Component
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDAO dao;

	public TicketDAO getDao() {
		return dao;
	}

	public void setDao(final TicketDAO dao) {
		this.dao = dao;
	}

	@Override
	public int buyTicket(final String passengerName, final String phone) {
		final Ticket ticket = new Ticket();
		ticket.setPassengerName(passengerName);
		ticket.setPhone(phone);
		return dao.createTicket(ticket);
	}

}
