package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderDAO orderDAO;
	private Utils utils;
	
	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}
	

	@Override
	public Order create() {
		LOGGER.info("Please enter the price of the item");
		Long price = utils.getLong();
		LOGGER.info("Please enter the amount ordered");
		Long amount = utils.getLong();
		Order order = orderDAO.create(new Order(price, amount));
		LOGGER.info("Order created");
		LOGGER.info("Your total order cost is £" + (order.getPrice() * order.getAmount()));
		return order;
	}

	@Override
	public Order update() {
		LOGGER.info("Please enter the id of the order you'd like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter the price of the item");
		Long price = utils.getLong();
		LOGGER.info("Please enter the amount ordered");
		Long amount = utils.getLong();
		Order order = orderDAO.update(new Order(id, price, amount));
		return order;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to remove");
		Long id = utils.getLong();
		return orderDAO.delete(id);
	}
	
	

}
