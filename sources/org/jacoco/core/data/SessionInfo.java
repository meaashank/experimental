package org.jacoco.core.data;

import android.support.v4.media.e;

/* JADX INFO: loaded from: classes6.dex */
public class SessionInfo implements Comparable<SessionInfo> {
    private final long dump;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f226136id;
    private final long start;

    public SessionInfo(String str, long j10, long j11) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.f226136id = str;
        this.start = j10;
        this.dump = j11;
    }

    public long getDumpTimeStamp() {
        return this.dump;
    }

    public String getId() {
        return this.f226136id;
    }

    public long getStartTimeStamp() {
        return this.start;
    }

    public String toString() {
        return e.a(new StringBuilder("SessionInfo["), this.f226136id, "]");
    }

    @Override // java.lang.Comparable
    public int compareTo(SessionInfo sessionInfo) {
        long j10 = this.dump;
        long j11 = sessionInfo.dump;
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }
}
