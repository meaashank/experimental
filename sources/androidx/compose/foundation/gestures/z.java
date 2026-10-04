package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z {
    public static boolean a(A a10) {
        return true;
    }

    public static boolean b(A a10) {
        return true;
    }

    public static boolean c(A a10) {
        return false;
    }

    public static boolean d(A a10) {
        return false;
    }

    public static /* synthetic */ boolean e(A a10) {
        return true;
    }

    public static /* synthetic */ boolean f(A a10) {
        return true;
    }

    public static /* synthetic */ boolean g(A a10) {
        return false;
    }

    public static /* synthetic */ boolean h(A a10) {
        return false;
    }

    public static /* synthetic */ Object i(A a10, MutatePriority mutatePriority, ed.p pVar, kotlin.coroutines.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return a10.a(mutatePriority, pVar, eVar);
    }
}
