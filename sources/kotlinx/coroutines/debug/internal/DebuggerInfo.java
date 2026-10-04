package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.InterfaceC4850b0;
import kotlinx.coroutines.J;
import kotlinx.coroutines.K;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC4850b0
public final class DebuggerInfo implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Long f219262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f219263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f219264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f219265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f219266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f219267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<StackTraceElement> f219268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f219269h;

    public DebuggerInfo(@NotNull DebugCoroutineInfoImpl debugCoroutineInfoImpl, @NotNull kotlin.coroutines.i iVar) {
        Thread.State state;
        J j10 = (J) iVar.get(J.f218740c);
        this.f219262a = j10 != null ? Long.valueOf(j10.f218741b) : null;
        kotlin.coroutines.f fVar = (kotlin.coroutines.f) iVar.get(kotlin.coroutines.f.f217679y3);
        this.f219263b = fVar != null ? fVar.toString() : null;
        K k10 = (K) iVar.get(K.f218768c);
        this.f219264c = k10 != null ? k10.f218769b : null;
        this.f219265d = debugCoroutineInfoImpl._state;
        Thread thread = debugCoroutineInfoImpl.lastObservedThread;
        this.f219266e = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = debugCoroutineInfoImpl.lastObservedThread;
        this.f219267f = thread2 != null ? thread2.getName() : null;
        this.f219268g = debugCoroutineInfoImpl.h();
        this.f219269h = debugCoroutineInfoImpl.f219231b;
    }

    @Nullable
    public final Long d() {
        return this.f219262a;
    }

    @Nullable
    public final String g() {
        return this.f219263b;
    }

    @Nullable
    public final String getName() {
        return this.f219264c;
    }

    @NotNull
    public final List<StackTraceElement> h() {
        return this.f219268g;
    }

    @Nullable
    public final String i() {
        return this.f219267f;
    }

    @Nullable
    public final String j() {
        return this.f219266e;
    }

    public final long k() {
        return this.f219269h;
    }

    @NotNull
    public final String l() {
        return this.f219265d;
    }
}
