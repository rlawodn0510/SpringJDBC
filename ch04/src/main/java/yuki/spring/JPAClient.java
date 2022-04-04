package yuki.spring;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import yuki.spring.domain.Board;

public class JPAClient {
	public static void main(String[] args) {
		// EntityManager 생성
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ch04");
		EntityManager manager = factory.createEntityManager();
		//트랜잭션 생성
		EntityTransaction tx = manager.getTransaction();
		try {
			tx.begin();
//			Board board = new Board();
//			board.setTitle("JPA 테스트");
//			board.setWriter("손오공");
//			board.setContent("글 등록 테스트");
//			board.setRegDate(new Date());
//			board.setCnt(0L);
//			// 글 등록
//			manager.persist(board);
		
			// 글 상세 조회
			Board serachBoard = manager.find(Board.class, 2L);
			System.out.println("---> " + serachBoard.toString());
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			manager.close();
			factory.close();
		}
	}
}
