package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Nb.c f194496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, Mb.a> f194497b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Mb.a f194498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f194499d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f194500a;

        public a(Activity activity) {
            this.f194500a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f194498c.show(this.f194500a);
        }
    }

    public k(d dVar) {
        this.f194499d = dVar;
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void a(Context context, String[] strArr, String[] strArr2, Nb.b bVar) {
        this.f194496a.a(context, strArr, strArr2, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void b(Context context, Nb.b bVar) {
        this.f194496a.b(context, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void show(Activity activity, String str, String str2) {
        Mb.a aVar = this.f194497b.get(str2);
        if (aVar != null) {
            this.f194498c = aVar;
            l.a(new a(activity));
            return;
        }
        this.f194499d.handleError(c.f(str2, str, "Could not find ad for placement '" + str2 + "'."));
    }
}
