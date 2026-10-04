package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final G f100679a = new G();

    @InterfaceC4850b0
    public static /* synthetic */ void c() {
    }

    public final void a(@NotNull Canvas canvas, @NotNull ed.l<? super C0, kotlin.L0> lVar) {
        G g10 = this.f100679a;
        Canvas canvas2 = g10.f100692a;
        g10.f100692a = canvas;
        lVar.invoke(g10);
        this.f100679a.f100692a = canvas2;
    }

    @NotNull
    public final G b() {
        return this.f100679a;
    }
}
