package com.unity3d.services.core.domain;

import com.unity3d.services.core.domain.task.InitializationException;
import kotlin.Result;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class ResultExtensionsKt {
    public static final <E extends Exception> E getCustomExceptionOrNull(Object obj) {
        Result.e(obj);
        G.P();
        throw null;
    }

    public static final <E extends Exception> E getCustomExceptionOrThrow(Object obj) {
        Result.e(obj);
        G.P();
        throw null;
    }

    @Nullable
    public static final InitializationException getInitializationExceptionOrNull(@NotNull Object obj) {
        Throwable thE = Result.e(obj);
        if (thE instanceof InitializationException) {
            return (InitializationException) thE;
        }
        return null;
    }

    @NotNull
    public static final InitializationException getInitializationExceptionOrThrow(@NotNull Object obj) {
        Throwable thE = Result.e(obj);
        if (thE instanceof InitializationException) {
            return (InitializationException) thE;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }
}
