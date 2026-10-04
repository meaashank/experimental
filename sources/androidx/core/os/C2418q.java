package androidx.core.os;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.N0;
import e.f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: androidx.core.os.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2418q implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Locale[] f111304c = new Locale[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Locale f111305d = new Locale(z4.e.f241233j, "XA");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Locale f111306e = new Locale("ar", "XB");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Locale f111307f = C2417p.b("en-Latn");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale[] f111308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final String f111309b;

    /* JADX INFO: renamed from: androidx.core.os.q$a */
    @e.T(21)
    public static class a {
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    public C2418q(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f111308a = f111304c;
            this.f111309b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale == null) {
                throw new NullPointerException(N0.a("list[", i10, "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                k(sb2, locale2);
                if (i10 < localeArr.length - 1) {
                    sb2.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f111308a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f111309b = sb2.toString();
    }

    public static String h(Locale locale) {
        String script = locale.getScript();
        return !script.isEmpty() ? script : "";
    }

    public static boolean i(Locale locale) {
        return f111305d.equals(locale) || f111306e.equals(locale);
    }

    @e.D(from = 0, to = 1)
    public static int j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || i(locale) || i(locale2)) {
            return 0;
        }
        String strH = h(locale);
        if (!strH.isEmpty()) {
            return strH.equals(h(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
    }

    @f0
    public static void k(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb2.append(SignatureVisitor.SUPER);
        sb2.append(locale.getCountry());
    }

    @Override // androidx.core.os.r
    public String a() {
        return this.f111309b;
    }

    @Override // androidx.core.os.r
    @Nullable
    public Object b() {
        return null;
    }

    @Override // androidx.core.os.r
    public Locale c(@NonNull String[] strArr) {
        return e(Arrays.asList(strArr), false);
    }

    @Override // androidx.core.os.r
    public int d(Locale locale) {
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f111308a;
            if (i10 >= localeArr.length) {
                return -1;
            }
            if (localeArr[i10].equals(locale)) {
                return i10;
            }
            i10++;
        }
    }

    public final Locale e(Collection<String> collection, boolean z10) {
        int iF = f(collection, z10);
        if (iF == -1) {
            return null;
        }
        return this.f111308a[iF];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2418q)) {
            return false;
        }
        Locale[] localeArr = ((C2418q) obj).f111308a;
        if (this.f111308a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f111308a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f111308a
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L8
            return r3
        L8:
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = -1
            return r5
        Ld:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L1e
            java.util.Locale r6 = androidx.core.os.C2418q.f111307f
            int r6 = r4.g(r6)
            if (r6 != 0) goto L1b
            return r3
        L1b:
            if (r6 >= r0) goto L1e
            goto L1f
        L1e:
            r6 = r0
        L1f:
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = androidx.core.os.C2417p.b(r1)
            int r1 = r4.g(r1)
            if (r1 != 0) goto L3a
            return r3
        L3a:
            if (r1 >= r6) goto L23
            r6 = r1
            goto L23
        L3e:
            if (r6 != r0) goto L41
            return r3
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.os.C2418q.f(java.util.Collection, boolean):int");
    }

    public final int g(Locale locale) {
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f111308a;
            if (i10 >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (j(locale, localeArr[i10]) > 0) {
                return i10;
            }
            i10++;
        }
    }

    @Override // androidx.core.os.r
    public Locale get(int i10) {
        if (i10 < 0) {
            return null;
        }
        Locale[] localeArr = this.f111308a;
        if (i10 < localeArr.length) {
            return localeArr[i10];
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f111308a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.core.os.r
    public boolean isEmpty() {
        return this.f111308a.length == 0;
    }

    @Override // androidx.core.os.r
    public int size() {
        return this.f111308a.length;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f111308a;
            if (i10 >= localeArr.length) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(localeArr[i10]);
            if (i10 < this.f111308a.length - 1) {
                sb2.append(',');
            }
            i10++;
        }
    }
}
