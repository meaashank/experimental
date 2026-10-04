package androidx.compose.foundation.layout;

import androidx.activity.C1477d;
import androidx.compose.runtime.InterfaceC1924k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C1676e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90905e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f90908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f90909d;

    public C1676e0(int i10, int i11, int i12, int i13) {
        this.f90906a = i10;
        this.f90907b = i11;
        this.f90908c = i12;
        this.f90909d = i13;
    }

    public final int a() {
        return this.f90909d;
    }

    public final int b() {
        return this.f90906a;
    }

    public final int c() {
        return this.f90908c;
    }

    public final int d() {
        return this.f90907b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1676e0)) {
            return false;
        }
        C1676e0 c1676e0 = (C1676e0) obj;
        return this.f90906a == c1676e0.f90906a && this.f90907b == c1676e0.f90907b && this.f90908c == c1676e0.f90908c && this.f90909d == c1676e0.f90909d;
    }

    public int hashCode() {
        return (((((this.f90906a * 31) + this.f90907b) * 31) + this.f90908c) * 31) + this.f90909d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f90906a);
        sb2.append(", top=");
        sb2.append(this.f90907b);
        sb2.append(", right=");
        sb2.append(this.f90908c);
        sb2.append(", bottom=");
        return C1477d.a(sb2, this.f90909d, ')');
    }
}
