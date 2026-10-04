package com.prism.gaia.server;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class GGuestUncaughtException implements Parcelable {
    public static final Parcelable.Creator<GGuestUncaughtException> CREATOR = new a();
    private Exception exception;
    private boolean isMainThread;
    private String packageName;
    private int pid;
    private String processName;

    public class a implements Parcelable.Creator<GGuestUncaughtException> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GGuestUncaughtException createFromParcel(Parcel parcel) {
            return new GGuestUncaughtException(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public GGuestUncaughtException[] newArray(int i10) {
            return new GGuestUncaughtException[i10];
        }
    }

    public GGuestUncaughtException(int i10, boolean z10, String str, String str2, Exception exc) {
        this.pid = i10;
        this.isMainThread = z10;
        if (str != null) {
            this.processName = str;
        } else {
            this.processName = "Unknown";
        }
        if (str2 != null) {
            this.packageName = str2;
        } else {
            this.packageName = "Unknown";
        }
        if (exc != null) {
            this.exception = exc;
        } else {
            this.exception = new RuntimeException("caller pass a null exception");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Exception getException() {
        return this.exception;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getPid() {
        return this.pid;
    }

    public String getProcessName() {
        return this.processName;
    }

    public boolean isMainThread() {
        return this.isMainThread;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.pid);
        parcel.writeInt(this.isMainThread ? 1 : 0);
        parcel.writeString(this.processName);
        parcel.writeString(this.packageName);
        parcel.writeSerializable(this.exception);
    }

    public GGuestUncaughtException(Parcel parcel) {
        this.pid = parcel.readInt();
        if (parcel.readInt() > 0) {
            this.isMainThread = true;
        }
        this.processName = parcel.readString();
        this.packageName = parcel.readString();
        this.exception = (Exception) parcel.readSerializable();
    }
}
