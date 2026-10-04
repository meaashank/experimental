package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.InterfaceC2025e2;
import androidx.compose.ui.graphics.U1;
import k0.t;
import k0.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    @NotNull
    public static final a a(@NotNull InterfaceC2025e2 interfaceC2025e2, long j10, long j11, int i10) {
        a aVar = new a(interfaceC2025e2, j10, j11);
        aVar.f101378j = i10;
        return aVar;
    }

    public static a b(InterfaceC2025e2 interfaceC2025e2, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            t.f214328b.getClass();
            j10 = t.f214329c;
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = y.a(interfaceC2025e2.getWidth(), interfaceC2025e2.getHeight());
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            U1.f100844b.getClass();
            i10 = U1.f100846d;
        }
        return a(interfaceC2025e2, j12, j13, i10);
    }
}
