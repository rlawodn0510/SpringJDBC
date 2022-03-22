package yuki.spring.guestbook.dao;

import java.util.List;

import yuki.spring.guestbook.vo.GuestMessage;

public interface GuestMessageDao {
	public int count();

	public List<GuestMessage> select(int begin, int end);

	public int insert(GuestMessage message);

	public int delete(int id);

	public int update(GuestMessage message);
}
