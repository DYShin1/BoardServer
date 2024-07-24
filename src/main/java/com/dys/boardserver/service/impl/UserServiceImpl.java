package com.dys.boardserver.service.impl;

import org.springframework.stereotype.Service;

import com.dys.boardserver.dto.UserDTO;
import com.dys.boardserver.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void register(UserDTO userProfile) {

	}

	@Override
	public UserDTO login(String id, String password) {
		return null;
	}

	@Override
	public boolean isDuplicatedId(String id) {
		return false;
	}

	@Override
	public UserDTO getUserInfo(String userId) {
		return null;
	}

	@Override
	public void updatePassword(String id, String beforePassword, String afterPassword) {

	}

	@Override
	public void deleteId(String id, String password) {

	}
}
