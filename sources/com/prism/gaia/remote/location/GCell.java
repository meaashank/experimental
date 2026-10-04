package com.prism.gaia.remote.location;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class GCell implements Parcelable {
    public static final Parcelable.Creator<GCell> CREATOR = new a();
    public int baseStationId;
    public int cid;
    public int lac;
    public int mcc;
    public int mnc;
    public int networkId;
    public int psc;
    public int systemId;
    public int type;

    public class a implements Parcelable.Creator<GCell> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GCell createFromParcel(Parcel parcel) {
            return new GCell(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public GCell[] newArray(int i10) {
            return new GCell[i10];
        }
    }

    public GCell() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.type);
        parcel.writeInt(this.mcc);
        parcel.writeInt(this.mnc);
        parcel.writeInt(this.psc);
        parcel.writeInt(this.lac);
        parcel.writeInt(this.cid);
        parcel.writeInt(this.baseStationId);
        parcel.writeInt(this.systemId);
        parcel.writeInt(this.networkId);
    }

    public GCell(Parcel parcel) {
        this.type = parcel.readInt();
        this.mcc = parcel.readInt();
        this.mnc = parcel.readInt();
        this.psc = parcel.readInt();
        this.lac = parcel.readInt();
        this.cid = parcel.readInt();
        this.baseStationId = parcel.readInt();
        this.systemId = parcel.readInt();
        this.networkId = parcel.readInt();
    }
}
