package u3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C1520a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import y3.l;

/* JADX INFO: renamed from: u3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5642d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<l> f239361a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1520a<l, List<Class<?>>> f239362b = new C1520a<>();

    public void a() {
        synchronized (this.f239362b) {
            this.f239362b.clear();
        }
    }

    @Nullable
    public List<Class<?>> b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        l andSet = this.f239361a.getAndSet(null);
        if (andSet == null) {
            andSet = new l(cls, cls2, cls3);
        } else {
            andSet.b(cls, cls2, cls3);
        }
        synchronized (this.f239362b) {
            list = this.f239362b.get(andSet);
        }
        this.f239361a.set(andSet);
        return list;
    }

    public void c(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f239362b) {
            this.f239362b.put(new l(cls, cls2, cls3), list);
        }
    }
}
