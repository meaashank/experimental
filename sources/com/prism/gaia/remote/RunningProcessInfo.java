package com.prism.gaia.remote;

import U6.j;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.prism.gaia.client.GProcessClient;

/* JADX INFO: loaded from: classes6.dex */
public class RunningProcessInfo implements Parcelable {
    public static final Parcelable.Creator<RunningProcessInfo> CREATOR = new a();
    public ApkInfo apkInfo;
    public String packageName;
    public int pid;
    public String processName;
    public int vpid;
    public int vuid;

    public class a implements Parcelable.Creator<RunningProcessInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public RunningProcessInfo createFromParcel(Parcel parcel) {
            return new RunningProcessInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public RunningProcessInfo[] newArray(int i10) {
            return new RunningProcessInfo[i10];
        }
    }

    public RunningProcessInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RunningProcessInfo runningProcessInfo = (RunningProcessInfo) obj;
            if (this.pid == runningProcessInfo.pid && this.vpid == runningProcessInfo.vpid && this.vuid == runningProcessInfo.vuid && TextUtils.equals(this.packageName, runningProcessInfo.packageName) && TextUtils.equals(this.processName, runningProcessInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        j.F(sb2, "pid", Integer.valueOf(this.pid));
        j.F(sb2, GProcessClient.f164190q, Integer.valueOf(this.vuid));
        j.F(sb2, GProcessClient.f164191r, Integer.valueOf(this.vpid));
        j.F(sb2, "packageName", this.packageName);
        j.F(sb2, GProcessClient.f164193t, this.processName);
        j.H(sb2, "apkInfo", this.apkInfo);
        j.G(sb2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.packageName);
        parcel.writeString(this.processName);
        parcel.writeInt(this.vuid);
        parcel.writeInt(this.vpid);
        parcel.writeInt(this.pid);
        parcel.writeParcelable(this.apkInfo, i10);
    }

    public RunningProcessInfo(Parcel parcel) {
        this.packageName = parcel.readString();
        this.processName = parcel.readString();
        this.vuid = parcel.readInt();
        this.vpid = parcel.readInt();
        this.pid = parcel.readInt();
        this.apkInfo = (ApkInfo) parcel.readParcelable(ApkInfo.class.getClassLoader());
    }
}
