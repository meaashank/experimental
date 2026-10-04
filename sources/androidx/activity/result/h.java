package androidx.activity.result;

import androidx.core.app.C2382e;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final void a(@NotNull g<Void> gVar, @Nullable C2382e c2382e) {
        gVar.c(null, c2382e);
    }

    public static void b(g gVar, C2382e c2382e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2382e = null;
        }
        gVar.c(null, c2382e);
    }

    @dd.j(name = "launchUnit")
    public static final void c(@NotNull g<L0> gVar, @Nullable C2382e c2382e) {
        gVar.c(L0.f217464a, c2382e);
    }

    public static /* synthetic */ void d(g gVar, C2382e c2382e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2382e = null;
        }
        c(gVar, c2382e);
    }
}
