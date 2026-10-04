package com.prism.gaia.remote;

import U6.j;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class PendingIntentInfoG implements Parcelable {
    public static final Parcelable.Creator<PendingIntentInfoG> CREATOR = new a();
    public String mCreatorPackage;
    public int mCreatorUid;
    public boolean mImmutable;
    public int mIntentSenderType;

    public class a implements Parcelable.Creator<PendingIntentInfoG> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PendingIntentInfoG createFromParcel(Parcel parcel) {
            return new PendingIntentInfoG(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PendingIntentInfoG[] newArray(int i10) {
            return new PendingIntentInfoG[i10];
        }
    }

    public PendingIntentInfoG() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        j.F(sb2, "mCreatorPackage", this.mCreatorPackage);
        j.F(sb2, "mCreatorUid", Integer.valueOf(this.mCreatorUid));
        j.F(sb2, "mImmutable", Boolean.valueOf(this.mImmutable));
        j.F(sb2, "mIntentSenderType", Integer.valueOf(this.mIntentSenderType));
        j.G(sb2);
        return sb2.toString();
    }

    public Object toSystemPendingIntentInfo() {
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.mCreatorPackage);
        parcel.writeInt(this.mCreatorUid);
        parcel.writeByte(this.mImmutable ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mIntentSenderType);
    }

    public PendingIntentInfoG(Parcel parcel) {
        this.mCreatorPackage = parcel.readString();
        this.mCreatorUid = parcel.readInt();
        this.mImmutable = parcel.readByte() != 0;
        this.mIntentSenderType = parcel.readInt();
    }
}
