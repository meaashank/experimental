package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class InitializationException extends Exception {

    @NotNull
    private final Configuration config;

    @NotNull
    private final ErrorState errorState;

    @NotNull
    private final Exception originalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(@NotNull ErrorState errorState, @NotNull Exception originalException, @NotNull Configuration config) {
        super(originalException);
        G.p(errorState, "errorState");
        G.p(originalException, "originalException");
        G.p(config, "config");
        this.errorState = errorState;
        this.originalException = originalException;
        this.config = config;
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, ErrorState errorState, Exception exc, Configuration configuration, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            errorState = initializationException.errorState;
        }
        if ((i10 & 2) != 0) {
            exc = initializationException.originalException;
        }
        if ((i10 & 4) != 0) {
            configuration = initializationException.config;
        }
        return initializationException.copy(errorState, exc, configuration);
    }

    @NotNull
    public final ErrorState component1() {
        return this.errorState;
    }

    @NotNull
    public final Exception component2() {
        return this.originalException;
    }

    @NotNull
    public final Configuration component3() {
        return this.config;
    }

    @NotNull
    public final InitializationException copy(@NotNull ErrorState errorState, @NotNull Exception originalException, @NotNull Configuration config) {
        G.p(errorState, "errorState");
        G.p(originalException, "originalException");
        G.p(config, "config");
        return new InitializationException(errorState, originalException, config);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        return G.g(this.errorState, initializationException.errorState) && G.g(this.originalException, initializationException.originalException) && G.g(this.config, initializationException.config);
    }

    @NotNull
    public final Configuration getConfig() {
        return this.config;
    }

    @NotNull
    public final ErrorState getErrorState() {
        return this.errorState;
    }

    @NotNull
    public final Exception getOriginalException() {
        return this.originalException;
    }

    public int hashCode() {
        ErrorState errorState = this.errorState;
        int iHashCode = (errorState != null ? errorState.hashCode() : 0) * 31;
        Exception exc = this.originalException;
        int iHashCode2 = (iHashCode + (exc != null ? exc.hashCode() : 0)) * 31;
        Configuration configuration = this.config;
        return iHashCode2 + (configuration != null ? configuration.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "InitializationException(errorState=" + this.errorState + ", originalException=" + this.originalException + ", config=" + this.config + ")";
    }
}
