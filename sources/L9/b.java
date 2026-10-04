package L9;

import android.content.IntentFilter;
import android.os.Parcel;
import android.os.PatternMatcher;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f58710a = "asdf-".concat(b.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f58711b = d("getAutoVerify", new Class[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f58712c = d("setAutoVerify", Boolean.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f58713d = d("getOrder", new Class[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f58714e = d("setOrder", Integer.TYPE);

    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IntentFilter f58715a;

        public a(IntentFilter intentFilter) {
            this.f58715a = intentFilter;
        }

        @Override // L9.b.e
        public String get(int i10) {
            return this.f58715a.getAction(i10);
        }
    }

    /* JADX INFO: renamed from: L9.b$b, reason: collision with other inner class name */
    public class C0073b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IntentFilter f58716a;

        public C0073b(IntentFilter intentFilter) {
            this.f58716a = intentFilter;
        }

        @Override // L9.b.e
        public String get(int i10) {
            return this.f58716a.getCategory(i10);
        }
    }

    public class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IntentFilter f58717a;

        public c(IntentFilter intentFilter) {
            this.f58717a = intentFilter;
        }

        @Override // L9.b.e
        public String get(int i10) {
            return this.f58717a.getDataScheme(i10);
        }
    }

    public class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IntentFilter f58718a;

        public d(IntentFilter intentFilter) {
            this.f58718a = intentFilter;
        }

        @Override // L9.b.e
        public String get(int i10) {
            return b.c(this.f58718a.getDataType(i10));
        }
    }

    public interface e {
        String get(int i10);
    }

    public static int b(int i10) {
        return Math.max(i10, 0);
    }

    public static String c(String str) {
        return (str == null || str.indexOf(47) >= 0) ? str : str.concat("/*");
    }

    public static Method d(String str, Class<?>... clsArr) {
        try {
            Method method = IntentFilter.class.getMethod(str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean e(Method method, IntentFilter intentFilter) {
        if (method == null) {
            return false;
        }
        try {
            return Boolean.TRUE.equals(method.invoke(intentFilter, null));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int f(Method method, IntentFilter intentFilter) {
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(intentFilter, null);
            if (objInvoke instanceof Integer) {
                return ((Integer) objInvoke).intValue();
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static void g(Method method, IntentFilter intentFilter, Object obj) {
        if (method == null) {
            return;
        }
        try {
            method.invoke(intentFilter, obj);
        } catch (Throwable th) {
            method.getName();
            th.getMessage();
        }
    }

    public static IntentFilter h(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.setPriority(parcel.readInt());
        int i10 = parcel.readInt();
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                break;
            }
            String string = parcel.readString();
            if (string != null) {
                intentFilter.addAction(string);
            }
            i10 = i11;
        }
        int i12 = parcel.readInt();
        while (true) {
            int i13 = i12 - 1;
            if (i12 <= 0) {
                break;
            }
            String string2 = parcel.readString();
            if (string2 != null) {
                intentFilter.addCategory(string2);
            }
            i12 = i13;
        }
        int i14 = parcel.readInt();
        while (true) {
            int i15 = i14 - 1;
            if (i14 <= 0) {
                break;
            }
            String string3 = parcel.readString();
            if (string3 != null) {
                intentFilter.addDataScheme(string3);
            }
            i14 = i15;
        }
        int i16 = parcel.readInt();
        while (true) {
            int i17 = i16 - 1;
            if (i16 <= 0) {
                break;
            }
            String string4 = parcel.readString();
            if (string4 != null) {
                try {
                    intentFilter.addDataType(string4);
                } catch (IntentFilter.MalformedMimeTypeException e10) {
                    e10.getMessage();
                }
            }
            i16 = i17;
        }
        int i18 = parcel.readInt();
        while (true) {
            int i19 = i18 - 1;
            if (i18 <= 0) {
                break;
            }
            PatternMatcher patternMatcherI = i(parcel);
            if (patternMatcherI != null) {
                intentFilter.addDataSchemeSpecificPart(patternMatcherI.getPath(), patternMatcherI.getType());
            }
            i18 = i19;
        }
        int i20 = parcel.readInt();
        while (true) {
            int i21 = i20 - 1;
            if (i20 <= 0) {
                break;
            }
            PatternMatcher patternMatcherI2 = i(parcel);
            if (patternMatcherI2 != null) {
                intentFilter.addDataPath(patternMatcherI2.getPath(), patternMatcherI2.getType());
            }
            i20 = i21;
        }
        int i22 = parcel.readInt();
        while (true) {
            int i23 = i22 - 1;
            if (i22 <= 0) {
                break;
            }
            String string5 = parcel.readString();
            int i24 = parcel.readInt();
            if (string5 != null) {
                intentFilter.addDataAuthority(string5, i24 < 0 ? null : String.valueOf(i24));
            }
            i22 = i23;
        }
        boolean z10 = parcel.readInt() != 0;
        int i25 = parcel.readInt();
        if (z10) {
            g(f58712c, intentFilter, Boolean.TRUE);
        }
        if (i25 != 0) {
            g(f58714e, intentFilter, Integer.valueOf(i25));
        }
        return intentFilter;
    }

    public static PatternMatcher i(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        String string = parcel.readString();
        int i10 = parcel.readInt();
        if (string == null) {
            return null;
        }
        return new PatternMatcher(string, i10);
    }

    public static void j(Parcel parcel, IntentFilter intentFilter) {
        if (intentFilter == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(intentFilter.getPriority());
        l(parcel, Math.max(intentFilter.countActions(), 0), new a(intentFilter));
        l(parcel, Math.max(intentFilter.countCategories(), 0), new C0073b(intentFilter));
        l(parcel, Math.max(intentFilter.countDataSchemes(), 0), new c(intentFilter));
        l(parcel, Math.max(intentFilter.countDataTypes(), 0), new d(intentFilter));
        int iCountDataSchemeSpecificParts = intentFilter.countDataSchemeSpecificParts();
        parcel.writeInt(iCountDataSchemeSpecificParts);
        for (int i10 = 0; i10 < iCountDataSchemeSpecificParts; i10++) {
            k(parcel, intentFilter.getDataSchemeSpecificPart(i10));
        }
        int iCountDataPaths = intentFilter.countDataPaths();
        parcel.writeInt(iCountDataPaths);
        for (int i11 = 0; i11 < iCountDataPaths; i11++) {
            k(parcel, intentFilter.getDataPath(i11));
        }
        int iCountDataAuthorities = intentFilter.countDataAuthorities();
        parcel.writeInt(iCountDataAuthorities);
        for (int i12 = 0; i12 < iCountDataAuthorities; i12++) {
            IntentFilter.AuthorityEntry dataAuthority = intentFilter.getDataAuthority(i12);
            parcel.writeString(dataAuthority == null ? null : dataAuthority.getHost());
            parcel.writeInt(dataAuthority == null ? -1 : dataAuthority.getPort());
        }
        parcel.writeInt(e(f58711b, intentFilter) ? 1 : 0);
        parcel.writeInt(f(f58713d, intentFilter));
    }

    public static void k(Parcel parcel, PatternMatcher patternMatcher) {
        if (patternMatcher == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(patternMatcher.getPath());
        parcel.writeInt(patternMatcher.getType());
    }

    public static void l(Parcel parcel, int i10, e eVar) {
        parcel.writeInt(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            parcel.writeString(eVar.get(i11));
        }
    }
}
