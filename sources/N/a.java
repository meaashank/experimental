package N;

import androidx.activity.C1477d;
import androidx.compose.animation.C1635o;
import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f58930e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f58931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f58934d;

    public a(boolean z10, int i10, int i11, int i12) {
        this.f58931a = z10;
        this.f58932b = i10;
        this.f58933c = i11;
        this.f58934d = i12;
    }

    public static a f(a aVar, boolean z10, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = aVar.f58931a;
        }
        if ((i13 & 2) != 0) {
            i10 = aVar.f58932b;
        }
        if ((i13 & 4) != 0) {
            i11 = aVar.f58933c;
        }
        if ((i13 & 8) != 0) {
            i12 = aVar.f58934d;
        }
        aVar.getClass();
        return new a(z10, i10, i11, i12);
    }

    public final boolean a() {
        return this.f58931a;
    }

    public final int b() {
        return this.f58932b;
    }

    public final int c() {
        return this.f58933c;
    }

    public final int d() {
        return this.f58934d;
    }

    @NotNull
    public final a e(boolean z10, int i10, int i11, int i12) {
        return new a(z10, i10, i11, i12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f58931a == aVar.f58931a && this.f58932b == aVar.f58932b && this.f58933c == aVar.f58933c && this.f58934d == aVar.f58934d;
    }

    public final int g() {
        return this.f58933c;
    }

    public final int h() {
        return this.f58934d;
    }

    public int hashCode() {
        return (((((C1635o.a(this.f58931a) * 31) + this.f58932b) * 31) + this.f58933c) * 31) + this.f58934d;
    }

    public final int i() {
        return this.f58932b;
    }

    public final boolean j() {
        return this.f58931a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ComposableInfo(isComposable=");
        sb2.append(this.f58931a);
        sb2.append(", realParamsCount=");
        sb2.append(this.f58932b);
        sb2.append(", changedParams=");
        sb2.append(this.f58933c);
        sb2.append(", defaultParams=");
        return C1477d.a(sb2, this.f58934d, ')');
    }
}
