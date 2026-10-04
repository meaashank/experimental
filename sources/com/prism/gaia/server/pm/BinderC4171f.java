package com.prism.gaia.server.pm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.multidex.MultiDexExtractor;
import com.google.android.gms.drive.DriveFile;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.C3845i;
import com.prism.commons.utils.StringUtils;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.gserver.GaiaAppManagerService;
import com.prism.gaia.helper.io.GFile;
import com.prism.gaia.helper.utils.OatUtils;
import com.prism.gaia.helper.utils.PkgUtils;
import com.prism.gaia.naked.compat.android.content.IntentCompat2;
import com.prism.gaia.naked.compat.android.content.pm.ApplicationInfoCompat2;
import com.prism.gaia.naked.compat.android.content.pm.SharedLibraryInfoCompat2;
import com.prism.gaia.naked.compat.libcore.io.OsCompat2;
import com.prism.gaia.naked.metadata.android.content.pm.ApplicationInfoCAG;
import com.prism.gaia.naked.metadata.android.content.pm.PackageParserCAG;
import com.prism.gaia.naked.metadata.android.content.pm.SharedLibraryInfoCAG;
import com.prism.gaia.naked.metadata.com.android.server.SystemConfigCAG;
import com.prism.gaia.os.GaiaUserHandle;
import com.prism.gaia.os.ParceledListSliceG;
import com.prism.gaia.remote.ComponentEnabledSettingG;
import com.prism.gaia.remote.GuestAppInfo;
import com.prism.gaia.remote.PermissionGroup;
import com.prism.gaia.remote.PropertyG;
import com.prism.gaia.server.GProcessSupervisorProvider;
import com.prism.gaia.server.c0;
import com.prism.gaia.server.pm.PackageParserG;
import g6.C4455a;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p6.InterfaceC5394a;
import p6.d;
import v8.C5705o;

/* JADX INFO: renamed from: com.prism.gaia.server.pm.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class BinderC4171f extends c0.b {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final int f167546A0 = 3;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final int f167547B0 = 4;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final int f167548C0 = 5;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static Pattern f167549D0 = null;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final Comparator<ResolveInfo> f167550E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final Comparator<ProviderInfo> f167551F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final int f167552G0 = 10000;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final int f167553H0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f167554q0 = "asdf-".concat(BinderC4171f.class.getSimpleName());

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f167555r0 = "package";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final BinderC4171f f167556s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final p6.d f167557t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static Map<String, String> f167558u0 = null;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static Map<String, SharedLibraryInfo> f167559v0 = null;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Set<String> f167560w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final ReentrantReadWriteLock f167561x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f167562y0 = 1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int f167563z0 = 2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ReentrantReadWriteLock f167564b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Map<String, PackageG> f167565c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final d f167566d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final i f167567e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final d f167568f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final h f167569g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final List<PackageParserG.a> f167570h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final List<PackageParserG.f> f167571i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final HashMap<ComponentName, PackageParserG.f> f167572j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final HashMap<String, PackageParserG.f> f167573k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final HashMap<String, PackageParserG.d> f167574l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final HashMap<String, PackageParserG.e> f167575m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public HandlerThread f167576n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public HandlerC0680f f167577o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final g f167578p0;

    /* JADX INFO: renamed from: com.prism.gaia.server.pm.f$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f167579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f167580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f167581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f167582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f167583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f167584f;

        public a(int[] iArr, String str, String str2, Bundle bundle, String str3, int i10) {
            this.f167579a = iArr;
            this.f167580b = str;
            this.f167581c = str2;
            this.f167582d = bundle;
            this.f167583e = str3;
            this.f167584f = i10;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"WrongConstant"})
        public void run() {
            int[] iArrJ6 = this.f167579a;
            if (iArrJ6 == null) {
                iArrJ6 = GaiaUserManagerService.e6().j6();
            }
            for (int i10 : iArrJ6) {
                String str = this.f167580b;
                String str2 = this.f167581c;
                Intent intent = new Intent(str, str2 != null ? Uri.fromParts("package", str2, null) : null);
                Bundle bundle = this.f167582d;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                String str3 = this.f167583e;
                if (str3 != null) {
                    intent.setPackage(str3);
                }
                int intExtra = intent.getIntExtra("android.intent.extra.UID", -1);
                if (intExtra >= 0 && GaiaUserHandle.getVuserId(intExtra) != i10) {
                    intent.putExtra("android.intent.extra.UID", intExtra);
                }
                intent.putExtra(IntentCompat2.EXTRA_USER_HANDLE, i10);
                intent.addFlags(IntentCompat2.FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT | this.f167584f);
                com.prism.gaia.server.am.q.p6().Z6(intent, i10);
            }
        }
    }

    /* JADX INFO: renamed from: com.prism.gaia.server.pm.f$b */
    public class b implements Comparator<ResolveInfo> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
            int i10 = resolveInfo.priority;
            int i11 = resolveInfo2.priority;
            if (i10 != i11) {
                return i10 > i11 ? -1 : 1;
            }
            int i12 = resolveInfo.preferredOrder;
            int i13 = resolveInfo2.preferredOrder;
            if (i12 != i13) {
                return i12 > i13 ? -1 : 1;
            }
            boolean z10 = resolveInfo.isDefault;
            if (z10 != resolveInfo2.isDefault) {
                return z10 ? -1 : 1;
            }
            int i14 = resolveInfo.match;
            int i15 = resolveInfo2.match;
            if (i14 != i15) {
                return i14 > i15 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.prism.gaia.server.pm.f$c */
    public class c implements Comparator<ProviderInfo> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ProviderInfo providerInfo, ProviderInfo providerInfo2) {
            return Integer.compare(providerInfo2.initOrder, providerInfo.initOrder);
        }
    }

    /* JADX INFO: renamed from: com.prism.gaia.server.pm.f$d */
    public final class d extends AbstractC4181p<PackageParserG.ActivityIntentInfo, ResolveInfo> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final HashMap<ComponentName, PackageParserG.a> f167586j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f167587k;

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public void A(List<ResolveInfo> list) {
            Collections.sort(list, BinderC4171f.f167550E0);
        }

        public final void E(PackageParserG.a aVar, String str) {
            this.f167586j.put(aVar.b(), aVar);
            int size = aVar.f167531b.size();
            for (int i10 = 0; i10 < size; i10++) {
                PackageParserG.ActivityIntentInfo activityIntentInfo = (PackageParserG.ActivityIntentInfo) aVar.f167531b.get(i10);
                if (activityIntentInfo.filter.getPriority() > 0 && "activity".equals(str)) {
                    activityIntentInfo.filter.setPriority(0);
                    String unused = BinderC4171f.f167554q0;
                    String str2 = aVar.f167529f.applicationInfo.packageName;
                }
                b(activityIntentInfo);
            }
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public boolean d(PackageParserG.ActivityIntentInfo activityIntentInfo, List<ResolveInfo> list) {
            ActivityInfo activityInfo = activityIntentInfo.activity.f167529f;
            for (int size = list.size() - 1; size >= 0; size--) {
                ActivityInfo activityInfo2 = list.get(size).activityInfo;
                if (com.prism.commons.utils.P.a(activityInfo2.name, activityInfo.name) && com.prism.commons.utils.P.a(activityInfo2.packageName, activityInfo.packageName)) {
                    return false;
                }
            }
            return true;
        }

        public void G(PrintWriter printWriter, String str, PackageParserG.ActivityIntentInfo activityIntentInfo) {
        }

        public Object H(PackageParserG.ActivityIntentInfo activityIntentInfo) {
            return activityIntentInfo.activity;
        }

        public IntentFilter I(@NonNull PackageParserG.ActivityIntentInfo activityIntentInfo) {
            return activityIntentInfo.filter;
        }

        public boolean J(PackageParserG.ActivityIntentInfo activityIntentInfo) {
            return false;
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public boolean q(String str, PackageParserG.ActivityIntentInfo activityIntentInfo) {
            return str.equals(activityIntentInfo.activity.f167530a.f167512o);
        }

        public PackageParserG.ActivityIntentInfo[] L(int i10) {
            return new PackageParserG.ActivityIntentInfo[i10];
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public ResolveInfo s(PackageParserG.ActivityIntentInfo activityIntentInfo, int i10, int i11) {
            ActivityInfo activityInfoN;
            PackageParserG.a aVar = activityIntentInfo.activity;
            PackageSettingG packageSettingG = aVar.f167530a.f167488A;
            if (!packageSettingG.isClonePresentLPr(this.f167587k, i11) || !PackageSettingG.isEnabledLPr(aVar, this.f167587k, i11) || (activityInfoN = PackageParserG.n(aVar, this.f167587k, packageSettingG.getUserState(i11), i11, true)) == null) {
                return null;
            }
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.activityInfo = activityInfoN;
            if ((this.f167587k & 64) != 0) {
                resolveInfo.filter = activityIntentInfo.filter;
            }
            resolveInfo.priority = activityIntentInfo.filter.getPriority();
            resolveInfo.preferredOrder = aVar.f167530a.f167513p;
            resolveInfo.match = i10;
            resolveInfo.isDefault = activityIntentInfo.hasDefault;
            resolveInfo.labelRes = activityIntentInfo.labelRes;
            resolveInfo.nonLocalizedLabel = activityIntentInfo.nonLocalizedLabel;
            resolveInfo.icon = activityIntentInfo.icon;
            return resolveInfo;
        }

        public List<ResolveInfo> N(Intent intent, String str, int i10, int i11) {
            this.f167587k = i10;
            return super.t(intent, str, (i10 & 65536) != 0, i11);
        }

        public List<ResolveInfo> O(Intent intent, String str, int i10, ArrayList<PackageParserG.a> arrayList, int i11) {
            if (arrayList == null) {
                return null;
            }
            this.f167587k = i10;
            boolean z10 = (i10 & 65536) != 0;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                ArrayList<II> arrayList3 = arrayList.get(i12).f167531b;
                if (arrayList3 != 0 && arrayList3.size() > 0) {
                    PackageParserG.ActivityIntentInfo[] activityIntentInfoArr = new PackageParserG.ActivityIntentInfo[arrayList3.size()];
                    arrayList3.toArray(activityIntentInfoArr);
                    arrayList2.add(activityIntentInfoArr);
                }
            }
            return u(intent, str, z10, arrayList2, i11);
        }

        public final void P(PackageParserG.a aVar, String str) {
            this.f167586j.remove(aVar.b());
            int size = aVar.f167531b.size();
            for (int i10 = 0; i10 < size; i10++) {
                x((PackageParserG.ActivityIntentInfo) aVar.f167531b.get(i10));
            }
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public /* bridge */ /* synthetic */ void g(PrintWriter printWriter, String str, PackageParserG.ActivityIntentInfo activityIntentInfo) {
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public void h(PrintWriter printWriter, String str, Object obj, int i10) {
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public Object l(PackageParserG.ActivityIntentInfo activityIntentInfo) {
            return activityIntentInfo.activity;
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public IntentFilter o(@NonNull PackageParserG.ActivityIntentInfo activityIntentInfo) {
            return activityIntentInfo.filter;
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public /* bridge */ /* synthetic */ boolean p(PackageParserG.ActivityIntentInfo activityIntentInfo) {
            return false;
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public PackageParserG.ActivityIntentInfo[] r(int i10) {
            return new PackageParserG.ActivityIntentInfo[i10];
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public List<ResolveInfo> t(Intent intent, String str, boolean z10, int i10) {
            this.f167587k = z10 ? 65536 : 0;
            return super.t(intent, str, z10, i10);
        }

        public d() {
            this.f167586j = new HashMap<>();
        }
    }

    /* JADX INFO: renamed from: com.prism.gaia.server.pm.f$e */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ZipEntry f167589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f167590b;

        public e(ZipEntry zipEntry, int i10) {
            this.f167589a = zipEntry;
            this.f167590b = i10;
        }
    }

    /* JADX INFO: renamed from: com.prism.gaia.server.pm.f$f, reason: collision with other inner class name */
    public class HandlerC0680f extends Handler {
        public HandlerC0680f(Looper looper) {
            super(looper);
        }

        public void a(Message message) {
            if (message.what != 1) {
                return;
            }
            Process.setThreadPriority(0);
            ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(BinderC4171f.this);
            try {
                int iH = BinderC4171f.this.f167578p0.h();
                if (iH <= 0) {
                    readLockA.unlock();
                    return;
                }
                String[] strArr = new String[iH];
                ArrayList<String>[] arrayListArr = new ArrayList[iH];
                int[] iArr = new int[iH];
                int i10 = 0;
                for (int i11 = 0; i11 < BinderC4171f.this.f167578p0.j(); i11++) {
                    int i12 = BinderC4171f.this.f167578p0.i(i11);
                    Iterator<Map.Entry<String, ArrayList<String>>> it = BinderC4171f.this.f167578p0.d(i12).entrySet().iterator();
                    while (it.hasNext() && i10 < iH) {
                        Map.Entry<String, ArrayList<String>> next = it.next();
                        strArr[i10] = next.getKey();
                        arrayListArr[i10] = next.getValue();
                        PackageG packageG = BinderC4171f.this.f167565c0.get(next.getKey());
                        iArr[i10] = packageG != null ? GaiaUserHandle.getVuid(i12, packageG.f167488A.appId) : -1;
                        i10++;
                    }
                }
                BinderC4171f.this.f167578p0.a();
                readLockA.unlock();
                for (int i13 = 0; i13 < i10; i13++) {
                    BinderC4171f.this.O6(strArr[i13], true, arrayListArr[i13], iArr[i13]);
                }
                Process.setThreadPriority(10);
            } catch (Throwable th) {
                readLockA.unlock();
                throw th;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                a(message);
            } finally {
                Process.setThreadPriority(10);
            }
        }
    }

    /* JADX INFO: renamed from: com.prism.gaia.server.pm.f$g */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final B8.g<B8.a<String, ArrayList<String>>> f167592a = new B8.g<>();

        public void a() {
            this.f167592a.b();
        }

        public ArrayList<String> b(int i10, String str) {
            return c(i10).get(str);
        }

        public final B8.a<String, ArrayList<String>> c(int i10) {
            B8.a<String, ArrayList<String>> aVarF = this.f167592a.f(i10);
            if (aVarF != null) {
                return aVarF;
            }
            B8.a<String, ArrayList<String>> aVar = new B8.a<>();
            this.f167592a.k(i10, aVar);
            return aVar;
        }

        public B8.a<String, ArrayList<String>> d(int i10) {
            return this.f167592a.f(i10);
        }

        public void e(int i10, String str, ArrayList<String> arrayList) {
            c(i10).put(str, arrayList);
        }

        public void f(int i10) {
            this.f167592a.l(i10);
        }

        public void g(int i10, String str) {
            B8.a<String, ArrayList<String>> aVarF = this.f167592a.f(i10);
            if (aVarF != null) {
                aVarF.remove(str);
            }
        }

        public int h() {
            int size = 0;
            for (int i10 = 0; i10 < this.f167592a.r(); i10++) {
                size += this.f167592a.s(i10).size();
            }
            return size;
        }

        public int i(int i10) {
            return this.f167592a.j(i10);
        }

        public int j() {
            return this.f167592a.r();
        }
    }

    /* JADX INFO: renamed from: com.prism.gaia.server.pm.f$h */
    public final class h extends AbstractC4181p<PackageParserG.ProviderIntentInfo, ResolveInfo> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final HashMap<ComponentName, PackageParserG.f> f167593j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f167594k;

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public void A(List<ResolveInfo> list) {
            Collections.sort(list, BinderC4171f.f167550E0);
        }

        public final void D(PackageParserG.f fVar) {
            if (this.f167593j.containsKey(fVar.b())) {
                String unused = BinderC4171f.f167554q0;
                Objects.toString(fVar.b());
                return;
            }
            this.f167593j.put(fVar.b(), fVar);
            int size = fVar.f167531b.size();
            for (int i10 = 0; i10 < size; i10++) {
                b((PackageParserG.ProviderIntentInfo) fVar.f167531b.get(i10));
            }
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        @TargetApi(19)
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public boolean d(PackageParserG.ProviderIntentInfo providerIntentInfo, List<ResolveInfo> list) {
            ProviderInfo providerInfo = providerIntentInfo.provider.f167538f;
            for (int size = list.size() - 1; size >= 0; size--) {
                ProviderInfo providerInfo2 = list.get(size).providerInfo;
                if (com.prism.commons.utils.P.a(providerInfo2.name, providerInfo.name) && com.prism.commons.utils.P.a(providerInfo2.packageName, providerInfo.packageName)) {
                    return false;
                }
            }
            return true;
        }

        public void F(PrintWriter printWriter, String str, PackageParserG.ProviderIntentInfo providerIntentInfo) {
        }

        public Object G(PackageParserG.ProviderIntentInfo providerIntentInfo) {
            return providerIntentInfo.provider;
        }

        public IntentFilter H(@NonNull PackageParserG.ProviderIntentInfo providerIntentInfo) {
            return providerIntentInfo.filter;
        }

        public boolean I(PackageParserG.ProviderIntentInfo providerIntentInfo) {
            return false;
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean q(String str, PackageParserG.ProviderIntentInfo providerIntentInfo) {
            return str.equals(providerIntentInfo.provider.f167530a.f167512o);
        }

        public PackageParserG.ProviderIntentInfo[] K(int i10) {
            return new PackageParserG.ProviderIntentInfo[i10];
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        @TargetApi(19)
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public ResolveInfo s(PackageParserG.ProviderIntentInfo providerIntentInfo, int i10, int i11) {
            ProviderInfo providerInfoU;
            PackageParserG.f fVar = providerIntentInfo.provider;
            PackageSettingG packageSettingG = fVar.f167530a.f167488A;
            if (!PackageSettingG.isEnabledLPr(fVar, this.f167594k, i11) || (providerInfoU = PackageParserG.u(fVar, this.f167594k, packageSettingG.getUserState(i11), i11, true)) == null) {
                return null;
            }
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.providerInfo = providerInfoU;
            if ((this.f167594k & 64) != 0) {
                resolveInfo.filter = providerIntentInfo.filter;
            }
            resolveInfo.priority = providerIntentInfo.filter.getPriority();
            resolveInfo.preferredOrder = fVar.f167530a.f167513p;
            resolveInfo.match = i10;
            resolveInfo.isDefault = providerIntentInfo.hasDefault;
            resolveInfo.labelRes = providerIntentInfo.labelRes;
            resolveInfo.nonLocalizedLabel = providerIntentInfo.nonLocalizedLabel;
            resolveInfo.icon = providerIntentInfo.icon;
            return resolveInfo;
        }

        public List<ResolveInfo> M(Intent intent, String str, int i10, int i11) {
            this.f167594k = i10;
            return super.t(intent, str, (i10 & 65536) != 0, i11);
        }

        public List<ResolveInfo> N(Intent intent, String str, int i10, ArrayList<PackageParserG.f> arrayList, int i11) {
            if (arrayList == null) {
                return null;
            }
            this.f167594k = i10;
            boolean z10 = (i10 & 65536) != 0;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                ArrayList<II> arrayList3 = arrayList.get(i12).f167531b;
                if (arrayList3 != 0 && arrayList3.size() > 0) {
                    PackageParserG.ProviderIntentInfo[] providerIntentInfoArr = new PackageParserG.ProviderIntentInfo[arrayList3.size()];
                    arrayList3.toArray(providerIntentInfoArr);
                    arrayList2.add(providerIntentInfoArr);
                }
            }
            return u(intent, str, z10, arrayList2, i11);
        }

        public final void O(PackageParserG.f fVar) {
            this.f167593j.remove(fVar.b());
            int size = fVar.f167531b.size();
            for (int i10 = 0; i10 < size; i10++) {
                x((PackageParserG.ProviderIntentInfo) fVar.f167531b.get(i10));
            }
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public /* bridge */ /* synthetic */ void g(PrintWriter printWriter, String str, PackageParserG.ProviderIntentInfo providerIntentInfo) {
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public void h(PrintWriter printWriter, String str, Object obj, int i10) {
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public Object l(PackageParserG.ProviderIntentInfo providerIntentInfo) {
            return providerIntentInfo.provider;
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public IntentFilter o(@NonNull PackageParserG.ProviderIntentInfo providerIntentInfo) {
            return providerIntentInfo.filter;
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public /* bridge */ /* synthetic */ boolean p(PackageParserG.ProviderIntentInfo providerIntentInfo) {
            return false;
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public PackageParserG.ProviderIntentInfo[] r(int i10) {
            return new PackageParserG.ProviderIntentInfo[i10];
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public List<ResolveInfo> t(Intent intent, String str, boolean z10, int i10) {
            this.f167594k = z10 ? 65536 : 0;
            return super.t(intent, str, z10, i10);
        }

        public h() {
            this.f167593j = new HashMap<>();
        }
    }

    /* JADX INFO: renamed from: com.prism.gaia.server.pm.f$i */
    public final class i extends AbstractC4181p<PackageParserG.ServiceIntentInfo, ResolveInfo> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final HashMap<ComponentName, PackageParserG.g> f167596j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f167597k;

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public void A(List<ResolveInfo> list) {
            Collections.sort(list, BinderC4171f.f167550E0);
        }

        public final void E(PackageParserG.g gVar) {
            this.f167596j.put(gVar.b(), gVar);
            int size = gVar.f167531b.size();
            for (int i10 = 0; i10 < size; i10++) {
                b((PackageParserG.ServiceIntentInfo) gVar.f167531b.get(i10));
            }
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public boolean d(PackageParserG.ServiceIntentInfo serviceIntentInfo, List<ResolveInfo> list) {
            ServiceInfo serviceInfo = serviceIntentInfo.service.f167539f;
            for (int size = list.size() - 1; size >= 0; size--) {
                ServiceInfo serviceInfo2 = list.get(size).serviceInfo;
                if (com.prism.commons.utils.P.a(serviceInfo2.name, serviceInfo.name) && com.prism.commons.utils.P.a(serviceInfo2.packageName, serviceInfo.packageName)) {
                    return false;
                }
            }
            return true;
        }

        public void G(PrintWriter printWriter, String str, PackageParserG.ServiceIntentInfo serviceIntentInfo) {
        }

        public Object H(PackageParserG.ServiceIntentInfo serviceIntentInfo) {
            return serviceIntentInfo.service;
        }

        public IntentFilter I(@NonNull PackageParserG.ServiceIntentInfo serviceIntentInfo) {
            return serviceIntentInfo.filter;
        }

        public boolean J(PackageParserG.ServiceIntentInfo serviceIntentInfo) {
            return false;
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public boolean q(String str, PackageParserG.ServiceIntentInfo serviceIntentInfo) {
            return str.equals(serviceIntentInfo.service.f167530a.f167512o);
        }

        public PackageParserG.ServiceIntentInfo[] L(int i10) {
            return new PackageParserG.ServiceIntentInfo[i10];
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public ResolveInfo s(PackageParserG.ServiceIntentInfo serviceIntentInfo, int i10, int i11) {
            ServiceInfo serviceInfoW;
            PackageParserG.g gVar = serviceIntentInfo.service;
            PackageSettingG packageSettingG = gVar.f167530a.f167488A;
            if (!PackageSettingG.isEnabledLPr(gVar, this.f167597k, i11) || (serviceInfoW = PackageParserG.w(gVar, this.f167597k, packageSettingG.getUserState(i11), i11, true)) == null) {
                return null;
            }
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.serviceInfo = serviceInfoW;
            if ((this.f167597k & 64) != 0) {
                resolveInfo.filter = serviceIntentInfo.filter;
            }
            resolveInfo.priority = serviceIntentInfo.filter.getPriority();
            resolveInfo.preferredOrder = gVar.f167530a.f167513p;
            resolveInfo.match = i10;
            resolveInfo.isDefault = serviceIntentInfo.hasDefault;
            resolveInfo.labelRes = serviceIntentInfo.labelRes;
            resolveInfo.nonLocalizedLabel = serviceIntentInfo.nonLocalizedLabel;
            resolveInfo.icon = serviceIntentInfo.icon;
            return resolveInfo;
        }

        public List<ResolveInfo> N(Intent intent, String str, int i10, int i11) {
            this.f167597k = i10;
            return super.t(intent, str, (i10 & 65536) != 0, i11);
        }

        public List<ResolveInfo> O(Intent intent, String str, int i10, ArrayList<PackageParserG.g> arrayList, int i11) {
            if (arrayList == null) {
                return null;
            }
            this.f167597k = i10;
            boolean z10 = (i10 & 65536) != 0;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                ArrayList<II> arrayList3 = arrayList.get(i12).f167531b;
                if (arrayList3 != 0 && arrayList3.size() > 0) {
                    PackageParserG.ServiceIntentInfo[] serviceIntentInfoArr = new PackageParserG.ServiceIntentInfo[arrayList3.size()];
                    arrayList3.toArray(serviceIntentInfoArr);
                    arrayList2.add(serviceIntentInfoArr);
                }
            }
            return u(intent, str, z10, arrayList2, i11);
        }

        public final void P(PackageParserG.g gVar) {
            this.f167596j.remove(gVar.b());
            int size = gVar.f167531b.size();
            for (int i10 = 0; i10 < size; i10++) {
                x((PackageParserG.ServiceIntentInfo) gVar.f167531b.get(i10));
            }
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public /* bridge */ /* synthetic */ void g(PrintWriter printWriter, String str, PackageParserG.ServiceIntentInfo serviceIntentInfo) {
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public void h(PrintWriter printWriter, String str, Object obj, int i10) {
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public Object l(PackageParserG.ServiceIntentInfo serviceIntentInfo) {
            return serviceIntentInfo.service;
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public IntentFilter o(@NonNull PackageParserG.ServiceIntentInfo serviceIntentInfo) {
            return serviceIntentInfo.filter;
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public /* bridge */ /* synthetic */ boolean p(PackageParserG.ServiceIntentInfo serviceIntentInfo) {
            return false;
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public PackageParserG.ServiceIntentInfo[] r(int i10) {
            return new PackageParserG.ServiceIntentInfo[i10];
        }

        @Override // com.prism.gaia.server.pm.AbstractC4181p
        public List<ResolveInfo> t(Intent intent, String str, boolean z10, int i10) {
            this.f167597k = z10 ? 65536 : 0;
            return super.t(intent, str, z10, i10);
        }

        public i() {
            this.f167596j = new HashMap<>();
        }
    }

    static {
        final BinderC4171f binderC4171f = new BinderC4171f();
        f167556s0 = binderC4171f;
        Objects.requireNonNull(binderC4171f);
        f167557t0 = new p6.d("package", binderC4171f, new d.a() { // from class: com.prism.gaia.server.pm.e
            @Override // p6.d.a
            public final void a() {
                this.f167545a.S6();
            }
        });
        f167558u0 = null;
        f167559v0 = null;
        f167560w0 = new HashSet();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        com.prism.gaia.helper.utils.o.h("GPMS.libraryLock", reentrantReadWriteLock);
        f167561x0 = reentrantReadWriteLock;
        f167549D0 = Pattern.compile(".*/gaia/data/app/([^/]+)/.*");
        f167550E0 = new b();
        f167551F0 = new c();
    }

    public BinderC4171f() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        com.prism.gaia.helper.utils.o.i("GPMS.loadedLock", reentrantReadWriteLock);
        this.f167564b0 = reentrantReadWriteLock;
        this.f167565c0 = new HashMap();
        this.f167566d0 = new d();
        this.f167567e0 = new i();
        this.f167568f0 = new d();
        this.f167569g0 = new h();
        this.f167570h0 = new ArrayList();
        this.f167571i0 = new ArrayList();
        this.f167572j0 = new HashMap<>();
        this.f167573k0 = new HashMap<>();
        this.f167574l0 = new HashMap<>();
        this.f167575m0 = new HashMap<>();
        this.f167578p0 = new g();
    }

    public static void A6() {
        if (SystemConfigCAG.f165999G.getInstance() != null) {
            try {
                if (C3841e.w() && SystemConfigCAG.Q29.getSharedLibraries() != null) {
                    Map<String, Object> mapCall = SystemConfigCAG.Q29.getSharedLibraries().call(SystemConfigCAG.f165999G.getInstance().call(new Object[0]), new Object[0]);
                    if (mapCall != null && mapCall.size() > 0) {
                        com.prism.commons.utils.I.b(f167554q0, "loading SystemConfig.getSharedLibraries() size %d", Integer.valueOf(mapCall.size()));
                        f167558u0 = new HashMap();
                        for (Object obj : mapCall.values()) {
                            SystemConfigCAG.Q29.SharedLibraryEntry.name().get(obj);
                            SystemConfigCAG.Q29.SharedLibraryEntry.filename().get(obj);
                            SystemConfigCAG.Q29.SharedLibraryEntry.dependencies().get(obj);
                            f167558u0.put(SystemConfigCAG.Q29.SharedLibraryEntry.name().get(obj), SystemConfigCAG.Q29.SharedLibraryEntry.filename().get(obj));
                        }
                    }
                } else if (SystemConfigCAG._P28.getSharedLibraries() != null) {
                    com.prism.commons.utils.I.a(f167554q0, "loading SystemConfig.getSharedLibraries() by _P28 api");
                    f167558u0 = SystemConfigCAG._P28.getSharedLibraries().call(SystemConfigCAG.f165999G.getInstance().call(new Object[0]), new Object[0]);
                }
            } catch (Exception e10) {
                f167558u0 = null;
                e10.getMessage();
            }
        }
        if (f167558u0 == null) {
            try {
                com.prism.commons.utils.I.a(f167554q0, "loading SystemConfig.getSharedLibraries() by reading files");
                f167558u0 = com.prism.gaia.gserver.e.h().j();
            } catch (Exception e11) {
                f167558u0 = new HashMap();
                e11.getMessage();
            }
        }
    }

    public static void B6() {
        f167559v0 = new HashMap();
        if (C3841e.s()) {
            Iterator it = GaiaContext.j().T().getSharedLibraries(0).iterator();
            while (it.hasNext()) {
                SharedLibraryInfo sharedLibraryInfoA = C4166a.a(it.next());
                f167559v0.put(sharedLibraryInfoA.getName(), sharedLibraryInfoA);
            }
        }
    }

    public static void C6(String str, boolean z10) throws Exception {
        String strW6;
        U6();
        if (U6.c.f0() || z10 || u6(str) != null || (strW6 = w6(str)) == null) {
            return;
        }
        File file = new File(strW6);
        if (file.exists()) {
            com.prism.gaia.gserver.d dVarB = com.prism.gaia.gserver.d.b(file);
            if (dVarB.e()) {
                String str2 = U6.c.f68723t;
                if (dVarB.f(str2)) {
                    return;
                }
                ReentrantReadWriteLock.WriteLock writeLock = f167561x0.writeLock();
                writeLock.lock();
                GFile gFileO = D9.d.o(str);
                try {
                    if (u6(str) != null) {
                        return;
                    }
                    com.prism.gaia.helper.utils.l.w(gFileO, -1);
                    OatUtils.d(gFileO.getAbsolutePath(), dVarB.c());
                    OsCompat2.Util.chmod(gFileO.getAbsolutePath(), 493);
                    String strB = OatUtils.b(gFileO, str, str2);
                    com.prism.gaia.helper.utils.l.x(strB);
                    com.prism.gaia.helper.a.d(gFileO.getAbsolutePath(), strB, str2);
                    com.prism.gaia.helper.a.e(strB);
                    f167560w0.add(str);
                } catch (Throwable th) {
                    try {
                        C5705o.c().e(th, "com.app.hider.master.promax", "supervisor", "DEX2OAT_FAILED", new Bundle());
                        com.prism.gaia.helper.utils.l.s(gFileO);
                        throw th;
                    } finally {
                        writeLock.unlock();
                    }
                }
            }
        }
    }

    public static z F6(PackageG packageG) {
        PackageSettingG packageSettingG;
        if (packageG == null || (packageSettingG = packageG.f167488A) == null) {
            return null;
        }
        z zVar = packageG.f167496I;
        if (zVar != null) {
            return zVar;
        }
        z zVarA = PackageParserG.A(packageSettingG);
        packageG.B(zVarA);
        return zVarA;
    }

    public static boolean Q6(PackageG packageG, PackageG packageG2) {
        if (packageG != null && packageG2 != null) {
            if (packageG == packageG2) {
                return true;
            }
            Signature[] signatureArrR6 = R6(packageG);
            Signature[] signatureArrR62 = R6(packageG2);
            if (signatureArrR6 != null && signatureArrR62 != null && signatureArrR6.length != 0 && signatureArrR62.length != 0) {
                for (Signature signature : signatureArrR6) {
                    if (signature != null) {
                        for (Signature signature2 : signatureArrR62) {
                            if (signature.equals(signature2)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static Signature[] R6(PackageG packageG) {
        if (packageG == null) {
            return null;
        }
        Signature[] signatureArr = packageG.f167509l;
        if (signatureArr != null && signatureArr.length > 0) {
            return signatureArr;
        }
        if (packageG.f167510m == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Signature[] signatureArr2 = PackageParserCAG.P28.SigningDetails.signatures().get(packageG.f167510m);
            if (signatureArr2 != null) {
                Collections.addAll(arrayList, signatureArr2);
            }
            Signature[] signatureArr3 = PackageParserCAG.P28.SigningDetails.pastSigningCertificates().get(packageG.f167510m);
            if (signatureArr3 != null) {
                Collections.addAll(arrayList, signatureArr3);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return (Signature[]) arrayList.toArray(new Signature[0]);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static /* synthetic */ void T5(List list, ZipFile zipFile, ParcelFileDescriptor[] parcelFileDescriptorArr) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                com.prism.gaia.helper.utils.l.X(zipFile.getInputStream(((e) list.get(i10)).f167589a), parcelFileDescriptorArr[i10]);
            } catch (IOException unused) {
                com.prism.gaia.helper.utils.l.j(parcelFileDescriptorArr[i10]);
            }
        }
        com.prism.gaia.helper.utils.l.j(zipFile);
    }

    public static void U6() {
        f167557t0.d();
    }

    public static void b6(Collection<String> collection, Set<String> set, SharedLibraryInfo sharedLibraryInfo, String str) {
        List<SharedLibraryInfo> list;
        if (C3841e.s()) {
            if (SharedLibraryInfoCAG.f165678C.mIsNative() == null || !SharedLibraryInfoCAG.f165678C.mIsNative().get(sharedLibraryInfo)) {
                String key = SharedLibraryInfoCompat2.Util.getKey(sharedLibraryInfo);
                if (set.contains(key)) {
                    return;
                }
                for (String str2 : SharedLibraryInfoCompat2.Util.getAllCodePaths(sharedLibraryInfo)) {
                    if (str2 != null && str2.endsWith(".apk")) {
                        StringBuilder sbA = android.support.v4.media.f.a(str2, "!");
                        sbA.append(File.separator);
                        sbA.append(str);
                        collection.add(sbA.toString());
                    }
                }
                set.add(key);
                if (SharedLibraryInfoCAG.f165678C.mDependencies() == null || (list = SharedLibraryInfoCAG.f165678C.mDependencies().get(sharedLibraryInfo)) == null) {
                    return;
                }
                Iterator<SharedLibraryInfo> it = list.iterator();
                while (it.hasNext()) {
                    b6(collection, set, C4166a.a(it.next()), str);
                }
            }
        }
    }

    public static int e6(PackageG packageG, String str) {
        ArrayList<PackageParserG.a> arrayList = packageG.f167498a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            PackageParserG.a aVar = arrayList.get(i10);
            i10++;
            if (str.equals(aVar.b().getClassName())) {
                return 1;
            }
        }
        ArrayList<PackageParserG.a> arrayList2 = packageG.f167499b;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            PackageParserG.a aVar2 = arrayList2.get(i11);
            i11++;
            if (str.equals(aVar2.b().getClassName())) {
                return 2;
            }
        }
        ArrayList<PackageParserG.g> arrayList3 = packageG.f167501d;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            PackageParserG.g gVar = arrayList3.get(i12);
            i12++;
            if (str.equals(gVar.b().getClassName())) {
                return 3;
            }
        }
        ArrayList<PackageParserG.f> arrayList4 = packageG.f167500c;
        int size4 = arrayList4.size();
        int i13 = 0;
        while (i13 < size4) {
            PackageParserG.f fVar = arrayList4.get(i13);
            i13++;
            if (str.equals(fVar.b().getClassName())) {
                return 4;
            }
        }
        return 0;
    }

    public static BinderC4171f h6() {
        return f167556s0;
    }

    public static Integer i6(String str) {
        if ("classes.dex".equals(str)) {
            return 1;
        }
        Matcher matcher = Pattern.compile("^classes(\\d+)\\.dex$").matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(matcher.group(1)));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static InterfaceC5394a j6() {
        return f167557t0;
    }

    public static SharedLibraryInfo t6(String str) {
        U6();
        Map<String, SharedLibraryInfo> map = f167559v0;
        if (map == null) {
            return null;
        }
        return C4166a.a(map.get(str));
    }

    public static String u6(String str) {
        ReentrantReadWriteLock.ReadLock lock = f167561x0.readLock();
        lock.lock();
        try {
            if (f167560w0.contains(str)) {
                return D9.d.o(str).getAbsolutePath();
            }
            lock.unlock();
            return null;
        } finally {
            lock.unlock();
        }
    }

    public static String v6(String str, boolean z10) {
        U6();
        if (z10) {
            return w6(str);
        }
        String strU6 = u6(str);
        return strU6 != null ? strU6 : w6(str);
    }

    public static String w6(String str) {
        return f167558u0.get(str);
    }

    public static void z6() {
        if (D9.d.n().exists()) {
            for (File file : D9.d.f22999k.listFiles()) {
                if (!file.isDirectory()) {
                    String name = file.getName();
                    if (name.endsWith(MultiDexExtractor.f114845k)) {
                        f167560w0.add(name.substring(0, name.length() - 4));
                    }
                }
            }
        }
    }

    @Override // com.prism.gaia.server.c0
    public List<PermissionGroupInfo> A0(int i10) {
        U6();
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            ArrayList arrayList = new ArrayList(this.f167575m0.size());
            Iterator<PackageParserG.e> it = this.f167575m0.values().iterator();
            while (it.hasNext()) {
                arrayList.add(new PermissionGroupInfo(it.next().f167537f));
            }
            return arrayList;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public GuestAppInfo A4(String str) {
        U6();
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG != null) {
                return packageG.l();
            }
            lock.unlock();
            return null;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public ParceledListSliceG<ActivityInfo> B0(String str, int i10, int i11) {
        U6();
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG == null) {
                return new ParceledListSliceG<>(new ArrayList(0));
            }
            int size = packageG.f167498a.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                PackageParserG.a aVar = packageG.f167498a.get(i12);
                if (PackageSettingG.isEnabledLPr(aVar, i10, i11)) {
                    arrayList.add(PackageParserG.n(aVar, i10, packageG.f167488A.getUserState(i11), i11, false));
                }
            }
            return new ParceledListSliceG<>(arrayList);
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public ParceledListSliceG<ProviderInfo> D3(String str, int i10, int i11) {
        return new ParceledListSliceG<>(G6(str, i10, i11));
    }

    @Override // com.prism.gaia.server.c0
    public PackageInfo D5(String str, int i10, int i11, boolean z10) {
        U6();
        c6(i11);
        int iT6 = T6(i10);
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG != null) {
                return g6(packageG, packageG.f167488A, iT6, i11, z10);
            }
            readLockA.unlock();
            return null;
        } finally {
        }
    }

    public final boolean D6(PackageG packageG, int i10, int i11) {
        PackageSettingG packageSettingG;
        if (packageG == null || (packageSettingG = packageG.f167488A) == null) {
            return false;
        }
        return packageSettingG.isAvailableLPr(i10, i11);
    }

    public boolean E6(String str) {
        U6();
        ReentrantReadWriteLock.ReadLock lock = this.f167564b0.readLock();
        lock.lock();
        try {
            return this.f167565c0.containsKey(str);
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public int G3(ComponentName componentName, int i10) {
        PackageSettingG packageSettingG;
        U6();
        String packageName = componentName.getPackageName();
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            PackageG packageG = this.f167565c0.get(packageName);
            if (packageG != null && (packageSettingG = packageG.f167488A) != null) {
                return packageSettingG.getCurrentEnabledStateLPr(componentName.getClassName(), i10);
            }
            readLockA.unlock();
            return -1;
        } finally {
            readLockA.unlock();
        }
    }

    public List<ProviderInfo> G6(String str, int i10, int i11) {
        U6();
        int vappId = GaiaUserHandle.getVappId(i10);
        int vuserId = GaiaUserHandle.getVuserId(i10);
        c6(vuserId);
        int iT6 = T6(i11);
        ArrayList arrayList = new ArrayList(3);
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            for (PackageParserG.f fVar : this.f167571i0) {
                PackageSettingG packageSettingG = fVar.f167530a.f167488A;
                if (str == null || (packageSettingG.appId == vappId && fVar.f167538f.processName.equals(str))) {
                    if (PackageSettingG.isEnabledLPr(fVar, iT6, vuserId)) {
                        ProviderInfo providerInfoU = PackageParserG.u(fVar, iT6, packageSettingG.getUserState(vuserId), vuserId, true);
                        int i12 = providerInfoU.initOrder;
                        arrayList.add(providerInfoU);
                    }
                }
            }
            readLockA.unlock();
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, f167551F0);
            }
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                String str2 = ((ProviderInfo) obj).authority;
            }
            return arrayList;
        } catch (Throwable th) {
            readLockA.unlock();
            throw th;
        }
    }

    @Override // com.prism.gaia.server.c0
    public PermissionInfo H(String str, int i10) {
        U6();
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            PackageParserG.d dVar = this.f167574l0.get(str);
            if (dVar != null) {
                return new PermissionInfo(dVar.f167536f);
            }
            lock.unlock();
            return null;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public boolean H5(String str, boolean z10, int i10) {
        PackageSettingG packageSettingG;
        U6();
        c6(i10);
        ReentrantReadWriteLock.WriteLock writeLock = k6().writeLock();
        writeLock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG != null && (packageSettingG = packageG.f167488A) != null) {
                PackageUserStateG userState = packageSettingG.getUserState(i10);
                if (userState.isHidden() == z10) {
                    return false;
                }
                userState.setHidden(z10);
                u.n().S(packageSettingG);
                int vuid = GaiaUserHandle.getVuid(i10, packageSettingG.appId);
                writeLock.unlock();
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(str);
                O6(str, false, arrayList, vuid);
                GProcessSupervisorProvider.B(str, i10);
                try {
                    GaiaAppManagerService.p6().L6(str, i10, z10 ? 4 : 5);
                    return true;
                } catch (Throwable unused) {
                    return true;
                }
            }
            return false;
        } finally {
            writeLock.unlock();
        }
    }

    public List<ResolveInfo> H6(Intent intent, String str, int i10, int i11) {
        U6();
        c6(i11);
        int iT6 = T6(i10);
        ComponentName component = intent.getComponent();
        if (component == null && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        Intent intent2 = intent;
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ActivityInfo activityInfoU3 = U3(component, iT6, i11);
            if (activityInfoU3 != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.activityInfo = activityInfoU3;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            String str2 = intent2.getPackage();
            if (str2 == null) {
                List<ResolveInfo> listN = this.f167566d0.N(intent2, str, iT6, i11);
                readLockA.unlock();
                return listN;
            }
            PackageG packageG = this.f167565c0.get(str2);
            if (packageG != null) {
                List<ResolveInfo> listO = this.f167566d0.O(intent2, str, iT6, packageG.f167498a, i11);
                readLockA.unlock();
                return listO;
            }
            List<ResolveInfo> list = Collections.EMPTY_LIST;
            readLockA.unlock();
            return list;
        } catch (Throwable th) {
            readLockA.unlock();
            throw th;
        }
    }

    @Override // com.prism.gaia.server.c0
    public PermissionGroupInfo I4(String str, int i10) {
        U6();
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            PackageParserG.e eVar = this.f167575m0.get(str);
            if (eVar != null) {
                return new PermissionGroupInfo(eVar.f167537f);
            }
            lock.unlock();
            return null;
        } finally {
            lock.unlock();
        }
    }

    @TargetApi(19)
    public List<ResolveInfo> I6(Intent intent, String str, int i10, int i11) {
        U6();
        c6(i11);
        int iT6 = T6(i10);
        ComponentName component = intent.getComponent();
        if (component == null && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        Intent intent2 = intent;
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ProviderInfo providerInfoV = V(component, iT6, i11);
            if (providerInfoV != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.providerInfo = providerInfoV;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            String str2 = intent2.getPackage();
            if (str2 == null) {
                List<ResolveInfo> listM = this.f167569g0.M(intent2, str, iT6, i11);
                readLockA.unlock();
                return listM;
            }
            PackageG packageG = this.f167565c0.get(str2);
            if (packageG != null) {
                List<ResolveInfo> listN = this.f167569g0.N(intent2, str, iT6, packageG.f167500c, i11);
                readLockA.unlock();
                return listN;
            }
            List<ResolveInfo> list = Collections.EMPTY_LIST;
            readLockA.unlock();
            return list;
        } catch (Throwable th) {
            readLockA.unlock();
            throw th;
        }
    }

    public List<ResolveInfo> J6(Intent intent, String str, int i10, int i11) {
        U6();
        c6(i11);
        int iT6 = T6(i10);
        ComponentName component = intent.getComponent();
        if (component == null && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        Intent intent2 = intent;
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ActivityInfo activityInfoZ = Z(component, iT6, i11);
            if (activityInfoZ != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.activityInfo = activityInfoZ;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            String str2 = intent2.getPackage();
            if (str2 == null) {
                List<ResolveInfo> listN = this.f167568f0.N(intent2, str, iT6, i11);
                readLockA.unlock();
                return listN;
            }
            PackageG packageG = this.f167565c0.get(str2);
            if (packageG != null) {
                List<ResolveInfo> listO = this.f167568f0.O(intent2, str, iT6, packageG.f167499b, i11);
                readLockA.unlock();
                return listO;
            }
            List<ResolveInfo> list = Collections.EMPTY_LIST;
            readLockA.unlock();
            return list;
        } catch (Throwable th) {
            readLockA.unlock();
            throw th;
        }
    }

    @Override // com.prism.gaia.server.c0
    public int K0(String str, int i10) {
        U6();
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG != null) {
                return GaiaUserHandle.getVuid(i10, packageG.f167488A.appId);
            }
            lock.unlock();
            return -1;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public ParceledListSliceG<ResolveInfo> K3(Intent intent, String str, int i10, int i11) {
        return new ParceledListSliceG<>(J6(intent, str, i10, i11));
    }

    public List<ResolveInfo> K6(Intent intent, String str, int i10, int i11) {
        U6();
        c6(i11);
        int iT6 = T6(i10);
        ComponentName component = intent.getComponent();
        if (component == null && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        Intent intent2 = intent;
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ServiceInfo serviceInfoD2 = d2(component, iT6, i11);
            if (serviceInfoD2 != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.serviceInfo = serviceInfoD2;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            String str2 = intent2.getPackage();
            if (str2 == null) {
                List<ResolveInfo> listN = this.f167567e0.N(intent2, str, iT6, i11);
                readLockA.unlock();
                return listN;
            }
            PackageG packageG = this.f167565c0.get(str2);
            if (packageG != null) {
                List<ResolveInfo> listO = this.f167567e0.O(intent2, str, iT6, packageG.f167501d, i11);
                readLockA.unlock();
                return listO;
            }
            List<ResolveInfo> list = Collections.EMPTY_LIST;
            readLockA.unlock();
            return list;
        } catch (Throwable th) {
            readLockA.unlock();
            throw th;
        }
    }

    @Override // com.prism.gaia.server.c0
    public String L1(String str, String str2) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = GaiaContext.j().T().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            return null;
        }
        String strA = android.support.v4.media.i.a("lib", str2, ".so");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(applicationInfo.nativeLibraryDir);
        String str3 = File.separator;
        String strA2 = android.support.v4.media.e.a(sb2, str3, strA);
        if (new GFile(strA2).canRead()) {
            return strA2;
        }
        String libraryCpuAbiDirPart = ApplicationInfoCompat2.Util.getLibraryCpuAbiDirPart(applicationInfo);
        StringBuilder sb3 = new StringBuilder();
        androidx.room.F.a(sb3, applicationInfo.sourceDir, "|", str3, libraryCpuAbiDirPart);
        return android.support.v4.media.e.a(sb3, str3, strA);
    }

    public void L6(PackageG packageG) {
        U6();
        ReentrantReadWriteLock.WriteLock writeLock = k6().writeLock();
        writeLock.lock();
        try {
            M6(packageG);
        } finally {
            writeLock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public List<GuestAppInfo> M() {
        U6();
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            LinkedList linkedList = new LinkedList();
            Iterator<PackageG> it = this.f167565c0.values().iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().l());
            }
            return linkedList;
        } finally {
            lock.unlock();
        }
    }

    public final void M6(PackageG packageG) {
        this.f167565c0.remove(packageG.f167512o);
        int size = packageG.f167498a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f167566d0.P(packageG.f167498a.get(i10), "activity");
        }
        int size2 = packageG.f167501d.size();
        for (int i11 = 0; i11 < size2; i11++) {
            this.f167567e0.P(packageG.f167501d.get(i11));
        }
        int size3 = packageG.f167499b.size();
        for (int i12 = 0; i12 < size3; i12++) {
            PackageParserG.a aVar = packageG.f167499b.get(i12);
            this.f167568f0.P(aVar, "receiver");
            this.f167570h0.remove(aVar);
        }
        int size4 = packageG.f167500c.size();
        for (int i13 = 0; i13 < size4; i13++) {
            PackageParserG.f fVar = packageG.f167500c.get(i13);
            this.f167569g0.O(fVar);
            for (String str : fVar.f167538f.authority.split(";")) {
                this.f167573k0.remove(str);
            }
            this.f167572j0.remove(fVar.b());
            this.f167571i0.remove(fVar);
        }
        int size5 = packageG.f167503f.size();
        for (int i14 = 0; i14 < size5; i14++) {
            this.f167574l0.remove(packageG.f167503f.get(i14).f167536f.name);
        }
        int size6 = packageG.f167504g.size();
        for (int i15 = 0; i15 < size6; i15++) {
            this.f167575m0.remove(packageG.f167504g.get(i15).f167537f.name);
        }
    }

    public final void N6(String str, String str2, Bundle bundle, int i10, String str3, IInterface iInterface, int[] iArr) {
        this.f167577o0.post(new a(iArr, str, str2, bundle, str3, i10));
    }

    @Override // com.prism.gaia.server.c0
    public List<PermissionGroup> O2(String str) throws RemoteException {
        U6();
        LinkedList linkedList = new LinkedList();
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG == null) {
                readLockA.unlock();
                return linkedList;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashSet hashSet = new HashSet(U6.c.G());
            LinkedList<PackageG> linkedList2 = new LinkedList();
            linkedList2.add(packageG);
            Iterator<String> it = PkgUtils.d(packageG).keySet().iterator();
            while (it.hasNext()) {
                PackageG packageG2 = this.f167565c0.get(it.next());
                if (packageG2 != null) {
                    linkedList2.add(packageG2);
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashMap.put("com.app.hider.master.promax", linkedHashSet);
            for (PackageG packageG3 : linkedList2) {
                ArrayList<String> arrayListP = packageG3.p();
                if (arrayListP != null) {
                    arrayListP.add(U6.b.f68570g);
                    Collection<String> collectionA = C3845i.a(arrayListP, hashSet);
                    String spacePkgName = packageG3.f167488A.getSpacePkgName();
                    boolean zEquals = "com.app.hider.master.promax".equals(spacePkgName);
                    LinkedHashSet linkedHashSet2 = (LinkedHashSet) linkedHashMap.get(spacePkgName);
                    if (linkedHashSet2 == null) {
                        linkedHashSet2 = new LinkedHashSet();
                        linkedHashMap.put(spacePkgName, linkedHashSet2);
                    }
                    for (String str2 : collectionA) {
                        if (!a7.f.a(str2) && !a7.f.f84780b.contains(str2) && !a7.f.f84782d.contains(str2)) {
                            if (U6.c.f68727x.contains(str2) && !zEquals) {
                                linkedHashSet.add(str2);
                            }
                            ApplicationInfo applicationInfo = packageG3.f167508k;
                            if (applicationInfo != null && applicationInfo.targetSdkVersion < 23) {
                                linkedHashSet2.add(str2);
                            }
                        }
                    }
                    if (linkedHashSet2.isEmpty()) {
                        linkedHashMap.remove(spacePkgName);
                    }
                }
            }
            if (linkedHashSet.isEmpty()) {
                linkedHashMap.remove("com.app.hider.master.promax");
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedList.add(new PermissionGroup((String) entry.getKey(), (String[]) ((LinkedHashSet) entry.getValue()).toArray(new String[0])));
            }
            readLockA.unlock();
            return linkedList;
        } catch (Throwable th) {
            readLockA.unlock();
            throw th;
        }
    }

    public final void O6(String str, boolean z10, ArrayList<String> arrayList, int i10) {
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        if (!z10) {
            Arrays.toString(strArr);
        }
        Arrays.toString(strArr);
        Bundle bundle = new Bundle(4);
        bundle.putString("android.intent.extra.changed_component_name", arrayList.get(0));
        bundle.putStringArray("android.intent.extra.changed_component_name_list", strArr);
        bundle.putBoolean("android.intent.extra.DONT_KILL_APP", z10);
        bundle.putInt("android.intent.extra.UID", i10);
        N6("android.intent.action.PACKAGE_CHANGED", str, bundle, 1073741824, null, null, new int[]{GaiaUserHandle.getVuserId(i10)});
    }

    @Override // com.prism.gaia.server.c0
    public String[] P0(int i10) {
        U6();
        int vuserId = GaiaUserHandle.getVuserId(i10);
        c6(vuserId);
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            ArrayList arrayList = new ArrayList(2);
            for (PackageG packageG : this.f167565c0.values()) {
                if (GaiaUserHandle.getVuid(vuserId, packageG.f167488A.appId) == i10) {
                    arrayList.add(packageG.f167512o);
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            readLockA.unlock();
            return strArr;
        } catch (Throwable th) {
            readLockA.unlock();
            throw th;
        }
    }

    public final void P6(ComponentEnabledSettingG componentEnabledSettingG, int i10) {
        int i11 = componentEnabledSettingG.state;
        int iT6 = T6(componentEnabledSettingG.flags);
        ComponentName componentName = componentEnabledSettingG.componentName;
        String packageName = componentName == null ? componentEnabledSettingG.packageName : componentName.getPackageName();
        ComponentName componentName2 = componentEnabledSettingG.componentName;
        String className = componentName2 == null ? null : componentName2.getClassName();
        ReentrantReadWriteLock.WriteLock writeLock = k6().writeLock();
        writeLock.lock();
        try {
            PackageG packageG = this.f167565c0.get(packageName);
            if (packageG != null && packageG.f167488A != null) {
                if (!packageG.u(className)) {
                    writeLock.unlock();
                    return;
                }
                PackageSettingG packageSettingG = packageG.f167488A;
                int vuid = GaiaUserHandle.getVuid(i10, packageSettingG.appId);
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            writeLock.unlock();
                            return;
                        } else {
                            if (!packageSettingG.disableComponentLPw(className, i10)) {
                                writeLock.unlock();
                                return;
                            }
                            u.n().S(packageSettingG);
                        }
                    } else {
                        if (!packageSettingG.enableComponentLPw(className, i10)) {
                            writeLock.unlock();
                            return;
                        }
                        u.n().S(packageSettingG);
                    }
                } else {
                    if (!packageSettingG.restoreComponentLPw(className, i10)) {
                        writeLock.unlock();
                        return;
                    }
                    u.n().S(packageSettingG);
                }
                writeLock.unlock();
                ArrayList<String> arrayListB = this.f167578p0.b(i10, packageName);
                boolean z10 = arrayListB == null;
                if (z10) {
                    arrayListB = new ArrayList<>();
                }
                if (!arrayListB.contains(className)) {
                    arrayListB.add(className);
                }
                int i12 = iT6 & 1;
                if (i12 == 0) {
                    this.f167578p0.g(i10, packageName);
                    O6(packageName, i12 != 0, arrayListB, vuid);
                    GProcessSupervisorProvider.B(packageName, i10);
                } else {
                    if (z10) {
                        this.f167578p0.e(i10, packageName, arrayListB);
                    }
                    if (this.f167577o0.hasMessages(1)) {
                        return;
                    }
                    this.f167577o0.sendEmptyMessageDelayed(1, 10000L);
                }
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public String Q2(String str) {
        ApplicationInfo applicationInfo;
        List<SharedLibraryInfo> list;
        try {
            applicationInfo = GaiaContext.j().T().getApplicationInfo(str, 1024);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String libraryCpuAbiDirPart = ApplicationInfoCompat2.Util.getLibraryCpuAbiDirPart(applicationInfo);
        String str2 = applicationInfo.nativeLibraryDir;
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (applicationInfo.sourceDir != null) {
            arrayList.add(applicationInfo.sourceDir + "!" + File.separator + libraryCpuAbiDirPart);
        }
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            for (String str3 : strArr) {
                StringBuilder sbA = android.support.v4.media.f.a(str3, "!");
                sbA.append(File.separator);
                sbA.append(libraryCpuAbiDirPart);
                arrayList.add(sbA.toString());
            }
        }
        HashSet hashSet = new HashSet();
        if (C3841e.w() && (list = ApplicationInfoCAG.Q29.sharedLibraryInfos().get(applicationInfo)) != null) {
            Iterator<SharedLibraryInfo> it = list.iterator();
            while (it.hasNext()) {
                b6(arrayList, hashSet, C4166a.a(it.next()), libraryCpuAbiDirPart);
            }
            return StringUtils.k(arrayList);
        }
        for (String str4 : applicationInfo.sharedLibraryFiles) {
            if (str4 != null && str4.endsWith(".apk") && !hashSet.contains(str4)) {
                StringBuilder sbA2 = android.support.v4.media.f.a(str4, "!");
                sbA2.append(File.separator);
                sbA2.append(libraryCpuAbiDirPart);
                arrayList.add(sbA2.toString());
                hashSet.add(str4);
            }
        }
        return StringUtils.k(arrayList);
    }

    @Override // com.prism.gaia.server.c0
    public void R(String str, int i10, int i11, int i12) {
        PackageSettingG packageSettingG;
        U6();
        c6(i12);
        int i13 = 4;
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Invalid new application state: ", i10));
        }
        ReentrantReadWriteLock.WriteLock writeLock = k6().writeLock();
        writeLock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG != null && (packageSettingG = packageG.f167488A) != null) {
                PackageUserStateG userState = packageSettingG.getUserState(i12);
                if (userState.getEnabled() == i10) {
                    return;
                }
                userState.getEnabled();
                userState.setEnabled(i10);
                u.n().S(packageSettingG);
                int vuid = GaiaUserHandle.getVuid(i12, packageSettingG.appId);
                writeLock.unlock();
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(str);
                int i14 = i11 & 1;
                O6(str, i14 != 0, arrayList, vuid);
                if (i14 == 0) {
                    GProcessSupervisorProvider.B(str, i12);
                }
                try {
                    GaiaAppManagerService gaiaAppManagerServiceP6 = GaiaAppManagerService.p6();
                    if (i10 != 2 && i10 != 3 && i10 != 4) {
                        i13 = 5;
                    }
                    gaiaAppManagerServiceP6.L6(str, i12, i13);
                } catch (Throwable unused) {
                }
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public String R2(String str) {
        String strGroup;
        ApplicationInfo applicationInfo;
        Matcher matcher = f167549D0.matcher(str);
        if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
            try {
                applicationInfo = GaiaContext.j().T().getApplicationInfo(strGroup, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                int iIndexOf = str.indexOf(".apk!");
                if (iIndexOf >= 0) {
                    String parent = new GFile(str.substring(0, iIndexOf)).getParent();
                    if (parent != null) {
                        String strSubstring = str.substring(parent.length() + 1);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(new GFile(applicationInfo.publicSourceDir).getParent());
                        return android.support.v4.media.e.a(sb2, File.separator, strSubstring);
                    }
                } else if (applicationInfo.nativeLibraryDir != null) {
                    return applicationInfo.nativeLibraryDir + File.separator + new GFile(str).getName();
                }
            }
        }
        return null;
    }

    public final void S6() {
        A6();
        B6();
        z6();
        HandlerThread handlerThread = new HandlerThread("gaia." + f167554q0, 10);
        this.f167576n0 = handlerThread;
        handlerThread.start();
        this.f167577o0 = new HandlerC0680f(this.f167576n0.getLooper());
        GaiaUserManagerService.f6().d();
    }

    @Override // com.prism.gaia.server.c0
    public ResolveInfo T0(Intent intent, String str, int i10, int i11) {
        U6();
        c6(i11);
        List<ResolveInfo> listJ6 = J6(intent, str, T6(i10), i11);
        if (listJ6 == null || listJ6.size() < 1) {
            return null;
        }
        return listJ6.get(0);
    }

    @Override // com.prism.gaia.server.c0
    public int T1(String str, int i10) {
        PackageSettingG packageSettingG;
        U6();
        c6(i10);
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG != null && (packageSettingG = packageG.f167488A) != null) {
                return packageSettingG.getUserState(i10).getEnabled();
            }
            throw new IllegalArgumentException("Unknown package: " + str);
        } finally {
            lock.unlock();
        }
    }

    public final int T6(int i10) {
        return (Build.VERSION.SDK_INT >= 24 && (i10 & 786432) == 0) ? i10 | 786432 : i10;
    }

    @Override // com.prism.gaia.server.c0
    public ActivityInfo U3(ComponentName componentName, int i10, int i11) {
        U6();
        c6(i11);
        int iT6 = T6(i10);
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            PackageParserG.a aVar = this.f167566d0.f167586j.get(componentName);
            if (aVar == null) {
                return null;
            }
            if (!aVar.f167530a.f167488A.isClonePresentLPr(iT6, i11)) {
                return null;
            }
            if (PackageSettingG.isEnabledLPr(aVar, iT6, i11)) {
                return PackageParserG.n(aVar, iT6, aVar.f167530a.f167488A.getUserState(i11), i11, true);
            }
            return null;
        } finally {
            readLockA.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public ProviderInfo V(ComponentName componentName, int i10, int i11) {
        U6();
        c6(i11);
        int iT6 = T6(i10);
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            PackageParserG.f fVar = this.f167572j0.get(componentName);
            if (fVar == null) {
                return null;
            }
            if (PackageSettingG.isEnabledLPr(fVar, iT6, i11)) {
                return PackageParserG.u(fVar, iT6, fVar.f167530a.f167488A.getUserState(i11), i11, true);
            }
            return null;
        } finally {
            readLockA.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public ParceledListSliceG<ResolveInfo> V1(Intent intent, String str, int i10, int i11) {
        return new ParceledListSliceG<>(H6(intent, str, i10, i11));
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.prism.gaia.server.c0
    public boolean V2(ComponentName componentName, Intent intent, String str) {
        U6();
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            PackageParserG.a aVar = this.f167566d0.f167586j.get(componentName);
            if (aVar == null) {
                lock.unlock();
                return false;
            }
            int i10 = 0;
            while (i10 < aVar.f167531b.size()) {
                String str2 = str;
                if (((PackageParserG.ActivityIntentInfo) aVar.f167531b.get(i10)).filter.match(intent.getAction(), str2, intent.getScheme(), intent.getData(), intent.getCategories(), f167554q0) >= 0) {
                    lock.unlock();
                    return true;
                }
                i10++;
                str = str2;
            }
            lock.unlock();
            return false;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.prism.gaia.server.c0
    public ParceledListSliceG<ProviderInfo> Y2(String str, int i10, int i11) throws RemoteException {
        U6();
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG == null) {
                return new ParceledListSliceG<>(new ArrayList(0));
            }
            int size = packageG.f167500c.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                PackageParserG.f fVar = packageG.f167500c.get(i12);
                if (PackageSettingG.isEnabledLPr(fVar, i10, i11)) {
                    arrayList.add(PackageParserG.u(fVar, i10, packageG.f167488A.getUserState(i11), i11, false));
                }
            }
            return new ParceledListSliceG<>(arrayList);
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public ActivityInfo Z(ComponentName componentName, int i10, int i11) {
        U6();
        c6(i11);
        int iT6 = T6(i10);
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            PackageParserG.a aVar = this.f167568f0.f167586j.get(componentName);
            if (aVar == null) {
                return null;
            }
            if (PackageSettingG.isEnabledLPr(aVar, iT6, i11)) {
                return PackageParserG.n(aVar, iT6, aVar.f167530a.f167488A.getUserState(i11), i11, true);
            }
            return null;
        } finally {
            readLockA.unlock();
        }
    }

    public void Z5(PackageG packageG) {
        U6();
        ReentrantReadWriteLock.WriteLock writeLock = k6().writeLock();
        writeLock.lock();
        try {
            a6(packageG);
        } finally {
            writeLock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public String a4(int i10) {
        U6();
        int vappId = GaiaUserHandle.getVappId(i10);
        c6(GaiaUserHandle.getVuserId(i10));
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            for (PackageG packageG : this.f167565c0.values()) {
                if (packageG.f167488A.appId == vappId) {
                    return packageG.f167512o;
                }
            }
            lock.unlock();
            return null;
        } finally {
            lock.unlock();
        }
    }

    public final void a6(PackageG packageG) {
        packageG.f167498a.size();
        packageG.f167501d.size();
        packageG.f167499b.size();
        packageG.f167500c.size();
        packageG.f167503f.size();
        packageG.f167504g.size();
        this.f167565c0.put(packageG.f167512o, packageG);
        int size = packageG.f167498a.size();
        for (int i10 = 0; i10 < size; i10++) {
            PackageParserG.a aVar = packageG.f167498a.get(i10);
            ActivityInfo activityInfo = aVar.f167529f;
            if (activityInfo.processName == null) {
                activityInfo.processName = activityInfo.packageName;
            }
            this.f167566d0.E(aVar, "activity");
        }
        int size2 = packageG.f167501d.size();
        for (int i11 = 0; i11 < size2; i11++) {
            PackageParserG.g gVar = packageG.f167501d.get(i11);
            ServiceInfo serviceInfo = gVar.f167539f;
            if (serviceInfo.processName == null) {
                serviceInfo.processName = serviceInfo.packageName;
            }
            this.f167567e0.E(gVar);
        }
        int size3 = packageG.f167499b.size();
        for (int i12 = 0; i12 < size3; i12++) {
            PackageParserG.a aVar2 = packageG.f167499b.get(i12);
            ActivityInfo activityInfo2 = aVar2.f167529f;
            if (activityInfo2.processName == null) {
                activityInfo2.processName = activityInfo2.packageName;
            }
            this.f167568f0.E(aVar2, "receiver");
            this.f167570h0.add(aVar2);
        }
        int size4 = packageG.f167500c.size();
        for (int i13 = 0; i13 < size4; i13++) {
            PackageParserG.f fVar = packageG.f167500c.get(i13);
            ProviderInfo providerInfo = fVar.f167538f;
            if (providerInfo.processName == null) {
                providerInfo.processName = providerInfo.packageName;
            }
            this.f167569g0.D(fVar);
            for (String str : fVar.f167538f.authority.split(";")) {
                if (!this.f167573k0.containsKey(str)) {
                    this.f167573k0.put(str, fVar);
                }
            }
            this.f167572j0.put(fVar.b(), fVar);
            this.f167571i0.add(fVar);
        }
        int size5 = packageG.f167503f.size();
        for (int i14 = 0; i14 < size5; i14++) {
            PackageParserG.d dVar = packageG.f167503f.get(i14);
            this.f167574l0.put(dVar.f167536f.name, dVar);
        }
        int size6 = packageG.f167504g.size();
        for (int i15 = 0; i15 < size6; i15++) {
            PackageParserG.e eVar = packageG.f167504g.get(i15);
            this.f167575m0.put(eVar.f167537f.name, eVar);
        }
    }

    @Override // com.prism.gaia.server.c0
    public ParcelFileDescriptor c2(String str, boolean z10) {
        File file = new File(str);
        if (!file.exists() || !file.canRead()) {
            file.toString();
            return null;
        }
        try {
            return ParcelFileDescriptor.open(file, !z10 ? DriveFile.MODE_READ_WRITE : 268435456);
        } catch (IOException e10) {
            e10.getMessage();
            return null;
        }
    }

    public final void c6(int i10) {
        GaiaUserManagerService gaiaUserManagerServiceE6 = GaiaUserManagerService.e6();
        if (!gaiaUserManagerServiceE6.L3(i10) && !gaiaUserManagerServiceE6.B6(i10)) {
            throw new SecurityException(android.support.v4.media.c.a("Invalid userId ", i10));
        }
    }

    @Override // com.prism.gaia.server.c0
    public ServiceInfo d2(ComponentName componentName, int i10, int i11) {
        U6();
        c6(i11);
        int iT6 = T6(i10);
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            PackageParserG.g gVar = this.f167567e0.f167596j.get(componentName);
            if (gVar == null) {
                return null;
            }
            if (PackageSettingG.isEnabledLPr(gVar, iT6, i11)) {
                return PackageParserG.w(gVar, iT6, gVar.f167530a.f167488A.getUserState(i11), i11, true);
            }
            return null;
        } finally {
            readLockA.unlock();
        }
    }

    public final ResolveInfo d6(Intent intent, String str, int i10, List<ResolveInfo> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (size == 1) {
            return list.get(0);
        }
        if (size <= 1) {
            return null;
        }
        ResolveInfo resolveInfo = list.get(0);
        ResolveInfo resolveInfo2 = list.get(1);
        return (resolveInfo.priority == resolveInfo2.priority && resolveInfo.preferredOrder == resolveInfo2.preferredOrder && resolveInfo.isDefault == resolveInfo2.isDefault) ? list.get(0) : list.get(0);
    }

    public final ResolveInfo f6(Intent intent, String str, int i10, List<ResolveInfo> list, int i11) {
        return null;
    }

    @Override // com.prism.gaia.server.c0
    public boolean g3(String str) {
        U6();
        ReentrantReadWriteLock.ReadLock lock = this.f167564b0.readLock();
        lock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG == null) {
                return false;
            }
            return packageG.f167488A.isLaunched(0);
        } finally {
            lock.unlock();
        }
    }

    public final PackageInfo g6(PackageG packageG, PackageSettingG packageSettingG, int i10, int i11, boolean z10) {
        PackageInfo packageInfoR = PackageParserG.r(packageG, i10, packageSettingG.firstInstallTime, packageSettingG.lastUpdateTime, packageSettingG.getUserState(i11), i11, z10);
        if (packageInfoR != null) {
            return packageInfoR;
        }
        String str = packageG.f167512o;
        return null;
    }

    @Override // com.prism.gaia.server.c0
    public String i0(String str) {
        U6();
        ReentrantReadWriteLock.ReadLock lock = this.f167564b0.readLock();
        lock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG != null) {
                return packageG.f167488A.installerSource;
            }
            lock.unlock();
            return null;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public ParceledListSliceG<ApplicationInfo> i1(int i10, int i11) {
        U6();
        c6(i11);
        int iT6 = T6(i10);
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            ArrayList arrayList = new ArrayList(this.f167565c0.size());
            for (PackageG packageG : this.f167565c0.values()) {
                if (D6(packageG, iT6, i11)) {
                    arrayList.add(PackageParserG.p(packageG, iT6, packageG.f167488A.getUserState(i11), i11));
                }
            }
            ParceledListSliceG<ApplicationInfo> parceledListSliceG = new ParceledListSliceG<>(arrayList);
            readLockA.unlock();
            return parceledListSliceG;
        } catch (Throwable th) {
            readLockA.unlock();
            throw th;
        }
    }

    @Override // com.prism.gaia.server.c0
    public ResolveInfo j0(Intent intent, String str, int i10, int i11) {
        U6();
        c6(i11);
        int iT6 = T6(i10);
        return d6(intent, str, iT6, H6(intent, str, iT6, i11));
    }

    @Override // com.prism.gaia.server.c0
    public int j3(String str, String str2, int i10) {
        U6();
        if (!a7.f.a(str)) {
            if (!a7.f.f84780b.contains(str)) {
                if (!a7.f.f84782d.contains(str)) {
                    ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
                    try {
                        PackageG packageG = this.f167565c0.get(str2);
                        if (packageG == null) {
                            return -1;
                        }
                        PackageParserG.d dVar = this.f167574l0.get(str);
                        if (dVar != null) {
                            return y6(packageG, dVar, str) ? 0 : -1;
                        }
                        return GaiaContext.j().T().checkPermission(str, packageG.q());
                    } finally {
                        readLockA.unlock();
                    }
                }
                if (U6.m.o(str2)) {
                }
            }
            return 0;
        }
        return -1;
    }

    @Override // com.prism.gaia.server.c0
    public boolean k2(String str) {
        return E6(str);
    }

    @Override // com.prism.gaia.server.c0
    public ApplicationInfo k4(String str, int i10, int i11) {
        U6();
        c6(i11);
        int iT6 = T6(i10);
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG == null) {
                return null;
            }
            PackageSettingG packageSettingG = packageG.f167488A;
            if (packageSettingG == null || packageSettingG.isAvailableLPr(iT6, i11)) {
                return PackageParserG.p(packageG, iT6, packageG.f167488A.getUserState(i11), i11);
            }
            return null;
        } finally {
            readLockA.unlock();
        }
    }

    public ReentrantReadWriteLock k6() {
        com.prism.gaia.helper.utils.o.a("GPMS.loadedLock");
        return this.f167564b0;
    }

    public PackageG l6(String str) {
        U6();
        ReentrantReadWriteLock.ReadLock lock = this.f167564b0.readLock();
        lock.lock();
        try {
            return this.f167565c0.get(str);
        } finally {
            lock.unlock();
        }
    }

    public List<PackageG> m6() {
        U6();
        LinkedList linkedList = new LinkedList();
        ReentrantReadWriteLock.ReadLock lock = this.f167564b0.readLock();
        lock.lock();
        try {
            linkedList.addAll(this.f167565c0.values());
            return linkedList;
        } finally {
            lock.unlock();
        }
    }

    public final PackageG n6(int i10) {
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            int vappId = GaiaUserHandle.getVappId(i10);
            PackageG packageG = null;
            for (PackageG packageG2 : this.f167565c0.values()) {
                if (packageG2.f167488A.appId == vappId) {
                    if (!C3841e.v()) {
                        return packageG2;
                    }
                    if (packageG2.f167510m != null) {
                        return packageG2;
                    }
                    packageG = packageG2;
                }
            }
            return packageG;
        } finally {
            readLockA.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public void o0(List<ComponentEnabledSettingG> list, int i10) {
        U6();
        c6(i10);
        Iterator<ComponentEnabledSettingG> it = list.iterator();
        while (it.hasNext()) {
            int i11 = it.next().state;
            if (i11 != 0 && i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
                throw new IllegalArgumentException(android.support.v4.media.c.a("Invalid new component state: ", i11));
            }
        }
        Iterator<ComponentEnabledSettingG> it2 = list.iterator();
        while (it2.hasNext()) {
            P6(it2.next(), i10);
        }
    }

    @Override // com.prism.gaia.server.c0
    public String[] o5(String str) {
        String[] list;
        LinkedList linkedList = new LinkedList();
        ApplicationInfo applicationInfoK4 = k4(str, 0, 0);
        if (applicationInfoK4.nativeLibraryDir != null && (list = new GFile(applicationInfoK4.nativeLibraryDir).list()) != null) {
            for (String str2 : list) {
                if (str2.endsWith(".dex.so")) {
                    linkedList.add(applicationInfoK4.nativeLibraryDir + File.separator + str2);
                }
            }
        }
        return (String[]) linkedList.toArray(new String[0]);
    }

    public int o6() {
        U6();
        ReentrantReadWriteLock.ReadLock lock = this.f167564b0.readLock();
        lock.lock();
        try {
            return this.f167565c0.size();
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public ResolveInfo p0(Intent intent, String str, int i10, int i11) {
        U6();
        c6(i11);
        List<ResolveInfo> listK6 = K6(intent, str, T6(i10), i11);
        if (listK6 == null || listK6.size() < 1) {
            return null;
        }
        return listK6.get(0);
    }

    public PackageSettingG p6(String str) {
        U6();
        ReentrantReadWriteLock.ReadLock lock = this.f167564b0.readLock();
        lock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG != null) {
                return packageG.f167488A;
            }
            lock.unlock();
            return null;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public boolean q4(String str, int i10) {
        PackageSettingG packageSettingG;
        U6();
        c6(i10);
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG != null && (packageSettingG = packageG.f167488A) != null) {
                return packageSettingG.getUserState(i10).isHidden();
            }
            lock.unlock();
            return false;
        } finally {
            lock.unlock();
        }
    }

    public List<PackageSettingG> q6() {
        U6();
        LinkedList linkedList = new LinkedList();
        ReentrantReadWriteLock.ReadLock lock = this.f167564b0.readLock();
        lock.lock();
        try {
            Iterator<PackageG> it = this.f167565c0.values().iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().f167488A);
            }
            return linkedList;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public List<String> r(String str, String str2, int i10) {
        U6();
        c6(i10);
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG != null && packageG.f167488A != null) {
                return new ArrayList(packageG.f167488A.getUserState(i10).getMimeGroup(str2));
            }
            return new ArrayList();
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public ParceledListSliceG<ResolveInfo> r5(Intent intent, String str, int i10, int i11) {
        return new ParceledListSliceG<>(K6(intent, str, i10, i11));
    }

    public PackageInfo r6(String str, int i10, int i11) {
        return D5(str, i10, i11, true);
    }

    public ProviderInfo s6(String str, int i10, int i11) {
        U6();
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            PackageParserG.f fVar = this.f167573k0.get(str);
            if (fVar == null) {
                return null;
            }
            if (PackageSettingG.isEnabledLPr(fVar, i10, i11)) {
                return PackageParserG.u(fVar, i10, fVar.f167530a.f167488A.getUserState(i11), i11, true);
            }
            return null;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public ParceledListSliceG<ActivityInfo> t(String str, int i10, int i11) throws RemoteException {
        U6();
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG == null) {
                return new ParceledListSliceG<>(new ArrayList(0));
            }
            int size = packageG.f167499b.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                PackageParserG.a aVar = packageG.f167499b.get(i12);
                if (PackageSettingG.isEnabledLPr(aVar, i10, i11)) {
                    arrayList.add(PackageParserG.n(aVar, i10, packageG.f167488A.getUserState(i11), i11, false));
                }
            }
            return new ParceledListSliceG<>(arrayList);
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public ApplicationInfo t5(String str) {
        try {
            return GaiaContext.j().T().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // com.prism.gaia.server.c0
    public PropertyG u0(String str, String str2, String str3, int i10) {
        U6();
        c6(i10);
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            z zVarF6 = F6(this.f167565c0.get(str2));
            PropertyG propertyG = null;
            if (zVarF6 == null) {
                return null;
            }
            D dE = zVarF6.e(str3, str);
            if (dE != null) {
                return new PropertyG(str, str2, str3, dE);
            }
            D d10 = zVarF6.d(str);
            if (d10 != null) {
                propertyG = new PropertyG(str, str2, null, d10);
            }
            return propertyG;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public int u2(String str, int i10) {
        PackageG next;
        U6();
        if (a7.f.a(str)) {
            return -1;
        }
        if (a7.f.f84780b.contains(str)) {
            return 0;
        }
        int vappId = GaiaUserHandle.getVappId(i10);
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            Iterator<PackageG> it = this.f167565c0.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f167488A.appId == vappId) {
                    break;
                }
            }
            if (next == null) {
                return -1;
            }
            if (a7.f.f84782d.contains(str)) {
                return U6.m.o(next.f167512o) ? 0 : -1;
            }
            PackageParserG.d dVar = this.f167574l0.get(str);
            if (dVar != null) {
                return y6(next, dVar, str) ? 0 : -1;
            }
            return GaiaContext.j().T().checkPermission(str, next.q());
        } finally {
            readLockA.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public ParcelFileDescriptor[] v0(String str) {
        Integer numI6;
        File file = new File(str);
        if (!file.exists() || !file.canRead()) {
            file.toString();
            return new ParcelFileDescriptor[0];
        }
        final ArrayList arrayList = new ArrayList();
        try {
            final ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (!zipEntryNextElement.isDirectory() && (numI6 = i6(zipEntryNextElement.getName())) != null && numI6.intValue() >= 0) {
                    arrayList.add(new e(zipEntryNextElement, numI6.intValue()));
                }
            }
            Collections.sort(arrayList, new C4168c());
            ParcelFileDescriptor[] parcelFileDescriptorArr = new ParcelFileDescriptor[arrayList.size()];
            final ParcelFileDescriptor[] parcelFileDescriptorArr2 = new ParcelFileDescriptor[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                parcelFileDescriptorArr[i10] = parcelFileDescriptorArrCreatePipe[0];
                parcelFileDescriptorArr2[i10] = parcelFileDescriptorArrCreatePipe[1];
            }
            C4455a.b().a().execute(new Runnable() { // from class: com.prism.gaia.server.pm.d
                @Override // java.lang.Runnable
                public final void run() {
                    BinderC4171f.T5(arrayList, zipFile, parcelFileDescriptorArr2);
                }
            });
            return parcelFileDescriptorArr;
        } catch (IOException e10) {
            e10.getMessage();
            return new ParcelFileDescriptor[0];
        }
    }

    @Override // com.prism.gaia.server.c0
    public ParceledListSliceG<ServiceInfo> w2(String str, int i10, int i11) throws RemoteException {
        U6();
        ReentrantReadWriteLock.ReadLock lock = k6().readLock();
        lock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG == null) {
                return new ParceledListSliceG<>(new ArrayList(0));
            }
            int size = packageG.f167501d.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                PackageParserG.g gVar = packageG.f167501d.get(i12);
                if (PackageSettingG.isEnabledLPr(gVar, i10, i11)) {
                    arrayList.add(PackageParserG.w(gVar, i10, packageG.f167488A.getUserState(i11), i11, false));
                }
            }
            return new ParceledListSliceG<>(arrayList);
        } finally {
            lock.unlock();
        }
    }

    public boolean x6(int i10, int i11, int i12) {
        U6();
        if (i10 == i11) {
            return true;
        }
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            PackageG packageGN6 = n6(i10);
            PackageG packageGN62 = n6(i11);
            if (packageGN6 != null && packageGN62 != null) {
                return packageGN6.y(packageGN62, i12);
            }
            readLockA.unlock();
            return false;
        } finally {
            readLockA.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public void y1(String str, String str2, List<String> list, int i10) {
        PackageSettingG packageSettingG;
        U6();
        c6(i10);
        ReentrantReadWriteLock.WriteLock writeLock = k6().writeLock();
        writeLock.lock();
        try {
            PackageG packageG = this.f167565c0.get(str);
            if (packageG != null && (packageSettingG = packageG.f167488A) != null) {
                HashSet hashSet = list == null ? new HashSet() : new HashSet(list);
                if (!packageSettingG.getUserState(i10).setMimeGroup(str2, hashSet)) {
                    writeLock.unlock();
                    return;
                }
                hashSet.size();
                u.n().S(packageSettingG);
                writeLock.unlock();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // com.prism.gaia.server.c0
    public ParceledListSliceG<ResolveInfo> y2(Intent intent, String str, int i10, int i11) {
        return new ParceledListSliceG<>(I6(intent, str, i10, i11));
    }

    @Override // com.prism.gaia.server.c0
    public ParceledListSliceG<PackageInfo> y4(int i10, int i11) {
        U6();
        c6(i11);
        int iT6 = T6(i10);
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            ArrayList arrayList = new ArrayList(this.f167565c0.size());
            for (PackageG packageG : this.f167565c0.values()) {
                if (D6(packageG, iT6, i11)) {
                    int i12 = i11;
                    PackageInfo packageInfoG6 = g6(packageG, packageG.f167488A, iT6, i12, true);
                    if (packageInfoG6 != null) {
                        arrayList.add(packageInfoG6);
                    }
                    i11 = i12;
                }
            }
            arrayList.size();
            ParceledListSliceG<PackageInfo> parceledListSliceG = new ParceledListSliceG<>(arrayList);
            readLockA.unlock();
            return parceledListSliceG;
        } catch (Throwable th) {
            readLockA.unlock();
            throw th;
        }
    }

    public final boolean y6(PackageG packageG, PackageParserG.d dVar, String str) {
        PackageG packageG2;
        PermissionInfo permissionInfo;
        int i10 = 0;
        if (packageG == null || !packageG.x(str)) {
            return false;
        }
        if (dVar != null && (permissionInfo = dVar.f167536f) != null) {
            i10 = permissionInfo.protectionLevel & 15;
        }
        if (i10 != 2 && i10 != 3) {
            return true;
        }
        boolean zQ6 = Q6(packageG, dVar.f167530a);
        if (!zQ6 && (packageG2 = dVar.f167530a) != null) {
            String str2 = packageG2.f167512o;
        }
        return zQ6;
    }

    @Override // com.prism.gaia.server.c0
    public ProviderInfo z(String str, int i10, int i11) {
        U6();
        c6(i11);
        return s6(str, T6(i10), i11);
    }

    @Override // com.prism.gaia.server.c0
    public List<PropertyG> z3(String str, int i10, int i11) {
        z zVarF6;
        U6();
        c6(i11);
        ArrayList arrayList = new ArrayList();
        ReentrantReadWriteLock.ReadLock readLockA = C4172g.a(this);
        try {
            for (PackageG packageG : this.f167565c0.values()) {
                if (D6(packageG, 0, i11) && (zVarF6 = F6(packageG)) != null) {
                    String str2 = packageG.f167488A.packageName;
                    if (i10 == 5) {
                        D d10 = zVarF6.d(str);
                        if (d10 != null) {
                            arrayList.add(new PropertyG(str, str2, null, d10));
                        }
                    } else {
                        for (Map.Entry entry : ((HashMap) zVarF6.f(str)).entrySet()) {
                            if (e6(packageG, (String) entry.getKey()) == i10) {
                                arrayList.add(new PropertyG(str, str2, (String) entry.getKey(), (D) entry.getValue()));
                            }
                        }
                    }
                }
            }
            readLockA.unlock();
            return arrayList;
        } catch (Throwable th) {
            readLockA.unlock();
            throw th;
        }
    }
}
