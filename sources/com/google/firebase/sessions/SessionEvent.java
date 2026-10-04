package com.google.firebase.sessions;

import com.google.firebase.encoders.annotations.Encodable;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Encodable
public final class SessionEvent {

    @NotNull
    private final ApplicationInfo applicationInfo;

    @NotNull
    private final EventType eventType;

    @NotNull
    private final SessionInfo sessionData;

    public SessionEvent(@NotNull EventType eventType, @NotNull SessionInfo sessionData, @NotNull ApplicationInfo applicationInfo) {
        G.p(eventType, "eventType");
        G.p(sessionData, "sessionData");
        G.p(applicationInfo, "applicationInfo");
        this.eventType = eventType;
        this.sessionData = sessionData;
        this.applicationInfo = applicationInfo;
    }

    public static /* synthetic */ SessionEvent copy$default(SessionEvent sessionEvent, EventType eventType, SessionInfo sessionInfo, ApplicationInfo applicationInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eventType = sessionEvent.eventType;
        }
        if ((i10 & 2) != 0) {
            sessionInfo = sessionEvent.sessionData;
        }
        if ((i10 & 4) != 0) {
            applicationInfo = sessionEvent.applicationInfo;
        }
        return sessionEvent.copy(eventType, sessionInfo, applicationInfo);
    }

    @NotNull
    public final EventType component1() {
        return this.eventType;
    }

    @NotNull
    public final SessionInfo component2() {
        return this.sessionData;
    }

    @NotNull
    public final ApplicationInfo component3() {
        return this.applicationInfo;
    }

    @NotNull
    public final SessionEvent copy(@NotNull EventType eventType, @NotNull SessionInfo sessionData, @NotNull ApplicationInfo applicationInfo) {
        G.p(eventType, "eventType");
        G.p(sessionData, "sessionData");
        G.p(applicationInfo, "applicationInfo");
        return new SessionEvent(eventType, sessionData, applicationInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionEvent)) {
            return false;
        }
        SessionEvent sessionEvent = (SessionEvent) obj;
        return this.eventType == sessionEvent.eventType && G.g(this.sessionData, sessionEvent.sessionData) && G.g(this.applicationInfo, sessionEvent.applicationInfo);
    }

    @NotNull
    public final ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    @NotNull
    public final EventType getEventType() {
        return this.eventType;
    }

    @NotNull
    public final SessionInfo getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        return this.applicationInfo.hashCode() + ((this.sessionData.hashCode() + (this.eventType.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SessionEvent(eventType=" + this.eventType + ", sessionData=" + this.sessionData + ", applicationInfo=" + this.applicationInfo + ')';
    }
}
