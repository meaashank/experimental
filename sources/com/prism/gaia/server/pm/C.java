package com.prism.gaia.server.pm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.prism.commons.utils.l0;
import com.prism.gaia.helper.interfaces.ParcelableG;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f167423a = l0.b(C.class.getSimpleName());

    public static Parcel a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return parcelObtain;
        } catch (Throwable th) {
            th.getMessage();
            parcelObtain.recycle();
            return null;
        }
    }

    public static <T extends Parcelable> T b(T t10) {
        if (t10 == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeParcelable(t10, 0);
            parcelObtain.setDataPosition(0);
            return (T) parcelObtain.readParcelable(t10.getClass().getClassLoader());
        } finally {
            parcelObtain.recycle();
        }
    }

    public static boolean c(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static Bundle d(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        return null;
    }

    public static int e(Parcel parcel) {
        return parcel.readInt();
    }

    public static long f(Parcel parcel) {
        return parcel.readLong();
    }

    public static <T> SparseArray<T> g(Parcel parcel, ParcelableG.b<T> bVar, int i10) {
        int i11 = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                return sparseArray;
            }
            sparseArray.append(parcel.readInt(), bVar.b(parcel, i10));
            i11 = i12;
        }
    }

    public static String h(Parcel parcel) {
        return parcel.readString();
    }

    public static String[] i(Parcel parcel) {
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = parcel.readString();
        }
        return strArr;
    }

    public static <T extends Collection<String>> T j(Parcel parcel, @NonNull T t10) {
        t10.clear();
        int i10 = parcel.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            t10.add(parcel.readString());
        }
        return t10;
    }

    public static void k(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void l(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static <T extends Parcelable> void m(Parcel parcel, SparseArray<T> sparseArray) {
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            sparseArray.valueAt(i10).writeToParcel(parcel, 0);
        }
    }

    public static void n(Parcel parcel, Collection<String> collection) {
        if (collection == null || collection.size() == 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(collection.size());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
    }
}
