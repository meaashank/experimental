package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.InterfaceC2025e2;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2021d2 {
    static {
        InterfaceC2025e2.a aVar = InterfaceC2025e2.f101098a;
    }

    public static /* synthetic */ void a(InterfaceC2025e2 interfaceC2025e2, int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
        }
        if ((i16 & 2) != 0) {
            i10 = 0;
        }
        if ((i16 & 4) != 0) {
            i11 = 0;
        }
        if ((i16 & 8) != 0) {
            i12 = interfaceC2025e2.getWidth();
        }
        if ((i16 & 16) != 0) {
            i13 = interfaceC2025e2.getHeight();
        }
        if ((i16 & 32) != 0) {
            i14 = 0;
        }
        if ((i16 & 64) != 0) {
            i15 = i12;
        }
        interfaceC2025e2.a(iArr, i10, i11, i12, i13, i14, i15);
    }
}
