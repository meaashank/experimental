package kotlinx.coroutines.debug.internal;

import dd.j;
import java.util.List;
import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC4850b0
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.i f219277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Vc.c f219278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f219279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<StackTraceElement> f219280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f219281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Thread f219282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Vc.c f219283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final List<StackTraceElement> f219284h;

    public c(@NotNull DebugCoroutineInfoImpl debugCoroutineInfoImpl, @NotNull kotlin.coroutines.i iVar) {
        this.f219277a = iVar;
        this.f219278b = debugCoroutineInfoImpl.f219230a;
        this.f219279c = debugCoroutineInfoImpl.f219231b;
        this.f219280d = debugCoroutineInfoImpl.b();
        this.f219281e = debugCoroutineInfoImpl._state;
        this.f219282f = debugCoroutineInfoImpl.lastObservedThread;
        this.f219283g = debugCoroutineInfoImpl.f();
        this.f219284h = debugCoroutineInfoImpl.h();
    }

    @NotNull
    public final kotlin.coroutines.i a() {
        return this.f219277a;
    }

    @Nullable
    public final Vc.c b() {
        return this.f219278b;
    }

    @NotNull
    public final List<StackTraceElement> c() {
        return this.f219280d;
    }

    @Nullable
    public final Vc.c d() {
        return this.f219283g;
    }

    @Nullable
    public final Thread e() {
        return this.f219282f;
    }

    public final long f() {
        return this.f219279c;
    }

    @NotNull
    public final String g() {
        return this.f219281e;
    }

    @j(name = "lastObservedStackTrace")
    @NotNull
    public final List<StackTraceElement> h() {
        return this.f219284h;
    }
}
