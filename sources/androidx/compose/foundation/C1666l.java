package androidx.compose.foundation;

/* JADX INFO: renamed from: androidx.compose.foundation.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1666l {
    public static /* synthetic */ Object a(InterfaceC1747m interfaceC1747m, MutatePriority mutatePriority, kotlin.coroutines.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return interfaceC1747m.b(mutatePriority, eVar);
    }
}
