package androidx.lifecycle;

import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends CoroutineDispatcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public final C2600m f114105c = new C2600m();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void F2(@NotNull kotlin.coroutines.i context, @NotNull Runnable block) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(block, "block");
        this.f114105c.c(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean J2(@NotNull kotlin.coroutines.i context) {
        kotlin.jvm.internal.G.p(context, "context");
        if (C5052b0.e().Z2().J2(context)) {
            return true;
        }
        return !this.f114105c.b();
    }
}
