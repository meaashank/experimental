package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.r;
import i0.C4542a;
import java.util.Set;
import kotlin.collections.B;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class c implements ComposeAnimation {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f105292e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Transition<Boolean> f105293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f105294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ComposeAnimationType f105295c = ComposeAnimationType.ANIMATED_VISIBILITY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Set<C4542a> f105296d;

    public c(@NotNull Transition<Boolean> transition, @Nullable String str) {
        this.f105293a = transition;
        this.f105294b = str;
        C4542a.C0747a c0747a = C4542a.f202768b;
        c0747a.getClass();
        C4542a c4542a = new C4542a(C4542a.f202769c);
        c0747a.getClass();
        this.f105296d = B.Fz(new C4542a[]{c4542a, new C4542a(C4542a.f202770d)});
    }

    public static /* synthetic */ void d() {
    }

    @NotNull
    public Transition<Boolean> a() {
        return this.f105293a;
    }

    public Object b() {
        return this.f105293a;
    }

    @Nullable
    public final Transition<Object> c() {
        Object objB3 = U.b3(this.f105293a.f87909j, 0);
        if (objB3 instanceof Transition) {
            return (Transition) objB3;
        }
        return null;
    }

    @Nullable
    public String e() {
        return this.f105294b;
    }

    @NotNull
    public Set<C4542a> f() {
        return this.f105296d;
    }

    @NotNull
    public ComposeAnimationType g() {
        return this.f105295c;
    }
}
