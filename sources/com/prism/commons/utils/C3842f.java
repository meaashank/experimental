package com.prism.commons.utils;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: com.prism.commons.utils.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3842f {
    public static Bundle a(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        Bundle bundle2 = new Bundle();
        bundle2.readFromParcel(parcelObtain);
        parcelObtain.recycle();
        return bundle2;
    }
}
