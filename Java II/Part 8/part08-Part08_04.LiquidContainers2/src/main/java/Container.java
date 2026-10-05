public class Container {
    private int currentAmount;
    private int capacity;

    public Container() {
        this.currentAmount = 0;
        this.capacity = 100;
    }

    public int contains() {
        return this.currentAmount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        } else if (currentAmount + amount >= capacity) {
            this.currentAmount = capacity;
        } else {
            this.currentAmount += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        } else if (currentAmount - amount <= 0) {
            this.currentAmount = 0;
        } else {
            this.currentAmount -= amount;
        }
    }

    public String toString() {
        return this.currentAmount + "/" + this.capacity;
    }
}
