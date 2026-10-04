package com.prism.gaia.remote;

import U6.j;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.prism.gaia.client.GProcessClient;

/* JADX INFO: loaded from: classes6.dex */
public class GuestProcessInfo implements Parcelable {
    public static final Parcelable.Creator<GuestProcessInfo> CREATOR = new a();
    public String packageName;
    public String processName;
    public int vpid;
    public int vuid;

    public class a implements Parcelable.Creator<GuestProcessInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GuestProcessInfo createFromParcel(Parcel parcel) {
            return new GuestProcessInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public GuestProcessInfo[] newArray(int i10) {
            return new GuestProcessInfo[i10];
        }
    }

    public GuestProcessInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GuestProcessInfo guestProcessInfo = (GuestProcessInfo) obj;
            if (this.vpid == guestProcessInfo.vpid && this.vuid == guestProcessInfo.vuid && TextUtils.equals(this.packageName, guestProcessInfo.packageName) && TextUtils.equals(this.processName, guestProcessInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        j.F(sb2, GProcessClient.f164190q, Integer.valueOf(this.vuid));
        j.F(sb2, GProcessClient.f164191r, Integer.valueOf(this.vpid));
        j.F(sb2, "packageName", this.packageName);
        j.F(sb2, GProcessClient.f164193t, this.processName);
        j.G(sb2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.packageName);
        parcel.writeString(this.processName);
        parcel.writeInt(this.vuid);
        parcel.writeInt(this.vpid);
    }

    public GuestProcessInfo(Parcel parcel) {
        this.packageName = parcel.readString();
        this.processName = parcel.readString();
        this.vuid = parcel.readInt();
        this.vpid = parcel.readInt();
    }
}
