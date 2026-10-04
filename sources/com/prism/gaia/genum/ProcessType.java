package com.prism.gaia.genum;

import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public enum ProcessType {
    SUPERVISOR(1),
    MAIN_PROCESS_PER_SPACE(2),
    GUEST(4),
    CHILD(8),
    SANDBOX(16);

    final int flag;

    ProcessType(int i10) {
        this.flag = i10;
    }

    public static ProcessType readFromParcel(Parcel parcel) {
        return values()[parcel.readInt()];
    }

    public int getFlag() {
        return this.flag;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(ordinal());
    }
}
