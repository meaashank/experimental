package L9;

import android.content.pm.PathPermission;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PatternMatcher;
import android.util.ArrayMap;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58730b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58731c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f58732d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f58733e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f58734f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f58735g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f58736h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f58737i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f58738j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f58739k = 9;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f58740l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f58741m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f58742n = 12;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f58743o = 13;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f58744p = 14;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f58745q = 15;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f58746r = 17;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f58747s = 18;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f58748t = 19;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f58749u = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f58729a = "asdf-".concat(e.class.getSimpleName());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f58750v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Comparator<String> f58751w = new a();

    public class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            if (str == null) {
                return str2 == null ? 0 : -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
    }

    public static boolean a(Map<?, ?> map) {
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (entry.getKey() != null && !(entry.getKey() instanceof String)) {
                return false;
            }
            if (entry.getValue() != null && !(entry.getValue() instanceof String)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Set<?> set) {
        for (Object obj : set) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
        }
        return true;
    }

    public static String c(Class<?> cls, Object obj) {
        String name = cls != null ? cls.getName() : "?";
        if (!(obj instanceof List)) {
            return name;
        }
        StringBuilder sbA = android.support.v4.media.f.a(name, "(size=");
        sbA.append(((List) obj).size());
        sbA.append(")");
        return sbA.toString();
    }

    public static List<String> d(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c.b(cls);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            Field field = (Field) obj;
            if (n(field.getType()) == 16) {
                arrayList.add(field.getName() + com.prism.gaia.server.accounts.b.f166434b0 + field.getType().getName());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Object e(Parcel parcel, Class<?> cls, String str, boolean z10) {
        int i10 = parcel.readInt();
        switch (i10) {
            case 0:
                return null;
            case 1:
                return Integer.valueOf(parcel.readInt());
            case 2:
                return Long.valueOf(parcel.readLong());
            case 3:
                return Boolean.valueOf(parcel.readInt() != 0);
            case 4:
                return Float.valueOf(parcel.readFloat());
            case 5:
                return Double.valueOf(parcel.readDouble());
            case 6:
            case 9:
                return parcel.readString();
            case 7:
                return parcel.createStringArray();
            case 8:
                return parcel.createIntArray();
            case 10:
                return l(parcel, str);
            case 11:
                return i(parcel);
            case 12:
                return h(parcel);
            case 13:
                return g(parcel);
            case 14:
                return f.c(parcel, cls, str);
            case 15:
                return L9.a.a(parcel);
            case 16:
                parcel.readString();
                return f58750v;
            case 17:
                return k(parcel);
            case 18:
                return j(parcel, cls);
            case 19:
                return f(parcel, z10, str);
            default:
                throw new IllegalStateException("unknown value tag(" + i10 + ") at field(" + str + ")");
        }
    }

    public static Object f(Parcel parcel, boolean z10, String str) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray == null) {
            return f58750v;
        }
        if (!z10) {
            return f58750v;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArrCreateByteArray, 0, bArrCreateByteArray.length);
            parcelObtain.setDataPosition(0);
            return parcelObtain.readParcelable(e.class.getClassLoader());
        } catch (Throwable th) {
            try {
                th.getMessage();
                return f58750v;
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    public static PathPermission[] g(Parcel parcel) {
        int i10 = parcel.readInt();
        PathPermission[] pathPermissionArr = new PathPermission[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            if (parcel.readInt() != 0) {
                pathPermissionArr[i11] = new PathPermission(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            }
        }
        return pathPermissionArr;
    }

    public static PatternMatcher[] h(Parcel parcel) {
        int i10 = parcel.readInt();
        PatternMatcher[] patternMatcherArr = new PatternMatcher[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            if (parcel.readInt() != 0) {
                patternMatcherArr[i11] = new PatternMatcher(parcel.readString(), parcel.readInt());
            }
        }
        return patternMatcherArr;
    }

    public static SparseArray<int[]> i(Parcel parcel) {
        int i10 = parcel.readInt();
        SparseArray<int[]> sparseArray = new SparseArray<>(i10);
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return sparseArray;
            }
            sparseArray.put(parcel.readInt(), parcel.createIntArray());
            i10 = i11;
        }
    }

    public static Map<String, String> j(Parcel parcel, Class<?> cls) {
        int i10 = parcel.readInt();
        Map<String, String> linkedHashMap = (cls == null || !ArrayMap.class.isAssignableFrom(cls)) ? new LinkedHashMap<>(Math.max(i10, 1)) : new ArrayMap<>(Math.max(i10, 1));
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return linkedHashMap;
            }
            linkedHashMap.put(parcel.readString(), parcel.readString());
            i10 = i11;
        }
    }

    public static Set<String> k(Parcel parcel) {
        int i10 = parcel.readInt();
        LinkedHashSet linkedHashSet = new LinkedHashSet(Math.max(i10, 1));
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return linkedHashSet;
            }
            linkedHashSet.add(parcel.readString());
            i10 = i11;
        }
    }

    public static Object l(Parcel parcel, String str) {
        String string = parcel.readString();
        if (string == null) {
            return null;
        }
        try {
            return UUID.fromString(string);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void m(Parcel parcel, String str) {
        e(parcel, null, str, false);
    }

    public static int n(Class<?> cls) {
        if (cls == Integer.TYPE || cls == Integer.class) {
            return 1;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return 2;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return 3;
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return 4;
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return 5;
        }
        if (cls == String.class) {
            return 6;
        }
        if (cls == String[].class) {
            return 7;
        }
        if (cls == int[].class) {
            return 8;
        }
        if (CharSequence.class.isAssignableFrom(cls)) {
            return 9;
        }
        if (cls == UUID.class) {
            return 10;
        }
        if (cls == SparseArray.class) {
            return 11;
        }
        if (cls == PatternMatcher[].class) {
            return 12;
        }
        if (cls == PathPermission[].class) {
            return 13;
        }
        if (cls == Bundle.class) {
            return 15;
        }
        if (f.b(cls)) {
            return 14;
        }
        if (Set.class.isAssignableFrom(cls)) {
            return 17;
        }
        if (Map.class.isAssignableFrom(cls)) {
            return 18;
        }
        return Parcelable.class.isAssignableFrom(cls) ? 19 : 16;
    }

    public static void o(Parcel parcel, int i10, Object obj, Class<?> cls) {
        if (obj == null) {
            parcel.writeInt(0);
        }
        if ((i10 == 17 && !b((Set) obj)) || (i10 == 18 && !a((Map) obj))) {
            i10 = 16;
        }
        parcel.writeInt(i10);
        switch (i10) {
            case 1:
                parcel.writeInt(((Integer) obj).intValue());
                break;
            case 2:
                parcel.writeLong(((Long) obj).longValue());
                break;
            case 3:
                parcel.writeInt(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 4:
                parcel.writeFloat(((Float) obj).floatValue());
                break;
            case 5:
                parcel.writeDouble(((Double) obj).doubleValue());
                break;
            case 6:
                parcel.writeString((String) obj);
                break;
            case 7:
                parcel.writeStringArray((String[]) obj);
                break;
            case 8:
                parcel.writeIntArray((int[]) obj);
                break;
            case 9:
                parcel.writeString(obj.toString());
                break;
            case 10:
                parcel.writeString(obj.toString());
                break;
            case 11:
                s(parcel, (SparseArray) obj);
                break;
            case 12:
                r(parcel, (PatternMatcher[]) obj);
                break;
            case 13:
                q(parcel, (PathPermission[]) obj);
                break;
            case 14:
                f.e(parcel, obj);
                break;
            case 15:
                L9.a.b(parcel, (Bundle) obj);
                break;
            case 16:
            default:
                parcel.writeString(c(cls, obj));
                break;
            case 17:
                u(parcel, (Set) obj);
                break;
            case 18:
                t(parcel, (Map) obj);
                break;
            case 19:
                p(parcel, obj, cls);
                break;
        }
    }

    public static void p(Parcel parcel, Object obj, Class<?> cls) {
        byte[] bArrMarshall;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeParcelable((Parcelable) obj, 0);
            bArrMarshall = parcelObtain.marshall();
        } catch (Throwable th) {
            try {
                th.getMessage();
                parcelObtain.recycle();
                bArrMarshall = null;
            } finally {
                parcelObtain.recycle();
            }
        }
        parcel.writeByteArray(bArrMarshall);
    }

    public static void q(Parcel parcel, PathPermission[] pathPermissionArr) {
        parcel.writeInt(pathPermissionArr.length);
        for (PathPermission pathPermission : pathPermissionArr) {
            if (pathPermission == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(pathPermission.getPath());
                parcel.writeInt(pathPermission.getType());
                parcel.writeString(pathPermission.getReadPermission());
                parcel.writeString(pathPermission.getWritePermission());
            }
        }
    }

    public static void r(Parcel parcel, PatternMatcher[] patternMatcherArr) {
        parcel.writeInt(patternMatcherArr.length);
        for (PatternMatcher patternMatcher : patternMatcherArr) {
            if (patternMatcher == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(patternMatcher.getPath());
                parcel.writeInt(patternMatcher.getType());
            }
        }
    }

    public static void s(Parcel parcel, SparseArray<?> sparseArray) {
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(sparseArray.keyAt(i10));
            Object objValueAt = sparseArray.valueAt(i10);
            parcel.writeIntArray(objValueAt instanceof int[] ? (int[]) objValueAt : null);
        }
    }

    public static void t(Parcel parcel, Map<?, ?> map) {
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<?> it = map.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        Collections.sort(arrayList, f58751w);
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            parcel.writeString(str);
            parcel.writeString((String) map.get(str));
        }
    }

    public static void u(Parcel parcel, Set<?> set) {
        ArrayList arrayList = new ArrayList(set.size());
        Iterator<?> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        Collections.sort(arrayList, f58751w);
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            parcel.writeString((String) obj);
        }
    }
}
