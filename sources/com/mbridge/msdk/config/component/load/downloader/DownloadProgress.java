package com.mbridge.msdk.config.component.load.downloader;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f154471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f154472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f154473c;

    public class a implements Parcelable.Creator<DownloadProgress> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress[] newArray(int i10) {
            return new DownloadProgress[i10];
        }
    }

    public DownloadProgress(long j10, long j11, int i10) {
        this.f154471a = j10;
        this.f154473c = j11;
        this.f154472b = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrent() {
        return this.f154471a;
    }

    public int getCurrentDownloadRate() {
        return this.f154472b;
    }

    public long getTotal() {
        return this.f154473c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f154471a);
        parcel.writeLong(this.f154473c);
        parcel.writeInt(this.f154472b);
    }

    public DownloadProgress(Parcel parcel) {
        this.f154471a = parcel.readLong();
        this.f154473c = parcel.readLong();
        this.f154472b = parcel.readInt();
    }
}
