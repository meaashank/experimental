package com.prism.gaia.remote;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.f;

/* JADX INFO: loaded from: classes6.dex */
public class GuestAppSizeG implements Parcelable {
    public static final Parcelable.Creator<GuestAppSizeG> CREATOR = new a();
    public long appSize;
    public long cacheSize;
    public long dataSize;

    public class a implements Parcelable.Creator<GuestAppSizeG> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GuestAppSizeG createFromParcel(Parcel parcel) {
            return new GuestAppSizeG(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public GuestAppSizeG[] newArray(int i10) {
            return new GuestAppSizeG[i10];
        }
    }

    public GuestAppSizeG() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GuestAppSizeG{app=");
        sb2.append(this.appSize);
        sb2.append(", data=");
        sb2.append(this.dataSize);
        sb2.append(", cache=");
        return f.a(sb2, this.cacheSize, "}");
    }

    public long total() {
        return this.appSize + this.dataSize + this.cacheSize;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.appSize);
        parcel.writeLong(this.dataSize);
        parcel.writeLong(this.cacheSize);
    }

    public GuestAppSizeG(long j10, long j11, long j12) {
        this.appSize = j10;
        this.dataSize = j11;
        this.cacheSize = j12;
    }

    public GuestAppSizeG(Parcel parcel) {
        this.appSize = parcel.readLong();
        this.dataSize = parcel.readLong();
        this.cacheSize = parcel.readLong();
    }
}
