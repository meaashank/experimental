package com.tonyodev.fetch2.exception;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class FetchException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchException(@NotNull String message) {
        super(message);
        G.p(message, "message");
    }
}
