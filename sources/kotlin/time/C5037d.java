package kotlin.time;

import kotlin.jvm.internal.C4969v;
import kotlin.time.E;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.time.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5037d implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final E f218411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f218412b;

    public /* synthetic */ C5037d(E e10, long j10, C4969v c4969v) {
        this(e10, j10);
    }

    @Override // kotlin.time.E
    public long a() {
        return C5041h.V(this.f218411a.a(), this.f218412b);
    }

    @Override // kotlin.time.E
    public boolean b() {
        return C5041h.S(a());
    }

    @Override // kotlin.time.E
    public boolean c() {
        return !C5041h.S(a());
    }

    public final long d() {
        return this.f218412b;
    }

    @NotNull
    public final E e() {
        return this.f218411a;
    }

    @Override // kotlin.time.E
    @NotNull
    public E o(long j10) {
        return new C5037d(this.f218411a, C5041h.W(this.f218412b, j10));
    }

    @Override // kotlin.time.E
    @NotNull
    public /* bridge */ E q(long j10) {
        return E.a.c(this, j10);
    }

    public C5037d(E mark, long j10) {
        kotlin.jvm.internal.G.p(mark, "mark");
        this.f218411a = mark;
        this.f218412b = j10;
    }
}
