package kotlin.io;

import java.io.Closeable;
import kotlin.C;
import kotlin.C4987s;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@dd.j(name = "CloseableKt")
public final class b {
    @InterfaceC4887e0(version = "1.1")
    @InterfaceC4850b0
    public static final void a(@Nullable Closeable closeable, @Nullable Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C4987s.a(th, th2);
            }
        }
    }

    @C
    @Xc.f
    public static final <T extends Closeable, R> R b(T t10, ed.l<? super T, ? extends R> block) {
        G.p(block, "block");
        try {
            R rInvoke = block.invoke(t10);
            a(t10, null);
            return rInvoke;
        } finally {
        }
    }
}
