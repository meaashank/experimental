package com.google.firebase.sessions;

import androidx.collection.C1550p;
import androidx.compose.foundation.text.modifiers.l;
import androidx.compose.runtime.R0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionInfo {

    @NotNull
    private final DataCollectionStatus dataCollectionStatus;
    private final long eventTimestampUs;

    @NotNull
    private final String firebaseAuthenticationToken;

    @NotNull
    private final String firebaseInstallationId;

    @NotNull
    private final String firstSessionId;

    @NotNull
    private final String sessionId;
    private final int sessionIndex;

    public SessionInfo(@NotNull String sessionId, @NotNull String firstSessionId, int i10, long j10, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String firebaseInstallationId, @NotNull String firebaseAuthenticationToken) {
        G.p(sessionId, "sessionId");
        G.p(firstSessionId, "firstSessionId");
        G.p(dataCollectionStatus, "dataCollectionStatus");
        G.p(firebaseInstallationId, "firebaseInstallationId");
        G.p(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.sessionId = sessionId;
        this.firstSessionId = firstSessionId;
        this.sessionIndex = i10;
        this.eventTimestampUs = j10;
        this.dataCollectionStatus = dataCollectionStatus;
        this.firebaseInstallationId = firebaseInstallationId;
        this.firebaseAuthenticationToken = firebaseAuthenticationToken;
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String str, String str2, int i10, long j10, DataCollectionStatus dataCollectionStatus, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionInfo.sessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionInfo.firstSessionId;
        }
        if ((i11 & 4) != 0) {
            i10 = sessionInfo.sessionIndex;
        }
        if ((i11 & 8) != 0) {
            j10 = sessionInfo.eventTimestampUs;
        }
        if ((i11 & 16) != 0) {
            dataCollectionStatus = sessionInfo.dataCollectionStatus;
        }
        if ((i11 & 32) != 0) {
            str3 = sessionInfo.firebaseInstallationId;
        }
        if ((i11 & 64) != 0) {
            str4 = sessionInfo.firebaseAuthenticationToken;
        }
        String str5 = str4;
        DataCollectionStatus dataCollectionStatus2 = dataCollectionStatus;
        long j11 = j10;
        int i12 = i10;
        return sessionInfo.copy(str, str2, i12, j11, dataCollectionStatus2, str3, str5);
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
        return this.eventTimestampUs;
    }

    @NotNull
    public final DataCollectionStatus component5() {
        return this.dataCollectionStatus;
    }

    @NotNull
    public final String component6() {
        return this.firebaseInstallationId;
    }

    @NotNull
    public final String component7() {
        return this.firebaseAuthenticationToken;
    }

    @NotNull
    public final SessionInfo copy(@NotNull String sessionId, @NotNull String firstSessionId, int i10, long j10, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String firebaseInstallationId, @NotNull String firebaseAuthenticationToken) {
        G.p(sessionId, "sessionId");
        G.p(firstSessionId, "firstSessionId");
        G.p(dataCollectionStatus, "dataCollectionStatus");
        G.p(firebaseInstallationId, "firebaseInstallationId");
        G.p(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SessionInfo(sessionId, firstSessionId, i10, j10, dataCollectionStatus, firebaseInstallationId, firebaseAuthenticationToken);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return G.g(this.sessionId, sessionInfo.sessionId) && G.g(this.firstSessionId, sessionInfo.firstSessionId) && this.sessionIndex == sessionInfo.sessionIndex && this.eventTimestampUs == sessionInfo.eventTimestampUs && G.g(this.dataCollectionStatus, sessionInfo.dataCollectionStatus) && G.g(this.firebaseInstallationId, sessionInfo.firebaseInstallationId) && G.g(this.firebaseAuthenticationToken, sessionInfo.firebaseAuthenticationToken);
    }

    @NotNull
    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    @NotNull
    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    @NotNull
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
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

    public int hashCode() {
        return this.firebaseAuthenticationToken.hashCode() + l.a(this.firebaseInstallationId, (this.dataCollectionStatus.hashCode() + ((C1550p.a(this.eventTimestampUs) + ((l.a(this.firstSessionId, this.sessionId.hashCode() * 31, 31) + this.sessionIndex) * 31)) * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.sessionId);
        sb2.append(", firstSessionId=");
        sb2.append(this.firstSessionId);
        sb2.append(", sessionIndex=");
        sb2.append(this.sessionIndex);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.eventTimestampUs);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.dataCollectionStatus);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.firebaseInstallationId);
        sb2.append(", firebaseAuthenticationToken=");
        return R0.a(sb2, this.firebaseAuthenticationToken, ')');
    }
}
