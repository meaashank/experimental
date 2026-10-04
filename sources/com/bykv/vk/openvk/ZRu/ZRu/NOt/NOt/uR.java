package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.Vor;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    private static volatile uR TFq;
    private volatile com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.NOt FA;
    private volatile com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ Ht;
    private volatile com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ Mm;
    private final SparseArray<Map<String, com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt>> NOt;
    private final HashSet<ZRu> Vor;
    private volatile mZ ZH;
    private volatile int ZRu = 163840;
    private final NOt.InterfaceC0372NOt aT;
    private volatile boolean edo;
    private volatile mZ lp;
    private final NOt<Runnable> mZ;
    private volatile String sAl;
    private final ExecutorService uR;

    public static final class NOt<T> extends LinkedBlockingDeque<T> {
        private ThreadPoolExecutor ZRu;

        private NOt() {
        }

        public void ZRu(ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                try {
                    if (this.ZRu != null) {
                        throw new IllegalStateException("You can only call setExecutor() once!");
                    }
                    if (threadPoolExecutor == null) {
                        throw new NullPointerException("executor argument can't be null!");
                    }
                    this.ZRu = threadPoolExecutor;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        public boolean offer(T t10) {
            synchronized (this) {
                try {
                    int poolSize = this.ZRu.getPoolSize();
                    int activeCount = this.ZRu.getActiveCount();
                    int maximumPoolSize = this.ZRu.getMaximumPoolSize();
                    if (activeCount < poolSize || poolSize >= maximumPoolSize) {
                        return offerFirst(t10);
                    }
                    if (TFq.mZ) {
                        Log.i("TAG_PROXY_TT", "create new preloader thread");
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class ZRu {
        final String[] Ht;
        final boolean NOt;
        final Map<String, String> TFq;
        final boolean ZRu;
        final int mZ;
        final String uR;

        public ZRu(boolean z10, boolean z11, int i10, String str, Map<String, String> map, String[] strArr) {
            this.ZRu = z10;
            this.NOt = z11;
            this.mZ = i10;
            this.uR = str;
            this.TFq = map;
            this.Ht = strArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ZRu.class != obj.getClass()) {
                return false;
            }
            ZRu zRu = (ZRu) obj;
            if (this.ZRu == zRu.ZRu && this.NOt == zRu.NOt && this.mZ == zRu.mZ) {
                return this.uR.equals(zRu.uR);
            }
            return false;
        }

        public int hashCode() {
            return this.uR.hashCode() + ((((((this.ZRu ? 1 : 0) * 31) + (this.NOt ? 1 : 0)) * 31) + this.mZ) * 31);
        }
    }

    private uR() {
        SparseArray<Map<String, com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt>> sparseArray = new SparseArray<>(2);
        this.NOt = sparseArray;
        this.Vor = new HashSet<>();
        this.aT = new NOt.InterfaceC0372NOt() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.uR.1
            @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.InterfaceC0372NOt
            public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt nOt) {
                int iHt = nOt.Ht();
                synchronized (uR.this.NOt) {
                    try {
                        Map map = (Map) uR.this.NOt.get(iHt);
                        if (map != null) {
                            map.remove(nOt.FA);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (TFq.mZ) {
                    Log.d("TAG_PROXY_Preloader", "afterExecute, key: " + nOt.FA);
                }
            }
        };
        NOt<Runnable> nOt = new NOt<>();
        this.mZ = nOt;
        ExecutorService executorServiceZRu = ZRu(nOt);
        this.uR = executorServiceZRu;
        nOt.ZRu((ThreadPoolExecutor) executorServiceZRu);
        sparseArray.put(0, new HashMap());
        sparseArray.put(1, new HashMap());
    }

    public static uR mZ() {
        if (TFq == null) {
            synchronized (uR.class) {
                try {
                    if (TFq == null) {
                        TFq = new uR();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return TFq;
    }

    public void uR() {
        com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(new com.bytedance.sdk.component.FA.FA("cancelAll") { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.uR.3
            @Override // java.lang.Runnable
            public void run() {
                int i10;
                ArrayList arrayList = new ArrayList();
                synchronized (uR.this.NOt) {
                    try {
                        int size = uR.this.NOt.size();
                        i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            Map map = (Map) uR.this.NOt.get(uR.this.NOt.keyAt(i11));
                            if (map != null) {
                                arrayList.addAll(map.values());
                                map.clear();
                            }
                        }
                        uR.this.mZ.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt nOt = (com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt) obj;
                    nOt.ZRu();
                    if (TFq.mZ) {
                        Log.w("TAG_PROXY_Preloader", "PreloadTask: " + nOt + ", canceled!!!");
                    }
                }
            }
        });
    }

    public mZ NOt() {
        return this.lp;
    }

    public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.mZ mZVar) {
        this.Mm = mZVar;
    }

    public void ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ mZVar) {
        this.Ht = mZVar;
    }

    public void ZRu(int i10) {
        if (i10 > 0) {
            this.ZRu = i10;
        }
        if (TFq.mZ) {
            Log.i("TAG_PROXY_Preloader", "MaxPreloadSize: ".concat(String.valueOf(i10)));
        }
    }

    public mZ ZRu() {
        return this.ZH;
    }

    public void ZRu(boolean z10, String str) throws Throwable {
        com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt nOtRemove;
        Throwable th;
        this.sAl = str;
        this.edo = z10;
        if (TFq.mZ) {
            Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, ".concat(String.valueOf(str)));
        }
        HashSet<com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt> hashSet = null;
        HashSet<ZRu> hashSet2 = null;
        if (str == null) {
            synchronized (this.Vor) {
                try {
                    if (!this.Vor.isEmpty()) {
                        try {
                            hashSet2 = new HashSet(this.Vor);
                            this.Vor.clear();
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    if (hashSet2 != null) {
                        for (ZRu zRu : hashSet2) {
                            ZRu(zRu.ZRu, zRu.NOt, zRu.mZ, zRu.uR, zRu.TFq, zRu.Ht);
                            if (TFq.mZ) {
                                Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, resume preload: " + zRu.uR);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } else {
            int i10 = TFq.FA;
            if (i10 != 3 && i10 != 2) {
                if (i10 == 1) {
                    synchronized (this.NOt) {
                        try {
                            Map<String, com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt> map = this.NOt.get(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.NOt.ZRu(z10));
                            nOtRemove = map != null ? map.remove(str) : null;
                        } finally {
                        }
                    }
                    if (nOtRemove != null) {
                        nOtRemove.ZRu();
                        return;
                    }
                    return;
                }
                return;
            }
            synchronized (this.NOt) {
                try {
                    int size = this.NOt.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        SparseArray<Map<String, com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt>> sparseArray = this.NOt;
                        Map<String, com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt> map2 = sparseArray.get(sparseArray.keyAt(i11));
                        if (map2 != null) {
                            Collection<com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt> collectionValues = map2.values();
                            if (collectionValues != null && !collectionValues.isEmpty()) {
                                if (hashSet == null) {
                                    hashSet = new HashSet();
                                }
                                hashSet.addAll(collectionValues);
                            }
                            map2.clear();
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (hashSet == null || hashSet.isEmpty()) {
                return;
            }
            for (com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt nOt : hashSet) {
                nOt.ZRu();
                if (TFq.mZ) {
                    Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, cancel preload: " + nOt.Mm);
                }
            }
            if (i10 == 3) {
                synchronized (this.Vor) {
                    try {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ZRu zRu2 = (ZRu) ((com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt) it.next()).edo;
                            if (zRu2 != null) {
                                this.Vor.add(zRu2);
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            }
        }
    }

    public void ZRu(boolean z10, boolean z11, int i10, String str, String... strArr) {
        ZRu(z10, z11, i10, str, null, strArr);
    }

    public void ZRu(boolean z10, boolean z11, int i10, String str, Map<String, String> map, String... strArr) {
        ArrayList arrayList;
        boolean z12 = TFq.mZ;
        if (z12) {
            Log.d("TAG_PROXY_Preloader", "preload start ！！！！");
        }
        com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.ZRu.ZRu zRu = z10 ? this.FA : this.Mm;
        com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.mZ mZVar = this.Ht;
        if (zRu == null || mZVar == null) {
            if (z12) {
                Log.e("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return;
        }
        int i11 = i10 <= 0 ? this.ZRu : i10;
        String strZRu = z11 ? str : com.bykv.vk.openvk.ZRu.ZRu.ZRu.Mm.NOt.ZRu(str);
        File fileUR = zRu.uR(strZRu);
        if (fileUR != null && fileUR.length() >= i11) {
            if (z12) {
                Log.i("TAG_PROXY_Preloader", "no need preload, file size: " + fileUR.length() + ", need preload size: " + i11);
                return;
            }
            return;
        }
        if (Ht.ZRu().ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.NOt.ZRu(z10), strZRu)) {
            if (z12) {
                Log.w("TAG_PROXY_Preloader", "has running proxy task, skip preload for key: ".concat(String.valueOf(str)));
                return;
            }
            return;
        }
        synchronized (this.NOt) {
            try {
                Map<String, com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt> map2 = this.NOt.get(z10 ? 1 : 0);
                if (map2.containsKey(strZRu)) {
                    return;
                }
                ZRu zRu2 = new ZRu(z10, z11, i11, str, map, strArr);
                String str2 = this.sAl;
                if (str2 != null) {
                    int i12 = TFq.FA;
                    if (i12 == 3) {
                        synchronized (this.Vor) {
                            this.Vor.add(zRu2);
                        }
                        if (z12) {
                            Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", add to pending queue");
                        }
                        return;
                    }
                    if (i12 == 2) {
                        if (z12) {
                            Log.w("TAG_PROXY_Preloader", "cancel preload: ".concat(String.valueOf(str)));
                        }
                        return;
                    } else if (i12 == 1 && this.edo == z10 && str2.equals(strZRu)) {
                        if (z12) {
                            Log.w("TAG_PROXY_Preloader", "cancel preload: " + str + ", it is playing");
                        }
                        return;
                    }
                }
                List<Vor.NOt> listZRu = com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(map));
                if (listZRu != null) {
                    arrayList = new ArrayList(listZRu.size());
                    int size = listZRu.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        Vor.NOt nOt = listZRu.get(i13);
                        if (nOt != null) {
                            arrayList.add(new Vor.NOt(nOt.ZRu, nOt.NOt));
                        }
                    }
                } else {
                    arrayList = null;
                }
                com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt nOtZRu = new NOt.ZRu().ZRu(zRu).ZRu(mZVar).ZRu(str).NOt(strZRu).ZRu(new lp(com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(strArr))).ZRu((List<Vor.NOt>) arrayList).ZRu(i11).ZRu(this.aT).ZRu(zRu2).ZRu();
                map2.put(strZRu, nOtZRu);
                this.uR.execute(nOtZRu);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void ZRu(String str) {
        ZRu(false, false, str);
    }

    public void ZRu(final boolean z10, final boolean z11, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu(new com.bytedance.sdk.component.FA.FA("cancel b b S") { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.uR.2
            @Override // java.lang.Runnable
            public void run() {
                com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt nOt;
                synchronized (uR.this.NOt) {
                    try {
                        Map map = (Map) uR.this.NOt.get(com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt.NOt.ZRu(z10));
                        if (map != null) {
                            nOt = (com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.NOt) map.remove(z11 ? str : com.bykv.vk.openvk.ZRu.ZRu.ZRu.Mm.NOt.ZRu(str));
                        } else {
                            nOt = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (nOt != null) {
                    nOt.ZRu();
                }
            }
        });
    }

    private static ExecutorService ZRu(final NOt<Runnable> nOt) {
        int i10;
        int iZRu = com.bykv.vk.openvk.ZRu.ZRu.NOt.mZ.ZRu.ZRu();
        if (iZRu > 0) {
            if (iZRu > 4) {
                i10 = 4;
            }
            return new ThreadPoolExecutor(0, i10, 60L, TimeUnit.SECONDS, nOt, new ThreadFactory() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.uR.4
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable) { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.uR.4.1
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            try {
                                Process.setThreadPriority(10);
                            } catch (Throwable unused) {
                            }
                            super.run();
                        }
                    };
                    thread.setName("csj_video_preload_" + thread.getId());
                    thread.setDaemon(true);
                    if (TFq.mZ) {
                        Log.i("TAG_PROXY_Preloader", "new preload thead: " + thread.getName());
                    }
                    return thread;
                }
            }, new RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.uR.5
                @Override // java.util.concurrent.RejectedExecutionHandler
                public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    try {
                        nOt.offerFirst(runnable);
                        if (TFq.mZ) {
                            Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
        iZRu = 1;
        i10 = iZRu;
        return new ThreadPoolExecutor(0, i10, 60L, TimeUnit.SECONDS, nOt, new ThreadFactory() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.uR.4
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable) { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.uR.4.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable unused) {
                        }
                        super.run();
                    }
                };
                thread.setName("csj_video_preload_" + thread.getId());
                thread.setDaemon(true);
                if (TFq.mZ) {
                    Log.i("TAG_PROXY_Preloader", "new preload thead: " + thread.getName());
                }
                return thread;
            }
        }, new RejectedExecutionHandler() { // from class: com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.uR.5
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    nOt.offerFirst(runnable);
                    if (TFq.mZ) {
                        Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
