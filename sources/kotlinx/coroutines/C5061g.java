package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5061g extends AbstractC5093j0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Thread f220257i;

    public C5061g(@NotNull Thread thread) {
        this.f220257i = thread;
    }

    @Override // kotlinx.coroutines.AbstractC5095k0
    @NotNull
    public Thread b4() {
        return this.f220257i;
    }
}
