package kotlinx.coroutines;

import kotlinx.coroutines.internal.C5085t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class J0 extends CoroutineDispatcher {
    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public CoroutineDispatcher R2(int i10) {
        C5085t.a(i10);
        return this;
    }

    @NotNull
    public abstract J0 Z2();

    @InterfaceC5120x0
    @Nullable
    public final String d3() {
        J0 j0Z2;
        J0 j0E = C5052b0.e();
        if (this == j0E) {
            return "Dispatchers.Main";
        }
        try {
            j0Z2 = j0E.Z2();
        } catch (UnsupportedOperationException unused) {
            j0Z2 = null;
        }
        if (this == j0Z2) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        String strD3 = d3();
        if (strD3 != null) {
            return strD3;
        }
        return getClass().getSimpleName() + '@' + O.b(this);
    }
}
