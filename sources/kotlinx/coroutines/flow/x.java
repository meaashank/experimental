package kotlinx.coroutines.flow;

import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements f<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final Throwable f220247a;

    public x(@NotNull Throwable th) {
        this.f220247a = th;
    }

    @Override // kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(@Nullable Object obj, @NotNull kotlin.coroutines.e<? super L0> eVar) throws Throwable {
        throw this.f220247a;
    }
}
