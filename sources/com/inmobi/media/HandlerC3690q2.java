package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: com.inmobi.media.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC3690q2 extends Handler implements B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f153285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f153286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f153287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ThreadPoolExecutor f153288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3690q2(Looper looper) {
        super(looper);
        kotlin.jvm.internal.G.p(looper, "looper");
        this.f153285a = new ArrayList();
        this.f153286b = new LinkedHashMap();
        this.f153287c = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Map map;
        boolean z10;
        D2 d22;
        ThreadPoolExecutor threadPoolExecutor;
        kotlin.jvm.internal.G.p(message, "message");
        if (C3773w2.f153492d.get()) {
            kotlin.L0 l02 = null;
            ThreadPoolExecutor threadPoolExecutor2 = null;
            ThreadPoolExecutor threadPoolExecutor3 = null;
            kotlin.L0 l03 = null;
            switch (message.what) {
                case 0:
                    kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                    Object obj = message.obj;
                    kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type com.inmobi.commons.core.configs.ConfigFetchInputs");
                    A2 a22 = (A2) obj;
                    Config config = a22.f151737a;
                    LinkedHashMap linkedHashMap = C3773w2.f153489a;
                    InterfaceC3759v2 interfaceC3759v2 = a22.f151738b;
                    if (interfaceC3759v2 != null) {
                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                        interfaceC3759v2.toString();
                        ArrayList arrayList = (ArrayList) C3773w2.f153489a.get(config);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new WeakReference(interfaceC3759v2));
                        C3773w2.f153489a.put(config, arrayList);
                    }
                    if (!C3773w2.f153491c.get()) {
                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                        config.getType();
                    } else {
                        String accountId$media_release = config.getAccountId$media_release();
                        if (accountId$media_release != null) {
                            String type = config.getType();
                            kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                            Config configA = AbstractC3537f3.a(accountId$media_release, type);
                            if (((C3801y2) C3773w2.f153494f.getValue()).b("root", accountId$media_release)) {
                                kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                                C3745u2.a(AbstractC3537f3.a(accountId$media_release, "root"));
                            } else {
                                Config configA2 = C3745u2.a(accountId$media_release);
                                kotlin.jvm.internal.G.n(configA2, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                                RootConfig rootConfig = (RootConfig) configA2;
                                long lastUpdateTimeStamp = rootConfig.getLastUpdateTimeStamp();
                                long expiryForType = rootConfig.getExpiryForType(rootConfig.getType());
                                kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                                long jCurrentTimeMillis = System.currentTimeMillis() - lastUpdateTimeStamp;
                                long j10 = 1000;
                                Object[] objArr = jCurrentTimeMillis > expiryForType * j10;
                                kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                                if (objArr != false) {
                                    kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                                    C3745u2.a(AbstractC3537f3.a(accountId$media_release, "root"));
                                }
                                if (!"root".equals(type)) {
                                    if (((C3801y2) C3773w2.f153494f.getValue()).b(type, accountId$media_release)) {
                                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                                        C3745u2.a(configA);
                                    } else {
                                        Config configA3 = C3745u2.a(accountId$media_release, type);
                                        long lastUpdateTimeStamp2 = configA3 != null ? configA3.getLastUpdateTimeStamp() : 0L;
                                        long expiryForType2 = rootConfig.getExpiryForType(type);
                                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                                        i = System.currentTimeMillis() - lastUpdateTimeStamp2 > expiryForType2 * j10 ? 1 : 0;
                                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                                        if (i != 0) {
                                            kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                                            C3745u2.a(configA);
                                        }
                                    }
                                }
                            }
                            l02 = kotlin.L0.f217464a;
                        }
                        if (l02 == null) {
                            kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                            config.getType();
                        }
                    }
                    break;
                case 1:
                    kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                    Object obj2 = message.obj;
                    kotlin.jvm.internal.G.n(obj2, "null cannot be cast to non-null type com.inmobi.commons.core.configs.Config");
                    Config config2 = (Config) obj2;
                    String accountId$media_release2 = config2.getAccountId$media_release();
                    if (accountId$media_release2 != null) {
                        String type2 = config2.getType();
                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                        LinkedHashMap linkedHashMap2 = C3773w2.f153489a;
                        Config configA4 = C3745u2.a(accountId$media_release2);
                        kotlin.jvm.internal.G.n(configA4, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                        Map map2 = (Map) this.f153286b.get(new C3703r2(((RootConfig) configA4).getUrlForType(type2), accountId$media_release2));
                        if (map2 != null && map2.containsKey(type2)) {
                            i = 1;
                        }
                        Map map3 = this.f153287c;
                        int i10 = (map3 == null || !map3.containsKey(type2)) ? i : 1;
                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                        config2.getType();
                        if (i10 == 0) {
                            this.f153285a.add(config2);
                            if (!hasMessages(2)) {
                                Message messageObtain = Message.obtain();
                                messageObtain.what = 2;
                                messageObtain.obj = accountId$media_release2;
                                sendMessage(messageObtain);
                            }
                        } else {
                            kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                            config2.getType();
                        }
                        l03 = kotlin.L0.f217464a;
                    }
                    if (l03 == null) {
                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                        config2.getType();
                    }
                    break;
                case 2:
                    LinkedHashMap linkedHashMap3 = C3773w2.f153489a;
                    Object obj3 = message.obj;
                    kotlin.jvm.internal.G.n(obj3, "null cannot be cast to non-null type kotlin.String");
                    kotlin.jvm.internal.G.n(C3745u2.a((String) obj3), "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                    sendEmptyMessageDelayed(3, ((RootConfig) r1).getWaitTime() * 1000);
                    break;
                case 3:
                    ArrayList arrayList2 = this.f153285a;
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj4 = arrayList2.get(i);
                        i++;
                        Config config3 = (Config) obj4;
                        String accountId$media_release3 = config3.getAccountId$media_release();
                        if (accountId$media_release3 != null) {
                            LinkedHashMap linkedHashMap4 = C3773w2.f153489a;
                            Config configA5 = C3745u2.a(accountId$media_release3);
                            kotlin.jvm.internal.G.n(configA5, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                            C3703r2 c3703r2 = new C3703r2(((RootConfig) configA5).getUrlForType(config3.getType()), accountId$media_release3);
                            Map map4 = (Map) this.f153286b.get(c3703r2);
                            if (map4 == null) {
                                map4 = new HashMap();
                                this.f153286b.put(c3703r2, map4);
                            }
                            map4.put(config3.getType(), config3);
                        }
                    }
                    this.f153285a.clear();
                    ThreadPoolExecutor threadPoolExecutor4 = this.f153288d;
                    if (threadPoolExecutor4 == null || !threadPoolExecutor4.isShutdown()) {
                        threadPoolExecutor3 = this.f153288d;
                    } else {
                        this.f153288d = null;
                    }
                    if (threadPoolExecutor3 == null) {
                        int i11 = T3.f152448a;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
                        String strF = C3773w2.f();
                        kotlin.jvm.internal.G.o(strF, "access$getTAG$cp(...)");
                        ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(1, 1, 5L, timeUnit, linkedBlockingDeque, new V4(strF));
                        threadPoolExecutor5.allowCoreThreadTimeOut(true);
                        this.f153288d = threadPoolExecutor5;
                        sendEmptyMessage(4);
                    }
                    break;
                case 4:
                    if (this.f153286b.isEmpty()) {
                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                        sendEmptyMessage(5);
                    } else {
                        Map.Entry entry = (Map.Entry) this.f153286b.entrySet().iterator().next();
                        this.f153287c = (Map) entry.getValue();
                        this.f153286b.remove(entry.getKey());
                        C3703r2 c3703r22 = (C3703r2) entry.getKey();
                        Map map5 = this.f153287c;
                        kotlin.jvm.internal.G.m(map5);
                        String str = ((C3703r2) entry.getKey()).f153303b;
                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                        Objects.toString(c3703r22);
                        LinkedHashMap linkedHashMap5 = C3773w2.f153489a;
                        Config configA6 = C3745u2.a(str);
                        kotlin.jvm.internal.G.n(configA6, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
                        RootConfig rootConfig2 = (RootConfig) configA6;
                        int retryInterval = rootConfig2.getRetryInterval();
                        int maxRetries = rootConfig2.getMaxRetries();
                        C3686pc c3686pc = new C3686pc(rootConfig2.getIncludeIdParams());
                        boolean zA = Z3.a(Z3.f152641a, false, 1, null);
                        if (zA || !map5.containsKey("root")) {
                            map = map5;
                            z10 = zA;
                        } else {
                            HashMap map6 = new HashMap(1);
                            Object obj5 = map5.get("root");
                            kotlin.jvm.internal.G.m(obj5);
                            map6.put("root", obj5);
                            map = map6;
                            z10 = true;
                        }
                        D2 d23 = new D2(map, c3686pc, c3703r22.f153302a, maxRetries, retryInterval, z10, str);
                        if (map5.containsKey("root")) {
                            String fallbackUrlForRootType = rootConfig2.getFallbackUrlForRootType();
                            HashMap map7 = new HashMap(1);
                            Object obj6 = map5.get("root");
                            kotlin.jvm.internal.G.m(obj6);
                            map7.put("root", obj6);
                            d22 = new D2(map7, c3686pc, fallbackUrlForRootType, maxRetries, retryInterval, z10, str);
                        } else {
                            d22 = null;
                        }
                        C2 c22 = new C2(this, d23, d22);
                        try {
                            ThreadPoolExecutor threadPoolExecutor6 = this.f153288d;
                            if (threadPoolExecutor6 == null || !threadPoolExecutor6.isShutdown()) {
                                threadPoolExecutor2 = this.f153288d;
                            } else {
                                this.f153288d = null;
                            }
                            if (threadPoolExecutor2 != null) {
                                threadPoolExecutor2.execute(c22);
                            }
                        } catch (OutOfMemoryError unused) {
                            C3773w2.f();
                            if (this.f153286b.isEmpty()) {
                                kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                                sendEmptyMessage(5);
                                return;
                            }
                            return;
                        }
                    }
                    break;
                case 5:
                    ThreadPoolExecutor threadPoolExecutor7 = this.f153288d;
                    if (threadPoolExecutor7 == null || !threadPoolExecutor7.isShutdown()) {
                        threadPoolExecutor = this.f153288d;
                    } else {
                        this.f153288d = null;
                        threadPoolExecutor = null;
                    }
                    if (threadPoolExecutor != null && !threadPoolExecutor.isShutdown()) {
                        this.f153287c = null;
                        this.f153286b.clear();
                        removeMessages(3);
                        threadPoolExecutor.shutdownNow();
                        break;
                    }
                    break;
                case 6:
                    Object obj7 = message.obj;
                    kotlin.jvm.internal.G.n(obj7, "null cannot be cast to non-null type com.inmobi.commons.core.configs.ConfigNetworkResponse.ConfigResponse");
                    F2 f22 = (F2) obj7;
                    if (f22.f151917c != null) {
                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                        f22.f151915a.getType();
                    } else if (f22.f151916b != 304) {
                        C3801y2 c3801y2 = (C3801y2) C3773w2.f153494f.getValue();
                        Config config4 = f22.f151915a;
                        c3801y2.getClass();
                        kotlin.jvm.internal.G.p(config4, "config");
                        try {
                            if (config4.getAccountId$media_release() != null) {
                                config4.getType();
                                config4.getAccountId$media_release();
                                c3801y2.a(config4, "account_id=? AND config_type=?", new String[]{config4.getAccountId$media_release(), config4.getType()});
                                break;
                            }
                        } catch (Exception unused2) {
                        }
                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                        f22.f151915a.getType();
                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                        Objects.toString(f22.f151915a.toJson());
                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                        f22.f151915a.getAccountId$media_release();
                        Config config5 = f22.f151915a;
                        ConcurrentHashMap concurrentHashMap = C3773w2.f153493e;
                        LinkedHashMap linkedHashMap6 = C3773w2.f153489a;
                        kotlin.jvm.internal.G.p(config5, "<this>");
                        HashMap map8 = AbstractC3537f3.f152908a;
                        String accountId$media_release4 = config5.getAccountId$media_release();
                        String type3 = config5.getType();
                        kotlin.jvm.internal.G.p(type3, "type");
                        concurrentHashMap.put(accountId$media_release4 + SignatureVisitor.SUPER + type3, config5);
                        C3745u2.b(f22.f151915a);
                    } else {
                        kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                        f22.f151915a.getType();
                        Config config6 = f22.f151915a;
                        if (config6.getAccountId$media_release() != null) {
                            C3801y2 c3801y22 = (C3801y2) C3773w2.f153494f.getValue();
                            String type4 = config6.getType();
                            String accountId$media_release5 = config6.getAccountId$media_release();
                            kotlin.jvm.internal.G.m(accountId$media_release5);
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            c3801y22.getClass();
                            kotlin.jvm.internal.G.p(type4, "type");
                            Config config7 = (Config) c3801y22.b("account_id=? AND config_type=?", new String[]{accountId$media_release5, type4});
                            if (config7 != null) {
                                config7.setLastUpdateTimeStamp(jCurrentTimeMillis2);
                                c3801y22.a(config7, "account_id=? AND config_type=?", new String[]{accountId$media_release5, type4});
                            }
                        }
                    }
                    break;
                default:
                    kotlin.jvm.internal.G.o(C3773w2.f(), "access$getTAG$cp(...)");
                    break;
            }
        }
    }
}
