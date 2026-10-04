package androidx.compose.ui.graphics.vector;

import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f101698b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ed.l<? super i, L0> f101699a;

    public i() {
    }

    public abstract void a(@NotNull androidx.compose.ui.graphics.drawscope.h hVar);

    @Nullable
    public ed.l<i, L0> b() {
        return this.f101699a;
    }

    public final void c() {
        ed.l<i, L0> lVarB = b();
        if (lVarB != null) {
            lVarB.invoke(this);
        }
    }

    public void d(@Nullable ed.l<? super i, L0> lVar) {
        this.f101699a = lVar;
    }

    public i(C4969v c4969v) {
    }
}
