package androidx.compose.foundation.lazy.layout;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1729c {
    public static /* synthetic */ void a(InterfaceC1730d interfaceC1730d, int i10, int i11, ed.l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = interfaceC1730d.getSize() - 1;
        }
        interfaceC1730d.a(i10, i11, lVar);
    }
}
