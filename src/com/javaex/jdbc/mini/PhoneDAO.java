package com.javaex.jdbc.mini;

import java.util.List;

public interface PhoneDAO {
	
	public List<PhoneDTO> getList();
	public boolean insert(PhoneDTO phoneDTO);
	public boolean delete(PhoneDTO phoneDTO);
	public boolean update(PhoneDTO phoneDTO);
	public PhoneDTO get(String name);
}
