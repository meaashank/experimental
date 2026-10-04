package kotlinx.coroutines.internal;

import ed.InterfaceC4376a;
import kotlinx.coroutines.InterfaceC5120x0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class S {
    @InterfaceC5120x0
    public static /* synthetic */ void a() {
    }

    @InterfaceC5120x0
    public static final <T> T b(@NotNull Object obj, @NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        T tInvoke;
        synchronized (obj) {
            tInvoke = interfaceC4376a.invoke();
        }
        return tInvoke;
    }
}
