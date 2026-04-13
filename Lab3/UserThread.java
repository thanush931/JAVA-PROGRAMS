package prg3;

public class UserThread extends Thread {
    ShoppingCart cart;
    int quantity;
    String operation;

    public UserThread(ShoppingCart cart, int quantity, String operation) {
        this.cart = cart;
        this.quantity = quantity;
        this.operation = operation;
    }

    public void run() {
        if (operation.equals("add")) {
            cart.addItem(quantity);
        } else if (operation.equals("remove")) {
            cart.removeItem(quantity);
        }
    }
}
