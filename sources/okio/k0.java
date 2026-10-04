package okio;

import ed.InterfaceC4376a;
import kotlin.text.C5013e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class k0 {
    @NotNull
    public static final byte[] a(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        byte[] bytes = str.getBytes(C5013e.f218326b);
        kotlin.jvm.internal.G.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final <R> R b(@NotNull Object lock, @NotNull InterfaceC4376a<? extends R> block) {
        R rInvoke;
        kotlin.jvm.internal.G.p(lock, "lock");
        kotlin.jvm.internal.G.p(block, "block");
        synchronized (lock) {
            rInvoke = block.invoke();
        }
        return rInvoke;
    }

    @NotNull
    public static final String c(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return new String(bArr, C5013e.f218326b);
    }
}
