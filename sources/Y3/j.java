package y3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class j<T, Y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<T, a<Y>> f241070a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f241071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f241072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f241073d;

    public static final class a<Y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Y f241074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f241075b;

        public a(Y y10, int i10) {
            this.f241074a = y10;
            this.f241075b = i10;
        }
    }

    public j(long j10) {
        this.f241071b = j10;
        this.f241072c = j10;
    }

    public void b() {
        q(0L);
    }

    public synchronized void c(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.f241072c = Math.round(this.f241071b * f10);
        j();
    }

    public synchronized long d() {
        return this.f241073d;
    }

    public synchronized long e() {
        return this.f241072c;
    }

    public synchronized boolean i(@NonNull T t10) {
        return this.f241070a.containsKey(t10);
    }

    public final void j() {
        q(this.f241072c);
    }

    @Nullable
    public synchronized Y k(@NonNull T t10) {
        a<Y> aVar;
        aVar = this.f241070a.get(t10);
        return aVar != null ? aVar.f241074a : null;
    }

    public synchronized int l() {
        return this.f241070a.size();
    }

    public int m(@Nullable Y y10) {
        return 1;
    }

    @Nullable
    public synchronized Y o(@NonNull T t10, @Nullable Y y10) {
        int iM = m(y10);
        long j10 = iM;
        if (j10 >= this.f241072c) {
            n(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f241073d += j10;
        }
        a<Y> aVarPut = this.f241070a.put(t10, y10 == null ? null : new a<>(y10, iM));
        if (aVarPut != null) {
            this.f241073d -= (long) aVarPut.f241075b;
            if (!aVarPut.f241074a.equals(y10)) {
                n(t10, aVarPut.f241074a);
            }
        }
        j();
        return aVarPut != null ? aVarPut.f241074a : null;
    }

    @Nullable
    public synchronized Y p(@NonNull T t10) {
        a<Y> aVarRemove = this.f241070a.remove(t10);
        if (aVarRemove == null) {
            return null;
        }
        this.f241073d -= (long) aVarRemove.f241075b;
        return aVarRemove.f241074a;
    }

    public synchronized void q(long j10) {
        while (this.f241073d > j10) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f241070a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f241073d -= (long) value.f241075b;
            T key = next.getKey();
            it.remove();
            n(key, value.f241074a);
        }
    }

    public void n(@NonNull T t10, @Nullable Y y10) {
    }
}
