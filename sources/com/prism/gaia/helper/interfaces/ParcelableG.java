package com.prism.gaia.helper.interfaces;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public interface ParcelableG extends Parcelable {

    public interface a<T> extends Parcelable.ClassLoaderCreator<T> {
        T a(Parcel parcel, ClassLoader classLoader, int i10);
    }

    public interface b<T> extends Parcelable.Creator<T> {
        T b(Parcel parcel, int i10);
    }
}
