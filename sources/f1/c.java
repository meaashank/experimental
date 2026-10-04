package f1;

import java.util.ArrayList;
import kotlin.collections.I;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<b> f200383a = new ArrayList<>();

    public final void a(@NotNull b listener) {
        G.p(listener, "listener");
        this.f200383a.add(listener);
    }

    public final void b() {
        for (int iL = I.L(this.f200383a); -1 < iL; iL--) {
            this.f200383a.get(iL).e();
        }
    }

    public final void c(@NotNull b listener) {
        G.p(listener, "listener");
        this.f200383a.remove(listener);
    }
}
