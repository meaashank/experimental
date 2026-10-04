package androidx.compose.ui.platform;

import ed.InterfaceC4376a;
import java.util.Arrays;
import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2287v0 {
    public static /* synthetic */ void a() {
    }

    @NotNull
    public static final Object b(@NotNull Object obj) {
        return obj.getClass();
    }

    @NotNull
    public static final String c(@NotNull Object obj, @Nullable String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        return str + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    @InterfaceC4850b0
    public static final <R> R d(@NotNull Object obj, @NotNull InterfaceC4376a<? extends R> interfaceC4376a) {
        R rInvoke;
        synchronized (obj) {
            rInvoke = interfaceC4376a.invoke();
        }
        return rInvoke;
    }
}
