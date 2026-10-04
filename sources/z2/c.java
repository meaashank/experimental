package z2;

import android.os.Trace;
import androidx.annotation.NonNull;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
@T(18)
public final class c {
    public static void a(@NonNull String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
