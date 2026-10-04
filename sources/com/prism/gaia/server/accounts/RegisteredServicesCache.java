package com.prism.gaia.server.accounts;

import U6.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import androidx.appcompat.widget.C1498d;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.load.engine.GlideException;
import com.prism.commons.utils.C3838b;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.client.stub.t;
import com.prism.gaia.exception.GaiaRemoteRunnableException;
import com.prism.gaia.helper.GUri;
import com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable;
import com.prism.gaia.helper.io.GFile;
import com.prism.gaia.helper.utils.B;
import com.prism.gaia.helper.utils.C3919b;
import com.prism.gaia.os.GaiaUserHandle;
import com.prism.gaia.os.UserInfoG;
import com.prism.gaia.server.pm.BinderC4171f;
import com.prism.gaia.server.pm.GaiaUserManagerService;
import com.prism.gaia.server.pm.PackageG;
import com.prism.gaia.server.pm.PackageSettingG;
import e.InterfaceC4326A;
import g6.C4455a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RegisteredServicesCache<V extends Parcelable> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f166368n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f166369o = 1000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final boolean f166371q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f166372r = "registered_services";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f166374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f166375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f166376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f166377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B<V> f166378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f166379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC4326A("mServicesLock")
    public final SparseArray<f<V>> f166380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p<V> f166381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f166382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ExecutorService f166383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f166384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f166385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f166367m = "asdf-".concat(RegisteredServicesCache.class.getSimpleName());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Handler f166370p = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Set<String> f166373s = new HashSet();

    public static class SpaceNotInitializedException extends XmlPullParserException {
        public SpaceNotInitializedException(String str) {
            super(str);
        }
    }

    public class a extends t {
        public a() {
        }

        @Override // com.prism.gaia.client.stub.t
        public void b(Context context, final Intent intent) {
            int intExtra = intent.getIntExtra("android.intent.extra.UID", -1);
            if (intExtra == -1) {
                return;
            }
            final int vuserId = GaiaUserHandle.getVuserId(intExtra);
            String unused = RegisteredServicesCache.f166367m;
            try {
                RegisteredServicesCache.this.f166383j.execute(new Runnable() { // from class: com.prism.gaia.server.accounts.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f166610a.d(intent, vuserId);
                    }
                });
            } catch (RejectedExecutionException unused2) {
                String str = RegisteredServicesCache.f166367m;
            }
        }

        public final /* synthetic */ void d(Intent intent, int i10) {
            try {
                RegisteredServicesCache.this.A(intent, i10);
            } catch (Throwable unused) {
                String unused2 = RegisteredServicesCache.f166367m;
            }
        }
    }

    public class b extends t {
        public b() {
        }

        @Override // com.prism.gaia.client.stub.t
        public void b(Context context, Intent intent) {
            RegisteredServicesCache.this.H(intent.getIntExtra(b.c.f68611M, -1));
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f166388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Parcelable f166389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f166390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f166391d;

        public c(p pVar, Parcelable parcelable, int i10, boolean z10) {
            this.f166388a = pVar;
            this.f166389b = parcelable;
            this.f166390c = i10;
            this.f166391d = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f166388a.U0(this.f166389b, this.f166390c, this.f166391d);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f166393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f166394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f166395c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                RegisteredServicesCache.this.q(dVar.f166393a, dVar.f166394b, dVar.f166395c - 1);
            }
        }

        public d(int[] iArr, int i10, int i11) {
            this.f166393a = iArr;
            this.f166394b = i10;
            this.f166395c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4455a.b().a().execute(new a());
        }
    }

    public static class e<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final V f166398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ComponentInfo f166399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ComponentName f166400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f166401d;

        public e(V v10, ComponentInfo componentInfo, ComponentName componentName) {
            this.f166398a = v10;
            this.f166399b = componentInfo;
            this.f166400c = componentName;
            this.f166401d = componentInfo != null ? componentInfo.applicationInfo.uid : -1;
        }

        public String toString() {
            return "ServiceInfo: " + this.f166398a + U6.j.f68738d + this.f166400c + ", uid " + this.f166401d;
        }
    }

    public static class f<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @InterfaceC4326A("mServicesLock")
        public final Map<V, Integer> f166402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @InterfaceC4326A("mServicesLock")
        public Map<V, e<V>> f166403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @InterfaceC4326A("mServicesLock")
        public boolean f166404c;

        public f() {
            this.f166402a = new HashMap();
            this.f166403b = null;
            this.f166404c = true;
        }
    }

    public RegisteredServicesCache(Context context, String str, String str2, String str3, B<V> b10) {
        Object obj = new Object();
        com.prism.gaia.helper.utils.o.i("RegisteredServicesCache.mServicesLock", obj);
        this.f166379f = obj;
        this.f166380g = new SparseArray<>(2);
        this.f166383j = Executors.newSingleThreadExecutor(new m());
        a aVar = new a();
        this.f166384k = aVar;
        b bVar = new b();
        this.f166385l = bVar;
        this.f166374a = context;
        this.f166375b = str;
        this.f166376c = str2;
        this.f166377d = str3;
        this.f166378e = b10;
        D();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        com.prism.gaia.server.am.q.p6().K6(aVar, intentFilter, null);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(b.a.f68591b);
        com.prism.gaia.server.am.q.f166930K0.K6(bVar, intentFilter2, null);
    }

    public static void E(Set<String> set, ResolveInfo resolveInfo) {
        ServiceInfo serviceInfo;
        String str;
        if (resolveInfo == null || (serviceInfo = resolveInfo.serviceInfo) == null || (str = serviceInfo.packageName) == null) {
            return;
        }
        set.add(str);
    }

    public static void L(GUri gUri, String str, Throwable th) {
        String strValueOf = String.valueOf(gUri);
        Set<String> set = f166373s;
        synchronized (set) {
            try {
                if (set.add(strValueOf)) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("space", strValueOf);
                        bundle.putString("pkg", str);
                        C5705o.c().e(th, str, "supervisor", "SPACE_NOT_INITIALIZED", bundle);
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "gaia-svc-rescan");
        thread.setDaemon(true);
        return thread;
    }

    public final void A(Intent intent, int i10) {
        int[] intArrayExtra;
        String action = intent.getAction();
        boolean z10 = "android.intent.action.PACKAGE_REMOVED".equals(action) || "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE".equals(action);
        boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        if (z10 && booleanExtra) {
            return;
        }
        if ("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE".equals(action) || "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE".equals(action)) {
            intArrayExtra = intent.getIntArrayExtra("android.intent.extra.changed_uid_list");
        } else {
            int intExtra = intent.getIntExtra("android.intent.extra.UID", -1);
            intArrayExtra = intExtra > 0 ? new int[]{intExtra} : null;
        }
        q(intArrayExtra, i10, 2);
    }

    public boolean B(int i10) {
        return false;
    }

    public void C(int i10) {
        synchronized (this.f166379f) {
            o(i10, true).f166403b = null;
        }
    }

    public final void D() {
        if (this.f166378e == null) {
            return;
        }
        File file = new File(new File(s(), "system"), f166372r);
        File file2 = new File(file, android.support.v4.media.e.a(new StringBuilder(), this.f166375b, C1498d.f86308y));
        D9.a aVar = new D9.a(file2);
        if (file2.exists()) {
            File file3 = new File(file, android.support.v4.media.e.a(new StringBuilder(), this.f166375b, ".xml.migrated"));
            if (file3.exists()) {
                return;
            }
            FileInputStream fileInputStreamG = null;
            try {
                fileInputStreamG = aVar.g();
                this.f166380g.clear();
                K(fileInputStreamG);
            } catch (Exception unused) {
            } catch (Throwable th) {
                com.prism.gaia.helper.utils.l.j(fileInputStreamG);
                throw th;
            }
            com.prism.gaia.helper.utils.l.j(fileInputStreamG);
            try {
                for (UserInfoG userInfoG : z()) {
                    f<V> fVar = this.f166380g.get(userInfoG.f166024id);
                    if (fVar != null) {
                        P(fVar, userInfoG.f166024id);
                    }
                }
                file3.createNewFile();
            } catch (Exception unused2) {
            }
            this.f166380g.clear();
        }
    }

    public final void F(V v10, int i10, boolean z10) throws Throwable {
        p<V> pVar;
        Handler handler;
        synchronized (this) {
            try {
                pVar = this.f166381h;
                handler = this.f166382i;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        if (pVar == null) {
            return;
        }
        handler.post(new c(pVar, v10, i10, z10));
    }

    public void G(int i10) {
    }

    public void H(int i10) {
        synchronized (this.f166379f) {
            this.f166380g.remove(i10);
        }
    }

    public e<V> I(ResolveInfo resolveInfo) throws XmlPullParserException, IOException {
        Parcelable type = w(resolveInfo).parseType();
        if (type == null) {
            return null;
        }
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        return new e<>(type, serviceInfo, new ComponentName(serviceInfo.packageName, serviceInfo.name));
    }

    public List<ResolveInfo> J(int i10) {
        return BinderC4171f.h6().K6(new Intent(this.f166375b), null, 128, i10);
    }

    public final void K(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, C3919b.f165105a.name());
        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 2 && eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
        }
        if ("services".equals(xmlPullParserNewPullParser.getName())) {
            int next = xmlPullParserNewPullParser.next();
            do {
                if (next == 2 && xmlPullParserNewPullParser.getDepth() == 2 && NotificationCompat.CATEGORY_SERVICE.equals(xmlPullParserNewPullParser.getName())) {
                    V vB = this.f166378e.b(xmlPullParserNewPullParser);
                    if (vB == null) {
                        return;
                    }
                    int i10 = Integer.parseInt(xmlPullParserNewPullParser.getAttributeValue(null, "uid"));
                    o(GaiaUserHandle.getVuserId(i10), false).f166402a.put(vB, Integer.valueOf(i10));
                }
                next = xmlPullParserNewPullParser.next();
            } while (next != 1);
        }
    }

    public final void M(int[] iArr, int i10, int i11, Set<String> set) {
        if (i11 <= 0) {
            return;
        }
        f166370p.postDelayed(new d(iArr, i10, i11), 1000L);
    }

    public void N(p<V> pVar, Handler handler) {
        if (handler == null) {
            handler = new Handler(this.f166374a.getMainLooper());
        }
        synchronized (this) {
            this.f166382i = handler;
            this.f166381h = pVar;
        }
    }

    public void O(int i10) {
        synchronized (this.f166379f) {
            try {
                f<V> fVarO = o(i10, true);
                if (fVarO.f166403b == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(fVarO.f166403b.values());
                int size = arrayList.size();
                B8.d dVar = null;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    e eVar = (e) obj;
                    PackageG packageGL6 = BinderC4171f.h6().l6(eVar.f166399b.packageName);
                    if (packageGL6 == null || packageGL6.c(eVar.f166399b.applicationInfo) != 0) {
                        if (dVar == null) {
                            dVar = new B8.d();
                        }
                        dVar.a(eVar.f166401d);
                    }
                }
                if (dVar == null || dVar.n() <= 0) {
                    return;
                }
                q(dVar.g(), i10, 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void P(f<V> fVar, int i10) {
        if (this.f166378e == null) {
            return;
        }
        D9.a aVarL = l(i10);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStreamI = aVarL.i();
            try {
                com.prism.gaia.helper.utils.j jVar = new com.prism.gaia.helper.utils.j();
                jVar.setOutput(fileOutputStreamI, C3919b.f165105a.name());
                jVar.startDocument(null, Boolean.TRUE);
                jVar.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
                jVar.startTag(null, "services");
                for (Map.Entry<V, Integer> entry : fVar.f166402a.entrySet()) {
                    jVar.startTag(null, NotificationCompat.CATEGORY_SERVICE);
                    jVar.attribute(null, "uid", Integer.toString(entry.getValue().intValue()));
                    this.f166378e.a(entry.getKey(), jVar);
                    jVar.endTag(null, NotificationCompat.CATEGORY_SERVICE);
                }
                jVar.endTag(null, "services");
                jVar.flush();
                aVarL.d(fileOutputStreamI);
            } catch (IOException unused) {
                fileOutputStream = fileOutputStreamI;
                if (fileOutputStream != null) {
                    aVarL.c(fileOutputStream);
                }
            }
        } catch (IOException unused2) {
        }
    }

    public final boolean i(ArrayList<e<V>> arrayList, V v10) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (arrayList.get(i10).f166398a.equals(v10)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(ArrayList<e<V>> arrayList, V v10, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            e<V> eVar = arrayList.get(i11);
            if (eVar.f166398a.equals(v10) && eVar.f166401d == i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(int[] iArr, int i10) {
        return iArr == null || C3838b.c(iArr, i10);
    }

    public final D9.a l(int i10) {
        GFile gFileY = y(i10);
        try {
            gFileY.C(-1);
        } catch (IOException unused) {
        }
        return new D9.a(new File(gFileY, android.support.v4.media.e.a(new StringBuilder("registered_services/"), this.f166375b, C1498d.f86308y)));
    }

    public void m(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr, int i10) {
        synchronized (this.f166379f) {
            try {
                f<V> fVarO = o(i10, true);
                if (fVarO.f166403b != null) {
                    printWriter.println("RegisteredServicesCache: " + fVarO.f166403b.size() + " services");
                    Iterator<e<V>> it = fVarO.f166403b.values().iterator();
                    while (it.hasNext()) {
                        printWriter.println(GlideException.a.f139488d + it.next());
                    }
                } else {
                    printWriter.println("RegisteredServicesCache: services not loaded");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC4326A("mServicesLock")
    public final f<V> n(int i10) {
        return o(i10, true);
    }

    @InterfaceC4326A("mServicesLock")
    public final f<V> o(int i10, boolean z10) {
        UserInfoG userInfoGX;
        f<V> fVar = this.f166380g.get(i10);
        if (fVar == null) {
            fVar = new f<>();
            this.f166380g.put(i10, fVar);
            if (z10 && this.f166378e != null && (userInfoGX = x(i10)) != null) {
                D9.a aVarL = l(userInfoGX.f166024id);
                if (aVarL.f22985a.exists()) {
                    FileInputStream fileInputStreamG = null;
                    try {
                        fileInputStreamG = aVarL.g();
                        K(fileInputStreamG);
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        com.prism.gaia.helper.utils.l.j(fileInputStreamG);
                        throw th;
                    }
                    com.prism.gaia.helper.utils.l.j(fileInputStreamG);
                }
            }
        }
        return fVar;
    }

    public final void p(int[] iArr, int i10) {
        q(iArr, i10, 2);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void q(int[] iArr, int i10, int i11) {
        ArrayList<e<V>> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : J(i10)) {
            try {
                e<V> eVarI = I(resolveInfo);
                if (eVarI == null) {
                    resolveInfo.toString();
                    E(hashSet, resolveInfo);
                } else {
                    arrayList.add(eVarI);
                }
            } catch (IOException | RuntimeException | XmlPullParserException unused) {
                resolveInfo.toString();
                E(hashSet, resolveInfo);
            }
        }
        synchronized (this.f166379f) {
            boolean z10 = true;
            try {
                f<V> fVarO = o(i10, true);
                int i12 = 0;
                boolean z11 = fVarO.f166403b == null;
                if (z11) {
                    fVarO.f166403b = new HashMap();
                }
                int size = arrayList.size();
                boolean z12 = false;
                int i13 = 0;
                while (i13 < size) {
                    e<V> eVar = arrayList.get(i13);
                    i13++;
                    e<V> eVar2 = eVar;
                    Integer num = fVarO.f166402a.get(eVar2.f166398a);
                    if (num == null) {
                        fVarO.f166403b.put(eVar2.f166398a, eVar2);
                        fVarO.f166402a.put(eVar2.f166398a, Integer.valueOf(eVar2.f166401d));
                        if (!fVarO.f166404c || !z11) {
                            F(eVar2.f166398a, i10, false);
                        }
                        z12 = z10;
                    } else if (num.intValue() == eVar2.f166401d) {
                        fVarO.f166403b.put(eVar2.f166398a, eVar2);
                    } else if (!j(arrayList, eVar2.f166398a, num.intValue())) {
                        fVarO.f166403b.put(eVar2.f166398a, eVar2);
                        fVarO.f166402a.put(eVar2.f166398a, Integer.valueOf(eVar2.f166401d));
                        F(eVar2.f166398a, i10, false);
                        z12 = true;
                    }
                    z10 = true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (V v10 : fVarO.f166402a.keySet()) {
                    if (!i(arrayList, v10) && k(iArr, fVarO.f166402a.get(v10).intValue())) {
                        Map<V, e<V>> map = fVarO.f166403b;
                        e<V> eVar3 = map == null ? null : map.get(v10);
                        if (eVar3 == null || !hashSet.contains(eVar3.f166399b.packageName)) {
                            arrayList2.add(v10);
                        } else {
                            String str = eVar3.f166399b.packageName;
                        }
                    }
                }
                int size2 = arrayList2.size();
                while (i12 < size2) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    Parcelable parcelable = (Parcelable) obj;
                    fVarO.f166402a.remove(parcelable);
                    fVarO.f166403b.remove(parcelable);
                    z12 = true;
                    F(parcelable, i10, true);
                }
                if (z12) {
                    P(fVarO, i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        M(iArr, i10, i11, hashSet);
    }

    public Collection<e<V>> r(int i10) {
        Collection<e<V>> collectionUnmodifiableCollection;
        synchronized (this.f166379f) {
            try {
                f<V> fVarO = o(i10, true);
                if (fVarO.f166403b == null) {
                    q(null, i10, 2);
                }
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(new ArrayList(fVarO.f166403b.values()));
            } catch (Throwable th) {
                throw th;
            }
        }
        return collectionUnmodifiableCollection;
    }

    public GFile s() {
        return D9.d.i();
    }

    public p<V> t() {
        p<V> pVar;
        synchronized (this) {
            pVar = this.f166381h;
        }
        return pVar;
    }

    public Map<V, Integer> u(int i10) {
        return o(i10, true).f166402a;
    }

    public e<V> v(V v10, int i10) {
        e<V> eVar;
        synchronized (this.f166379f) {
            try {
                f<V> fVarO = o(i10, true);
                if (fVarO.f166403b == null) {
                    q(null, i10, 2);
                }
                eVar = fVarO.f166403b.get(v10);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public abstract RemoteTypeParser<V> w(ResolveInfo resolveInfo);

    public UserInfoG x(int i10) {
        return GaiaUserManagerService.e6().k(i10);
    }

    public GFile y(int i10) {
        return D9.d.l0(i10);
    }

    public List<UserInfoG> z() {
        return GaiaUserManagerService.e6().z5(true);
    }

    public static abstract class RemoteTypeParser<V extends Parcelable> extends RemoteRunnable {
        public static final String FAULT_RUNTIME = "services_cache_runtime";
        public static final String FAULT_UNHOOKED_PM_NULL = "services_cache_unhookedpm_null";
        protected static final String RESULT_TYPE = "result_type";
        private String attributesName;
        private String metaDataName;
        private ServiceInfo si;

        public RemoteTypeParser(RegisteredServicesCache<V> registeredServicesCache, ResolveInfo resolveInfo) {
            this.metaDataName = registeredServicesCache.f166376c;
            this.attributesName = registeredServicesCache.f166377d;
            this.si = resolveInfo.serviceInfo;
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable
        public void onRemoteRun() throws Exception {
            int next;
            PackageManager packageManagerT = GaiaContext.j().T();
            if (packageManagerT == null) {
                throw new SpaceNotInitializedException("gaia not initialized in space process " + GaiaContext.f164212y.s() + " (pid " + Process.myPid() + "), cannot parse " + this.metaDataName + " of " + this.si.packageName);
            }
            XmlResourceParser xmlResourceParser = null;
            try {
                try {
                    XmlResourceParser xmlResourceParserLoadXmlMetaData = this.si.loadXmlMetaData(packageManagerT, this.metaDataName);
                    if (xmlResourceParserLoadXmlMetaData == null) {
                        throw new XmlPullParserException("No " + this.metaDataName + " meta-data");
                    }
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParserLoadXmlMetaData);
                    do {
                        next = xmlResourceParserLoadXmlMetaData.next();
                        if (next == 1) {
                            break;
                        }
                    } while (next != 2);
                    if (!this.attributesName.equals(xmlResourceParserLoadXmlMetaData.getName())) {
                        throw new XmlPullParserException("Meta-data does not start with " + this.attributesName + " tag");
                    }
                    Parcelable serviceAttributes = parseServiceAttributes(packageManagerT.getResourcesForApplication(this.si.applicationInfo), this.si.packageName, attributeSetAsAttributeSet);
                    if (serviceAttributes == null) {
                        setResultCode(-1);
                        xmlResourceParserLoadXmlMetaData.close();
                    } else {
                        setResultCode(0);
                        getResultBundle().putParcelable(RESULT_TYPE, serviceAttributes);
                        xmlResourceParserLoadXmlMetaData.close();
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new XmlPullParserException("Unable to load resources for pacakge " + this.si.packageName);
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        }

        public abstract V parseServiceAttributes(Resources resources, String str, AttributeSet attributeSet);

        public V parseType() throws XmlPullParserException, IOException {
            PackageSettingG packageSettingGP6 = BinderC4171f.h6().p6(this.si.packageName);
            if (packageSettingGP6 == null) {
                return null;
            }
            try {
                if (start(packageSettingGP6.getSpaceUri()) == 0) {
                    return (V) getResultBundle().getParcelable(RESULT_TYPE);
                }
                return null;
            } catch (GaiaRemoteRunnableException e10) {
                if (e10.getCause() instanceof SpaceNotInitializedException) {
                    RegisteredServicesCache.L(packageSettingGP6.getSpaceUri(), this.si.packageName, e10.getCause());
                }
                if (e10.getCause() instanceof XmlPullParserException) {
                    throw ((XmlPullParserException) e10.getCause());
                }
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        @Override // com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.metaDataName);
            parcel.writeString(this.attributesName);
            parcel.writeParcelable(this.si, i10);
        }

        public RemoteTypeParser(Parcel parcel) {
            super(parcel);
            this.metaDataName = parcel.readString();
            this.attributesName = parcel.readString();
            this.si = (ServiceInfo) parcel.readParcelable(ServiceInfo.class.getClassLoader());
        }
    }
}
