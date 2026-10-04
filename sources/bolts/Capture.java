package bolts;

/* JADX INFO: loaded from: classes2.dex */
public class Capture<T> {
    private T value;

    public Capture() {
    }

    public T get() {
        return this.value;
    }

    public void set(T t10) {
        this.value = t10;
    }

    public Capture(T t10) {
        this.value = t10;
    }
}
