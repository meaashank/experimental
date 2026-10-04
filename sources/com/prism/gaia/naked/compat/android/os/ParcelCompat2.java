package com.prism.gaia.naked.compat.android.os;

import android.os.Parcel;
import android.os.Parcelable;
import com.prism.gaia.naked.metadata.android.os.ParcelCAG;

/* JADX INFO: loaded from: classes6.dex */
public class ParcelCompat2 {

    public static class Util {
        public static Parcelable.Creator<?> readParcelableCreator(Parcel parcel, ClassLoader classLoader) {
            return ParcelCAG.f165886G.readParcelableCreator().call(parcel, classLoader);
        }
    }
}
