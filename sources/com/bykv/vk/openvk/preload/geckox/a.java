package com.bykv.vk.openvk.preload.geckox;

import Z3.f;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f140433a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.falconx.a.a f140434b = new com.bykv.vk.openvk.preload.falconx.a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Queue<String> f140435c = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f140436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f140437e;

    private a(b bVar) {
        this.f140436d = bVar;
        File fileL = bVar.l();
        this.f140437e = fileL;
        fileL.mkdirs();
        com.bykv.vk.openvk.preload.geckox.statistic.b.a(this, this.f140436d);
    }

    public static /* synthetic */ void d(a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.f140436d.e());
        try {
            String strA = com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(new com.bykv.vk.openvk.preload.geckox.a.c(arrayList));
            if (aVar.f140435c.size() < 10) {
                aVar.f140435c.add(strA);
            }
        } catch (Throwable unused) {
        }
    }

    public static a a(b bVar) {
        List<String> listE = bVar.e();
        if (listE == null || listE.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        return new a(bVar);
    }

    private boolean b(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map != null && !map.isEmpty()) {
            List<String> listE = this.f140436d.e();
            for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                Iterator<String> it = listE.iterator();
                boolean z10 = false;
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next(), entry.getKey())) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean a() {
        List<String> listD = this.f140436d.d();
        List<String> listE = this.f140436d.e();
        if (listD == null || listD.isEmpty() || listE == null || listE.isEmpty()) {
            return false;
        }
        for (String str : listE) {
            Iterator<String> it = listD.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next())) {
                    z10 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void a(Class<? extends d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        this.f140434b.a(cls, aVar);
    }

    public final void a(final Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        final String str = "default";
        if (!TextUtils.isEmpty("default")) {
            if (a()) {
                if (b(map)) {
                    b.h().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.1

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private /* synthetic */ com.bykv.vk.openvk.preload.geckox.e.a.a f140439b = null;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private /* synthetic */ Map f140440c = null;

                        @Override // java.lang.Runnable
                        public final void run() {
                            com.bykv.vk.openvk.preload.geckox.a.a.b bVarA;
                            GeckoLogger.d("gecko-debug-tag", "start check update...", str);
                            if (a.this.f140436d.b() != null) {
                                bVarA = a.this.f140436d.b().a();
                                bVarA.a(a.this.f140436d.b(), a.this.f140436d.l(), a.this.f140436d.e());
                            } else {
                                bVarA = null;
                            }
                            try {
                                try {
                                    a.this.f140436d.a(new JSONObject());
                                    GeckoLogger.d("gecko-debug-tag", "update finished", com.bykv.vk.openvk.preload.geckox.g.a.a(a.this.f140437e, a.this.f140436d, a.this.f140434b, map, str).a(str));
                                    if (bVarA != null) {
                                        bVarA.a();
                                    }
                                    a.this.f140436d.n().upload("download_gecko_end", a.this.f140436d.f());
                                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                } catch (Throwable th) {
                                    if (bVarA != null) {
                                        bVarA.a();
                                    }
                                    a.this.f140436d.n().upload("download_gecko_end", a.this.f140436d.f());
                                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                    throw th;
                                }
                            } catch (Exception e10) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("success", false);
                                    jSONObject.put("msg", e10.toString());
                                    jSONObject.put(f.f79422s, 2);
                                    a.this.f140436d.a(jSONObject);
                                } catch (Throwable unused) {
                                }
                                GeckoLogger.w("gecko-debug-tag", "Gecko update failed:", e10);
                                if (bVarA != null) {
                                    bVarA.a();
                                }
                                a.this.f140436d.n().upload("download_gecko_end", a.this.f140436d.f());
                                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                            }
                            a.d(a.this);
                        }
                    });
                    return;
                }
                throw new IllegalArgumentException("target keys not in deployments keys");
            }
            throw new IllegalArgumentException("deployments keys not in local keys");
        }
        throw new IllegalArgumentException("groupType == null");
    }
}
