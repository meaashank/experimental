package com.prism.gaia.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.gaia.server.pm.D;

/* JADX INFO: loaded from: classes6.dex */
public class PropertyG implements Parcelable {
    public static final Parcelable.Creator<PropertyG> CREATOR = new a();
    public final String className;
    public final String name;
    public final String packageName;
    public final D value;

    public class a implements Parcelable.Creator<PropertyG> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PropertyG createFromParcel(Parcel parcel) {
            return new PropertyG(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public PropertyG[] newArray(int i10) {
            return new PropertyG[i10];
        }
    }

    public PropertyG(String str, String str2, String str3, D d10) {
        this.name = str;
        this.packageName = str2;
        this.className = str3;
        this.value = d10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PropertyG{");
        sb2.append(this.name);
        sb2.append("@");
        sb2.append(this.packageName);
        if (this.className == null) {
            str = "";
        } else {
            str = RemoteSettings.FORWARD_SLASH_STRING + this.className;
        }
        sb2.append(str);
        sb2.append("=");
        sb2.append(this.value);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.name);
        parcel.writeString(this.packageName);
        parcel.writeString(this.className);
        this.value.i(parcel);
    }

    public PropertyG(Parcel parcel) {
        this.name = parcel.readString();
        this.packageName = parcel.readString();
        this.className = parcel.readString();
        this.value = D.h(parcel);
    }
}
