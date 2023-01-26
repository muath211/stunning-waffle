import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafeStock {
    private double price;
    private final ReentrantReadWriteLock lock;

    public ThreadSafeStock(String name, double price) {
        this.price = price;
        this.lock = new ReentrantReadWriteLock();
    }

    public double getPrice() {
        lock.readLock().lock();
        try {
            return price;
        } finally {
            lock.readLock().unlock();
        }
    }

    public void setPrice(double price) {
        lock.writeLock().lock();
        try {
            this.price = price;
        } finally {
            lock.writeLock().unlock();
        }
    }
}
