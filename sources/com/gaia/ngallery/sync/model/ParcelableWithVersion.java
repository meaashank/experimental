package com.gaia.ngallery.sync.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ParcelableWithVersion implements Parcelable {
    private int dataVersion = getDefaultDataVersion();

    public static abstract class a<T extends ParcelableWithVersion> implements Parcelable.Creator<T> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public T createFromParcel(Parcel parcel) {
            T t10 = (T) d();
            t10.readFromParcel(parcel);
            return t10;
        }

        public abstract T d();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDataVersion() {
        return this.dataVersion;
    }

    public abstract int getDefaultDataVersion();

    public abstract void readDataFromParcel(Parcel parcel, int i10);

    public void readFromParcel(Parcel parcel) {
        int i10 = parcel.readInt();
        this.dataVersion = i10;
        readDataFromParcel(parcel, i10);
    }

    public abstract void writeDataToParcel(Parcel parcel, int i10);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.dataVersion);
        writeDataToParcel(parcel, this.dataVersion);
    }
}
