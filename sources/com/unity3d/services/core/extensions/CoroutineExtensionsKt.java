package com.unity3d.services.core.extensions;

import ed.InterfaceC4376a;
import java.util.concurrent.CancellationException;
import kotlin.C4885d0;
import kotlin.Result;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class CoroutineExtensionsKt {
    @NotNull
    public static final <R> Object runReturnSuspendCatching(@NotNull InterfaceC4376a<? extends R> block) {
        Object objA;
        Throwable thE;
        G.p(block, "block");
        try {
            objA = block.invoke();
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            objA = C4885d0.a(th);
        }
        return ((objA instanceof Result.Failure) && (thE = Result.e(objA)) != null) ? C4885d0.a(thE) : objA;
    }

    @NotNull
    public static final <R> Object runSuspendCatching(@NotNull InterfaceC4376a<? extends R> block) {
        G.p(block, "block");
        try {
            return block.invoke();
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            return C4885d0.a(th);
        }
    }
}
