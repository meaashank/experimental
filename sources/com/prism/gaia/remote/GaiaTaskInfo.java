package com.prism.gaia.remote;

import U6.j;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class GaiaTaskInfo implements Parcelable {
    public static final Parcelable.Creator<GaiaTaskInfo> CREATOR = new a();
    public ComponentName baseActivity;
    public Intent baseIntent;
    public int taskId;
    public ComponentName topActivity;

    public class a implements Parcelable.Creator<GaiaTaskInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GaiaTaskInfo createFromParcel(Parcel parcel) {
            return new GaiaTaskInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public GaiaTaskInfo[] newArray(int i10) {
            return new GaiaTaskInfo[i10];
        }
    }

    public GaiaTaskInfo(int i10, Intent intent, ComponentName componentName, ComponentName componentName2) {
        this.taskId = i10;
        this.baseIntent = intent;
        this.baseActivity = componentName;
        this.topActivity = componentName2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        j.F(sb2, "_class", "GaiaTaskInfo");
        j.F(sb2, "taskId", Integer.valueOf(this.taskId));
        j.H(sb2, "baseIntent", this.baseIntent);
        j.F(sb2, "baseActivity", this.baseActivity);
        j.F(sb2, "topActivity", this.topActivity);
        j.G(sb2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.taskId);
        parcel.writeParcelable(this.baseIntent, i10);
        parcel.writeParcelable(this.baseActivity, i10);
        parcel.writeParcelable(this.topActivity, i10);
    }

    public GaiaTaskInfo(Parcel parcel) {
        this.taskId = parcel.readInt();
        this.baseIntent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.baseActivity = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.topActivity = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
    }
}
