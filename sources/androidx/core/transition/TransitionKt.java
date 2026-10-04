package androidx.core.transition;

import android.transition.Transition;
import ed.l;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n1#1,69:1\n47#1,9:70\n66#1,2:79\n47#1,9:81\n66#1,2:90\n47#1,9:92\n66#1,2:101\n47#1,9:103\n66#1,2:112\n47#1,9:114\n66#1,2:123\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n24#1:70,9\n24#1:79,2\n29#1:81,9\n29#1:90,2\n34#1:92,9\n34#1:101,2\n39#1:103,9\n39#1:112,2\n44#1:114,9\n44#1:123,2\n*E\n"})
public final class TransitionKt {

    public static final class a implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Transition, L0> f111353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Transition, L0> f111354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<Transition, L0> f111355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<Transition, L0> f111356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l<Transition, L0> f111357e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Transition, L0> lVar, l<? super Transition, L0> lVar2, l<? super Transition, L0> lVar3, l<? super Transition, L0> lVar4, l<? super Transition, L0> lVar5) {
            this.f111353a = lVar;
            this.f111354b = lVar2;
            this.f111355c = lVar3;
            this.f111356d = lVar4;
            this.f111357e = lVar5;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            this.f111356d.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f111353a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.f111355c.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.f111354b.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            this.f111357e.invoke(transition);
        }
    }

    @V({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,64:1\n48#2:65\n51#3:66\n52#4:67\n49#5:68\n*E\n"})
    public static final class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f111363a;

        public b(l lVar) {
            this.f111363a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            this.f111363a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    @V({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,64:1\n51#2:65\n52#3:66\n50#4:67\n49#5:68\n*E\n"})
    public static final class c implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f111364a;

        public c(l lVar) {
            this.f111364a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f111364a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    @V({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,64:1\n48#2:65\n51#3:66\n50#4:67\n49#5:68\n*E\n"})
    public static final class d implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f111365a;

        public d(l lVar) {
            this.f111365a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.f111365a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    @V({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,64:1\n48#2:65\n52#3:66\n50#4:67\n49#5:68\n*E\n"})
    public static final class e implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f111366a;

        public e(l lVar) {
            this.f111366a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.f111366a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    @V({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n*L\n1#1,64:1\n48#2:65\n51#3:66\n52#4:67\n50#5:68\n*E\n"})
    public static final class f implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f111367a;

        public f(l lVar) {
            this.f111367a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            this.f111367a.invoke(transition);
        }
    }

    @NotNull
    public static final Transition.TransitionListener a(@NotNull Transition transition, @NotNull l<? super Transition, L0> lVar, @NotNull l<? super Transition, L0> lVar2, @NotNull l<? super Transition, L0> lVar3, @NotNull l<? super Transition, L0> lVar4, @NotNull l<? super Transition, L0> lVar5) {
        a aVar = new a(lVar, lVar4, lVar5, lVar3, lVar2);
        transition.addListener(aVar);
        return aVar;
    }

    public static /* synthetic */ Transition.TransitionListener b(Transition transition, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new l<Transition, L0>() { // from class: androidx.core.transition.TransitionKt$addListener$1
                public final void e(Transition transition2) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Transition transition2) {
                    return L0.f217464a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            lVar2 = new l<Transition, L0>() { // from class: androidx.core.transition.TransitionKt$addListener$2
                public final void e(Transition transition2) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Transition transition2) {
                    return L0.f217464a;
                }
            };
        }
        l lVar6 = lVar2;
        if ((i10 & 4) != 0) {
            lVar3 = new l<Transition, L0>() { // from class: androidx.core.transition.TransitionKt$addListener$3
                public final void e(Transition transition2) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Transition transition2) {
                    return L0.f217464a;
                }
            };
        }
        if ((i10 & 8) != 0) {
            lVar4 = new l<Transition, L0>() { // from class: androidx.core.transition.TransitionKt$addListener$4
                public final void e(Transition transition2) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Transition transition2) {
                    return L0.f217464a;
                }
            };
        }
        if ((i10 & 16) != 0) {
            lVar5 = new l<Transition, L0>() { // from class: androidx.core.transition.TransitionKt$addListener$5
                public final void e(Transition transition2) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Transition transition2) {
                    return L0.f217464a;
                }
            };
        }
        a aVar = new a(lVar, lVar4, lVar5, lVar3, lVar6);
        transition.addListener(aVar);
        return aVar;
    }

    @NotNull
    public static final Transition.TransitionListener c(@NotNull Transition transition, @NotNull l<? super Transition, L0> lVar) {
        b bVar = new b(lVar);
        transition.addListener(bVar);
        return bVar;
    }

    @NotNull
    public static final Transition.TransitionListener d(@NotNull Transition transition, @NotNull l<? super Transition, L0> lVar) {
        c cVar = new c(lVar);
        transition.addListener(cVar);
        return cVar;
    }

    @NotNull
    public static final Transition.TransitionListener e(@NotNull Transition transition, @NotNull l<? super Transition, L0> lVar) {
        d dVar = new d(lVar);
        transition.addListener(dVar);
        return dVar;
    }

    @NotNull
    public static final Transition.TransitionListener f(@NotNull Transition transition, @NotNull l<? super Transition, L0> lVar) {
        e eVar = new e(lVar);
        transition.addListener(eVar);
        return eVar;
    }

    @NotNull
    public static final Transition.TransitionListener g(@NotNull Transition transition, @NotNull l<? super Transition, L0> lVar) {
        f fVar = new f(lVar);
        transition.addListener(fVar);
        return fVar;
    }
}
