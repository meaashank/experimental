package G0;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.activity.C1477d;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final D f40030e = new D(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40034d;

    @e.T(29)
    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public D(int i10, int i11, int i12, int i13) {
        this.f40031a = i10;
        this.f40032b = i11;
        this.f40033c = i12;
        this.f40034d = i13;
    }

    @NonNull
    public static D a(@NonNull D d10, @NonNull D d11) {
        return d(d10.f40031a + d11.f40031a, d10.f40032b + d11.f40032b, d10.f40033c + d11.f40033c, d10.f40034d + d11.f40034d);
    }

    @NonNull
    public static D b(@NonNull D d10, @NonNull D d11) {
        return d(Math.max(d10.f40031a, d11.f40031a), Math.max(d10.f40032b, d11.f40032b), Math.max(d10.f40033c, d11.f40033c), Math.max(d10.f40034d, d11.f40034d));
    }

    @NonNull
    public static D c(@NonNull D d10, @NonNull D d11) {
        return d(Math.min(d10.f40031a, d11.f40031a), Math.min(d10.f40032b, d11.f40032b), Math.min(d10.f40033c, d11.f40033c), Math.min(d10.f40034d, d11.f40034d));
    }

    @NonNull
    public static D d(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f40030e : new D(i10, i11, i12, i13);
    }

    @NonNull
    public static D e(@NonNull Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NonNull
    public static D f(@NonNull D d10, @NonNull D d11) {
        return d(d10.f40031a - d11.f40031a, d10.f40032b - d11.f40032b, d10.f40033c - d11.f40033c, d10.f40034d - d11.f40034d);
    }

    @NonNull
    @e.T(api = 29)
    public static D g(@NonNull Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }

    @NonNull
    @e.T(api = 29)
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static D i(@NonNull Insets insets) {
        return g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d10 = (D) obj;
        return this.f40034d == d10.f40034d && this.f40031a == d10.f40031a && this.f40033c == d10.f40033c && this.f40032b == d10.f40032b;
    }

    @NonNull
    @e.T(29)
    public Insets h() {
        return a.a(this.f40031a, this.f40032b, this.f40033c, this.f40034d);
    }

    public int hashCode() {
        return (((((this.f40031a * 31) + this.f40032b) * 31) + this.f40033c) * 31) + this.f40034d;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f40031a);
        sb2.append(", top=");
        sb2.append(this.f40032b);
        sb2.append(", right=");
        sb2.append(this.f40033c);
        sb2.append(", bottom=");
        return C1477d.a(sb2, this.f40034d, '}');
    }
}
