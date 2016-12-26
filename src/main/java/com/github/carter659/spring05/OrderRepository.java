package com.github.carter659.spring05;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 博客出处：http://www.cnblogs.com/GoodHelper/
 * 
 * @author 刘冬
 *
 */
public interface OrderRepository extends JpaRepository<Order, String> {

	/**
	 * like查询
	 * 
	 * @param no
	 * @return
	 */
	List<Order> findAllByNoLike(String no);

	/**
	 * between查询
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	List<Order> findAllByDateBetween(Date startDate, Date endDate);

	/**
	 * 小于查询
	 * 
	 * @param quantity
	 * @return
	 */
	List<Order> findAllByQuantityLessThan(int quantity);
}
