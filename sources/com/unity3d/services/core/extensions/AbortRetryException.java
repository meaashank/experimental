package com.unity3d.services.core.extensions;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AbortRetryException extends Exception {
    private final String reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbortRetryException(@NotNull String reason) {
        super(reason);
        G.p(reason, "reason");
        this.reason = reason;
    }
}
