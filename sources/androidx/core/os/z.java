package androidx.core.os;

import android.os.OutcomeReceiver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@e.T(31)
public final class z {
    @e.T(31)
    @NotNull
    public static final <R, E extends Throwable> OutcomeReceiver a(@NotNull kotlin.coroutines.e<? super R> eVar) {
        return y.a(new ContinuationOutcomeReceiver(eVar));
    }
}
