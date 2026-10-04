package z2;

import android.os.Trace;
import androidx.annotation.NonNull;
import e.InterfaceC4345t;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
@T(29)
public final class d {
    public static void a(@NonNull String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void b(@NonNull String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }

    @InterfaceC4345t
    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(@NonNull String str, int i10) {
        Trace.setCounter(str, i10);
    }
}
