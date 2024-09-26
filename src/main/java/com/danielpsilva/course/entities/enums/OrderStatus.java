package com.danielpsilva.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int statusCode;

	private OrderStatus(int statusCode) {
		this.statusCode = statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public static OrderStatus valueOf(int statusCode) {
		for (OrderStatus value : OrderStatus.values()) {
			if (statusCode == value.getStatusCode()) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid status code");
	}
}
