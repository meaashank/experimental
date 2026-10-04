package com.prism.gaia.remote;

import U6.j;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.prism.gaia.client.GProcessClient;
import com.prism.gaia.genum.ProcessType;

/* JADX INFO: loaded from: classes6.dex */
public class StubProcessInfo implements Parcelable {
    public static final Parcelable.Creator<StubProcessInfo> CREATOR = new a();
    public final ProcessType processType;
    public final String spacePkgName;
    public final int vpid;

    public class a implements Parcelable.Creator<StubProcessInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public StubProcessInfo createFromParcel(Parcel parcel) {
            return new StubProcessInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public StubProcessInfo[] newArray(int i10) {
            return new StubProcessInfo[i10];
        }
    }

    public StubProcessInfo(ProcessType processType, int i10, String str) {
        this.processType = processType;
        this.vpid = i10;
        this.spacePkgName = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        j.F(sb2, "_class", "StubProcessInfo");
        j.F(sb2, "processType", this.processType);
        j.F(sb2, GProcessClient.f164191r, Integer.valueOf(this.vpid));
        j.F(sb2, "spacePkgName", this.spacePkgName);
        j.G(sb2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        this.processType.writeToParcel(parcel, i10);
        parcel.writeInt(this.vpid);
        parcel.writeString(this.spacePkgName);
    }

    public StubProcessInfo(Parcel parcel) {
        this.processType = ProcessType.readFromParcel(parcel);
        this.vpid = parcel.readInt();
        this.spacePkgName = parcel.readString();
    }
}
