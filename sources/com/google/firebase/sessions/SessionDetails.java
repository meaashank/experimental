package com.google.firebase.sessions;

import androidx.collection.C1550p;
import androidx.compose.foundation.text.modifiers.l;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionDetails {

    @NotNull
    private final String firstSessionId;

    @NotNull
    private final String sessionId;
    private final int sessionIndex;
    private final long sessionStartTimestampUs;

    public SessionDetails(@NotNull String sessionId, @NotNull String firstSessionId, int i10, long j10) {
        G.p(sessionId, "sessionId");
        G.p(firstSessionId, "firstSessionId");
        this.sessionId = sessionId;
        this.firstSessionId = firstSessionId;
        this.sessionIndex = i10;
        this.sessionStartTimestampUs = j10;
    }

    public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, String str2, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionDetails.sessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionDetails.firstSessionId;
        }
        if ((i11 & 4) != 0) {
            i10 = sessionDetails.sessionIndex;
        }
        if ((i11 & 8) != 0) {
            j10 = sessionDetails.sessionStartTimestampUs;
        }
        int i12 = i10;
        return sessionDetails.copy(str, str2, i12, j10);
    }

    @NotNull
    public final String component1() {
        return this.sessionId;
    }

    @NotNull
    public final String component2() {
        return this.firstSessionId;
    }

    public final int component3() {
        return this.sessionIndex;
    }

    public final long component4() {
        return this.sessionStartTimestampUs;
    }

    @NotNull
    public final SessionDetails copy(@NotNull String sessionId, @NotNull String firstSessionId, int i10, long j10) {
        G.p(sessionId, "sessionId");
        G.p(firstSessionId, "firstSessionId");
        return new SessionDetails(sessionId, firstSessionId, i10, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) obj;
        return G.g(this.sessionId, sessionDetails.sessionId) && G.g(this.firstSessionId, sessionDetails.firstSessionId) && this.sessionIndex == sessionDetails.sessionIndex && this.sessionStartTimestampUs == sessionDetails.sessionStartTimestampUs;
    }

    @NotNull
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    public int hashCode() {
        return C1550p.a(this.sessionStartTimestampUs) + ((l.a(this.firstSessionId, this.sessionId.hashCode() * 31, 31) + this.sessionIndex) * 31);
    }

    @NotNull
    public String toString() {
        return "SessionDetails(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", sessionStartTimestampUs=" + this.sessionStartTimestampUs + ')';
    }
}
