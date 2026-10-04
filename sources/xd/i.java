package xd;

import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC4850b0
public abstract class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    public long f240624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public j f240625b;

    public i(long j10, @NotNull j jVar) {
        this.f240624a = j10;
        this.f240625b = jVar;
    }

    public final int a() {
        return this.f240625b.h2();
    }

    public i() {
        this(0L, m.f240636i);
    }
}
