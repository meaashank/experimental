package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.util.InterfaceC2427d;
import androidx.lifecycle.InterfaceC2611y;
import androidx.lifecycle.Lifecycle;
import e.InterfaceC4345t;
import e.T;
import e.f0;
import ed.InterfaceC4376a;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.L0;
import kotlin.collections.C4871m;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n1747#2,3:431\n533#2,6:434\n533#2,6:440\n533#2,6:446\n533#2,6:452\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n114#1:431,3\n233#1:434,6\n251#1:440,6\n271#1:446,6\n290#1:452,6\n*E\n"})
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Runnable f84865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final InterfaceC2427d<Boolean> f84866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C4871m<C> f84867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public C f84868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public OnBackInvokedCallback f84869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public OnBackInvokedDispatcher f84870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f84872h;

    @T(33)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f84878a = new a();

        public static final void c(InterfaceC4376a onBackInvoked) {
            kotlin.jvm.internal.G.p(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        @InterfaceC4345t
        @NotNull
        public final OnBackInvokedCallback b(@NotNull final InterfaceC4376a<L0> onBackInvoked) {
            kotlin.jvm.internal.G.p(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.E
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.a.c(onBackInvoked);
                }
            };
        }

        @InterfaceC4345t
        public final void d(@NotNull Object dispatcher, int i10, @NotNull Object callback) {
            kotlin.jvm.internal.G.p(dispatcher, "dispatcher");
            kotlin.jvm.internal.G.p(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        @InterfaceC4345t
        public final void e(@NotNull Object dispatcher, @NotNull Object callback) {
            kotlin.jvm.internal.G.p(dispatcher, "dispatcher");
            kotlin.jvm.internal.G.p(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    @T(34)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f84879a = new b();

        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ed.l<C1478e, L0> f84880a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ed.l<C1478e, L0> f84881b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4376a<L0> f84882c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4376a<L0> f84883d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(ed.l<? super C1478e, L0> lVar, ed.l<? super C1478e, L0> lVar2, InterfaceC4376a<L0> interfaceC4376a, InterfaceC4376a<L0> interfaceC4376a2) {
                this.f84880a = lVar;
                this.f84881b = lVar2;
                this.f84882c = interfaceC4376a;
                this.f84883d = interfaceC4376a2;
            }

            public void onBackCancelled() {
                this.f84883d.invoke();
            }

            public void onBackInvoked() {
                this.f84882c.invoke();
            }

            public void onBackProgressed(@NotNull BackEvent backEvent) {
                kotlin.jvm.internal.G.p(backEvent, "backEvent");
                this.f84881b.invoke(new C1478e(backEvent));
            }

            public void onBackStarted(@NotNull BackEvent backEvent) {
                kotlin.jvm.internal.G.p(backEvent, "backEvent");
                this.f84880a.invoke(new C1478e(backEvent));
            }
        }

        @InterfaceC4345t
        @NotNull
        public final OnBackInvokedCallback a(@NotNull ed.l<? super C1478e, L0> onBackStarted, @NotNull ed.l<? super C1478e, L0> onBackProgressed, @NotNull InterfaceC4376a<L0> onBackInvoked, @NotNull InterfaceC4376a<L0> onBackCancelled) {
            kotlin.jvm.internal.G.p(onBackStarted, "onBackStarted");
            kotlin.jvm.internal.G.p(onBackProgressed, "onBackProgressed");
            kotlin.jvm.internal.G.p(onBackInvoked, "onBackInvoked");
            kotlin.jvm.internal.G.p(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    public final class c implements InterfaceC2611y, InterfaceC1479f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Lifecycle f84884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final C f84885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public InterfaceC1479f f84886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f84887d;

        public c(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, @NotNull Lifecycle lifecycle, C onBackPressedCallback) {
            kotlin.jvm.internal.G.p(lifecycle, "lifecycle");
            kotlin.jvm.internal.G.p(onBackPressedCallback, "onBackPressedCallback");
            this.f84887d = onBackPressedDispatcher;
            this.f84884a = lifecycle;
            this.f84885b = onBackPressedCallback;
            lifecycle.c(this);
        }

        @Override // androidx.activity.InterfaceC1479f
        public void cancel() {
            this.f84884a.g(this);
            this.f84885b.l(this);
            InterfaceC1479f interfaceC1479f = this.f84886c;
            if (interfaceC1479f != null) {
                interfaceC1479f.cancel();
            }
            this.f84886c = null;
        }

        @Override // androidx.lifecycle.InterfaceC2611y
        public void onStateChanged(@NotNull androidx.lifecycle.B source, @NotNull Lifecycle.Event event) {
            kotlin.jvm.internal.G.p(source, "source");
            kotlin.jvm.internal.G.p(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.f84886c = this.f84887d.j(this.f84885b);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC1479f interfaceC1479f = this.f84886c;
                if (interfaceC1479f != null) {
                    interfaceC1479f.cancel();
                }
            }
        }
    }

    public final class d implements InterfaceC1479f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C f84888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f84889b;

        public d(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, C onBackPressedCallback) {
            kotlin.jvm.internal.G.p(onBackPressedCallback, "onBackPressedCallback");
            this.f84889b = onBackPressedDispatcher;
            this.f84888a = onBackPressedCallback;
        }

        @Override // androidx.activity.InterfaceC1479f
        public void cancel() {
            this.f84889b.f84867c.remove(this.f84888a);
            if (kotlin.jvm.internal.G.g(this.f84889b.f84868d, this.f84888a)) {
                this.f84888a.f();
                this.f84889b.f84868d = null;
            }
            this.f84888a.l(this);
            InterfaceC4376a<L0> interfaceC4376a = this.f84888a.f84854c;
            if (interfaceC4376a != null) {
                interfaceC4376a.invoke();
            }
            this.f84888a.f84854c = null;
        }
    }

    @dd.k
    public OnBackPressedDispatcher() {
        this(null, 1, null);
    }

    @e.I
    public final void h(@NotNull C onBackPressedCallback) {
        kotlin.jvm.internal.G.p(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    @e.I
    public final void i(@NotNull androidx.lifecycle.B owner, @NotNull C onBackPressedCallback) {
        kotlin.jvm.internal.G.p(owner, "owner");
        kotlin.jvm.internal.G.p(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.d() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.d(new c(this, lifecycle, onBackPressedCallback));
        u();
        onBackPressedCallback.f84854c = new OnBackPressedDispatcher$addCallback$1(this);
    }

    @e.I
    @NotNull
    public final InterfaceC1479f j(@NotNull C onBackPressedCallback) {
        kotlin.jvm.internal.G.p(onBackPressedCallback, "onBackPressedCallback");
        this.f84867c.addLast(onBackPressedCallback);
        d dVar = new d(this, onBackPressedCallback);
        onBackPressedCallback.d(dVar);
        u();
        onBackPressedCallback.f84854c = new OnBackPressedDispatcher$addCancellableCallback$1(this);
        return dVar;
    }

    @e.I
    @f0
    public final void k() {
        o();
    }

    @e.I
    @f0
    public final void l(@NotNull C1478e backEvent) {
        kotlin.jvm.internal.G.p(backEvent, "backEvent");
        q(backEvent);
    }

    @e.I
    @f0
    public final void m(@NotNull C1478e backEvent) {
        kotlin.jvm.internal.G.p(backEvent, "backEvent");
        r(backEvent);
    }

    @e.I
    public final boolean n() {
        return this.f84872h;
    }

    @e.I
    public final void o() {
        C cPrevious;
        C4871m<C> c4871m = this.f84867c;
        ListIterator<C> listIterator = c4871m.listIterator(c4871m.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                cPrevious = null;
                break;
            } else {
                cPrevious = listIterator.previous();
                if (cPrevious.f84852a) {
                    break;
                }
            }
        }
        C c10 = cPrevious;
        this.f84868d = null;
        if (c10 != null) {
            c10.f();
        }
    }

    @e.I
    public final void p() {
        C cPrevious;
        C4871m<C> c4871m = this.f84867c;
        ListIterator<C> listIterator = c4871m.listIterator(c4871m.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                cPrevious = null;
                break;
            } else {
                cPrevious = listIterator.previous();
                if (cPrevious.f84852a) {
                    break;
                }
            }
        }
        C c10 = cPrevious;
        this.f84868d = null;
        if (c10 != null) {
            c10.g();
            return;
        }
        Runnable runnable = this.f84865a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @e.I
    public final void q(C1478e c1478e) {
        C cPrevious;
        C4871m<C> c4871m = this.f84867c;
        ListIterator<C> listIterator = c4871m.listIterator(c4871m.getSize());
        while (true) {
            if (!listIterator.hasPrevious()) {
                cPrevious = null;
                break;
            } else {
                cPrevious = listIterator.previous();
                if (cPrevious.f84852a) {
                    break;
                }
            }
        }
        C c10 = cPrevious;
        if (c10 != null) {
            c10.h(c1478e);
        }
    }

    @e.I
    public final void r(C1478e c1478e) {
        C cPrevious;
        C4871m<C> c4871m = this.f84867c;
        ListIterator<C> listIterator = c4871m.listIterator(c4871m.getSize());
        while (true) {
            if (!listIterator.hasPrevious()) {
                cPrevious = null;
                break;
            } else {
                cPrevious = listIterator.previous();
                if (cPrevious.f84852a) {
                    break;
                }
            }
        }
        C c10 = cPrevious;
        this.f84868d = c10;
        if (c10 != null) {
            c10.i(c1478e);
        }
    }

    @T(33)
    public final void s(@NotNull OnBackInvokedDispatcher invoker) {
        kotlin.jvm.internal.G.p(invoker, "invoker");
        this.f84870f = invoker;
        t(this.f84872h);
    }

    @T(33)
    public final void t(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f84870f;
        OnBackInvokedCallback onBackInvokedCallback = this.f84869e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f84871g) {
            a.f84878a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f84871g = true;
        } else {
            if (z10 || !this.f84871g) {
                return;
            }
            a.f84878a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f84871g = false;
        }
    }

    public final void u() {
        boolean z10 = this.f84872h;
        C4871m<C> c4871m = this.f84867c;
        boolean z11 = false;
        if (!D.a(c4871m) || !c4871m.isEmpty()) {
            Iterator<C> it = c4871m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f84852a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f84872h = z11;
        if (z11 != z10) {
            InterfaceC2427d<Boolean> interfaceC2427d = this.f84866b;
            if (interfaceC2427d != null) {
                interfaceC2427d.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                t(z11);
            }
        }
    }

    public OnBackPressedDispatcher(@Nullable Runnable runnable, @Nullable InterfaceC2427d<Boolean> interfaceC2427d) {
        this.f84865a = runnable;
        this.f84866b = interfaceC2427d;
        this.f84867c = new C4871m<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f84869e = i10 >= 34 ? b.f84879a.a(new ed.l<C1478e, L0>() { // from class: androidx.activity.OnBackPressedDispatcher.1
                {
                    super(1);
                }

                public final void e(@NotNull C1478e backEvent) {
                    kotlin.jvm.internal.G.p(backEvent, "backEvent");
                    OnBackPressedDispatcher.this.r(backEvent);
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(C1478e c1478e) {
                    e(c1478e);
                    return L0.f217464a;
                }
            }, new ed.l<C1478e, L0>() { // from class: androidx.activity.OnBackPressedDispatcher.2
                {
                    super(1);
                }

                public final void e(@NotNull C1478e backEvent) {
                    kotlin.jvm.internal.G.p(backEvent, "backEvent");
                    OnBackPressedDispatcher.this.q(backEvent);
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(C1478e c1478e) {
                    e(c1478e);
                    return L0.f217464a;
                }
            }, new InterfaceC4376a<L0>() { // from class: androidx.activity.OnBackPressedDispatcher.3
                {
                    super(0);
                }

                @Override // ed.InterfaceC4376a
                public /* bridge */ /* synthetic */ L0 invoke() {
                    invoke2();
                    return L0.f217464a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.p();
                }
            }, new InterfaceC4376a<L0>() { // from class: androidx.activity.OnBackPressedDispatcher.4
                {
                    super(0);
                }

                @Override // ed.InterfaceC4376a
                public /* bridge */ /* synthetic */ L0 invoke() {
                    invoke2();
                    return L0.f217464a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.o();
                }
            }) : a.f84878a.b(new InterfaceC4376a<L0>() { // from class: androidx.activity.OnBackPressedDispatcher.5
                {
                    super(0);
                }

                @Override // ed.InterfaceC4376a
                public /* bridge */ /* synthetic */ L0 invoke() {
                    invoke2();
                    return L0.f217464a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.p();
                }
            });
        }
    }

    @dd.k
    public OnBackPressedDispatcher(@Nullable Runnable runnable) {
        this(runnable, null);
    }

    public OnBackPressedDispatcher(Runnable runnable, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? null : runnable, null);
    }
}
