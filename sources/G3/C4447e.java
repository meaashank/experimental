package g3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C1520a;
import java.security.MessageDigest;
import y3.C5813b;

/* JADX INFO: renamed from: g3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4447e implements InterfaceC4444b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1520a<C4446d<?>, Object> f202239c = new C5813b();

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void g(@NonNull C4446d<T> c4446d, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        c4446d.h(obj, messageDigest);
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f202239c.size(); i10++) {
            this.f202239c.i(i10).h(this.f202239c.o(i10), messageDigest);
        }
    }

    @Nullable
    public <T> T c(@NonNull C4446d<T> c4446d) {
        return this.f202239c.containsKey(c4446d) ? (T) this.f202239c.get(c4446d) : c4446d.f202235a;
    }

    public void d(@NonNull C4447e c4447e) {
        this.f202239c.j(c4447e.f202239c);
    }

    public C4447e e(@NonNull C4446d<?> c4446d) {
        this.f202239c.remove(c4446d);
        return this;
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        if (obj instanceof C4447e) {
            return this.f202239c.equals(((C4447e) obj).f202239c);
        }
        return false;
    }

    @NonNull
    public <T> C4447e f(@NonNull C4446d<T> c4446d, @NonNull T t10) {
        this.f202239c.put(c4446d, t10);
        return this;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        return this.f202239c.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f202239c + '}';
    }
}
