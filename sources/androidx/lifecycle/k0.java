package androidx.lifecycle;

import java.io.Closeable;
import java.util.Arrays;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final S1.h f114351a;

    public k0() {
        this.f114351a = new S1.h();
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ void b(Closeable closeable) {
        kotlin.jvm.internal.G.p(closeable, "closeable");
        S1.h hVar = this.f114351a;
        if (hVar != null) {
            hVar.d(closeable);
        }
    }

    public void c(@NotNull AutoCloseable closeable) {
        kotlin.jvm.internal.G.p(closeable, "closeable");
        S1.h hVar = this.f114351a;
        if (hVar != null) {
            hVar.d(closeable);
        }
    }

    public final void d(@NotNull String key, @NotNull AutoCloseable closeable) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(closeable, "closeable");
        S1.h hVar = this.f114351a;
        if (hVar != null) {
            hVar.e(key, closeable);
        }
    }

    @e.I
    public final void e() {
        S1.h hVar = this.f114351a;
        if (hVar != null) {
            hVar.f();
        }
        g();
    }

    @Nullable
    public final <T extends AutoCloseable> T f(@NotNull String key) {
        kotlin.jvm.internal.G.p(key, "key");
        S1.h hVar = this.f114351a;
        if (hVar != null) {
            return (T) hVar.h(key);
        }
        return null;
    }

    public void g() {
    }

    public k0(@NotNull kotlinx.coroutines.L viewModelScope) {
        kotlin.jvm.internal.G.p(viewModelScope, "viewModelScope");
        this.f114351a = new S1.h(viewModelScope);
    }

    public k0(@NotNull AutoCloseable... closeables) {
        kotlin.jvm.internal.G.p(closeables, "closeables");
        this.f114351a = new S1.h((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public k0(@NotNull kotlinx.coroutines.L viewModelScope, @NotNull AutoCloseable... closeables) {
        kotlin.jvm.internal.G.p(viewModelScope, "viewModelScope");
        kotlin.jvm.internal.G.p(closeables, "closeables");
        this.f114351a = new S1.h(viewModelScope, (AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ k0(Closeable... closeables) {
        kotlin.jvm.internal.G.p(closeables, "closeables");
        this.f114351a = new S1.h((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }
}
