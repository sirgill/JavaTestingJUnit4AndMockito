package com.gill.useradmin.dao;

import com.gill.useradmin.dto.User;
import com.gill.useradmin.util.IDGenerator;

public class UserDAO {

	public int create(final User user) {
		final int id = IDGenerator.generateID();
		// Save the user object to the db
		return id;

	}

}
