package androidx.compose.ui.focus;

import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class s implements A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f100667b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.l<p, L0> f100668a;

    /* JADX WARN: Multi-variable type inference failed */
    public s(@NotNull ed.l<? super p, L0> lVar) {
        this.f100668a = lVar;
    }

    @Override // androidx.compose.ui.focus.A
    public void a(@NotNull v vVar) {
        this.f100668a.invoke(new p(vVar));
    }

    @NotNull
    public final ed.l<p, L0> b() {
        return this.f100668a;
    }
}
