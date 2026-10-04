package com.google.firebase.sessions.api;

import androidx.compose.runtime.R0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface SessionSubscriber {

    public enum Name {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    public static final class SessionDetails {

        @NotNull
        private final String sessionId;

        public SessionDetails(@NotNull String sessionId) {
            G.p(sessionId, "sessionId");
            this.sessionId = sessionId;
        }

        public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sessionDetails.sessionId;
            }
            return sessionDetails.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.sessionId;
        }

        @NotNull
        public final SessionDetails copy(@NotNull String sessionId) {
            G.p(sessionId, "sessionId");
            return new SessionDetails(sessionId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionDetails) && G.g(this.sessionId, ((SessionDetails) obj).sessionId);
        }

        @NotNull
        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        @NotNull
        public String toString() {
            return R0.a(new StringBuilder("SessionDetails(sessionId="), this.sessionId, ')');
        }
    }

    @NotNull
    Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(@NotNull SessionDetails sessionDetails);
}
