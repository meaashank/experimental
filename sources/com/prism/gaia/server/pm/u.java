package com.prism.gaia.server.pm;

import U6.o;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.android.launcher3.IconCache;
import com.prism.commons.utils.C3838b;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.helper.GUri;
import com.prism.gaia.helper.PersistenceHelper;
import com.prism.gaia.helper.compat.NativeLibraryHelperCompat;
import com.prism.gaia.helper.compat.bit32bit64.FileCompat;
import com.prism.gaia.helper.io.GFile;
import com.prism.gaia.helper.utils.PkgUtils;
import com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAG;
import com.prism.gaia.server.GProcessSupervisorProvider;
import com.prism.gaia.server.pm.PackageG;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public class u {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f167649l = 20000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f167652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<PackageSettingG> f167653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, PackageG> f167654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f167655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f167656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f167657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f167658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.prism.gaia.helper.d f167659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f167660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f167661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f167648k = "asdf-".concat(u.class.getSimpleName());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u f167650m = new u();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ExecutorService f167651n = Executors.newSingleThreadExecutor(new g());

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f167662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f167663b;

        public a(String str, int i10) {
            this.f167662a = str;
            this.f167663b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.prism.gaia.server.am.q.p6().g7(this.f167662a, this.f167663b, true, false);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f167665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f167666b;

        public b(String str, int i10) {
            this.f167665a = str;
            this.f167666b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.prism.gaia.server.am.q.p6().e7(this.f167665a, this.f167666b, false);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f167668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f167669b;

        public c(String str, int i10) {
            this.f167668a = str;
            this.f167669b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.prism.gaia.server.am.q.p6().g7(this.f167668a, this.f167669b, false, true);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f167671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f167672b;

        public d(String str, int i10) {
            this.f167671a = str;
            this.f167672b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.prism.gaia.server.am.q.p6().e7(this.f167671a, this.f167672b, true);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f167674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f167675b;

        public e(String str, int i10) {
            this.f167674a = str;
            this.f167675b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.prism.gaia.server.am.q.p6().g7(this.f167674a, this.f167675b, false, true);
        }
    }

    public class f extends Thread {
        public f(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(20000L);
                u.this.b0();
            } catch (InterruptedException unused) {
            }
        }
    }

    public class g implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "gaia-pkg-broadcast");
            thread.setDaemon(true);
            return thread;
        }
    }

    public interface h {
        void U0(PackageG packageG);

        void h2(PackageG packageG);

        void v5(String str);
    }

    public u() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        com.prism.gaia.helper.utils.o.i("PackageLoader.liveLock", reentrantReadWriteLock);
        this.f167652a = reentrantReadWriteLock;
        this.f167653b = new LinkedHashSet();
        this.f167654c = new HashMap();
        this.f167655d = new A();
        this.f167656e = false;
        this.f167657f = false;
        this.f167658g = false;
        this.f167659h = new com.prism.gaia.helper.d();
        this.f167661j = false;
    }

    public static void U(PackageSettingG packageSettingG) {
        if (packageSettingG.lastUpdateTime <= 0 || packageSettingG.firstInstallTime <= 0) {
            try {
                if (packageSettingG.apkPath == null) {
                    return;
                }
                long jLastModified = new File(packageSettingG.apkPath).lastModified();
                if (jLastModified <= 0) {
                    return;
                }
                if (packageSettingG.firstInstallTime <= 0) {
                    packageSettingG.firstInstallTime = jLastModified;
                }
                if (packageSettingG.lastUpdateTime <= 0) {
                    packageSettingG.lastUpdateTime = jLastModified;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public static void c(Runnable runnable) {
        try {
            f167651n.execute(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static u n() {
        return f167650m;
    }

    public final void A(PackageG packageG) {
        h hVar = this.f167660i;
        if (hVar != null) {
            hVar.U0(packageG);
        }
    }

    public void B(String str) {
        j(str);
    }

    public void C(String str) {
        j(str);
    }

    public void D(String str) {
        j(str);
    }

    public void E(PackageG packageG) throws IOException {
        if (packageG == null) {
            return;
        }
        ReentrantReadWriteLock.WriteLock writeLock = p().writeLock();
        writeLock.lock();
        ReentrantReadWriteLock.WriteLock writeLock2 = q().writeLock();
        writeLock2.lock();
        try {
            PackageParserG.N(packageG);
            PackageSettingG packageSettingG = packageG.f167488A;
            if (packageSettingG != null) {
                b(packageSettingG);
            }
            Q();
            writeLock2.unlock();
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock2.unlock();
            writeLock.unlock();
            throw th;
        }
    }

    public final void F(PackageSettingG packageSettingG, PackageG packageG) {
        H(packageSettingG);
        packageG.f167488A = packageSettingG;
        U(packageSettingG);
        boolean z10 = packageG.f167488A.useSystem;
        this.f167654c.put(packageSettingG.packageName, packageG);
        y(packageG);
    }

    public final Set<PackageSettingG> G() {
        Set<PackageSettingG> setG = this.f167655d.g();
        this.f167653b = setG;
        if (setG == null) {
            this.f167653b = new HashSet();
            this.f167657f = this.f167655d.c() == PersistenceHelper.ReadStatus.DAMAGED;
            if (this.f167657f) {
                C5705o.c().d("package settings unreadable at " + this.f167655d.f164941a.getAbsolutePath() + "; guests hidden and saving disabled for this run");
            }
        }
        return this.f167653b;
    }

    public final void H(PackageSettingG packageSettingG) {
        B b10;
        boolean z10;
        if (this.f167655d.n() >= 6) {
            b10 = new B(packageSettingG.packageName);
            packageSettingG.userStateMap = b10.g();
        } else {
            String str = packageSettingG.packageName;
            b10 = null;
        }
        if (packageSettingG.userStateMap == null) {
            packageSettingG.userStateMap = new SparseArray<>();
        }
        if (packageSettingG.userStateMap.get(0) == null) {
            packageSettingG.getUserState(0);
            z10 = true;
        } else {
            z10 = false;
        }
        if (b10 != null && b10.m() < 2) {
            PackageUserStateG packageUserStateG = packageSettingG.userStateMap.get(0);
            if (!packageUserStateG.installed) {
                packageUserStateG.installed = true;
            }
        }
        if (z10) {
            S(packageSettingG);
        }
    }

    public PackageG I(String str) {
        ReentrantReadWriteLock.WriteLock writeLock = p().writeLock();
        writeLock.lock();
        ReentrantReadWriteLock.WriteLock writeLock2 = q().writeLock();
        writeLock2.lock();
        try {
            PackageG packageG = this.f167654c.get(str);
            if (packageG == null) {
                writeLock2.unlock();
                writeLock.unlock();
                return null;
            }
            d0(packageG);
            g(packageG.f167488A, packageG);
            Q();
            return packageG;
        } finally {
            writeLock2.unlock();
            writeLock.unlock();
        }
    }

    public final void J(PackageSettingG packageSettingG) {
        if (this.f167653b.remove(packageSettingG)) {
            this.f167656e = true;
        }
    }

    public void K(int i10) {
        ReentrantReadWriteLock.ReadLock lock = p().readLock();
        lock.lock();
        ReentrantReadWriteLock.WriteLock writeLock = q().writeLock();
        writeLock.lock();
        try {
            Iterator<PackageG> it = this.f167654c.values().iterator();
            while (it.hasNext()) {
                L(i10, it.next().f167488A);
            }
        } finally {
            writeLock.unlock();
            lock.unlock();
        }
    }

    public final void L(int i10, PackageSettingG packageSettingG) {
        if (packageSettingG.userStateMap.get(i10) != null) {
            GaiaUserManagerService.Y5(packageSettingG, new int[]{i10});
            packageSettingG.userStateMap.remove(i10);
            S(packageSettingG);
        }
    }

    public final void M() {
        try {
            String[] list = D9.d.h().list();
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (str != null && !str.startsWith(IconCache.EMPTY_CLASS_NAME) && D9.d.q(str).exists() && !this.f167654c.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            C5705o.c().d("packages installed on disk but NOT loaded this boot: " + arrayList + " (loaded=" + this.f167654c.size() + ", onDisk=" + list.length + ")");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void N(PackageG packageG) throws IOException {
        ReentrantReadWriteLock.WriteLock writeLock = p().writeLock();
        writeLock.lock();
        ReentrantReadWriteLock.WriteLock writeLock2 = q().writeLock();
        writeLock2.lock();
        try {
            O(packageG.f167488A, packageG, true);
            Q();
        } finally {
            writeLock2.unlock();
            writeLock.unlock();
        }
    }

    public final void O(PackageSettingG packageSettingG, PackageG packageG, boolean z10) throws IOException {
        if (packageG != null) {
            String str = packageG.f167512o;
            boolean zA = packageG.A();
            int i10 = packageSettingG == null ? -1 : packageSettingG.appId;
            if (this.f167654c.put(packageG.f167512o, packageG) == null) {
                y(packageG);
                if (this.f167661j) {
                    if (zA) {
                        c(new b(str, i10));
                    } else if (packageSettingG != null) {
                        c(new c(str, i10));
                    }
                }
            } else {
                A(packageG);
                if (this.f167661j) {
                    if (zA) {
                        c(new d(str, i10));
                    } else if (packageSettingG != null) {
                        c(new e(str, i10));
                    }
                }
            }
            PackageParserG.N(packageG);
        }
        if (!z10 || packageSettingG == null) {
            return;
        }
        S(packageSettingG);
        b(packageSettingG);
    }

    public void P() {
        ReentrantReadWriteLock.WriteLock writeLock = p().writeLock();
        writeLock.lock();
        ReentrantReadWriteLock.WriteLock writeLock2 = q().writeLock();
        writeLock2.lock();
        try {
            this.f167656e = true;
            Q();
        } finally {
            writeLock2.unlock();
            writeLock.unlock();
        }
    }

    public final void Q() {
        if (this.f167656e && !this.f167657f) {
            this.f167655d.i(this.f167653b);
            this.f167656e = false;
        }
    }

    public void R(PackageSettingG packageSettingG) {
        ReentrantReadWriteLock.WriteLock writeLock = q().writeLock();
        writeLock.lock();
        try {
            S(packageSettingG);
        } finally {
            writeLock.unlock();
        }
    }

    public void S(PackageSettingG packageSettingG) {
        new B(packageSettingG.packageName).i(packageSettingG.userStateMap);
    }

    public final void T() {
        f fVar = new f("gaia-schema-sweep");
        fVar.setPriority(1);
        fVar.start();
    }

    public void V(PackageG packageG, PackageG.StateCode stateCode, String str) {
        ReentrantReadWriteLock.WriteLock writeLock = p().writeLock();
        writeLock.lock();
        ReentrantReadWriteLock.WriteLock writeLock2 = q().writeLock();
        writeLock2.lock();
        try {
            Y(packageG, stateCode, str, 0);
        } finally {
            writeLock2.unlock();
            writeLock.unlock();
        }
    }

    public void W(PackageG packageG, String str) {
        V(packageG, PackageG.StateCode.INSTALL_ERROR, str);
    }

    public final void X(PackageG packageG, PackageG.StateCode stateCode, String str) {
        Y(packageG, stateCode, str, 0);
    }

    public final void Y(PackageG packageG, PackageG.StateCode stateCode, String str, int i10) {
        d0(packageG);
        packageG.f167491D = PackageG.State.NEED_FIX;
        packageG.f167492E = stateCode;
        packageG.f167493F = str;
        packageG.C(i10);
        try {
            O(packageG.f167488A, packageG, false);
        } catch (IOException unused) {
        }
        A(packageG);
    }

    public final void Z(PackageG packageG, String str) {
        Y(packageG, PackageG.StateCode.INSTALL_ERROR, str, 0);
    }

    public void a(PackageG packageG) throws IOException {
        ReentrantReadWriteLock.WriteLock writeLock = p().writeLock();
        writeLock.lock();
        ReentrantReadWriteLock.WriteLock writeLock2 = q().writeLock();
        writeLock2.lock();
        try {
            v(packageG);
            O(packageG.f167488A, packageG, true);
            Q();
        } finally {
            writeLock2.unlock();
            writeLock.unlock();
        }
    }

    public final void a0(PackageG packageG, int i10) {
        packageG.C(i10);
        try {
            O(packageG.f167488A, packageG, false);
        } catch (IOException unused) {
        }
        A(packageG);
    }

    public final void b(PackageSettingG packageSettingG) {
        this.f167653b.add(packageSettingG);
        this.f167656e = true;
    }

    public void b0() {
        ArrayList arrayList = new ArrayList();
        ReentrantReadWriteLock.ReadLock lock = p().readLock();
        lock.lock();
        try {
            for (PackageG packageG : this.f167654c.values()) {
                if (packageG.f167497J || packageG.f167496I == null) {
                    arrayList.add(packageG);
                }
            }
            lock.unlock();
            if (arrayList.isEmpty()) {
                return;
            }
            arrayList.size();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                e0((PackageG) obj);
            }
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public void c0(String str) {
        ReentrantReadWriteLock.ReadLock lock = p().readLock();
        lock.lock();
        ReentrantReadWriteLock.WriteLock writeLock = q().writeLock();
        writeLock.lock();
        try {
            PackageG packageG = this.f167654c.get(str);
            if (packageG != null) {
                d0(packageG);
            }
        } finally {
            writeLock.unlock();
            lock.unlock();
        }
    }

    @NonNull
    public String d(String str, String[] strArr, int i10) {
        if (a7.c.o(str)) {
            return "com.app.hider.master.promax";
        }
        String[] strArrD = NativeLibraryHelperCompat.d(strArr);
        return U6.c.f68697c ? NativeLibraryHelperCompat.p(strArrD) ? "com.app.hider.helper.hider32helper" : "com.app.hider.master.promax" : NativeLibraryHelperCompat.r(strArrD) ? "com.app.hider.helper.hider64helper" : "com.app.hider.master.promax";
    }

    public final void d0(PackageG packageG) {
        if (packageG.A()) {
            try {
                com.prism.gaia.server.am.v.e().m(packageG.f167512o);
                BinderC4171f.h6().L6(packageG);
                GProcessSupervisorProvider.B(packageG.f167512o, -1);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public boolean e(String str, boolean z10) {
        boolean zA = false;
        if (!this.f167658g || (z10 && str == null)) {
            try {
                List<PackageInfo> installedPackages = GaiaContext.j().T().getInstalledPackages(0);
                com.prism.commons.utils.I.b(f167648k, "getInstalledPackages num: %d", Integer.valueOf(installedPackages.size()));
                LinkedList linkedList = new LinkedList();
                Iterator<PackageInfo> it = installedPackages.iterator();
                while (it.hasNext()) {
                    linkedList.add(it.next().packageName);
                }
                this.f167659h.c();
                zA = this.f167659h.a(linkedList);
                this.f167658g = true;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return str == null ? zA : this.f167659h.i(str, GaiaContext.j().g0(str));
    }

    public void e0(PackageG packageG) {
        if (packageG == null || packageG.f167488A == null) {
            return;
        }
        if (packageG.f167497J || packageG.f167496I == null) {
            ReentrantReadWriteLock.WriteLock writeLock = q().writeLock();
            writeLock.lock();
            try {
                i(packageG);
                if (packageG.f167497J) {
                    SystemClock.uptimeMillis();
                    PackageParserG.N(packageG);
                    packageG.f167497J = false;
                    SystemClock.uptimeMillis();
                }
            } catch (Throwable th) {
                try {
                    th.getMessage();
                } finally {
                    writeLock.unlock();
                }
            }
        }
    }

    public void f(PackageG packageG) {
        ReentrantReadWriteLock.WriteLock writeLock = p().writeLock();
        writeLock.lock();
        ReentrantReadWriteLock.WriteLock writeLock2 = q().writeLock();
        writeLock2.lock();
        try {
            g(packageG.f167488A, packageG);
            Q();
        } finally {
            writeLock2.unlock();
            writeLock.unlock();
        }
    }

    public final void g(PackageSettingG packageSettingG, PackageG packageG) {
        if (packageG != null) {
            if (this.f167654c.remove(packageG.f167512o) != null) {
                z(packageG.f167512o);
                if (this.f167661j) {
                    c(new a(packageG.f167512o, packageSettingG.appId));
                }
            }
            PackageParserG.k(packageG);
        }
        GUri spaceUri = packageSettingG.getSpaceUri();
        FileCompat.n(D9.d.r(packageSettingG.packageName).g(spaceUri), spaceUri);
        h(packageSettingG, true);
        J(packageSettingG);
    }

    public final void h(PackageSettingG packageSettingG, boolean z10) {
        if (z10) {
            GaiaUserManagerService.X5(packageSettingG);
        }
        packageSettingG.userStateMap.clear();
        new B(packageSettingG.packageName).a();
    }

    public final void i(PackageG packageG) {
        PackageSettingG packageSettingG;
        if (packageG == null || packageG.f167496I != null || (packageSettingG = packageG.f167488A) == null) {
            return;
        }
        packageG.B(PackageParserG.A(packageSettingG));
    }

    public final void j(String str) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f167652a.writeLock();
        writeLock.lock();
        try {
            l(str);
            PackageG packageG = this.f167654c.get(str);
            if (packageG == null) {
                return;
            }
            k(packageG);
        } finally {
            writeLock.unlock();
        }
    }

    public final void k(PackageG packageG) {
        PackageSettingG packageSettingG = packageG.f167488A;
        m(packageSettingG, packageG);
        if (packageG.A()) {
            if (!packageSettingG.useSystem) {
                PackageInfo packageInfo = packageSettingG.pkgInfoInSystem;
                if (packageInfo == null || packageG.d(packageInfo) >= 0) {
                    return;
                }
                a0(packageG, 2);
                return;
            }
            if (packageSettingG.pkgInfoInSystem == null) {
                if (packageSettingG.srcPath == null || !new GFile(packageSettingG.srcPath).v()) {
                    Y(packageG, PackageG.StateCode.DEPEND_SYSTEM_MISSING, GaiaContext.j().N(o.n.f72118Q3, new Object[0]), 0);
                    return;
                } else {
                    Y(packageG, PackageG.StateCode.OPTIMIZE_WAITING, GaiaContext.j().N(o.n.f72172a4, new Object[0]), 0);
                    return;
                }
            }
            if (NativeLibraryHelperCompat.o(ApplicationInfoCAG.L21.primaryCpuAbi().get(packageSettingG.pkgInfoInSystem.applicationInfo)) != C3838b.d(NativeLibraryHelperCompat.f164956i, packageSettingG.primaryAbi)) {
                Y(packageG, PackageG.StateCode.NEED_RELOCATE, "[1]" + GaiaContext.j().N(o.n.f72184c4, new Object[0]), 0);
                return;
            }
            if (packageG.d(packageSettingG.pkgInfoInSystem) < 0) {
                Y(packageG, PackageG.StateCode.NEED_REINSTALL, GaiaContext.j().N(o.n.f72112P3, new Object[0]), 0);
            }
        }
    }

    public final void l(String str) {
        if (e(str, false)) {
            for (PackageG packageG : this.f167654c.values()) {
                if (packageG.A() && !packageG.f167488A.isInstalledInLaunch() && this.f167659h.h(packageG.f167488A.getLocationPkgName()) == 0) {
                    V(packageG, PackageG.StateCode.HELPER_MISSING, GaiaContext.j().N(o.n.f72136T3, new Object[0]));
                }
            }
        }
    }

    public final void m(PackageSettingG packageSettingG, PackageG packageG) {
        PackageInfo packageInfo;
        if (packageG != null) {
            try {
                ApplicationInfo applicationInfo = packageG.f167508k;
                if (applicationInfo != null) {
                    packageSettingG.betterSpacePkgName = d(packageSettingG.packageName, packageSettingG.supportedAbis, applicationInfo.targetSdkVersion);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                packageSettingG.pkgInfoInSystem = null;
            }
        }
        PackageInfo packageInfoU = GaiaContext.j().U(packageSettingG.packageName, 128);
        packageSettingG.pkgInfoInSystem = packageInfoU;
        if (packageInfoU != null) {
            String str = packageInfoU.applicationInfo.publicSourceDir;
        }
        if (!packageSettingG.useSystem || (packageInfo = packageSettingG.pkgInfoInSystem) == null) {
            return;
        }
        ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
        packageSettingG.apkPath = PkgUtils.e(applicationInfo2);
        packageSettingG.libPath = NativeLibraryHelperCompat.g(applicationInfo2.nativeLibraryDir, applicationInfo2.packageName, packageSettingG.primaryAbi);
        String[] strArr = applicationInfo2.splitPublicSourceDirs;
        if (strArr == null) {
            strArr = applicationInfo2.splitSourceDirs;
        }
        packageSettingG.splitCodePaths = strArr;
        packageSettingG.dexFilePaths = new String[0];
    }

    public List<String> o() {
        return this.f167659h.d();
    }

    public final ReentrantReadWriteLock p() {
        com.prism.gaia.helper.utils.o.a("PackageLoader.liveLock");
        return this.f167652a;
    }

    public final ReentrantReadWriteLock q() {
        return BinderC4171f.h6().k6();
    }

    public final B r(String str) {
        return new B(str);
    }

    public boolean s() {
        return this.f167661j;
    }

    public synchronized void t(h hVar) {
        if (this.f167661j) {
            return;
        }
        this.f167660i = hVar;
        ReentrantReadWriteLock.WriteLock writeLock = p().writeLock();
        writeLock.lock();
        ReentrantReadWriteLock.WriteLock writeLock2 = q().writeLock();
        writeLock2.lock();
        try {
            w();
            this.f167661j = true;
            T();
        } finally {
            writeLock2.unlock();
            writeLock.unlock();
        }
    }

    public void u(String str) {
        ReentrantReadWriteLock.ReadLock lock = p().readLock();
        lock.lock();
        ReentrantReadWriteLock.WriteLock writeLock = q().writeLock();
        writeLock.lock();
        try {
            PackageG packageG = this.f167654c.get(str);
            if (packageG != null) {
                v(packageG);
            }
        } finally {
            writeLock.unlock();
            lock.unlock();
        }
    }

    public final void v(PackageG packageG) {
        if (packageG.A()) {
            try {
                m(packageG.f167488A, packageG);
                packageG.f167488A.getUserState(0);
                GaiaUserManagerService.p6(packageG.f167488A, new int[]{0});
                PackageParserG.m(packageG);
                BinderC4171f.h6().Z5(packageG);
                com.prism.gaia.server.am.v.e().k(packageG);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public final void w() {
        boolean z10;
        ApplicationInfo applicationInfo;
        s.a();
        l(null);
        Set<PackageSettingG> setG = G();
        this.f167654c.clear();
        HashSet<PackageSettingG> hashSet = new HashSet(setG);
        hashSet.size();
        for (PackageSettingG packageSettingG : hashSet) {
            PackageG packageGH = PackageParserG.H(packageSettingG);
            if (packageGH != null && (applicationInfo = packageGH.f167508k) != null && !C3838b.n(applicationInfo.splitSourceDirs) && packageGH.f167508k.splitSourceDirs[0].contains("/Android/media/")) {
                C5705o.c().d("saved guest(" + packageGH.f167508k.packageName + ") appInfo.sourceDir: " + packageGH.f167508k.sourceDir + ", splitSourceDirs: " + Arrays.toString(packageGH.f167508k.splitSourceDirs));
            }
            m(packageSettingG, packageGH);
            if (packageGH == null) {
                String strN = GaiaContext.j().N(o.n.f72100N3, new Object[0]);
                PackageG packageG = new PackageG(packageSettingG.packageName, PackageG.State.NEED_FIX);
                packageG.f167519v = Integer.MAX_VALUE;
                packageG.f167488A = packageSettingG;
                Y(packageG, PackageG.StateCode.PACKAGE_DAMAGED, strN, 0);
                z10 = true;
                packageGH = packageG;
            } else {
                z10 = false;
            }
            x(packageSettingG, packageGH);
            F(packageSettingG, packageGH);
            packageSettingG.launchable = packageGH.z();
            if (packageSettingG.isNeedMigrate()) {
                Y(packageGH, PackageG.StateCode.NEED_MIGRATING, GaiaContext.j().N(o.n.f72151W3, new Object[0]), 0);
            } else {
                if (packageSettingG.useSystem) {
                    if (packageSettingG.pkgInfoInSystem == null) {
                        if (packageSettingG.srcPath == null || !new GFile(packageSettingG.srcPath).v()) {
                            Y(packageGH, PackageG.StateCode.DEPEND_SYSTEM_MISSING, GaiaContext.j().N(o.n.f72118Q3, new Object[0]), 0);
                        } else {
                            Y(packageGH, PackageG.StateCode.OPTIMIZE_WAITING, GaiaContext.j().N(o.n.f72172a4, new Object[0]), 0);
                        }
                    } else if (NativeLibraryHelperCompat.o(ApplicationInfoCAG.L21.primaryCpuAbi().get(packageSettingG.pkgInfoInSystem.applicationInfo)) != C3838b.d(NativeLibraryHelperCompat.f164956i, packageSettingG.primaryAbi) && packageGH.A()) {
                        V(packageGH, PackageG.StateCode.NEED_RELOCATE, "[3]" + GaiaContext.j().N(o.n.f72184c4, new Object[0]));
                    }
                }
                if (!z10) {
                    PackageInfo packageInfo = packageSettingG.pkgInfoInSystem;
                    if (packageInfo != null && packageGH.d(packageInfo) < 0) {
                        if (packageSettingG.useSystem) {
                            V(packageGH, PackageG.StateCode.NEED_REINSTALL, GaiaContext.j().N(o.n.f72112P3, new Object[0]));
                        } else {
                            a0(packageGH, 2);
                        }
                    }
                    if (this.f167659h.h(packageGH.f167488A.getLocationPkgName()) == 0 && packageGH.f167488A.isInstalledInHelper()) {
                        V(packageGH, PackageG.StateCode.HELPER_MISSING, GaiaContext.j().N(o.n.f72136T3, new Object[0]));
                    }
                    if (!a7.c.o(packageSettingG.packageName) && !packageSettingG.isInstalledInHelper() && ((U6.c.b0() && NativeLibraryHelperCompat.o(packageSettingG.primaryAbi)) || (!U6.c.f68697c && NativeLibraryHelperCompat.q(packageSettingG.primaryAbi)))) {
                        packageSettingG.isInstalledInHelper();
                        boolean z11 = U6.c.f68697c;
                        if (packageGH.f167492E != PackageG.StateCode.HELPER_NO_REL_START) {
                            Y(packageGH, PackageG.StateCode.NEED_RELOCATE, "[5]" + GaiaContext.j().N(o.n.f72184c4, new Object[0]), 0);
                        }
                    }
                    v(packageGH);
                    ApplicationInfo applicationInfo2 = packageGH.f167508k;
                    if (applicationInfo2 != null && !C3838b.n(applicationInfo2.splitSourceDirs) && packageGH.f167508k.splitSourceDirs[0].contains("/Android/media/")) {
                        C5705o.c().d("loaded guest(" + packageGH.f167508k.packageName + ") appInfo.sourceDir: " + packageGH.f167508k.sourceDir + ", splitSourceDirs: " + Arrays.toString(packageGH.f167508k.splitSourceDirs));
                    }
                }
            }
        }
        M();
        Q();
    }

    public final void x(PackageSettingG packageSettingG, PackageG packageG) {
        String strG;
        String[] strArr = packageSettingG.splitCodePaths;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        String[] strArr2 = null;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10] != null) {
                GFile gFile = new GFile(strArr[i10]);
                if (!gFile.getName().startsWith("split_") && gFile.exists() && gFile.v() && (strG = PkgUtils.g(strArr[i10])) != null && !strG.isEmpty()) {
                    GFile gFile2 = new GFile(gFile.getParentFile(), android.support.v4.media.i.a("split_", strG, ".apk"));
                    if (gFile2.exists()) {
                        gFile2.getName();
                    } else if (!gFile.renameTo(gFile2)) {
                        gFile2.getName();
                    }
                    if (strArr2 == null) {
                        strArr2 = (String[]) strArr.clone();
                    }
                    strArr2[i10] = gFile2.getAbsolutePath();
                    gFile2.getName();
                }
            }
        }
        if (strArr2 == null) {
            return;
        }
        packageSettingG.splitCodePaths = strArr2;
        packageG.f167489B = strArr2;
        try {
            O(packageSettingG, packageG, true);
        } catch (Throwable unused) {
        }
    }

    public final void y(PackageG packageG) {
        h hVar = this.f167660i;
        if (hVar != null) {
            hVar.h2(packageG);
        }
    }

    public final void z(String str) {
        h hVar = this.f167660i;
        if (hVar != null) {
            hVar.v5(str);
        }
    }
}
