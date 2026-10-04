package u3;

import androidx.annotation.Nullable;
import androidx.collection.C1520a;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.engine.q;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import y3.l;

/* JADX INFO: renamed from: u3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5641c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q<?, ?, ?> f239358c = new q<>(Object.class, Object.class, Object.class, Collections.singletonList(new g(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new r3.g(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1520a<l, q<?, ?, ?>> f239359a = new C1520a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<l> f239360b = new AtomicReference<>();

    @Nullable
    public <Data, TResource, Transcode> q<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        q<Data, TResource, Transcode> qVar;
        l lVarB = b(cls, cls2, cls3);
        synchronized (this.f239359a) {
            qVar = (q) this.f239359a.get(lVarB);
        }
        this.f239360b.set(lVarB);
        return qVar;
    }

    public final l b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        l andSet = this.f239360b.getAndSet(null);
        if (andSet == null) {
            andSet = new l();
        }
        andSet.b(cls, cls2, cls3);
        return andSet;
    }

    public boolean c(@Nullable q<?, ?, ?> qVar) {
        return f239358c.equals(qVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable q<?, ?, ?> qVar) {
        synchronized (this.f239359a) {
            C1520a<l, q<?, ?, ?>> c1520a = this.f239359a;
            l lVar = new l(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f239358c;
            }
            c1520a.put(lVar, qVar);
        }
    }
}
