package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class X5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        kotlin.jvm.internal.G.p(parcel, "parcel");
        long j10 = parcel.readLong();
        String string = parcel.readString();
        String str = string == null ? "" : string;
        String string2 = parcel.readString();
        String str2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        String str3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        String str4 = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        String str5 = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        String str6 = string6 == null ? "" : string6;
        boolean z10 = parcel.readByte() != 0;
        String string7 = parcel.readString();
        C3470a6 c3470a6 = new C3470a6(j10, str, str2, str3, str4, str5, str6, z10, string7 == null ? "" : string7);
        String string8 = parcel.readString();
        Z5 z52 = new Z5(c3470a6, string8 == null ? "" : string8, parcel.readInt(), parcel.readLong());
        z52.f152652f = parcel.readInt();
        z52.f152653g = parcel.readString();
        return z52;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new Z5[i10];
    }
}
