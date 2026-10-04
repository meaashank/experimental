package S1;

import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.G;
import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.L;
import kotlinx.coroutines.Y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f68110a = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    @NotNull
    public static final a a(@NotNull L l10) {
        G.p(l10, "<this>");
        return new a(l10);
    }

    @NotNull
    public static final a b() {
        kotlin.coroutines.i iVarZ2;
        try {
            iVarZ2 = C5052b0.e().Z2();
        } catch (IllegalStateException unused) {
            iVarZ2 = EmptyCoroutineContext.f217673a;
        } catch (NotImplementedError unused2) {
            iVarZ2 = EmptyCoroutineContext.f217673a;
        }
        return new a(iVarZ2.plus(Y0.c(null, 1, null)));
    }
}
