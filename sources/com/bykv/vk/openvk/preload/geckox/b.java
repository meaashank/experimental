package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static IThreadPoolCallback f140469q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static ThreadPoolExecutor f140470r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f140471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.c f140472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IStatisticMonitor f140473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final INetWork f140474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f140475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f140476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.a f140477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f140478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f140479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f140480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f140481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f140482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f140483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f140484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f140485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private JSONObject f140486p;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private INetWork f140487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f140488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f140489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Context f140490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IStatisticMonitor f140491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f140492f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.a f140493g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Long f140494h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f140495i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f140496j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f140497k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private File f140498l;

        public a(Context context) {
            this.f140490d = context.getApplicationContext();
        }

        public final a a(String... strArr) {
            this.f140489c = Arrays.asList(strArr);
            return this;
        }

        public final a b(String... strArr) {
            this.f140488b = Arrays.asList(strArr);
            return this;
        }

        public final a c(String str) {
            this.f140497k = str;
            return this;
        }

        public final a a(INetWork iNetWork) {
            this.f140487a = iNetWork;
            return this;
        }

        public final a b() {
            this.f140494h = 38L;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor) {
            this.f140491e = iStatisticMonitor;
            return this;
        }

        public final a b(String str) {
            this.f140496j = str;
            return this;
        }

        public final a a() {
            this.f140492f = false;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.f140493g = aVar;
            return this;
        }

        public final a a(String str) {
            this.f140495i = str;
            return this;
        }

        public final a a(File file) {
            this.f140498l = file;
            return this;
        }
    }

    public /* synthetic */ b(a aVar, byte b10) {
        this(aVar);
    }

    public static Executor g() {
        return p();
    }

    public static Executor h() {
        return p();
    }

    public static ExecutorService p() {
        IThreadPoolCallback iThreadPoolCallback = f140469q;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (f140470r == null) {
            synchronized (b.class) {
                try {
                    if (f140470r == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        f140470r = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } finally {
                }
            }
        }
        return f140470r;
    }

    public final Context a() {
        return this.f140471a;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.f140477g;
    }

    public final boolean c() {
        return this.f140485o;
    }

    public final List<String> d() {
        return this.f140476f;
    }

    public final List<String> e() {
        return this.f140475e;
    }

    public final JSONObject f() {
        return this.f140486p;
    }

    public final INetWork i() {
        return this.f140474d;
    }

    public final String j() {
        return this.f140481k;
    }

    public final long k() {
        return this.f140478h.longValue();
    }

    public final File l() {
        return this.f140484n;
    }

    public final String m() {
        return this.f140479i;
    }

    public final IStatisticMonitor n() {
        return this.f140473c;
    }

    public final String o() {
        return this.f140480j;
    }

    private b(a aVar) {
        Context context = aVar.f140490d;
        this.f140471a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f140488b;
        this.f140475e = list;
        this.f140476f = aVar.f140489c;
        this.f140472b = null;
        this.f140477g = aVar.f140493g;
        Long l10 = aVar.f140494h;
        this.f140478h = l10;
        if (TextUtils.isEmpty(aVar.f140495i)) {
            this.f140479i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.f140479i = aVar.f140495i;
        }
        String str = aVar.f140496j;
        this.f140480j = str;
        this.f140482l = null;
        this.f140483m = null;
        if (aVar.f140498l == null) {
            this.f140484n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f140484n = aVar.f140498l;
        }
        String str2 = aVar.f140497k;
        this.f140481k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l10 == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.f140474d = aVar.f140487a;
        this.f140473c = aVar.f140491e;
        this.f140485o = aVar.f140492f;
    }

    public final void a(JSONObject jSONObject) {
        this.f140486p = jSONObject;
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f140469q = iThreadPoolCallback;
    }
}
