package com.gill.junit.spring.service;

import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gill.junit.spring.dao.TicketDAO;
import com.gill.junit.spring.dto.Ticket;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
public class TicketServiceImplTest {

	private static final String PHONE = "1234567890";
	private static final String PASSENGER_NAME = "Gill";
	private static final int RESULT = 1;

	@Mock
	TicketDAO dao;

	@Autowired
	@InjectMocks
	private TicketServiceImpl service;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void buyTicketsShouldReturnsAValidValue() {
		when(dao.createTicket(any(Ticket.class))).thenReturn(1);
		final int result = service.buyTicket(PASSENGER_NAME, PHONE);
		assertEquals(result, RESULT);
	}
}
