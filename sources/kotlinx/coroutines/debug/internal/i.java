package kotlinx.coroutines.debug.internal;

import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC4850b0
public final class i implements Vc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Vc.c f219290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public final StackTraceElement f219291b;

    public i(@Nullable Vc.c cVar, @NotNull StackTraceElement stackTraceElement) {
        this.f219290a = cVar;
        this.f219291b = stackTraceElement;
    }

    @Override // Vc.c
    @Nullable
    public Vc.c getCallerFrame() {
        return this.f219290a;
    }

    @Override // Vc.c
    @NotNull
    public StackTraceElement getStackTraceElement() {
        return this.f219291b;
    }
}
