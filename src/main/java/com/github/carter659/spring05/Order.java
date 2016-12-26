package com.github.carter659.spring05;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * 博客出处：http://www.cnblogs.com/GoodHelper/
 * 
 * @author 刘冬
 *
 */
@Entity
@Table(name = "t_order")
public class Order {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "order_id", length = 36)
	public String id;

	@Column(name = "order_no", length = 50)
	public String no;

	@Temporal(TemporalType.DATE)
	@Column(name = "order_date")
	public Date date;

	@Column(name = "quantity")
	public int quantity;

	/**
	 * 省略 get set
	 */
}
