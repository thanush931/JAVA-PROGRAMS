package prg3;

public class ShoppingCart {
    private int items = 0;

    public synchronized void addItem(int quantity) {
        items += quantity;
        System.out.println(Thread.currentThread().getName() +
                " added " + quantity + " items. Total items: " + items);
    }

    public synchronized void removeItem(int quantity) {
        if (items >= quantity) {
            items -= quantity;
            System.out.println(Thread.currentThread().getName() +
                    " removed " + quantity + " items. Total items: " + items);
        } else {
            System.out.println("Not enough items to remove.");
        }
    }

    public int getItems() {
        return items;
    }
}
