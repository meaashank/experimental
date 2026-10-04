package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.C2407f;
import androidx.core.view.C2507z0;
import androidx.fragment.app.SpecialEffectsController;
import e.InterfaceC4335i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u1.C5637a;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n288#2,2:713\n533#2,6:715\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n69#1:711,2\n75#1:713,2\n166#1:715,6\n*E\n"})
public abstract class SpecialEffectsController {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f113710f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewGroup f113711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Operation> f113712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Operation> f113713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f113714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f113715e;

    @kotlin.jvm.internal.V({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n1855#2,2:711\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n607#1:711,2\n*E\n"})
    public static class Operation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public State f113716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public LifecycleImpact f113717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Fragment f113718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final List<Runnable> f113719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Set<C2407f> f113720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f113721f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f113722g;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            @NotNull
            public static final a Companion = new a();

            public static final class a {
                public a() {
                }

                @NotNull
                public final State a(@NotNull View view) {
                    kotlin.jvm.internal.G.p(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? State.INVISIBLE : b(view.getVisibility());
                }

                @dd.o
                @NotNull
                public final State b(int i10) {
                    if (i10 == 0) {
                        return State.VISIBLE;
                    }
                    if (i10 == 4) {
                        return State.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return State.GONE;
                    }
                    throw new IllegalArgumentException(android.support.v4.media.c.a("Unknown visibility ", i10));
                }

                public a(C4969v c4969v) {
                }
            }

            public /* synthetic */ class b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f113723a;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f113723a = iArr;
                }
            }

            @dd.o
            @NotNull
            public static final State from(int i10) {
                return Companion.b(i10);
            }

            public final void applyState(@NotNull View view) {
                kotlin.jvm.internal.G.p(view, "view");
                int i10 = b.f113723a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.X0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f113724a;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f113724a = iArr;
            }
        }

        public Operation(@NotNull State finalState, @NotNull LifecycleImpact lifecycleImpact, @NotNull Fragment fragment, @NotNull C2407f cancellationSignal) {
            kotlin.jvm.internal.G.p(finalState, "finalState");
            kotlin.jvm.internal.G.p(lifecycleImpact, "lifecycleImpact");
            kotlin.jvm.internal.G.p(fragment, "fragment");
            kotlin.jvm.internal.G.p(cancellationSignal, "cancellationSignal");
            this.f113716a = finalState;
            this.f113717b = lifecycleImpact;
            this.f113718c = fragment;
            this.f113719d = new ArrayList();
            this.f113720e = new LinkedHashSet();
            cancellationSignal.d(new C2407f.a() { // from class: androidx.fragment.app.e0
                @Override // androidx.core.os.C2407f.a
                public final void onCancel() {
                    SpecialEffectsController.Operation.b(this.f113847a);
                }
            });
        }

        public static final void b(Operation this$0) {
            kotlin.jvm.internal.G.p(this$0, "this$0");
            this$0.d();
        }

        public final void c(@NotNull Runnable listener) {
            kotlin.jvm.internal.G.p(listener, "listener");
            this.f113719d.add(listener);
        }

        public final void d() {
            if (this.f113721f) {
                return;
            }
            this.f113721f = true;
            if (this.f113720e.isEmpty()) {
                e();
                return;
            }
            Iterator it = kotlin.collections.U.e6(this.f113720e).iterator();
            while (it.hasNext()) {
                ((C2407f) it.next()).a();
            }
        }

        @InterfaceC4335i
        public void e() {
            if (this.f113722g) {
                return;
            }
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f113722g = true;
            Iterator<T> it = this.f113719d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(@NotNull C2407f signal) {
            kotlin.jvm.internal.G.p(signal, "signal");
            if (this.f113720e.remove(signal) && this.f113720e.isEmpty()) {
                e();
            }
        }

        @NotNull
        public final State g() {
            return this.f113716a;
        }

        @NotNull
        public final Fragment h() {
            return this.f113718c;
        }

        @NotNull
        public final LifecycleImpact i() {
            return this.f113717b;
        }

        public final boolean j() {
            return this.f113721f;
        }

        public final boolean k() {
            return this.f113722g;
        }

        public final void l(@NotNull C2407f signal) {
            kotlin.jvm.internal.G.p(signal, "signal");
            n();
            this.f113720e.add(signal);
        }

        public final void m(@NotNull State finalState, @NotNull LifecycleImpact lifecycleImpact) {
            kotlin.jvm.internal.G.p(finalState, "finalState");
            kotlin.jvm.internal.G.p(lifecycleImpact, "lifecycleImpact");
            int i10 = a.f113724a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f113716a == State.REMOVED) {
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f113718c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f113717b + " to ADDING.");
                    }
                    this.f113716a = State.VISIBLE;
                    this.f113717b = LifecycleImpact.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f113718c + " mFinalState = " + this.f113716a + " -> REMOVED. mLifecycleImpact  = " + this.f113717b + " to REMOVING.");
                }
                this.f113716a = State.REMOVED;
                this.f113717b = LifecycleImpact.REMOVING;
                return;
            }
            if (i10 == 3 && this.f113716a != State.REMOVED) {
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f113718c + " mFinalState = " + this.f113716a + " -> " + finalState + '.');
                }
                this.f113716a = finalState;
            }
        }

        public void n() {
        }

        public final void o(@NotNull State state) {
            kotlin.jvm.internal.G.p(state, "<set-?>");
            this.f113716a = state;
        }

        public final void p(@NotNull LifecycleImpact lifecycleImpact) {
            kotlin.jvm.internal.G.p(lifecycleImpact, "<set-?>");
            this.f113717b = lifecycleImpact;
        }

        @NotNull
        public String toString() {
            StringBuilder sbA = androidx.activity.result.i.a("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            sbA.append(this.f113716a);
            sbA.append(" lifecycleImpact = ");
            sbA.append(this.f113717b);
            sbA.append(" fragment = ");
            sbA.append(this.f113718c);
            sbA.append('}');
            return sbA.toString();
        }
    }

    public static final class a {
        public a() {
        }

        @dd.o
        @NotNull
        public final SpecialEffectsController a(@NotNull ViewGroup container, @NotNull FragmentManager fragmentManager) {
            kotlin.jvm.internal.G.p(container, "container");
            kotlin.jvm.internal.G.p(fragmentManager, "fragmentManager");
            f0 f0VarP0 = fragmentManager.P0();
            kotlin.jvm.internal.G.o(f0VarP0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, f0VarP0);
        }

        @dd.o
        @NotNull
        public final SpecialEffectsController b(@NotNull ViewGroup container, @NotNull f0 factory) {
            kotlin.jvm.internal.G.p(container, "container");
            kotlin.jvm.internal.G.p(factory, "factory");
            int i10 = C5637a.c.f239345b;
            Object tag = container.getTag(i10);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController specialEffectsControllerA = factory.a(container);
            container.setTag(i10, specialEffectsControllerA);
            return specialEffectsControllerA;
        }

        public a(C4969v c4969v) {
        }
    }

    public static final class b extends Operation {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final Q f113725h;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(@NotNull Operation.State finalState, @NotNull Operation.LifecycleImpact lifecycleImpact, @NotNull Q fragmentStateManager, @NotNull C2407f cancellationSignal) {
            kotlin.jvm.internal.G.p(finalState, "finalState");
            kotlin.jvm.internal.G.p(lifecycleImpact, "lifecycleImpact");
            kotlin.jvm.internal.G.p(fragmentStateManager, "fragmentStateManager");
            kotlin.jvm.internal.G.p(cancellationSignal, "cancellationSignal");
            Fragment fragmentK = fragmentStateManager.k();
            kotlin.jvm.internal.G.o(fragmentK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragmentK, cancellationSignal);
            this.f113725h = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void e() {
            super.e();
            this.f113725h.m();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void n() {
            Operation.LifecycleImpact lifecycleImpact = this.f113717b;
            if (lifecycleImpact != Operation.LifecycleImpact.ADDING) {
                if (lifecycleImpact == Operation.LifecycleImpact.REMOVING) {
                    Fragment fragmentK = this.f113725h.k();
                    kotlin.jvm.internal.G.o(fragmentK, "fragmentStateManager.fragment");
                    View viewRequireView = fragmentK.requireView();
                    kotlin.jvm.internal.G.o(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragmentK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentK2 = this.f113725h.k();
            kotlin.jvm.internal.G.o(fragmentK2, "fragmentStateManager.fragment");
            View viewFindFocus = fragmentK2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentK2.setFocusedView(viewFindFocus);
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK2);
                }
            }
            View viewRequireView2 = this.f113718c.requireView();
            kotlin.jvm.internal.G.o(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                this.f113725h.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentK2.getPostOnViewCreatedAlpha());
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113726a;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f113726a = iArr;
        }
    }

    public SpecialEffectsController(@NotNull ViewGroup container) {
        kotlin.jvm.internal.G.p(container, "container");
        this.f113711a = container;
        this.f113712b = new ArrayList();
        this.f113713c = new ArrayList();
    }

    public static final void d(SpecialEffectsController this$0, b operation) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(operation, "$operation");
        if (this$0.f113712b.contains(operation)) {
            Operation.State state = operation.f113716a;
            View view = operation.f113718c.mView;
            kotlin.jvm.internal.G.o(view, "operation.fragment.mView");
            state.applyState(view);
        }
    }

    public static final void e(SpecialEffectsController this$0, b operation) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(operation, "$operation");
        this$0.f113712b.remove(operation);
        this$0.f113713c.remove(operation);
    }

    @dd.o
    @NotNull
    public static final SpecialEffectsController r(@NotNull ViewGroup viewGroup, @NotNull FragmentManager fragmentManager) {
        return f113710f.a(viewGroup, fragmentManager);
    }

    @dd.o
    @NotNull
    public static final SpecialEffectsController s(@NotNull ViewGroup viewGroup, @NotNull f0 f0Var) {
        return f113710f.b(viewGroup, f0Var);
    }

    public final void c(Operation.State state, Operation.LifecycleImpact lifecycleImpact, Q q10) {
        synchronized (this.f113712b) {
            C2407f c2407f = new C2407f();
            Fragment fragmentK = q10.k();
            kotlin.jvm.internal.G.o(fragmentK, "fragmentStateManager.fragment");
            Operation operationL = l(fragmentK);
            if (operationL != null) {
                operationL.m(state, lifecycleImpact);
                return;
            }
            final b bVar = new b(state, lifecycleImpact, q10, c2407f);
            this.f113712b.add(bVar);
            bVar.c(new Runnable() { // from class: androidx.fragment.app.c0
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.d(this.f113836a, bVar);
                }
            });
            bVar.c(new Runnable() { // from class: androidx.fragment.app.d0
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.e(this.f113842a, bVar);
                }
            });
        }
    }

    public final void f(@NotNull Operation.State finalState, @NotNull Q fragmentStateManager) {
        kotlin.jvm.internal.G.p(finalState, "finalState");
        kotlin.jvm.internal.G.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        c(finalState, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void g(@NotNull Q fragmentStateManager) {
        kotlin.jvm.internal.G.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        c(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void h(@NotNull Q fragmentStateManager) {
        kotlin.jvm.internal.G.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        c(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    public final void i(@NotNull Q fragmentStateManager) {
        kotlin.jvm.internal.G.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        c(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public abstract void j(@NotNull List<Operation> list, boolean z10);

    public final void k() {
        if (this.f113715e) {
            return;
        }
        if (!C2507z0.R0(this.f113711a)) {
            n();
            this.f113714d = false;
            return;
        }
        synchronized (this.f113712b) {
            try {
                if (!this.f113712b.isEmpty()) {
                    List listD6 = kotlin.collections.U.d6(this.f113713c);
                    this.f113713c.clear();
                    ArrayList arrayList = (ArrayList) listD6;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Operation operation = (Operation) obj;
                        if (FragmentManager.X0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                        }
                        operation.d();
                        if (!operation.f113722g) {
                            this.f113713c.add(operation);
                        }
                    }
                    u();
                    List<Operation> listD62 = kotlin.collections.U.d6(this.f113712b);
                    this.f113712b.clear();
                    this.f113713c.addAll(listD62);
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    ArrayList arrayList2 = (ArrayList) listD62;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        ((Operation) obj2).n();
                    }
                    j(listD62, this.f113714d);
                    this.f113714d = false;
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Operation l(Fragment fragment) {
        Object next;
        Iterator<T> it = this.f113712b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Operation operation = (Operation) next;
            if (kotlin.jvm.internal.G.g(operation.f113718c, fragment) && !operation.f113721f) {
                break;
            }
        }
        return (Operation) next;
    }

    public final Operation m(Fragment fragment) {
        Object next;
        Iterator<T> it = this.f113713c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Operation operation = (Operation) next;
            if (kotlin.jvm.internal.G.g(operation.f113718c, fragment) && !operation.f113721f) {
                break;
            }
        }
        return (Operation) next;
    }

    public final void n() {
        String str;
        String str2;
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zR0 = C2507z0.R0(this.f113711a);
        synchronized (this.f113712b) {
            try {
                u();
                Iterator<Operation> it = this.f113712b.iterator();
                while (it.hasNext()) {
                    it.next().n();
                }
                ArrayList arrayList = (ArrayList) kotlin.collections.U.d6(this.f113713c);
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    Operation operation = (Operation) obj;
                    if (FragmentManager.X0(2)) {
                        if (zR0) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f113711a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + operation);
                    }
                    operation.d();
                }
                ArrayList arrayList2 = (ArrayList) kotlin.collections.U.d6(this.f113712b);
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    Operation operation2 = (Operation) obj2;
                    if (FragmentManager.X0(2)) {
                        if (zR0) {
                            str = "";
                        } else {
                            str = "Container " + this.f113711a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + operation2);
                    }
                    operation2.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.f113715e) {
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f113715e = false;
            k();
        }
    }

    @Nullable
    public final Operation.LifecycleImpact p(@NotNull Q fragmentStateManager) {
        kotlin.jvm.internal.G.p(fragmentStateManager, "fragmentStateManager");
        Fragment fragmentK = fragmentStateManager.k();
        kotlin.jvm.internal.G.o(fragmentK, "fragmentStateManager.fragment");
        Operation operationL = l(fragmentK);
        Operation.LifecycleImpact lifecycleImpact = operationL != null ? operationL.f113717b : null;
        Operation operationM = m(fragmentK);
        Operation.LifecycleImpact lifecycleImpact2 = operationM != null ? operationM.f113717b : null;
        int i10 = lifecycleImpact == null ? -1 : c.f113726a[lifecycleImpact.ordinal()];
        return (i10 == -1 || i10 == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    @NotNull
    public final ViewGroup q() {
        return this.f113711a;
    }

    public final void t() {
        Operation operationPrevious;
        synchronized (this.f113712b) {
            try {
                u();
                List<Operation> list = this.f113712b;
                ListIterator<Operation> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        operationPrevious = null;
                        break;
                    }
                    operationPrevious = listIterator.previous();
                    Operation operation = operationPrevious;
                    Operation.State.a aVar = Operation.State.Companion;
                    View view = operation.f113718c.mView;
                    kotlin.jvm.internal.G.o(view, "operation.fragment.mView");
                    Operation.State stateA = aVar.a(view);
                    Operation.State state = operation.f113716a;
                    Operation.State state2 = Operation.State.VISIBLE;
                    if (state == state2 && stateA != state2) {
                        break;
                    }
                }
                Operation operation2 = operationPrevious;
                Fragment fragment = operation2 != null ? operation2.f113718c : null;
                this.f113715e = fragment != null ? fragment.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        for (Operation operation : this.f113712b) {
            if (operation.f113717b == Operation.LifecycleImpact.ADDING) {
                View viewRequireView = operation.f113718c.requireView();
                kotlin.jvm.internal.G.o(viewRequireView, "fragment.requireView()");
                operation.m(Operation.State.Companion.b(viewRequireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public final void v(boolean z10) {
        this.f113714d = z10;
    }
}
