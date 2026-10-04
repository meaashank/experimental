package androidx.compose.ui.text.platform;

import ed.InterfaceC4376a;
import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    @NotNull
    public static final y a() {
        return new y();
    }

    @InterfaceC4850b0
    public static final <R> R b(@NotNull y yVar, @NotNull InterfaceC4376a<? extends R> interfaceC4376a) {
        R rInvoke;
        synchronized (yVar) {
            rInvoke = interfaceC4376a.invoke();
        }
        return rInvoke;
    }
}
