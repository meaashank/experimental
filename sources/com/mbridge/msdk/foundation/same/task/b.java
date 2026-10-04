package com.mbridge.msdk.foundation.same.task;

import android.annotation.SuppressLint;
import android.content.Context;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.s0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f156654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    HashMap<Long, com.mbridge.msdk.foundation.same.task.a> f156655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    WeakReference<Context> f156656c;

    public class a implements a.InterfaceC0573a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.task.a f156657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0573a f156658b;

        public a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0573a interfaceC0573a) {
            this.f156657a = aVar;
            this.f156658b = interfaceC0573a;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0573a
        public void a(a.b bVar) {
            if (bVar == a.b.CANCEL || bVar == a.b.FINISH) {
                b.this.f156655b.remove(Long.valueOf(this.f156657a.getId()));
            } else if (bVar == a.b.RUNNING && b.this.f156656c.get() == null) {
                b.this.a();
            }
            a.InterfaceC0573a interfaceC0573a = this.f156658b;
            if (interfaceC0573a != null) {
                interfaceC0573a.a(bVar);
            }
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context, int i10) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.f156654a = c.b();
        } else {
            if (i10 == 0) {
                this.f156654a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f156654a = new ThreadPoolExecutor(i10, (i10 * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f156654a.allowCoreThreadTimeOut(true);
        }
        this.f156655b = new HashMap<>();
        this.f156656c = new WeakReference<>(context);
    }

    public void a(com.mbridge.msdk.foundation.same.task.a aVar) {
        a(aVar, null);
        this.f156654a.execute(aVar);
    }

    public void b(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0573a interfaceC0573a) {
        a(aVar, interfaceC0573a);
        this.f156654a.execute(aVar);
    }

    private synchronized void a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0573a interfaceC0573a) {
        this.f156655b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a(aVar, interfaceC0573a));
    }

    public synchronized void a() {
        try {
            Iterator<Map.Entry<Long, com.mbridge.msdk.foundation.same.task.a>> it = this.f156655b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.f156655b.clear();
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.f156654a = c.b();
        } else {
            if (s0.a().a("c_t_p_t_l", true)) {
                int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f156654a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f156654a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f156654a.allowCoreThreadTimeOut(true);
        }
        this.f156655b = new HashMap<>();
        this.f156656c = new WeakReference<>(context);
    }
}
