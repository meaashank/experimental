package com.inmobi.media;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.media.C3535f1;
import com.squareup.picasso.Callback;
import com.squareup.picasso.RequestCreator;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3535f1 implements InterfaceC3759v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3535f1 f152892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f152893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static AdConfig.AssetCacheConfig f152894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static AdConfig.VastVideoConfig f152895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ExecutorService f152896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadPoolExecutor f152897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static HandlerC3479b1 f152898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static HandlerThread f152899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f152900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicBoolean f152901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ConcurrentHashMap f152902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ArrayList f152903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicBoolean f152904m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C3507d1 f152905n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3521e1 f152906o;

    static {
        C3535f1 c3535f1 = new C3535f1();
        f152892a = c3535f1;
        f152893b = new Object();
        f152900i = new AtomicBoolean(false);
        f152901j = new AtomicBoolean(false);
        f152903l = new ArrayList();
        f152904m = new AtomicBoolean(true);
        f152905n = C3507d1.f152805a;
        LinkedHashMap linkedHashMap = C3773w2.f153489a;
        Config configA = C3745u2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C3657nb.b(), c3535f1);
        kotlin.jvm.internal.G.n(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
        AdConfig adConfig = (AdConfig) configA;
        f152894c = adConfig.getAssetCacheConfig();
        f152895d = adConfig.getVastVideo();
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new V4("f1".concat("-AP")));
        kotlin.jvm.internal.G.o(executorServiceNewCachedThreadPool, "newCachedThreadPool(...)");
        f152896e = executorServiceNewCachedThreadPool;
        int i10 = T3.f152448a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new V4("f1".concat("-AD")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f152897f = threadPoolExecutor;
        HandlerThread handlerThread = new HandlerThread("assetFetcher");
        f152899h = handlerThread;
        W3.a(handlerThread, "assetFetcher");
        HandlerThread handlerThread2 = f152899h;
        kotlin.jvm.internal.G.m(handlerThread2);
        Looper looper = handlerThread2.getLooper();
        kotlin.jvm.internal.G.o(looper, "getLooper(...)");
        f152898g = new HandlerC3479b1(looper, c3535f1);
        f152902k = new ConcurrentHashMap(2, 0.9f, 2);
        f152906o = new C3521e1();
    }

    @Override // com.inmobi.media.InterfaceC3759v2
    public final void a(Config config) {
        kotlin.jvm.internal.G.p(config, "config");
        if (!(config instanceof AdConfig)) {
            f152894c = null;
            f152895d = null;
        } else {
            AdConfig adConfig = (AdConfig) config;
            f152894c = adConfig.getAssetCacheConfig();
            f152895d = adConfig.getVastVideo();
        }
    }

    public final void b(C3589j c3589j) {
        String str = c3589j.f153017c;
        AdConfig.AssetCacheConfig assetCacheConfig = f152894c;
        if (str == null || str.length() == 0 || assetCacheConfig == null) {
            return;
        }
        File file = new File(str);
        long jMin = Math.min((c3589j.f153021g - c3589j.f153019e) + System.currentTimeMillis(), (assetCacheConfig.getTimeToLive() * ((long) 1000)) + System.currentTimeMillis());
        int iNextInt = new Random().nextInt() & Integer.MAX_VALUE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        String url = c3589j.f153016b;
        int maxRetries = assetCacheConfig.getMaxRetries();
        long j10 = c3589j.f153022h;
        kotlin.jvm.internal.G.p(url, "url");
        C3589j c3589j2 = new C3589j(iNextInt, url, str, maxRetries, jCurrentTimeMillis, jCurrentTimeMillis2, jMin, j10);
        c3589j2.f153019e = System.currentTimeMillis();
        AbstractC3531eb.a().a(c3589j2);
        long j11 = c3589j.f153019e;
        c3589j2.f153024j = AbstractC3617l.a(c3589j, file, j11, j11);
        c3589j2.f153023i = true;
        a(c3589j2, (byte) -1);
    }

    public final synchronized void c(String str) {
        int size = f152903l.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3603k c3603k = (C3603k) f152903l.get(i10);
            Iterator it = c3603k.f153068h.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.G.g(((C3488ba) it.next()).f152730b, str)) {
                        c3603k.f153062b++;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public final synchronized void d(String str) {
        int size = f152903l.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3603k c3603k = (C3603k) f152903l.get(i10);
            Set set = c3603k.f153068h;
            HashSet hashSet = c3603k.f153065e;
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.G.g(((C3488ba) it.next()).f152730b, str)) {
                    if (!hashSet.contains(str)) {
                        c3603k.f153065e.add(str);
                        c3603k.f153061a++;
                    }
                }
            }
        }
    }

    public final synchronized void e() {
        try {
            ArrayList arrayList = new ArrayList();
            int size = f152903l.size();
            for (int i10 = 0; i10 < size; i10++) {
                C3603k c3603k = (C3603k) f152903l.get(i10);
                if (c3603k.f153061a == c3603k.f153068h.size()) {
                    try {
                        InterfaceC3549g1 interfaceC3549g1 = (InterfaceC3549g1) c3603k.f153064d.get();
                        if (interfaceC3549g1 != null) {
                            interfaceC3549g1.a(c3603k);
                        }
                        arrayList.add(c3603k);
                    } catch (Exception e10) {
                        C3511d5 c3511d5 = C3511d5.f152815a;
                        C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
                    }
                }
            }
            b(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(C3589j c3589j) {
        int size = f152903l.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3603k c3603k = (C3603k) f152903l.get(i10);
            Iterator it = c3603k.f153068h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (kotlin.jvm.internal.G.g(((C3488ba) it.next()).f152730b, c3589j.f153016b)) {
                    if (!c3603k.f153067g.contains(c3589j)) {
                        c3603k.f153067g.add(c3589j);
                    }
                }
            }
        }
    }

    public final void c() {
        if (f152904m.get()) {
            f152901j.set(false);
            boolean z10 = C3473a9.f152704a;
            if (C3473a9.a(false) != null) {
                Q6 q6F = C3657nb.f();
                C3507d1 c3507d1 = f152905n;
                q6F.a(c3507d1);
                C3657nb.f().a(new int[]{10, 2, 1}, c3507d1);
                return;
            }
            synchronized (f152893b) {
                try {
                    if (f152900i.compareAndSet(false, true)) {
                        if (f152899h == null) {
                            HandlerThread handlerThread = new HandlerThread("assetFetcher");
                            f152899h = handlerThread;
                            W3.a(handlerThread, "assetFetcher");
                        }
                        if (f152898g == null) {
                            HandlerThread handlerThread2 = f152899h;
                            kotlin.jvm.internal.G.m(handlerThread2);
                            Looper looper = handlerThread2.getLooper();
                            kotlin.jvm.internal.G.o(looper, "getLooper(...)");
                            f152898g = new HandlerC3479b1(looper, this);
                        }
                        if (AbstractC3531eb.a().b().isEmpty()) {
                            d();
                        } else {
                            Q6 q6F2 = C3657nb.f();
                            C3507d1 c3507d12 = f152905n;
                            q6F2.a(c3507d12);
                            C3657nb.f().a(new int[]{10, 2, 1}, c3507d12);
                            HandlerC3479b1 handlerC3479b1 = f152898g;
                            kotlin.jvm.internal.G.m(handlerC3479b1);
                            handlerC3479b1.sendEmptyMessage(1);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void d() {
        if (f152904m.get()) {
            synchronized (f152893b) {
                f152900i.set(false);
                f152902k.clear();
                HandlerThread handlerThread = f152899h;
                if (handlerThread != null) {
                    handlerThread.getLooper().quit();
                    handlerThread.interrupt();
                    f152899h = null;
                    f152898g = null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0120, code lost:
    
        r20.f153026l = 4;
        r20.f153018d = 0;
        com.inmobi.media.C3631m.a(r1, r12, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012a, code lost:
    
        r19.f153120a.a(r20);
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5 A[Catch: all -> 0x009c, Exception -> 0x00a1, IOException -> 0x00a4, ProtocolException -> 0x00a7, MalformedURLException -> 0x00aa, FileNotFoundException -> 0x00ad, SocketTimeoutException -> 0x00b0, TryCatch #8 {FileNotFoundException -> 0x00ad, MalformedURLException -> 0x00aa, ProtocolException -> 0x00a7, SocketTimeoutException -> 0x00b0, IOException -> 0x00a4, Exception -> 0x00a1, all -> 0x009c, blocks: (B:15:0x0056, B:17:0x0082, B:19:0x008f, B:21:0x0093, B:23:0x0099, B:32:0x00b3, B:33:0x00b6, B:35:0x00ba, B:36:0x00c5, B:40:0x00d5, B:42:0x00e2, B:44:0x00f3, B:45:0x00f6), top: B:128:0x0056 }] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r6v13, types: [com.inmobi.media.m] */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.inmobi.media.m] */
    /* JADX WARN: Type inference failed for: r6v15, types: [com.inmobi.media.m] */
    /* JADX WARN: Type inference failed for: r6v16, types: [com.inmobi.media.m] */
    /* JADX WARN: Type inference failed for: r6v17, types: [com.inmobi.media.m] */
    /* JADX WARN: Type inference failed for: r6v18, types: [com.inmobi.media.m] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v39, types: [int] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(com.inmobi.media.C3589j r20, com.inmobi.media.Z0 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3535f1.a(com.inmobi.media.j, com.inmobi.media.Z0):boolean");
    }

    public final synchronized void b(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f152903l.remove(arrayList.get(i10));
        }
    }

    public static void b() {
        ArrayList arrayListA = AbstractC3531eb.a().a();
        long length = 0;
        if (!arrayListA.isEmpty()) {
            int size = arrayListA.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayListA.get(i10);
                i10++;
                String str = ((C3589j) obj).f153017c;
                if (str != null) {
                    length += new File(str).length();
                }
            }
        }
        AdConfig.AssetCacheConfig assetCacheConfig = f152894c;
        if (assetCacheConfig != null) {
            assetCacheConfig.getMaxCacheSize();
            if (length > assetCacheConfig.getMaxCacheSize()) {
                Y0 y0A = AbstractC3531eb.a();
                y0A.getClass();
                ArrayList arrayListA2 = F1.a(y0A, null, null, null, null, "ts ASC ", 1, 15);
                C3589j c3589j = arrayListA2.isEmpty() ? null : (C3589j) arrayListA2.get(0);
                if (c3589j != null) {
                    if (f152904m.get()) {
                        Y0 y0A2 = AbstractC3531eb.a();
                        y0A2.getClass();
                        y0A2.a("id = ?", new String[]{String.valueOf(c3589j.f153015a)});
                        String str2 = c3589j.f153017c;
                        if (str2 != null) {
                            File file = new File(str2);
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                    }
                    b();
                }
            }
        }
    }

    public static final void b(C3603k assetBatch) {
        kotlin.jvm.internal.G.p(assetBatch, "$assetBatch");
        synchronized (f152892a) {
            ArrayList arrayList = f152903l;
            if (!arrayList.contains(assetBatch)) {
                arrayList.add(assetBatch);
            }
        }
        assetBatch.f153068h.size();
        Iterator it = assetBatch.f153068h.iterator();
        while (it.hasNext()) {
            String str = ((C3488ba) it.next()).f152730b;
            C3535f1 c3535f1 = f152892a;
            C3589j c3589jA = AbstractC3531eb.a().a(str);
            if (c3589jA != null && c3589jA.a()) {
                c3535f1.b(c3589jA);
            } else {
                a(str);
            }
        }
    }

    public static final void b(C3603k assetBatch, String adType) {
        int i10;
        String str;
        long jElapsedRealtime;
        Context contextD;
        kotlin.jvm.internal.G.p(assetBatch, "$assetBatch");
        kotlin.jvm.internal.G.p(adType, "$adType");
        synchronized (f152892a) {
            ArrayList arrayList = f152903l;
            if (!arrayList.contains(assetBatch)) {
                arrayList.add(assetBatch);
            }
        }
        assetBatch.f153068h.size();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = assetBatch.f153068h.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            C3488ba c3488ba = (C3488ba) it.next();
            String str2 = c3488ba.f152730b;
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= length) {
                boolean z11 = kotlin.jvm.internal.G.t(str2.charAt(!z10 ? i11 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            if (str2.subSequence(i11, length + 1).toString().length() > 0 && c3488ba.f152729a == 2) {
                arrayList2.add(c3488ba.f152730b);
            } else {
                arrayList3.add(c3488ba.f152730b);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(arrayList2.size());
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            String str3 = (String) obj;
            try {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                contextD = C3657nb.d();
            } catch (Exception unused) {
                str = adType;
            }
            if (contextD != null) {
                B9 b92 = B9.f151790a;
                RequestCreator requestCreatorLoad = b92.a(contextD).load(str3);
                str = adType;
                try {
                    Object objA = b92.a(new C3493c1(countDownLatch, str3, jElapsedRealtime, str));
                    requestCreatorLoad.fetch(objA instanceof Callback ? (Callback) objA : null);
                } catch (Exception unused2) {
                    countDownLatch.countDown();
                }
                adType = str;
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused3) {
        }
        C3535f1 c3535f1 = f152892a;
        c3535f1.e();
        c3535f1.a((byte) 0);
        int size2 = arrayList3.size();
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            String str4 = (String) obj2;
            C3535f1 c3535f12 = f152892a;
            C3589j c3589jA = AbstractC3531eb.a().a(str4);
            if (c3589jA != null && c3589jA.a()) {
                c3535f12.b(c3589jA);
            } else {
                a(str4);
            }
        }
    }

    public final synchronized void a(C3589j c3589j, byte b10) {
        a(c3589j);
        f152902k.remove(c3589j.f153016b);
        if (b10 == -1) {
            d(c3589j.f153016b);
            e();
        } else {
            c(c3589j.f153016b);
            a(b10);
        }
    }

    public static final void b(String remoteUrl) throws Throwable {
        kotlin.jvm.internal.G.p(remoteUrl, "$remoteUrl");
        C3589j c3589jA = AbstractC3531eb.a().a(remoteUrl);
        if (c3589jA != null) {
            if (c3589jA.a()) {
                f152892a.b(c3589jA);
            } else {
                a(c3589jA, f152906o);
            }
        }
    }

    public final synchronized void a(byte b10) {
        try {
            ArrayList arrayList = new ArrayList();
            int size = f152903l.size();
            for (int i10 = 0; i10 < size; i10++) {
                C3603k c3603k = (C3603k) f152903l.get(i10);
                if (c3603k.f153062b > 0) {
                    try {
                        InterfaceC3549g1 interfaceC3549g1 = (InterfaceC3549g1) c3603k.f153064d.get();
                        if (interfaceC3549g1 != null) {
                            interfaceC3549g1.a(c3603k, b10);
                        }
                        arrayList.add(c3603k);
                    } catch (Exception e10) {
                        C3511d5 c3511d5 = C3511d5.f152815a;
                        C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
                    }
                }
            }
            b(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void a() {
        if (f152904m.get()) {
            synchronized (f152893b) {
                try {
                    ArrayList arrayListA = AbstractC3531eb.a().a();
                    if (arrayListA.isEmpty()) {
                        return;
                    }
                    int size = arrayListA.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayListA.get(i10);
                        i10++;
                        C3589j c3589j = (C3589j) obj;
                        c3589j.getClass();
                        if (System.currentTimeMillis() > c3589j.f153021g && f152904m.get()) {
                            Y0 y0A = AbstractC3531eb.a();
                            y0A.getClass();
                            y0A.a("id = ?", new String[]{String.valueOf(c3589j.f153015a)});
                            String str = c3589j.f153017c;
                            if (str != null) {
                                File file = new File(str);
                                if (file.exists()) {
                                    file.delete();
                                }
                            }
                        }
                    }
                    b();
                    a(arrayListA);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void a(ArrayList arrayList) {
        File[] fileArrListFiles;
        File fileB = C3657nb.f153207a.b(C3657nb.d());
        if (!fileB.exists() || (fileArrListFiles = fileB.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (kotlin.jvm.internal.G.g(file.getAbsolutePath(), ((C3589j) obj).f153017c)) {
                        break;
                    }
                } else {
                    file.getAbsolutePath();
                    file.delete();
                    break;
                }
            }
        }
    }

    public static void a(final C3603k assetBatch) {
        kotlin.jvm.internal.G.p(assetBatch, "assetBatch");
        if (f152904m.get()) {
            f152896e.execute(new Runnable() { // from class: F5.h1
                @Override // java.lang.Runnable
                public final void run() {
                    C3535f1.b(assetBatch);
                }
            });
        }
    }

    public static void a(final C3603k assetBatch, final String adType) {
        kotlin.jvm.internal.G.p(assetBatch, "assetBatch");
        kotlin.jvm.internal.G.p(adType, "adType");
        if (f152904m.get()) {
            f152896e.execute(new Runnable() { // from class: F5.f1
                @Override // java.lang.Runnable
                public final void run() {
                    C3535f1.b(assetBatch, adType);
                }
            });
        }
    }

    public static void a(final String url) {
        C3589j c3589j;
        AdConfig.AssetCacheConfig assetCacheConfig = f152894c;
        if (assetCacheConfig != null) {
            int iNextInt = new Random().nextInt() & Integer.MAX_VALUE;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            int maxRetries = assetCacheConfig.getMaxRetries();
            long timeToLive = assetCacheConfig.getTimeToLive();
            kotlin.jvm.internal.G.p(url, "url");
            c3589j = new C3589j(iNextInt, url, null, maxRetries, jCurrentTimeMillis, jCurrentTimeMillis2, timeToLive + System.currentTimeMillis(), 0L);
        } else {
            c3589j = null;
        }
        if (AbstractC3531eb.a().a(url) == null && c3589j != null) {
            Y0 y0A = AbstractC3531eb.a();
            synchronized (y0A) {
                y0A.a(c3589j, "url = ?", new String[]{c3589j.f153016b});
            }
        }
        f152897f.execute(new Runnable() { // from class: F5.g1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C3535f1.b(url);
            }
        });
    }
}
