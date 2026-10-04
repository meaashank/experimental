package com.prism.gaia.remote;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class ReceiverInfo implements Parcelable {
    public static final Parcelable.Creator<ReceiverInfo> CREATOR = new a();
    public ComponentName component;
    public IntentFilter[] filters;
    public String permission;

    public class a implements Parcelable.Creator<ReceiverInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ReceiverInfo createFromParcel(Parcel parcel) {
            return new ReceiverInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ReceiverInfo[] newArray(int i10) {
            return new ReceiverInfo[i10];
        }
    }

    public ReceiverInfo(ComponentName componentName, IntentFilter[] intentFilterArr, String str) {
        this.component = componentName;
        this.filters = intentFilterArr;
        this.permission = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.component, i10);
        parcel.writeTypedArray(this.filters, i10);
        parcel.writeString(this.permission);
    }

    public ReceiverInfo(Parcel parcel) {
        this.component = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.filters = (IntentFilter[]) parcel.createTypedArray(IntentFilter.CREATOR);
        this.permission = parcel.readString();
    }
}
