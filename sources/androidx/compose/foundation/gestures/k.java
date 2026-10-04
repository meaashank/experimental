package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k {
    public static /* synthetic */ Object a(l lVar, MutatePriority mutatePriority, ed.p pVar, kotlin.coroutines.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return lVar.a(mutatePriority, pVar, eVar);
    }
}
