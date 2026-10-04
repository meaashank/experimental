package androidx.core.os;

import android.os.Trace;
import ed.InterfaceC4376a;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class U {
    @InterfaceC4982o(message = "Use androidx.tracing.Trace instead", replaceWith = @InterfaceC4852c0(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    public static final <T> T a(@NotNull String str, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        Trace.beginSection(str);
        try {
            return interfaceC4376a.invoke();
        } finally {
            Trace.endSection();
        }
    }
}
