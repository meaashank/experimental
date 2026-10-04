package androidx.core.animation;

import android.animation.Animator;
import ed.l;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,123:1\n85#1,18:124\n85#1,18:142\n85#1,18:160\n85#1,18:178\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n29#1:124,18\n39#1:142,18\n49#1:160,18\n58#1:178,18\n*E\n"})
public final class AnimatorKt {

    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Animator, L0> f110620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Animator, L0> f110621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<Animator, L0> f110622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<Animator, L0> f110623d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Animator, L0> lVar, l<? super Animator, L0> lVar2, l<? super Animator, L0> lVar3, l<? super Animator, L0> lVar4) {
            this.f110620a = lVar;
            this.f110621b = lVar2;
            this.f110622c = lVar3;
            this.f110623d = lVar4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f110622c.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f110621b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.f110620a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f110623d.invoke(animator);
        }
    }

    public static final class b implements Animator.AnimatorPauseListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Animator, L0> f110630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Animator, L0> f110631b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super Animator, L0> lVar, l<? super Animator, L0> lVar2) {
            this.f110630a = lVar;
            this.f110631b = lVar2;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f110630a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f110631b.invoke(animator);
        }
    }

    @V({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,99:1\n89#2:100\n86#3:101\n87#4:102\n*E\n"})
    public static final class c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f110632a;

        public c(l lVar) {
            this.f110632a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f110632a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @V({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,99:1\n89#2:100\n88#3:101\n87#4:102\n*E\n"})
    public static final class d implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f110633a;

        public d(l lVar) {
            this.f110633a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f110633a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @V({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,99:1\n86#2:100\n88#3:101\n87#4:102\n*E\n"})
    public static final class e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f110634a;

        public e(l lVar) {
            this.f110634a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.f110634a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @V({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n*L\n1#1,99:1\n89#2:100\n86#3:101\n88#4:102\n*E\n"})
    public static final class f implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f110635a;

        public f(l lVar) {
            this.f110635a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f110635a.invoke(animator);
        }
    }

    @NotNull
    public static final Animator.AnimatorListener a(@NotNull Animator animator, @NotNull l<? super Animator, L0> lVar, @NotNull l<? super Animator, L0> lVar2, @NotNull l<? super Animator, L0> lVar3, @NotNull l<? super Animator, L0> lVar4) {
        a aVar = new a(lVar4, lVar, lVar3, lVar2);
        animator.addListener(aVar);
        return aVar;
    }

    public static /* synthetic */ Animator.AnimatorListener b(Animator animator, l lVar, l lVar2, l lVar3, l lVar4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new l<Animator, L0>() { // from class: androidx.core.animation.AnimatorKt$addListener$1
                public final void e(Animator animator2) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Animator animator2) {
                    return L0.f217464a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            lVar2 = new l<Animator, L0>() { // from class: androidx.core.animation.AnimatorKt$addListener$2
                public final void e(Animator animator2) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Animator animator2) {
                    return L0.f217464a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            lVar3 = new l<Animator, L0>() { // from class: androidx.core.animation.AnimatorKt$addListener$3
                public final void e(Animator animator2) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Animator animator2) {
                    return L0.f217464a;
                }
            };
        }
        if ((i10 & 8) != 0) {
            lVar4 = new l<Animator, L0>() { // from class: androidx.core.animation.AnimatorKt$addListener$4
                public final void e(Animator animator2) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Animator animator2) {
                    return L0.f217464a;
                }
            };
        }
        a aVar = new a(lVar4, lVar, lVar3, lVar2);
        animator.addListener(aVar);
        return aVar;
    }

    @NotNull
    public static final Animator.AnimatorPauseListener c(@NotNull Animator animator, @NotNull l<? super Animator, L0> lVar, @NotNull l<? super Animator, L0> lVar2) {
        b bVar = new b(lVar2, lVar);
        animator.addPauseListener(bVar);
        return bVar;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener d(Animator animator, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new l<Animator, L0>() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$1
                public final void e(Animator animator2) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Animator animator2) {
                    return L0.f217464a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            lVar2 = new l<Animator, L0>() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$2
                public final void e(Animator animator2) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Animator animator2) {
                    return L0.f217464a;
                }
            };
        }
        return c(animator, lVar, lVar2);
    }

    @NotNull
    public static final Animator.AnimatorListener e(@NotNull Animator animator, @NotNull l<? super Animator, L0> lVar) {
        c cVar = new c(lVar);
        animator.addListener(cVar);
        return cVar;
    }

    @NotNull
    public static final Animator.AnimatorListener f(@NotNull Animator animator, @NotNull l<? super Animator, L0> lVar) {
        d dVar = new d(lVar);
        animator.addListener(dVar);
        return dVar;
    }

    @NotNull
    public static final Animator.AnimatorPauseListener g(@NotNull Animator animator, @NotNull l<? super Animator, L0> lVar) {
        return d(animator, null, lVar, 1, null);
    }

    @NotNull
    public static final Animator.AnimatorListener h(@NotNull Animator animator, @NotNull l<? super Animator, L0> lVar) {
        e eVar = new e(lVar);
        animator.addListener(eVar);
        return eVar;
    }

    @NotNull
    public static final Animator.AnimatorPauseListener i(@NotNull Animator animator, @NotNull l<? super Animator, L0> lVar) {
        return d(animator, lVar, null, 2, null);
    }

    @NotNull
    public static final Animator.AnimatorListener j(@NotNull Animator animator, @NotNull l<? super Animator, L0> lVar) {
        f fVar = new f(lVar);
        animator.addListener(fVar);
        return fVar;
    }
}
