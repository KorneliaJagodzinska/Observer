package notification;

import order.Order;

public class TextMessage {
    public void update(Order order) {
        System.out.println("SMS - zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
