package androidx.core.os;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface C<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i10);
}
