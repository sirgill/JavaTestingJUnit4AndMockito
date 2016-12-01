package com.gill.junit.spring.dao;

import org.springframework.stereotype.Component;

import com.gill.junit.spring.dto.Ticket;

@Component
public class TicketDAOImpl implements TicketDAO {

	@Override
	public int createTicket(final Ticket ticket) {
		return 1;
	}

}
