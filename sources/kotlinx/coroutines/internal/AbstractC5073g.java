package kotlinx.coroutines.internal;

import ed.InterfaceC4376a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.internal.AbstractC5073g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n103#1,7:266\n1#2:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n111#1:266,7\n*E\n"})
public abstract class AbstractC5073g<N extends AbstractC5073g<N>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220340a = AtomicReferenceFieldUpdater.newUpdater(AbstractC5073g.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220341b = AtomicReferenceFieldUpdater.newUpdater(AbstractC5073g.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC5073g(@Nullable N n10) {
        this._prev$volatile = n10;
    }

    public static final Object b(AbstractC5073g abstractC5073g) {
        abstractC5073g.getClass();
        return f220340a.get(abstractC5073g);
    }

    private final /* synthetic */ void u(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ed.l<Object, ? extends Object> lVar) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
    }

    public final void c() {
        f220341b.set(this, null);
    }

    public final N d() {
        N n10 = (N) h();
        while (n10 != null && n10.m()) {
            n10 = (N) f220341b.get(n10);
        }
        return n10;
    }

    public final N e() {
        AbstractC5073g abstractC5073gF;
        N n10 = (N) f();
        kotlin.jvm.internal.G.m(n10);
        while (n10.m() && (abstractC5073gF = n10.f()) != null) {
            n10 = (N) abstractC5073gF;
        }
        return n10;
    }

    @Nullable
    public final N f() {
        Object obj = f220340a.get(this);
        if (obj == C5072f.f220339b) {
            return null;
        }
        return (N) obj;
    }

    public final Object g() {
        return f220340a.get(this);
    }

    @Nullable
    public final N h() {
        return (N) f220341b.get(this);
    }

    public final /* synthetic */ Object i() {
        return this._next$volatile;
    }

    public final /* synthetic */ Object k() {
        return this._prev$volatile;
    }

    public abstract boolean m();

    public final boolean n() {
        return f() == null;
    }

    public final boolean o() {
        return androidx.concurrent.futures.c.a(f220340a, this, null, C5072f.f220339b);
    }

    @Nullable
    public final N p(@NotNull InterfaceC4376a interfaceC4376a) {
        Object obj = f220340a.get(this);
        if (obj != C5072f.f220339b) {
            return (N) obj;
        }
        interfaceC4376a.invoke();
        throw new KotlinNothingValueException();
    }

    public final void q() {
        Object obj;
        if (n()) {
            return;
        }
        while (true) {
            AbstractC5073g abstractC5073gD = d();
            AbstractC5073g abstractC5073gE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220341b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC5073gE);
            } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, abstractC5073gE, obj, ((AbstractC5073g) obj) == null ? null : abstractC5073gD));
            if (abstractC5073gD != null) {
                f220340a.set(abstractC5073gD, abstractC5073gE);
            }
            if (!abstractC5073gE.m() || abstractC5073gE.n()) {
                if (abstractC5073gD == null || !abstractC5073gD.m()) {
                    return;
                }
            }
        }
    }

    public final /* synthetic */ void r(Object obj) {
        this._next$volatile = obj;
    }

    public final /* synthetic */ void s(Object obj) {
        this._prev$volatile = obj;
    }

    public final boolean t(@NotNull N n10) {
        return androidx.concurrent.futures.c.a(f220340a, this, null, n10);
    }
}
