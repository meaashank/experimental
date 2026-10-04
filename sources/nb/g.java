package Nb;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, T> f64938a = new ConcurrentHashMap();

    public T a(String str) {
        return this.f64938a.get(str);
    }

    public void b(String str, T t10) {
        this.f64938a.put(str, t10);
    }
}
