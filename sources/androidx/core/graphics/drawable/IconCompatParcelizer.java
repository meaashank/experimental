package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f111213a = versionedParcel.M(iconCompat.f111213a, 1);
        iconCompat.f111215c = versionedParcel.t(iconCompat.f111215c, 2);
        iconCompat.f111216d = versionedParcel.W(iconCompat.f111216d, 3);
        iconCompat.f111217e = versionedParcel.M(iconCompat.f111217e, 4);
        iconCompat.f111218f = versionedParcel.M(iconCompat.f111218f, 5);
        iconCompat.f111219g = (ColorStateList) versionedParcel.W(iconCompat.f111219g, 6);
        iconCompat.f111221i = versionedParcel.d0(iconCompat.f111221i, 7);
        iconCompat.f111222j = versionedParcel.d0(iconCompat.f111222j, 8);
        iconCompat.f();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.j0(true, true);
        iconCompat.g(versionedParcel.i());
        int i10 = iconCompat.f111213a;
        if (-1 != i10) {
            versionedParcel.M0(i10, 1);
        }
        byte[] bArr = iconCompat.f111215c;
        if (bArr != null) {
            versionedParcel.u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f111216d;
        if (parcelable != null) {
            versionedParcel.X0(parcelable, 3);
        }
        int i11 = iconCompat.f111217e;
        if (i11 != 0) {
            versionedParcel.M0(i11, 4);
        }
        int i12 = iconCompat.f111218f;
        if (i12 != 0) {
            versionedParcel.M0(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f111219g;
        if (colorStateList != null) {
            versionedParcel.X0(colorStateList, 6);
        }
        String str = iconCompat.f111221i;
        if (str != null) {
            versionedParcel.f1(str, 7);
        }
        String str2 = iconCompat.f111222j;
        if (str2 != null) {
            versionedParcel.f1(str2, 8);
        }
    }
}
