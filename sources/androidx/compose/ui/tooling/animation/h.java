package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.r;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class h<T> implements ComposeAnimation, g<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f105334e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Transition<T> f105335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Set<Object> f105336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f105337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ComposeAnimationType f105338d = ComposeAnimationType.TRANSITION_ANIMATION;

    public h(@NotNull Transition<T> transition, @NotNull Set<? extends Object> set, @Nullable String str) {
        this.f105335a = transition;
        this.f105336b = set;
        this.f105337c = str;
    }

    @Override // androidx.compose.ui.tooling.animation.g
    @NotNull
    public Transition<T> a() {
        return this.f105335a;
    }

    public Object b() {
        return this.f105335a;
    }

    @Nullable
    public String c() {
        return this.f105337c;
    }

    @NotNull
    public Set<Object> d() {
        return this.f105336b;
    }

    @NotNull
    public ComposeAnimationType e() {
        return this.f105338d;
    }
}
