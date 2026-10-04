package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.J0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC5120x0
public final class F implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final F f220286a = new F();

    @Override // kotlinx.coroutines.internal.B
    public int a() {
        return -1;
    }

    @Override // kotlinx.coroutines.internal.B
    @Nullable
    public String b() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.B
    @NotNull
    public J0 c(@NotNull List<? extends B> list) {
        return new E(null, null, 2, null);
    }
}
