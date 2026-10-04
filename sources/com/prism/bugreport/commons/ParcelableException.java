package com.prism.bugreport.commons;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class ParcelableException implements Parcelable {
    public static final Parcelable.Creator<ParcelableException> CREATOR = new a();
    private Exception exception;

    public class a implements Parcelable.Creator<ParcelableException> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ParcelableException createFromParcel(Parcel parcel) {
            return new ParcelableException(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ParcelableException[] newArray(int i10) {
            return new ParcelableException[i10];
        }
    }

    public ParcelableException(Parcel parcel) {
        this.exception = (Exception) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Exception getException() {
        return this.exception;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.exception);
    }

    public ParcelableException(Throwable th) {
        if (th instanceof Exception) {
            this.exception = (Exception) th;
        } else {
            this.exception = new RuntimeException(th);
        }
    }
}
