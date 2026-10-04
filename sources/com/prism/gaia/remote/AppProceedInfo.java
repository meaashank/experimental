package com.prism.gaia.remote;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class AppProceedInfo implements Parcelable {
    public static final Parcelable.Creator<AppProceedInfo> CREATOR = new a();
    public int action;
    public ApkInfo apkInfo;
    public Code code;
    public String msg;
    private boolean notifiedFinish;
    public int vuserId;

    public enum Code {
        PROCEEDING,
        SUCCESS,
        CANCEL,
        UPDATE_NO_NEED,
        APK_INVALID,
        FAIL,
        DISK_NO_SPACE,
        HELPER_NO_INSTALL,
        HELPER_VS_TOO_LOW,
        HELPER_NO_REL_START,
        HELPER_FORBID_IN_STORE,
        FILE_OP_ERROR,
        OAT_NO_READABLE,
        OAT_GEN_FAIL,
        USE_LIBRARY_INSTALL_FAIL,
        REL_APP_NOT_EXIST,
        REL_APP_INSTALL_FAIL,
        SIGNATURE_MISMATCH,
        PROCESS_INTERRUPTED;

        public boolean isCanceled() {
            return ordinal() >= CANCEL.ordinal() && ordinal() < FAIL.ordinal();
        }

        public boolean isFailed() {
            return ordinal() >= FAIL.ordinal();
        }

        public boolean isProceeding() {
            return ordinal() == PROCEEDING.ordinal();
        }

        public boolean isSuccess() {
            return ordinal() >= SUCCESS.ordinal() && ordinal() < CANCEL.ordinal();
        }
    }

    public class a implements Parcelable.Creator<AppProceedInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AppProceedInfo createFromParcel(Parcel parcel) {
            return new AppProceedInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public AppProceedInfo[] newArray(int i10) {
            return new AppProceedInfo[i10];
        }
    }

    public AppProceedInfo(int i10, int i11) {
        this.notifiedFinish = false;
        this.action = i10;
        this.vuserId = i11;
        resetCode();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isCanceled() {
        return this.code.isCanceled();
    }

    public boolean isFailed() {
        return this.code.isFailed();
    }

    public boolean isNotifiedFinish() {
        return this.notifiedFinish;
    }

    public boolean isProceeding() {
        return this.code.isProceeding();
    }

    public boolean isSuccess() {
        return this.code.isSuccess();
    }

    public AppProceedInfo make(Code code, String str) {
        this.code = code;
        this.msg = str;
        return this;
    }

    public void resetCode() {
        this.code = Code.PROCEEDING;
        this.msg = null;
    }

    public void setApkInfo(ApkInfo apkInfo) {
        this.apkInfo = apkInfo;
    }

    public void setNotifiedFinish(boolean z10) {
        this.notifiedFinish = z10;
    }

    public AppProceedInfo success() {
        this.code = Code.SUCCESS;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.action);
        parcel.writeInt(this.vuserId);
        parcel.writeParcelable(this.apkInfo, 0);
        parcel.writeInt(this.code.ordinal());
        parcel.writeString(this.msg);
        parcel.writeByte(this.notifiedFinish ? (byte) 1 : (byte) 0);
    }

    public AppProceedInfo(Parcel parcel) {
        this.notifiedFinish = false;
        this.action = parcel.readInt();
        this.vuserId = parcel.readInt();
        this.apkInfo = (ApkInfo) parcel.readParcelable(ApkInfo.class.getClassLoader());
        this.code = Code.values()[parcel.readInt()];
        this.msg = parcel.readString();
        this.notifiedFinish = parcel.readByte() != 0;
    }
}
