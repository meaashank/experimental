package com.prism.gaia.remote;

import U6.j;
import Z3.f;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class PermissionGroup implements Parcelable {
    public static final Parcelable.Creator<PermissionGroup> CREATOR = new a();
    public final String[] permissions;
    public final String pkgName;

    public class a implements Parcelable.Creator<PermissionGroup> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PermissionGroup createFromParcel(Parcel parcel) {
            return new PermissionGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PermissionGroup[] newArray(int i10) {
            return new PermissionGroup[i10];
        }
    }

    public PermissionGroup(String str, String... strArr) {
        this.pkgName = str;
        this.permissions = strArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        j.F(sb2, "pkgName", this.pkgName);
        j.H(sb2, f.f79420q, this.permissions);
        j.G(sb2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.pkgName);
        parcel.writeInt(this.permissions.length);
        for (String str : this.permissions) {
            parcel.writeString(str);
        }
    }

    public PermissionGroup(Parcel parcel) {
        this.pkgName = parcel.readString();
        int i10 = parcel.readInt();
        this.permissions = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.permissions[i11] = parcel.readString();
        }
    }
}
