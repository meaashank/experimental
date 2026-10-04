package androidx.compose.ui;

import androidx.compose.runtime.D;
import androidx.compose.ui.node.W;
import androidx.compose.ui.platform.C2278s0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class CompositionLocalMapInjectionElement extends W<h> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100363d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final D f100364c;

    public CompositionLocalMapInjectionElement(@NotNull D d10) {
        this.f100364c = d10;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && G.g(((CompositionLocalMapInjectionElement) obj).f100364c, this.f100364c);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "<Injected CompositionLocalMap>";
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f100364c.hashCode();
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public h c() {
        return new h(this.f100364c);
    }

    @NotNull
    public final D j() {
        return this.f100364c;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull h hVar) {
        hVar.f3(this.f100364c);
    }
}
