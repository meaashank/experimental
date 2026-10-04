package com.prism.gaia.helper.compat;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.prism.commons.utils.C3838b;
import com.prism.gaia.helper.utils.other.IBinderParcelable;
import com.prism.gaia.naked.metadata.android.os.BaseBundleCAG;
import com.prism.gaia.naked.metadata.android.os.BundleCAG;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static void a(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInt(0);
        parcelObtain.setDataPosition(0);
        if (BaseBundleCAG.f165854C.ORG_CLASS() != null) {
            Parcel parcel = BaseBundleCAG.f165854C.mParcelledData().get(bundle);
            if (parcel != null) {
                parcel.recycle();
            }
            BaseBundleCAG.f165854C.mParcelledData().set(bundle, parcelObtain);
            return;
        }
        if (BundleCAG.f165858A.BaseBundle.f165860C.ORG_CLASS() != null) {
            Parcel parcel2 = BundleCAG.f165858A.BaseBundle.f165860C.mParcelledData().get(bundle);
            if (parcel2 != null) {
                parcel2.recycle();
            }
            BundleCAG.f165858A.BaseBundle.f165860C.mParcelledData().set(bundle, parcelObtain);
        }
    }

    public static IBinder b(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static IBinder[] c(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (parcelableArray == null) {
            return null;
        }
        IBinder[] iBinderArr = new IBinder[parcelableArray.length];
        for (int i10 = 0; i10 < parcelableArray.length; i10++) {
            iBinderArr[i10] = ((IBinderParcelable) parcelableArray[i10]).getIBinder();
        }
        return iBinderArr;
    }

    public static <T extends Parcelable> T[] d(Intent intent, String str, Class<? extends T[]> cls) {
        return (T[]) e(intent.getExtras(), str, cls);
    }

    public static <T extends Parcelable> T[] e(Bundle bundle, String str, Class<? extends T[]> cls) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        return parcelableArray == null ? (T[]) ((Parcelable[]) C3838b.f(cls, 0)) : (T[]) ((Parcelable[]) Arrays.copyOf(parcelableArray, parcelableArray.length, cls));
    }

    public static void f(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }

    public static void g(Bundle bundle, String str, IBinder[] iBinderArr) {
        if (iBinderArr == null) {
            return;
        }
        IBinderParcelable[] iBinderParcelableArr = new IBinderParcelable[iBinderArr.length];
        for (int i10 = 0; i10 < iBinderArr.length; i10++) {
            iBinderParcelableArr[i10] = new IBinderParcelable(iBinderArr[i10]);
        }
        bundle.putParcelableArray(str, iBinderParcelableArr);
    }

    public static void h(Bundle bundle, boolean z10) {
        if (bundle == null || BundleCAG.f165859G.setDefusable() == null) {
            return;
        }
        BundleCAG.f165859G.setDefusable().call(bundle, Boolean.valueOf(z10));
    }
}
