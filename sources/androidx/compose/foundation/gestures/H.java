package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H {
    public static /* synthetic */ Object a(I i10, MutatePriority mutatePriority, ed.p pVar, kotlin.coroutines.e eVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
        }
        if ((i11 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return i10.a(mutatePriority, pVar, eVar);
    }
}
