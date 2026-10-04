package com.prism.gaia.helper.utils.other;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class IBinderParcelable implements Parcelable {
    public static final Parcelable.Creator<IBinderParcelable> CREATOR = new a();
    private IBinder mIBinder;

    public class a implements Parcelable.Creator<IBinderParcelable> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public IBinderParcelable createFromParcel(Parcel parcel) {
            return new IBinderParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public IBinderParcelable[] newArray(int i10) {
            return new IBinderParcelable[i10];
        }
    }

    public IBinderParcelable(IBinder iBinder) {
        this.mIBinder = iBinder;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IBinder getIBinder() {
        return this.mIBinder;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStrongBinder(this.mIBinder);
    }

    public IBinderParcelable(Parcel parcel) {
        this.mIBinder = parcel.readStrongBinder();
    }
}
