package y3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class<?> f241079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f241080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class<?> f241081c;

    public l() {
    }

    public void a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        b(cls, cls2, null);
    }

    public void b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f241079a = cls;
        this.f241080b = cls2;
        this.f241081c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f241079a.equals(lVar.f241079a) && this.f241080b.equals(lVar.f241080b) && o.e(this.f241081c, lVar.f241081c);
    }

    public int hashCode() {
        int iHashCode = (this.f241080b.hashCode() + (this.f241079a.hashCode() * 31)) * 31;
        Class<?> cls = this.f241081c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f241079a + ", second=" + this.f241080b + '}';
    }

    public l(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        a(cls, cls2);
    }

    public l(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        b(cls, cls2, cls3);
    }
}
