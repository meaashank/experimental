package com.android.launcher3.util;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityResultInfo implements Parcelable {
    public static final Parcelable.Creator<ActivityResultInfo> CREATOR = new AnonymousClass1();
    public final Intent data;
    public final int requestCode;
    public final int resultCode;

    /* JADX INFO: renamed from: com.android.launcher3.util.ActivityResultInfo$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ActivityResultInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityResultInfo createFromParcel(Parcel parcel) {
            return new ActivityResultInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityResultInfo[] newArray(int i10) {
            return new ActivityResultInfo[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.requestCode);
        parcel.writeInt(this.resultCode);
        if (this.data == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            this.data.writeToParcel(parcel, i10);
        }
    }

    public ActivityResultInfo(int i10, int i11, Intent intent) {
        this.requestCode = i10;
        this.resultCode = i11;
        this.data = intent;
    }

    private ActivityResultInfo(Parcel parcel) {
        this.requestCode = parcel.readInt();
        this.resultCode = parcel.readInt();
        this.data = parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null;
    }
}
