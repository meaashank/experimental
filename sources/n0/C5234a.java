package n0;

import android.os.Trace;
import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: n0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5234a {
    public static final <T> T a(@NotNull String str, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        Trace.beginSection(str);
        try {
            return interfaceC4376a.invoke();
        } finally {
            Trace.endSection();
        }
    }
}
