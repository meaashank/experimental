package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f156531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f156532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f156533c;

    public class a implements Parcelable.Creator<BatchReportMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage[] newArray(int i10) {
            return new BatchReportMessage[i10];
        }
    }

    public BatchReportMessage(String str, String str2, long j10) {
        this.f156533c = str;
        this.f156531a = str2;
        this.f156532b = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f156531a;
    }

    public long getTimestamp() {
        return this.f156532b;
    }

    public String getUuid() {
        return this.f156533c;
    }

    public void setReportMessage(String str) {
        this.f156531a = str;
    }

    public void setTimestamp(long j10) {
        this.f156532b = j10;
    }

    public void setUuid(String str) {
        this.f156533c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f156533c);
        parcel.writeString(this.f156531a);
        parcel.writeLong(this.f156532b);
    }

    public BatchReportMessage(Parcel parcel) {
        this.f156533c = parcel.readString();
        this.f156531a = parcel.readString();
        this.f156532b = parcel.readLong();
    }
}
