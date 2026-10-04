package com.prism.gaia.exception;

import android.os.Parcel;
import android.os.Parcelable;
import com.prism.commons.utils.C3857v;

/* JADX INFO: loaded from: classes6.dex */
public class GaiaRemoteRunnableException extends RuntimeException implements Parcelable {
    public static final Parcelable.Creator<GaiaRemoteRunnableException> CREATOR = new a();
    private static final long serialVersionUID = 1;

    public class a implements Parcelable.Creator<GaiaRemoteRunnableException> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GaiaRemoteRunnableException createFromParcel(Parcel parcel) {
            return GaiaRemoteRunnableException.readFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public GaiaRemoteRunnableException[] newArray(int i10) {
            return new GaiaRemoteRunnableException[i10];
        }
    }

    public GaiaRemoteRunnableException() {
    }

    public static GaiaRemoteRunnableException readFromParcel(Parcel parcel) {
        return (GaiaRemoteRunnableException) C3857v.c(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C3857v.d(parcel, this);
    }

    public GaiaRemoteRunnableException(Throwable th) {
        super(th);
    }

    public GaiaRemoteRunnableException(String str) {
        super(str);
    }

    public GaiaRemoteRunnableException(String str, Throwable th) {
        super(str, th);
    }
}
