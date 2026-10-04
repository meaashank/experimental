package androidx.lifecycle;

import androidx.compose.runtime.V1;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import o.C5286a;
import o.C5287b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class D extends Lifecycle {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f113961k = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f113962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public C5286a<A, b> f113963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Lifecycle.State f113964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final WeakReference<B> f113965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f113967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f113968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public ArrayList<Lifecycle.State> f113969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.j<Lifecycle.State> f113970j;

    public static final class a {
        public a() {
        }

        @dd.o
        @e.f0
        @NotNull
        public final D a(@NotNull B owner) {
            kotlin.jvm.internal.G.p(owner, "owner");
            return new D(owner, false);
        }

        @dd.o
        @NotNull
        public final Lifecycle.State b(@NotNull Lifecycle.State state1, @Nullable Lifecycle.State state) {
            kotlin.jvm.internal.G.p(state1, "state1");
            return (state == null || state.compareTo(state1) >= 0) ? state1 : state;
        }

        public a(C4969v c4969v) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public Lifecycle.State f113971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public InterfaceC2611y f113972b;

        public b(@Nullable A a10, @NotNull Lifecycle.State initialState) {
            kotlin.jvm.internal.G.p(initialState, "initialState");
            kotlin.jvm.internal.G.m(a10);
            this.f113972b = J.f(a10);
            this.f113971a = initialState;
        }

        public final void a(@Nullable B b10, @NotNull Lifecycle.Event event) {
            kotlin.jvm.internal.G.p(event, "event");
            Lifecycle.State targetState = event.getTargetState();
            this.f113971a = D.f113961k.b(this.f113971a, targetState);
            InterfaceC2611y interfaceC2611y = this.f113972b;
            kotlin.jvm.internal.G.m(b10);
            interfaceC2611y.onStateChanged(b10, event);
            this.f113971a = targetState;
        }

        @NotNull
        public final InterfaceC2611y b() {
            return this.f113972b;
        }

        @NotNull
        public final Lifecycle.State c() {
            return this.f113971a;
        }

        public final void d(@NotNull InterfaceC2611y interfaceC2611y) {
            kotlin.jvm.internal.G.p(interfaceC2611y, "<set-?>");
            this.f113972b = interfaceC2611y;
        }

        public final void e(@NotNull Lifecycle.State state) {
            kotlin.jvm.internal.G.p(state, "<set-?>");
            this.f113971a = state;
        }
    }

    public /* synthetic */ D(B b10, boolean z10, C4969v c4969v) {
        this(b10, z10);
    }

    @dd.o
    @e.f0
    @NotNull
    public static final D k(@NotNull B b10) {
        return f113961k.a(b10);
    }

    @dd.o
    @NotNull
    public static final Lifecycle.State r(@NotNull Lifecycle.State state, @Nullable Lifecycle.State state2) {
        return f113961k.b(state, state2);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void c(@NotNull A observer) {
        B b10;
        kotlin.jvm.internal.G.p(observer, "observer");
        l("addObserver");
        Lifecycle.State state = this.f113964d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        b bVar = new b(observer, state2);
        if (this.f113963c.j(observer, bVar) == null && (b10 = this.f113965e.get()) != null) {
            boolean z10 = this.f113966f != 0 || this.f113967g;
            Lifecycle.State stateJ = j(observer);
            this.f113966f++;
            while (bVar.f113971a.compareTo(stateJ) < 0 && this.f113963c.contains(observer)) {
                u(bVar.f113971a);
                Lifecycle.Event eventC = Lifecycle.Event.Companion.c(bVar.f113971a);
                if (eventC == null) {
                    throw new IllegalStateException("no event up from " + bVar.f113971a);
                }
                bVar.a(b10, eventC);
                t();
                stateJ = j(observer);
            }
            if (!z10) {
                w();
            }
            this.f113966f--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    @NotNull
    public Lifecycle.State d() {
        return this.f113964d;
    }

    @Override // androidx.lifecycle.Lifecycle
    @NotNull
    public kotlinx.coroutines.flow.u<Lifecycle.State> e() {
        return FlowKt__ShareKt.b(this.f113970j);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void g(@NotNull A observer) {
        kotlin.jvm.internal.G.p(observer, "observer");
        l("removeObserver");
        this.f113963c.k(observer);
    }

    public final void i(B b10) {
        Iterator<Map.Entry<A, b>> itDescendingIterator = this.f113963c.descendingIterator();
        while (true) {
            C5287b.e eVar = (C5287b.e) itDescendingIterator;
            if (!eVar.hasNext() || this.f113968h) {
                return;
            }
            Map.Entry next = eVar.next();
            kotlin.jvm.internal.G.o(next, "next()");
            A a10 = (A) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.f113971a.compareTo(this.f113964d) > 0 && !this.f113968h && this.f113963c.contains(a10)) {
                Lifecycle.Event eventA = Lifecycle.Event.Companion.a(bVar.f113971a);
                if (eventA == null) {
                    throw new IllegalStateException("no event down from " + bVar.f113971a);
                }
                u(eventA.getTargetState());
                bVar.a(b10, eventA);
                t();
            }
        }
    }

    public final Lifecycle.State j(A a10) {
        b value;
        Map.Entry<A, b> entryN = this.f113963c.n(a10);
        Lifecycle.State state = (entryN == null || (value = entryN.getValue()) == null) ? null : value.f113971a;
        Lifecycle.State state2 = this.f113969i.isEmpty() ? null : (Lifecycle.State) V1.a(this.f113969i, 1);
        a aVar = f113961k;
        return aVar.b(aVar.b(this.f113964d, state), state2);
    }

    public final void l(String str) {
        if (this.f113962b && !G.a()) {
            throw new IllegalStateException(android.support.v4.media.i.a("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void m(B b10) {
        C5287b<A, b>.d dVarG = this.f113963c.g();
        while (dVarG.hasNext() && !this.f113968h) {
            Map.Entry<A, b> next = dVarG.next();
            A key = next.getKey();
            b value = next.getValue();
            while (value.f113971a.compareTo(this.f113964d) < 0 && !this.f113968h && this.f113963c.contains(key)) {
                u(value.f113971a);
                Lifecycle.Event eventC = Lifecycle.Event.Companion.c(value.f113971a);
                if (eventC == null) {
                    throw new IllegalStateException("no event up from " + value.f113971a);
                }
                value.a(b10, eventC);
                t();
            }
        }
    }

    public int n() {
        l("getObserverCount");
        return this.f113963c.size();
    }

    public void o(@NotNull Lifecycle.Event event) {
        kotlin.jvm.internal.G.p(event, "event");
        l("handleLifecycleEvent");
        s(event.getTargetState());
    }

    public final boolean p() {
        if (this.f113963c.size() == 0) {
            return true;
        }
        Map.Entry<A, b> entryB = this.f113963c.b();
        kotlin.jvm.internal.G.m(entryB);
        Lifecycle.State state = entryB.getValue().f113971a;
        Map.Entry<A, b> entryH = this.f113963c.h();
        kotlin.jvm.internal.G.m(entryH);
        Lifecycle.State state2 = entryH.getValue().f113971a;
        return state == state2 && this.f113964d == state2;
    }

    @e.I
    @InterfaceC4982o(message = "Override [currentState].")
    public void q(@NotNull Lifecycle.State state) {
        kotlin.jvm.internal.G.p(state, "state");
        l("markState");
        v(state);
    }

    public final void s(Lifecycle.State state) {
        Lifecycle.State state2 = this.f113964d;
        if (state2 == state) {
            return;
        }
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + state + ", but was " + this.f113964d + " in component " + this.f113965e.get()).toString());
        }
        this.f113964d = state;
        if (this.f113967g || this.f113966f != 0) {
            this.f113968h = true;
            return;
        }
        this.f113967g = true;
        w();
        this.f113967g = false;
        if (this.f113964d == Lifecycle.State.DESTROYED) {
            this.f113963c = new C5286a<>();
        }
    }

    public final void t() {
        this.f113969i.remove(r0.size() - 1);
    }

    public final void u(Lifecycle.State state) {
        this.f113969i.add(state);
    }

    public void v(@NotNull Lifecycle.State state) {
        kotlin.jvm.internal.G.p(state, "state");
        l("setCurrentState");
        s(state);
    }

    public final void w() {
        B b10 = this.f113965e.get();
        if (b10 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!p()) {
            this.f113968h = false;
            Lifecycle.State state = this.f113964d;
            Map.Entry<A, b> entryB = this.f113963c.b();
            kotlin.jvm.internal.G.m(entryB);
            if (state.compareTo(entryB.getValue().f113971a) < 0) {
                i(b10);
            }
            Map.Entry<A, b> entryH = this.f113963c.h();
            if (!this.f113968h && entryH != null && this.f113964d.compareTo(entryH.getValue().f113971a) > 0) {
                m(b10);
            }
        }
        this.f113968h = false;
        this.f113970j.setValue(d());
    }

    public D(B b10, boolean z10) {
        this.f113962b = z10;
        this.f113963c = new C5286a<>();
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.f113964d = state;
        this.f113969i = new ArrayList<>();
        this.f113965e = new WeakReference<>(b10);
        this.f113970j = kotlinx.coroutines.flow.v.a(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D(@NotNull B provider) {
        this(provider, true);
        kotlin.jvm.internal.G.p(provider, "provider");
    }
}
