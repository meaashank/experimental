package com.prism.gaia.remote;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.text.TextUtils;
import com.prism.gaia.client.GaiaContext;

/* JADX INFO: loaded from: classes6.dex */
public class BadgerInfo implements Parcelable {
    public static final Parcelable.Creator<BadgerInfo> CREATOR = new a();
    public int badgerCount;
    public String className;
    public String packageName;
    public int userId;

    public class a implements Parcelable.Creator<BadgerInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public BadgerInfo createFromParcel(Parcel parcel) {
            return new BadgerInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public BadgerInfo[] newArray(int i10) {
            return new BadgerInfo[i10];
        }
    }

    public BadgerInfo() {
        this.userId = GaiaContext.j().Z();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BadgerInfo)) {
            return super.equals(obj);
        }
        BadgerInfo badgerInfo = (BadgerInfo) obj;
        return badgerInfo.userId == this.userId && TextUtils.equals(badgerInfo.className, this.className) && TextUtils.equals(this.packageName, badgerInfo.packageName);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ userId:");
        sb2.append(this.userId);
        sb2.append("; packageName:");
        sb2.append(this.packageName);
        sb2.append("; className:");
        sb2.append(this.className);
        sb2.append("; badgeNumber:");
        return d.a(sb2, this.badgerCount, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.userId);
        parcel.writeString(this.packageName);
        parcel.writeInt(this.badgerCount);
        parcel.writeString(this.className);
    }

    public BadgerInfo(Parcel parcel) {
        this.userId = parcel.readInt();
        this.packageName = parcel.readString();
        this.badgerCount = parcel.readInt();
        this.className = parcel.readString();
    }
}
