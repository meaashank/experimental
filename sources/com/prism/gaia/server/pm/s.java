package com.prism.gaia.server.pm;

import L9.c;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import com.android.launcher3.IconCache;
import com.prism.gaia.server.pm.PackageG;
import com.prism.gaia.server.pm.PackageParserG;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.parser.ParseErrorList;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f167634b = 1196444466;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f167635c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f167636d = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f167638f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f167639g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f167640h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f167641i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f167642j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f167643k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f167644l = 6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f167645m = 7;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f167646n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f167633a = "asdf-".concat(s.class.getSimpleName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f167637e = {ApplicationInfo.class, ActivityInfo.class, ServiceInfo.class, ProviderInfo.class, InstrumentationInfo.class, PermissionInfo.class, PermissionGroupInfo.class, ConfigurationInfo.class, FeatureInfo.class};

    public static List<String> a() {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : f167637e) {
            ArrayList arrayList2 = (ArrayList) L9.e.d(cls);
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                arrayList.add(cls.getSimpleName() + IconCache.EMPTY_CLASS_NAME + ((String) obj));
            }
        }
        return arrayList;
    }

    public static Object b(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (Throwable th) {
            throw new IllegalStateException("cannot instantiate ".concat(cls.getName()), th);
        }
    }

    public static PackageG c(Parcel parcel) {
        int i10;
        if (parcel.readInt() != 1196444466 || (i10 = parcel.readInt()) > 2) {
            return null;
        }
        boolean z10 = true;
        if (i10 < 1) {
            return null;
        }
        boolean z11 = i10 < 2;
        int i11 = parcel.readInt();
        String string = parcel.readString();
        int i12 = Build.VERSION.SDK_INT;
        if (i11 != i12 || (string != null && !string.equals(Build.VERSION.INCREMENTAL))) {
            String str = Build.VERSION.INCREMENTAL;
        }
        if (i11 != i12 || (string != null && !string.equals(Build.VERSION.INCREMENTAL))) {
            z10 = false;
        }
        c.b[] bVarArr = new c.b[f167637e.length];
        int i13 = 0;
        while (true) {
            Class<?>[] clsArr = f167637e;
            if (i13 >= clsArr.length) {
                break;
            }
            c.b bVarD = L9.c.d(parcel, clsArr[i13]);
            bVarArr[i13] = bVarD;
            bVarD.f58728d = z10;
            if (!((ArrayList) bVarD.a()).isEmpty()) {
                String str2 = bVarArr[i13].f58725a;
            }
            i13++;
        }
        PackageG packageG = new PackageG();
        packageG.f167497J = z11;
        ApplicationInfo applicationInfo = (ApplicationInfo) n(parcel, bVarArr, 0, ApplicationInfo.class);
        packageG.f167508k = applicationInfo;
        packageG.f167498a = d(parcel, bVarArr, applicationInfo);
        packageG.f167499b = d(parcel, bVarArr, packageG.f167508k);
        packageG.f167501d = m(parcel, bVarArr, packageG.f167508k);
        packageG.f167500c = l(parcel, bVarArr, packageG.f167508k);
        packageG.f167502e = f(parcel, bVarArr);
        packageG.f167503f = i(parcel, bVarArr);
        packageG.f167504g = j(parcel, bVarArr);
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        packageG.f167505h = arrayListCreateStringArrayList;
        if (arrayListCreateStringArrayList == null) {
            packageG.f167505h = new ArrayList<>(0);
        }
        packageG.f167507j = parcel.createStringArrayList();
        packageG.f167511n = h(parcel);
        packageG.f167512o = parcel.readString();
        packageG.f167513p = parcel.readInt();
        packageG.f167514q = parcel.readString();
        packageG.f167515r = parcel.readString();
        packageG.f167516s = parcel.createStringArrayList();
        packageG.f167517t = parcel.createStringArrayList();
        packageG.f167518u = parcel.createStringArrayList();
        packageG.f167519v = parcel.readInt();
        packageG.f167520w = parcel.readInt();
        packageG.f167521x = parcel.readInt();
        packageG.f167522y = o(parcel, bVarArr, 7, ConfigurationInfo.class);
        packageG.f167523z = o(parcel, bVarArr, 8, FeatureInfo.class);
        packageG.f167489B = parcel.createStringArray();
        packageG.f167490C = parcel.createIntArray();
        packageG.f167491D = (PackageG.State) e(parcel, PackageG.State.class, PackageG.State.DEFAULT);
        packageG.f167492E = (PackageG.StateCode) e(parcel, PackageG.StateCode.class, PackageG.StateCode.DEFAULT);
        packageG.f167493F = parcel.readString();
        packageG.f167494G = parcel.readInt();
        packageG.j();
        return packageG;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static ArrayList<PackageParserG.a> d(Parcel parcel, c.b[] bVarArr, ApplicationInfo applicationInfo) {
        int i10 = parcel.readInt();
        ArrayList<PackageParserG.a> arrayList = new ArrayList<>(i10);
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return arrayList;
            }
            PackageParserG.a aVar = new PackageParserG.a();
            ActivityInfo activityInfo = (ActivityInfo) n(parcel, bVarArr, 1, ActivityInfo.class);
            aVar.f167529f = activityInfo;
            if (activityInfo != null) {
                activityInfo.applicationInfo = applicationInfo;
            }
            aVar.f167532c = parcel.readString();
            aVar.f167533d = h(parcel);
            int i12 = parcel.readInt();
            while (true) {
                int i13 = i12 - 1;
                if (i12 > 0) {
                    PackageParserG.ActivityIntentInfo activityIntentInfo = new PackageParserG.ActivityIntentInfo();
                    g(parcel, activityIntentInfo);
                    aVar.f167531b.add(activityIntentInfo);
                    i12 = i13;
                }
            }
            arrayList.add(aVar);
            i10 = i11;
        }
    }

    public static <E extends Enum<E>> E e(Parcel parcel, Class<E> cls, E e10) {
        String string = parcel.readString();
        if (string == null) {
            return e10;
        }
        try {
            return (E) Enum.valueOf(cls, string);
        } catch (IllegalArgumentException unused) {
            cls.getSimpleName();
            return e10;
        }
    }

    public static ArrayList<PackageParserG.c> f(Parcel parcel, c.b[] bVarArr) {
        int i10 = parcel.readInt();
        ArrayList<PackageParserG.c> arrayList = new ArrayList<>(i10);
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return arrayList;
            }
            PackageParserG.c cVar = new PackageParserG.c();
            cVar.f167535f = (InstrumentationInfo) n(parcel, bVarArr, 4, InstrumentationInfo.class);
            cVar.f167532c = parcel.readString();
            cVar.f167533d = h(parcel);
            k(parcel, cVar.f167531b);
            arrayList.add(cVar);
            i10 = i11;
        }
    }

    public static void g(Parcel parcel, PackageParserG.IntentInfo intentInfo) {
        intentInfo.filter = L9.b.h(parcel);
        intentInfo.hasDefault = parcel.readInt() != 0;
        intentInfo.labelRes = parcel.readInt();
        intentInfo.nonLocalizedLabel = parcel.readString();
        intentInfo.icon = parcel.readInt();
        intentInfo.logo = parcel.readInt();
        intentInfo.banner = parcel.readInt();
    }

    public static Bundle h(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return L9.a.a(parcel);
    }

    public static ArrayList<PackageParserG.d> i(Parcel parcel, c.b[] bVarArr) {
        int i10 = parcel.readInt();
        ArrayList<PackageParserG.d> arrayList = new ArrayList<>(i10);
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return arrayList;
            }
            PackageParserG.d dVar = new PackageParserG.d();
            dVar.f167536f = (PermissionInfo) n(parcel, bVarArr, 5, PermissionInfo.class);
            dVar.f167532c = parcel.readString();
            dVar.f167533d = h(parcel);
            k(parcel, dVar.f167531b);
            arrayList.add(dVar);
            i10 = i11;
        }
    }

    public static ArrayList<PackageParserG.e> j(Parcel parcel, c.b[] bVarArr) {
        int i10 = parcel.readInt();
        ArrayList<PackageParserG.e> arrayList = new ArrayList<>(i10);
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return arrayList;
            }
            PackageParserG.e eVar = new PackageParserG.e();
            eVar.f167537f = (PermissionGroupInfo) n(parcel, bVarArr, 6, PermissionGroupInfo.class);
            eVar.f167532c = parcel.readString();
            eVar.f167533d = h(parcel);
            k(parcel, eVar.f167531b);
            arrayList.add(eVar);
            i10 = i11;
        }
    }

    public static void k(Parcel parcel, List<PackageParserG.IntentInfo> list) {
        int i10 = parcel.readInt();
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return;
            }
            PackageParserG.IntentInfo intentInfo = new PackageParserG.IntentInfo();
            g(parcel, intentInfo);
            list.add(intentInfo);
            i10 = i11;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static ArrayList<PackageParserG.f> l(Parcel parcel, c.b[] bVarArr, ApplicationInfo applicationInfo) {
        int i10 = parcel.readInt();
        ArrayList<PackageParserG.f> arrayList = new ArrayList<>(i10);
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return arrayList;
            }
            PackageParserG.f fVar = new PackageParserG.f();
            ProviderInfo providerInfo = (ProviderInfo) n(parcel, bVarArr, 3, ProviderInfo.class);
            fVar.f167538f = providerInfo;
            if (providerInfo != null) {
                providerInfo.applicationInfo = applicationInfo;
            }
            fVar.f167532c = parcel.readString();
            fVar.f167533d = h(parcel);
            int i12 = parcel.readInt();
            while (true) {
                int i13 = i12 - 1;
                if (i12 > 0) {
                    PackageParserG.ProviderIntentInfo providerIntentInfo = new PackageParserG.ProviderIntentInfo();
                    g(parcel, providerIntentInfo);
                    fVar.f167531b.add(providerIntentInfo);
                    i12 = i13;
                }
            }
            arrayList.add(fVar);
            i10 = i11;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static ArrayList<PackageParserG.g> m(Parcel parcel, c.b[] bVarArr, ApplicationInfo applicationInfo) {
        int i10 = parcel.readInt();
        ArrayList<PackageParserG.g> arrayList = new ArrayList<>(i10);
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return arrayList;
            }
            PackageParserG.g gVar = new PackageParserG.g();
            ServiceInfo serviceInfo = (ServiceInfo) n(parcel, bVarArr, 2, ServiceInfo.class);
            gVar.f167539f = serviceInfo;
            if (serviceInfo != null) {
                serviceInfo.applicationInfo = applicationInfo;
            }
            gVar.f167532c = parcel.readString();
            gVar.f167533d = h(parcel);
            int i12 = parcel.readInt();
            while (true) {
                int i13 = i12 - 1;
                if (i12 > 0) {
                    PackageParserG.ServiceIntentInfo serviceIntentInfo = new PackageParserG.ServiceIntentInfo();
                    g(parcel, serviceIntentInfo);
                    gVar.f167531b.add(serviceIntentInfo);
                    i12 = i13;
                }
            }
            arrayList.add(gVar);
            i10 = i11;
        }
    }

    public static Object n(Parcel parcel, c.b[] bVarArr, int i10, Class<?> cls) {
        if (parcel.readInt() == 0) {
            return null;
        }
        Object objB = b(cls);
        bVarArr[i10].c(parcel, objB);
        return objB;
    }

    public static <T> ArrayList<T> o(Parcel parcel, c.b[] bVarArr, int i10, Class<T> cls) {
        int i11 = parcel.readInt();
        if (i11 < 0) {
            return null;
        }
        ParseErrorList parseErrorList = (ArrayList<T>) new ArrayList(i11);
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                return parseErrorList;
            }
            parseErrorList.add(n(parcel, bVarArr, i10, cls));
            i11 = i12;
        }
    }

    public static void p(Parcel parcel, PackageG packageG) {
        parcel.writeInt(f167634b);
        parcel.writeInt(2);
        parcel.writeInt(Build.VERSION.SDK_INT);
        parcel.writeString(Build.VERSION.INCREMENTAL);
        for (Class<?> cls : f167637e) {
            L9.c.c(cls).f(parcel);
        }
        t(parcel, 0, packageG.f167508k);
        q(parcel, 1, packageG.f167498a);
        q(parcel, 1, packageG.f167499b);
        q(parcel, 2, packageG.f167501d);
        q(parcel, 3, packageG.f167500c);
        q(parcel, 4, packageG.f167502e);
        q(parcel, 5, packageG.f167503f);
        q(parcel, 6, packageG.f167504g);
        parcel.writeStringList(packageG.f167505h);
        parcel.writeStringList(packageG.f167507j);
        s(parcel, packageG.f167511n);
        parcel.writeString(packageG.f167512o);
        parcel.writeInt(packageG.f167513p);
        parcel.writeString(packageG.f167514q);
        parcel.writeString(packageG.f167515r);
        parcel.writeStringList(packageG.f167516s);
        parcel.writeStringList(packageG.f167517t);
        parcel.writeStringList(packageG.f167518u);
        parcel.writeInt(packageG.f167519v);
        parcel.writeInt(packageG.f167520w);
        parcel.writeInt(packageG.f167521x);
        u(parcel, 7, packageG.f167522y);
        u(parcel, 8, packageG.f167523z);
        parcel.writeStringArray(packageG.f167489B);
        parcel.writeIntArray(packageG.f167490C);
        PackageG.State state = packageG.f167491D;
        parcel.writeString(state == null ? null : state.name());
        PackageG.StateCode stateCode = packageG.f167492E;
        parcel.writeString(stateCode != null ? stateCode.name() : null);
        parcel.writeString(packageG.f167493F);
        parcel.writeInt(packageG.r());
    }

    public static void q(Parcel parcel, int i10, List<? extends PackageParserG.b<?>> list) {
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(list.size());
        for (PackageParserG.b<?> bVar : list) {
            t(parcel, i10, bVar.a());
            parcel.writeString(bVar.f167532c);
            s(parcel, bVar.f167533d);
            r(parcel, bVar.f167531b);
        }
    }

    public static void r(Parcel parcel, List<? extends PackageParserG.IntentInfo> list) {
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(list.size());
        for (PackageParserG.IntentInfo intentInfo : list) {
            L9.b.j(parcel, intentInfo.filter);
            parcel.writeInt(intentInfo.hasDefault ? 1 : 0);
            parcel.writeInt(intentInfo.labelRes);
            parcel.writeString(intentInfo.nonLocalizedLabel);
            parcel.writeInt(intentInfo.icon);
            parcel.writeInt(intentInfo.logo);
            parcel.writeInt(intentInfo.banner);
        }
    }

    public static void s(Parcel parcel, Bundle bundle) {
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            L9.a.b(parcel, bundle);
        }
    }

    public static void t(Parcel parcel, int i10, Object obj) {
        if (obj == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            L9.c.c(f167637e[i10]).e(parcel, obj);
        }
    }

    public static <T> void u(Parcel parcel, int i10, List<T> list) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            t(parcel, i10, it.next());
        }
    }
}
