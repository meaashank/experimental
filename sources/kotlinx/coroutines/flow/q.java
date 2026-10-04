package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final e<T> f220236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    public final int f220237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public final BufferOverflow f220238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    @NotNull
    public final kotlin.coroutines.i f220239d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@NotNull e<? extends T> eVar, int i10, @NotNull BufferOverflow bufferOverflow, @NotNull kotlin.coroutines.i iVar) {
        this.f220236a = eVar;
        this.f220237b = i10;
        this.f220238c = bufferOverflow;
        this.f220239d = iVar;
    }
}
