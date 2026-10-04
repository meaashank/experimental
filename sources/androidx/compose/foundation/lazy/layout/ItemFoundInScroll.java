package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C1591j;
import androidx.compose.animation.core.C1595l;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class ItemFoundInScroll extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C1591j<Float, C1595l> f91550b;

    public ItemFoundInScroll(int i10, @NotNull C1591j<Float, C1595l> c1591j) {
        this.f91549a = i10;
        this.f91550b = c1591j;
    }

    public final int d() {
        return this.f91549a;
    }

    @NotNull
    public final C1591j<Float, C1595l> g() {
        return this.f91550b;
    }
}
