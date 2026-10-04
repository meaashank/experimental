package kotlinx.coroutines.rx3;

import kotlinx.coroutines.A0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Bc.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final A0 f220613a;

    public a(@NotNull A0 a02) {
        this.f220613a = a02;
    }

    @Override // Bc.f
    public void cancel() {
        A0.a.b(this.f220613a, null, 1, null);
    }
}
