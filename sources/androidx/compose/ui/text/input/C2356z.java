package androidx.compose.ui.text.input;

import androidx.activity.C1477d;
import androidx.compose.ui.text.C2359l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2356z implements InterfaceC2340i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f104859b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104860a;

    public C2356z(int i10) {
        this.f104860a = i10;
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2340i
    public void a(@NotNull C2342k c2342k) {
        if (c2342k.h() == -1) {
            int i10 = c2342k.f104810b;
            c2342k.r(i10, i10);
        }
        int i11 = c2342k.f104810b;
        String string = c2342k.f104809a.toString();
        int i12 = this.f104860a;
        int i13 = 0;
        if (i12 <= 0) {
            int i14 = -i12;
            while (i13 < i14) {
                int iB = C2359l.b(string, i11);
                if (iB == -1) {
                    break;
                }
                i13++;
                i11 = iB;
            }
        } else {
            while (i13 < i12) {
                int iA = C2359l.a(string, i11);
                if (iA == -1) {
                    break;
                }
                i13++;
                i11 = iA;
            }
        }
        c2342k.r(i11, i11);
    }

    public final int b() {
        return this.f104860a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2356z) && this.f104860a == ((C2356z) obj).f104860a;
    }

    public int hashCode() {
        return this.f104860a;
    }

    @NotNull
    public String toString() {
        return C1477d.a(new StringBuilder("MoveCursorCommand(amount="), this.f104860a, ')');
    }
}
