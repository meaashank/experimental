package L9;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f58704a = "asdf-".concat(a.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58705b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58706c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f58707d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f58708e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f58709f = 5;

    public static Bundle a(Parcel parcel) {
        int i10 = parcel.readInt();
        Bundle bundle = new Bundle();
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return bundle;
            }
            String string = parcel.readString();
            int i12 = parcel.readInt();
            if (i12 == 1) {
                bundle.putString(string, parcel.readString());
            } else if (i12 == 2) {
                bundle.putInt(string, parcel.readInt());
            } else if (i12 == 3) {
                bundle.putFloat(string, parcel.readFloat());
            } else if (i12 != 4) {
                parcel.readString();
            } else {
                bundle.putBoolean(string, parcel.readInt() != 0);
            }
            i10 = i11;
        }
    }

    public static void b(Parcel parcel, Bundle bundle) {
        ArrayList arrayList = new ArrayList(bundle.keySet());
        Collections.sort(arrayList);
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            parcel.writeString(str);
            Object obj2 = bundle.get(str);
            if (obj2 instanceof String) {
                parcel.writeInt(1);
                parcel.writeString((String) obj2);
            } else if (obj2 instanceof Integer) {
                parcel.writeInt(2);
                parcel.writeInt(((Integer) obj2).intValue());
            } else if (obj2 instanceof Float) {
                parcel.writeInt(3);
                parcel.writeFloat(((Float) obj2).floatValue());
            } else if (obj2 instanceof Boolean) {
                parcel.writeInt(4);
                parcel.writeInt(((Boolean) obj2).booleanValue() ? 1 : 0);
            } else {
                parcel.writeInt(5);
                parcel.writeString(obj2 == null ? "null" : obj2.getClass().getName());
            }
        }
    }
}
