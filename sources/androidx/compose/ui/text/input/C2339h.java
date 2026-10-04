package androidx.compose.ui.text.input;

import androidx.activity.C1477d;
import androidx.collection.M0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2339h implements InterfaceC2340i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104803c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104805b;

    public C2339h(int i10, int i11) {
        this.f104804a = i10;
        this.f104805b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(M0.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i10, " and ", i11, " respectively.").toString());
        }
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2340i
    public void a(@NotNull C2342k c2342k) {
        int i10 = this.f104804a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 < i10) {
                int i14 = i13 + 1;
                int i15 = c2342k.f104810b;
                if (i15 <= i14) {
                    i13 = i15;
                    break;
                } else {
                    i13 = C2341j.b(c2342k.f104809a.a((i15 - i14) + (-1)), c2342k.f104809a.a(c2342k.f104810b - i14)) ? i13 + 2 : i14;
                    i12++;
                }
            } else {
                break;
            }
        }
        int i16 = this.f104805b;
        int iB = 0;
        while (true) {
            if (i11 >= i16) {
                break;
            }
            int i17 = iB + 1;
            if (c2342k.f104811c + i17 >= c2342k.f104809a.b()) {
                iB = c2342k.f104809a.b() - c2342k.f104811c;
                break;
            } else {
                iB = C2341j.b(c2342k.f104809a.a((c2342k.f104811c + i17) + (-1)), c2342k.f104809a.a(c2342k.f104811c + i17)) ? iB + 2 : i17;
                i11++;
            }
        }
        int i18 = c2342k.f104811c;
        c2342k.c(i18, iB + i18);
        int i19 = c2342k.f104810b;
        c2342k.c(i19 - i13, i19);
    }

    public final int b() {
        return this.f104805b;
    }

    public final int c() {
        return this.f104804a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2339h)) {
            return false;
        }
        C2339h c2339h = (C2339h) obj;
        return this.f104804a == c2339h.f104804a && this.f104805b == c2339h.f104805b;
    }

    public int hashCode() {
        return (this.f104804a * 31) + this.f104805b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f104804a);
        sb2.append(", lengthAfterCursor=");
        return C1477d.a(sb2, this.f104805b, ')');
    }
}
