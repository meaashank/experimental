package com.google.android.datatransport.cct.internal;

import android.support.v4.media.session.f;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_LogResponse extends LogResponse {
    private final long nextRequestWaitMillis;

    public AutoValue_LogResponse(long j10) {
        this.nextRequestWaitMillis = j10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LogResponse) && this.nextRequestWaitMillis == ((LogResponse) obj).getNextRequestWaitMillis();
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public int hashCode() {
        long j10 = this.nextRequestWaitMillis;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return f.a(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.nextRequestWaitMillis, "}");
    }
}
