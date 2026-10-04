package androidx.activity.compose;

import androidx.activity.result.g;
import androidx.core.app.C2382e;
import kotlin.L0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class b<I> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public g<I> f84994a;

    @Nullable
    public final g<I> a() {
        return this.f84994a;
    }

    public final void b(@Nullable I i10, @Nullable C2382e c2382e) {
        L0 l02;
        g<I> gVar = this.f84994a;
        if (gVar != null) {
            gVar.c(i10, c2382e);
            l02 = L0.f217464a;
        } else {
            l02 = null;
        }
        if (l02 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void c(@Nullable g<I> gVar) {
        this.f84994a = gVar;
    }

    public final void d() {
        L0 l02;
        g<I> gVar = this.f84994a;
        if (gVar != null) {
            gVar.d();
            l02 = L0.f217464a;
        } else {
            l02 = null;
        }
        if (l02 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
