package kotlinx.coroutines;

import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f218791a = kotlinx.coroutines.internal.W.d("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final U f218792b = c();

    @NotNull
    public static final U a() {
        return f218792b;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final U c() {
        if (!f218791a) {
            return P.f218782i;
        }
        J0 j0E = C5052b0.e();
        return ((j0E.Z2() instanceof kotlinx.coroutines.internal.E) || !(j0E instanceof U)) ? P.f218782i : (U) j0E;
    }
}
