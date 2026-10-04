package kotlinx.coroutines;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,681:1\n1#2:682\n*E\n"})
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @Nullable
    public final Object f218685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @Nullable
    public final InterfaceC5098m f218686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @Nullable
    public final ed.l<Throwable, kotlin.L0> f218687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    @Nullable
    public final Object f218688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    @Nullable
    public final Throwable f218689e;

    /* JADX WARN: Multi-variable type inference failed */
    public A(@Nullable Object obj, @Nullable InterfaceC5098m interfaceC5098m, @Nullable ed.l<? super Throwable, kotlin.L0> lVar, @Nullable Object obj2, @Nullable Throwable th) {
        this.f218685a = obj;
        this.f218686b = interfaceC5098m;
        this.f218687c = lVar;
        this.f218688d = obj2;
        this.f218689e = th;
    }

    public static A g(A a10, Object obj, InterfaceC5098m interfaceC5098m, ed.l lVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = a10.f218685a;
        }
        if ((i10 & 2) != 0) {
            interfaceC5098m = a10.f218686b;
        }
        if ((i10 & 4) != 0) {
            lVar = a10.f218687c;
        }
        if ((i10 & 8) != 0) {
            obj2 = a10.f218688d;
        }
        if ((i10 & 16) != 0) {
            th = a10.f218689e;
        }
        Throwable th2 = th;
        a10.getClass();
        ed.l lVar2 = lVar;
        return new A(obj, interfaceC5098m, lVar2, obj2, th2);
    }

    @Nullable
    public final Object a() {
        return this.f218685a;
    }

    @Nullable
    public final InterfaceC5098m b() {
        return this.f218686b;
    }

    @Nullable
    public final ed.l<Throwable, kotlin.L0> c() {
        return this.f218687c;
    }

    @Nullable
    public final Object d() {
        return this.f218688d;
    }

    @Nullable
    public final Throwable e() {
        return this.f218689e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return kotlin.jvm.internal.G.g(this.f218685a, a10.f218685a) && kotlin.jvm.internal.G.g(this.f218686b, a10.f218686b) && kotlin.jvm.internal.G.g(this.f218687c, a10.f218687c) && kotlin.jvm.internal.G.g(this.f218688d, a10.f218688d) && kotlin.jvm.internal.G.g(this.f218689e, a10.f218689e);
    }

    @NotNull
    public final A f(@Nullable Object obj, @Nullable InterfaceC5098m interfaceC5098m, @Nullable ed.l<? super Throwable, kotlin.L0> lVar, @Nullable Object obj2, @Nullable Throwable th) {
        return new A(obj, interfaceC5098m, lVar, obj2, th);
    }

    public final boolean h() {
        return this.f218689e != null;
    }

    public int hashCode() {
        Object obj = this.f218685a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC5098m interfaceC5098m = this.f218686b;
        int iHashCode2 = (iHashCode + (interfaceC5098m == null ? 0 : interfaceC5098m.hashCode())) * 31;
        ed.l<Throwable, kotlin.L0> lVar = this.f218687c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f218688d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f218689e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final void i(@NotNull C5102o<?> c5102o, @NotNull Throwable th) {
        InterfaceC5098m interfaceC5098m = this.f218686b;
        if (interfaceC5098m != null) {
            c5102o.k(interfaceC5098m, th);
        }
        ed.l<Throwable, kotlin.L0> lVar = this.f218687c;
        if (lVar != null) {
            c5102o.o(lVar, th);
        }
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.f218685a + ", cancelHandler=" + this.f218686b + ", onCancellation=" + this.f218687c + ", idempotentResume=" + this.f218688d + ", cancelCause=" + this.f218689e + ')';
    }

    public /* synthetic */ A(Object obj, InterfaceC5098m interfaceC5098m, ed.l lVar, Object obj2, Throwable th, int i10, C4969v c4969v) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC5098m, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
