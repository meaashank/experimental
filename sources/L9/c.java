package L9;

import android.os.Parcel;
import com.android.launcher3.IconCache;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f58720e = "applicationInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f58722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Field> f58723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f58724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f58719d = "asdf-".concat(c.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map<Class<?>, c> f58721f = new HashMap();

    public class a implements Comparator<Field> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Field field, Field field2) {
            int iCompareTo = field.getDeclaringClass().getName().compareTo(field2.getDeclaringClass().getName());
            return iCompareTo != 0 ? iCompareTo : field.getName().compareTo(field2.getName());
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f58726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field[] f58727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f58728d;

        public List<String> a() {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                String[] strArr = this.f58726b;
                if (i10 >= strArr.length) {
                    return arrayList;
                }
                if (this.f58727c[i10] == null) {
                    arrayList.add(strArr[i10]);
                }
                i10++;
            }
        }

        public String b() {
            return this.f58725a;
        }

        public void c(Parcel parcel, Object obj) {
            for (int i10 = 0; i10 < this.f58726b.length; i10++) {
                Field field = this.f58727c[i10];
                String str = this.f58725a + IconCache.EMPTY_CLASS_NAME + this.f58726b[i10];
                if (field == null) {
                    e.m(parcel, str);
                } else {
                    Object objE = e.e(parcel, field.getType(), str, this.f58728d);
                    if (objE != e.f58750v && (objE != null || !field.getType().isPrimitive())) {
                        try {
                            field.set(obj, objE);
                        } catch (Throwable th) {
                            String unused = c.f58719d;
                            th.getMessage();
                        }
                    }
                }
            }
        }

        public void d(boolean z10) {
            this.f58728d = z10;
        }

        public b(String str, String[] strArr, Field[] fieldArr) {
            this.f58725a = str;
            this.f58726b = strArr;
            this.f58727c = fieldArr;
        }
    }

    public c(Class<?> cls, List<Field> list) {
        this.f58722a = cls;
        this.f58723b = list;
        this.f58724c = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f58724c[i10] = e.n(list.get(i10).getType());
        }
    }

    public static List<Field> b(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers()) && !field.isSynthetic() && !f58720e.equals(field.getName())) {
                    field.setAccessible(true);
                    arrayList.add(field);
                }
            }
            cls = cls.getSuperclass();
        }
        Collections.sort(arrayList, new a());
        return arrayList;
    }

    public static synchronized c c(Class<?> cls) {
        c cVar;
        Map<Class<?>, c> map = f58721f;
        cVar = map.get(cls);
        if (cVar == null) {
            cVar = new c(cls, b(cls));
            map.put(cls, cVar);
        }
        return cVar;
    }

    public static b d(Parcel parcel, Class<?> cls) {
        String string = parcel.readString();
        int i10 = parcel.readInt();
        String[] strArr = new String[i10];
        Field[] fieldArr = new Field[i10];
        HashMap map = new HashMap();
        ArrayList arrayList = (ArrayList) b(cls);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Field field = (Field) obj;
            map.put(field.getName(), field);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            strArr[i12] = parcel.readString();
            parcel.readInt();
            fieldArr[i12] = (Field) map.get(strArr[i12]);
        }
        return new b(string, strArr, fieldArr);
    }

    public void e(Parcel parcel, Object obj) {
        Object obj2;
        for (int i10 = 0; i10 < this.f58723b.size(); i10++) {
            Field field = this.f58723b.get(i10);
            try {
                obj2 = field.get(obj);
            } catch (Throwable th) {
                this.f58722a.getSimpleName();
                field.getName();
                th.getMessage();
                obj2 = null;
            }
            e.o(parcel, this.f58724c[i10], obj2, field.getType());
        }
    }

    public void f(Parcel parcel) {
        parcel.writeString(this.f58722a.getName());
        parcel.writeInt(this.f58723b.size());
        for (int i10 = 0; i10 < this.f58723b.size(); i10++) {
            parcel.writeString(this.f58723b.get(i10).getName());
            parcel.writeInt(this.f58724c[i10]);
        }
    }
}
