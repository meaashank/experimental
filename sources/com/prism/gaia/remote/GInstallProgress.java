package com.prism.gaia.remote;

import U6.j;
import android.os.Parcel;
import android.os.Parcelable;
import s0.C5559a;

/* JADX INFO: loaded from: classes6.dex */
public class GInstallProgress implements Parcelable {
    public static final Parcelable.Creator<GInstallProgress> CREATOR = new a();
    private String pkgName;
    private boolean proceedEnd;
    private float progress;
    private int stage;
    private float stageMaxProgress;
    private long stageTotalTimeMillis;
    private long startTimeMillis;

    public class a implements Parcelable.Creator<GInstallProgress> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GInstallProgress createFromParcel(Parcel parcel) {
            return new GInstallProgress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public GInstallProgress[] newArray(int i10) {
            return new GInstallProgress[i10];
        }
    }

    public GInstallProgress() {
        this.startTimeMillis = System.currentTimeMillis();
        this.pkgName = null;
        this.stage = 0;
        this.progress = 0.0f;
        this.stageMaxProgress = 0.0f;
        this.stageTotalTimeMillis = 0L;
        this.proceedEnd = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public float getProgress() {
        return this.progress;
    }

    public int getStage() {
        return this.stage;
    }

    public float getStageMaxProgress() {
        return this.stageMaxProgress;
    }

    public long getStageTotalTimeMillis() {
        return this.stageTotalTimeMillis;
    }

    public long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    public double getVirtualProgress(double d10) {
        double stageMaxProgress = getStageMaxProgress();
        double progress = getProgress();
        return (stageMaxProgress <= 0.0d || d10 < progress) ? progress : d10 >= stageMaxProgress ? stageMaxProgress : C5559a.a(stageMaxProgress, d10, 0.25d, d10);
    }

    public boolean isProceedEnd() {
        return this.proceedEnd;
    }

    public void reset() {
        this.startTimeMillis = System.currentTimeMillis();
        this.stage = 0;
        this.progress = 0.0f;
        this.stageMaxProgress = 0.0f;
        this.stageTotalTimeMillis = 0L;
        this.proceedEnd = false;
    }

    public void setPkgName(String str) {
        synchronized (this) {
            this.pkgName = str;
        }
    }

    public void setProceedEnd(boolean z10) {
        this.proceedEnd = z10;
    }

    public void setProgress(float f10) {
        synchronized (this) {
            this.progress = f10;
        }
    }

    public void setProgresses(float f10, float f11, long j10, boolean z10) {
        synchronized (this) {
            if (z10) {
                try {
                    this.stage++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.progress = f10;
            this.stageMaxProgress = f11;
            this.stageTotalTimeMillis = j10;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        j.F(sb2, "pkgName", this.pkgName);
        j.F(sb2, "progress", Float.valueOf(this.progress));
        j.F(sb2, "startTimeMillis", Long.valueOf(this.startTimeMillis));
        j.G(sb2);
        sb2.append(")");
        return sb2.toString();
    }

    public void updProgress(GInstallProgress gInstallProgress) {
        this.stage = gInstallProgress.stage;
        this.progress = gInstallProgress.progress;
        this.stageMaxProgress = gInstallProgress.stageMaxProgress;
        this.stageTotalTimeMillis = gInstallProgress.stageTotalTimeMillis;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            parcel.writeString(this.pkgName);
            parcel.writeInt(this.stage);
            parcel.writeFloat(this.progress);
            parcel.writeFloat(this.stageMaxProgress);
            parcel.writeLong(this.stageTotalTimeMillis);
            parcel.writeLong(this.startTimeMillis);
            parcel.writeByte(this.proceedEnd ? (byte) 1 : (byte) 0);
        }
    }

    public GInstallProgress(Parcel parcel) {
        this.pkgName = parcel.readString();
        this.stage = parcel.readInt();
        this.progress = parcel.readFloat();
        this.stageMaxProgress = parcel.readFloat();
        this.stageTotalTimeMillis = parcel.readLong();
        this.startTimeMillis = parcel.readLong();
        this.proceedEnd = parcel.readByte() != 0;
    }
}
