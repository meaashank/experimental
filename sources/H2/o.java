package H2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45457e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45458f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final p[] f45459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f45460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final byte[] f45461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45462d;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface a {
    }

    public o(@Nullable String str) {
        this(str, (p[]) null);
    }

    public final void a(int i10) {
        if (i10 == this.f45462d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + f(this.f45462d) + " expected, but got " + f(i10));
    }

    @NonNull
    public byte[] b() {
        a(1);
        Objects.requireNonNull(this.f45461c);
        return this.f45461c;
    }

    @Nullable
    public String c() {
        a(0);
        return this.f45460b;
    }

    @Nullable
    public p[] d() {
        return this.f45459a;
    }

    public int e() {
        return this.f45462d;
    }

    @NonNull
    public final String f(int i10) {
        return i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public o(@Nullable String str, @Nullable p[] pVarArr) {
        this.f45460b = str;
        this.f45461c = null;
        this.f45459a = pVarArr;
        this.f45462d = 0;
    }

    public o(@NonNull byte[] bArr) {
        this(bArr, (p[]) null);
    }

    public o(@NonNull byte[] bArr, @Nullable p[] pVarArr) {
        Objects.requireNonNull(bArr);
        this.f45461c = bArr;
        this.f45460b = null;
        this.f45459a = pVarArr;
        this.f45462d = 1;
    }
}
