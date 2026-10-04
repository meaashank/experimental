package androidx.compose.runtime;

import android.os.Trace;
import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d2 {
    public static final <T> T a(@NotNull String str, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        c2 c2Var = c2.f99428a;
        c2Var.getClass();
        Trace.beginSection(str);
        try {
            T tInvoke = interfaceC4376a.invoke();
            c2Var.getClass();
            Trace.endSection();
            return tInvoke;
        } catch (Throwable th) {
            c2.f99428a.getClass();
            Trace.endSection();
            throw th;
        }
    }
}
