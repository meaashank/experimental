package g3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import y3.m;

/* JADX INFO: renamed from: g3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4446d<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b<Object> f202234e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f202235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<T> f202236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f202237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[] f202238d;

    /* JADX INFO: renamed from: g3.d$b */
    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t10, @NonNull MessageDigest messageDigest);
    }

    public C4446d(@NonNull String str, @Nullable T t10, @NonNull b<T> bVar) {
        m.c(str);
        this.f202237c = str;
        this.f202235a = t10;
        m.f(bVar, "Argument must not be null");
        this.f202236b = bVar;
    }

    @NonNull
    public static <T> C4446d<T> a(@NonNull String str, @NonNull b<T> bVar) {
        return new C4446d<>(str, null, bVar);
    }

    @NonNull
    public static <T> C4446d<T> b(@NonNull String str, @Nullable T t10, @NonNull b<T> bVar) {
        return new C4446d<>(str, t10, bVar);
    }

    @NonNull
    public static <T> b<T> c() {
        return (b<T>) f202234e;
    }

    @NonNull
    public static <T> C4446d<T> f(@NonNull String str) {
        return new C4446d<>(str, null, f202234e);
    }

    @NonNull
    public static <T> C4446d<T> g(@NonNull String str, @NonNull T t10) {
        return new C4446d<>(str, t10, f202234e);
    }

    @Nullable
    public T d() {
        return this.f202235a;
    }

    @NonNull
    public final byte[] e() {
        if (this.f202238d == null) {
            this.f202238d = this.f202237c.getBytes(InterfaceC4444b.f202232b);
        }
        return this.f202238d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4446d) {
            return this.f202237c.equals(((C4446d) obj).f202237c);
        }
        return false;
    }

    public void h(@NonNull T t10, @NonNull MessageDigest messageDigest) {
        this.f202236b.a(e(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f202237c.hashCode();
    }

    public String toString() {
        return android.support.v4.media.e.a(new StringBuilder("Option{key='"), this.f202237c, "'}");
    }

    /* JADX INFO: renamed from: g3.d$a */
    public class a implements b<Object> {
        @Override // g3.C4446d.b
        public void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }
}
