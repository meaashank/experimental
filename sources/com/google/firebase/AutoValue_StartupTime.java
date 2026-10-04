package com.google.firebase;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_StartupTime extends StartupTime {
    private final long elapsedRealtime;
    private final long epochMillis;
    private final long uptimeMillis;

    public AutoValue_StartupTime(long j10, long j11, long j12) {
        this.epochMillis = j10;
        this.elapsedRealtime = j11;
        this.uptimeMillis = j12;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StartupTime) {
            StartupTime startupTime = (StartupTime) obj;
            if (this.epochMillis == startupTime.getEpochMillis() && this.elapsedRealtime == startupTime.getElapsedRealtime() && this.uptimeMillis == startupTime.getUptimeMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.StartupTime
    public long getElapsedRealtime() {
        return this.elapsedRealtime;
    }

    @Override // com.google.firebase.StartupTime
    public long getEpochMillis() {
        return this.epochMillis;
    }

    @Override // com.google.firebase.StartupTime
    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public int hashCode() {
        long j10 = this.epochMillis;
        long j11 = this.elapsedRealtime;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.uptimeMillis;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.epochMillis);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.elapsedRealtime);
        sb2.append(", uptimeMillis=");
        return android.support.v4.media.session.f.a(sb2, this.uptimeMillis, "}");
    }
}
