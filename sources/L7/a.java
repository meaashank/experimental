package L7;

import Y6.d;
import Z6.k;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.support.v4.media.i;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c7.C2953e;
import c7.E;
import c7.m;
import com.prism.gaia.server.pm.C;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes6.dex */
public class a extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f58665e = "asdf-".concat(a.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f58666f = "KeystoreNoAttestation";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f58667g = "KeystoreBlackout";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f58668h = "android.system.keystore2.IKeystoreService/default";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f58669i = "gaia:";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f58670j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Boolean f58671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Boolean f58672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f58673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Class<?> f58674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Field f58675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Field f58676p;

    /* JADX INFO: renamed from: L7.a$a, reason: collision with other inner class name */
    public class C0072a extends m {
        public C0072a() {
        }

        @Override // c7.m
        public String A() {
            return "getSecurityLevel";
        }

        @Override // c7.m
        public Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            return a.S(obj2);
        }
    }

    public static class b extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f58678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f58679e;

        public b(String str, Object obj) {
            this.f58678d = str;
            this.f58679e = obj;
        }

        @Override // c7.m
        public String A() {
            return this.f58678d;
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) {
            return this.f58679e;
        }
    }

    public static class c extends m {
        public c() {
        }

        @Override // c7.m
        public String A() {
            return "getNumberOfEntries";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                int i10 = 0;
                Object objInvoke = obj.getClass().getMethod("listEntries", Integer.TYPE, Long.TYPE).invoke(obj, objArr[0], objArr[1]);
                if (objInvoke instanceof Object[]) {
                    Object[] objArr2 = (Object[]) objInvoke;
                    int length = objArr2.length;
                    int i11 = 0;
                    while (i10 < length) {
                        if (a.I(a.E(objArr2[i10])) != null) {
                            i11++;
                        }
                        i10++;
                    }
                    i10 = i11;
                }
                return Integer.valueOf(i10);
            } catch (Throwable unused) {
                String unused2 = a.f58665e;
                return method.invoke(obj, objArr);
            }
        }

        public c(L7.b bVar) {
        }
    }

    public static class d extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f58680d;

        public d(String str) {
            this.f58680d = str;
        }

        @Override // c7.m
        public String A() {
            return this.f58680d;
        }

        @Override // c7.m
        public Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (!(obj2 instanceof Object[])) {
                return obj2;
            }
            Object[] objArr2 = (Object[]) obj2;
            ArrayList arrayList = new ArrayList(objArr2.length);
            for (Object obj3 : objArr2) {
                String strI = a.I(a.E(obj3));
                if (strI != null && a.R(obj3, strI)) {
                    arrayList.add(obj3);
                }
            }
            if (arrayList.size() == objArr2.length) {
                return obj2;
            }
            String unused = a.f58665e;
            arrayList.size();
            return arrayList.toArray((Object[]) Array.newInstance(objArr2.getClass().getComponentType(), arrayList.size()));
        }
    }

    public static class e extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f58681d;

        public e(String str) {
            this.f58681d = str;
        }

        @Override // c7.m
        public String A() {
            return this.f58681d;
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            if (objArr != null) {
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    objArr[i10] = a.M(objArr[i10]);
                }
            }
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e10) {
                if (e10.getCause() != null) {
                    throw e10.getCause();
                }
                throw e10;
            }
        }
    }

    public static class f extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f58682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f58683e;

        public f(String str, int i10) {
            this.f58682d = str;
            this.f58683e = i10;
        }

        @Override // c7.m
        public String A() {
            return this.f58682d;
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            throw a.Q(this.f58683e);
        }
    }

    public static class g extends m {
        public g() {
        }

        public static boolean u0(Object obj, int i10) {
            return obj.getClass().getField(d.C0152d.f79310d).getInt(obj) == i10;
        }

        @Override // c7.m
        public String A() {
            return "generateKey";
        }

        @Override // c7.m
        public boolean b(Object obj, Method method, Object... objArr) {
            int iG = a.G("android.hardware.security.keymint.Tag", "ATTESTATION_CHALLENGE", Integer.MIN_VALUE);
            if (objArr != null && iG != Integer.MIN_VALUE) {
                int i10 = 0;
                while (true) {
                    if (i10 >= objArr.length) {
                        break;
                    }
                    if (!(objArr[i10] instanceof Object[]) || a.K().isInstance(objArr[i10])) {
                        i10++;
                    } else {
                        Object[] objArr2 = (Object[]) objArr[i10];
                        ArrayList arrayList = new ArrayList(objArr2.length);
                        boolean z10 = false;
                        for (Object obj2 : objArr2) {
                            if (obj2 == null || !u0(obj2, iG)) {
                                arrayList.add(obj2);
                            } else {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            objArr[i10] = arrayList.toArray((Object[]) Array.newInstance(objArr2.getClass().getComponentType(), arrayList.size()));
                            String str = a.f58665e;
                            m.w();
                        }
                    }
                }
            }
            return true;
        }

        public g(L7.b bVar) {
        }
    }

    public static void D(C2953e<IInterface> c2953e) {
        c2953e.f(new f("getSecurityLevel", G("android.hardware.security.keymint.ErrorCode", "HARDWARE_TYPE_UNAVAILABLE", -68)));
        int iN = N();
        String[] strArr = {"getKeyEntry", "updateSubcomponent", "grant"};
        for (int i10 = 0; i10 < 3; i10++) {
            c2953e.f(new f(strArr[i10], iN));
        }
        Object objL = L();
        c2953e.f(new b("listEntries", objL));
        c2953e.f(new b("listEntriesBatched", objL));
        c2953e.f(new b("getNumberOfEntries", 0));
        c2953e.f(new b("deleteKey", null));
        c2953e.f(new b("ungrant", null));
    }

    public static String E(Object obj) {
        if (obj != null && K().isInstance(obj)) {
            try {
                if (f58676p.getInt(obj) != 0) {
                    return null;
                }
                return (String) f58675o.get(obj);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static boolean F() {
        if (f58671k == null) {
            k.c(f58667g);
            f58671k = Boolean.FALSE;
        }
        return f58671k.booleanValue();
    }

    public static int G(String str, String str2, int i10) {
        try {
            return Class.forName(str).getField(str2).getInt(null);
        } catch (Throwable unused) {
            return i10;
        }
    }

    public static Object H(Object obj) {
        try {
            return C.b((Parcelable) obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String I(String str) {
        String strP = P();
        if (str == null || strP == null || !str.startsWith(strP)) {
            return null;
        }
        return str.substring(strP.length());
    }

    public static int J(String str, int i10) {
        String str2;
        int i11 = 0;
        if (str == null) {
            return 0;
        }
        if (i10 < 0) {
            str2 = null;
        } else {
            str2 = f58669i + i10 + com.prism.gaia.server.accounts.b.f166434b0 + str + com.prism.gaia.server.accounts.b.f166434b0;
        }
        String strA = i.a(com.prism.gaia.server.accounts.b.f166434b0, str, com.prism.gaia.server.accounts.b.f166434b0);
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            ArrayList arrayList = new ArrayList();
            Enumeration<String> enumerationAliases = keyStore.aliases();
            while (enumerationAliases.hasMoreElements()) {
                String strNextElement = enumerationAliases.nextElement();
                if (strNextElement != null && strNextElement.startsWith(f58669i)) {
                    if (str2 != null ? strNextElement.startsWith(str2) : strNextElement.contains(strA)) {
                        arrayList.add(strNextElement);
                    }
                }
            }
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                try {
                    keyStore.deleteEntry((String) obj);
                    i11++;
                } catch (Throwable unused) {
                }
            }
            if (i11 > 0 && i10 >= 0) {
                String.valueOf(i10);
            }
        } catch (Throwable unused2) {
        }
        return i11;
    }

    public static Class<?> K() {
        if (f58674n == null) {
            try {
                Class<?> cls = Class.forName("android.system.keystore2.KeyDescriptor");
                f58674n = cls;
                f58675o = cls.getField("alias");
                f58676p = f58674n.getField("domain");
            } catch (Throwable unused) {
                f58674n = Void.class;
            }
        }
        return f58674n;
    }

    public static Object L() {
        try {
            return Array.newInstance(Class.forName("android.system.keystore2.KeyDescriptor"), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object M(Object obj) {
        Object objH;
        String strE = E(obj);
        String strP = P();
        return (strE == null || strP == null || strE.startsWith(f58669i) || (objH = H(obj)) == null || !R(objH, strP.concat(strE))) ? obj : objH;
    }

    public static int N() {
        return G("android.system.keystore2.ResponseCode", "KEY_NOT_FOUND", 7);
    }

    public static boolean O() {
        if (f58672l == null) {
            k.c(f58666f);
            f58672l = Boolean.FALSE;
        }
        return f58672l.booleanValue();
    }

    @Nullable
    public static String P() {
        String str = f58673m;
        if (str != null) {
            return str;
        }
        String strQ = m.q();
        if (strQ == null) {
            return null;
        }
        String str2 = f58669i + m.M() + com.prism.gaia.server.accounts.b.f166434b0 + strQ + com.prism.gaia.server.accounts.b.f166434b0;
        f58673m = str2;
        return str2;
    }

    public static Throwable Q(int i10) {
        try {
            return (Throwable) Class.forName("android.os.ServiceSpecificException").getConstructor(Integer.TYPE).newInstance(Integer.valueOf(i10));
        } catch (Throwable unused) {
            return new IllegalStateException(android.support.v4.media.c.a("keystore status ", i10));
        }
    }

    public static boolean R(Object obj, String str) {
        try {
            f58675o.set(obj, str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Object S(Object obj) {
        if (!(obj instanceof IInterface)) {
            return obj;
        }
        try {
            C2953e c2953e = new C2953e(null, (IInterface) obj, null);
            String[] strArr = {"generateKey", "importKey", "importWrappedKey", "createOperation", "convertStorageKeyToEphemeral", "deleteKey"};
            for (int i10 = 0; i10 < 6; i10++) {
                c2953e.f(new e(strArr[i10]));
            }
            if (O()) {
                c2953e.f(new g());
            }
            return c2953e.f131257f;
        } catch (Throwable unused) {
            return obj;
        }
    }

    @Override // c7.E
    public void d(@NonNull C2953e<IInterface> c2953e) {
        if (F()) {
            D(c2953e);
            return;
        }
        String[] strArr = {"getKeyEntry", "deleteKey", "updateSubcomponent", "grant", "ungrant"};
        for (int i10 = 0; i10 < 5; i10++) {
            c2953e.f(new e(strArr[i10]));
        }
        c2953e.f(new d("listEntries"));
        c2953e.f(new d("listEntriesBatched"));
        c2953e.f(new c());
        c2953e.f(new C0072a());
    }

    @Override // c7.E
    @Nullable
    public IInterface i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            return (IInterface) Class.forName("android.system.keystore2.IKeystoreService$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // c7.E
    public String l() {
        return f58668h;
    }
}
