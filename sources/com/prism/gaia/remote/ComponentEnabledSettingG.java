package com.prism.gaia.remote;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class ComponentEnabledSettingG implements Parcelable {
    public static final Parcelable.Creator<ComponentEnabledSettingG> CREATOR = new a();

    @Nullable
    public ComponentName componentName;
    public int flags;

    @Nullable
    public String packageName;
    public int state;

    public class a implements Parcelable.Creator<ComponentEnabledSettingG> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ComponentEnabledSettingG createFromParcel(Parcel parcel) {
            return new ComponentEnabledSettingG(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ComponentEnabledSettingG[] newArray(int i10) {
            return new ComponentEnabledSettingG[i10];
        }
    }

    public ComponentEnabledSettingG(String str, int i10, int i11) {
        this(str, null, i10, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.packageName);
        parcel.writeParcelable(this.componentName, i10);
        parcel.writeInt(this.state);
        parcel.writeInt(this.flags);
    }

    public ComponentEnabledSettingG(ComponentName componentName, int i10, int i11) {
        this(null, componentName, i10, i11);
    }

    public ComponentEnabledSettingG(@Nullable String str, @Nullable ComponentName componentName, int i10, int i11) {
        this.packageName = str;
        this.componentName = componentName;
        this.state = i10;
        this.flags = i11;
    }

    public ComponentEnabledSettingG(Parcel parcel) {
        this.packageName = parcel.readString();
        this.componentName = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.state = parcel.readInt();
        this.flags = parcel.readInt();
    }
}
