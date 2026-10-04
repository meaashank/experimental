package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import java.util.Set;
import kotlin.collections.x0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nInfiniteTransitionComposeAnimation.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransitionComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,69:1\n12744#2,2:70\n*S KotlinDebug\n*F\n+ 1 InfiniteTransitionComposeAnimation.android.kt\nandroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation\n*L\n51#1:70,2\n*E\n"})
@r(parameters = 0)
public final class e implements ComposeAnimation {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f105324f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f105325g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f105326h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f<Long> f105327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InfiniteTransition f105328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ComposeAnimationType f105329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Set<Object> f105330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f105331e;

    public static final class a {
        public a() {
        }

        public final boolean a() {
            return e.f105326h;
        }

        @Nullable
        public final e b(@NotNull AnimationSearch.g gVar) {
            if (e.f105326h) {
                return new e(gVar.f105225b, gVar.f105224a);
            }
            return null;
        }

        @TestOnly
        public final void c(boolean z10) {
            e.f105326h = z10;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        ComposeAnimationType[] composeAnimationTypeArrValues = ComposeAnimationType.values();
        int length = composeAnimationTypeArrValues.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (G.g(composeAnimationTypeArrValues[i10].name(), "INFINITE_TRANSITION")) {
                z10 = true;
                break;
            }
            i10++;
        }
        f105326h = z10;
    }

    public /* synthetic */ e(f fVar, InfiniteTransition infiniteTransition, C4969v c4969v) {
        this(fVar, infiniteTransition);
    }

    @NotNull
    public InfiniteTransition c() {
        return this.f105328b;
    }

    public Object d() {
        return this.f105328b;
    }

    @NotNull
    public String e() {
        return this.f105331e;
    }

    @NotNull
    public Set<Object> f() {
        return this.f105330d;
    }

    @NotNull
    public ComposeAnimationType g() {
        return this.f105329c;
    }

    public final void h(long j10) {
        this.f105327a.setValue(Long.valueOf(j10));
    }

    public e(f<Long> fVar, InfiniteTransition infiniteTransition) {
        this.f105327a = fVar;
        this.f105328b = infiniteTransition;
        this.f105329c = ComposeAnimationType.INFINITE_TRANSITION;
        this.f105330d = x0.f(0);
        this.f105331e = infiniteTransition.f87676a;
    }
}
