package com.neo.mapper;

import java.awt.*;
import java.util.List;

import com.neo.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;

public interface UserMapper {
	
	List<User> getAll();
	
	User getOne(Long id);

	void insert(User user);
	void insertBatch(@Param("list") List<User> user);
	void update(User user);

	void delete(Long id);

	Cursor<User> getCusor();

}