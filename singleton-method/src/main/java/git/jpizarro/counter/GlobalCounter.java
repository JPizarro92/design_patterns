package git.jpizarro.counter;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped
public class GlobalCounter {
    private final AtomicInteger count = new AtomicInteger(0);

    public int increment(){
        return count.incrementAndGet();
    }

    public int getCount(){
        return count.get();
    }

}
