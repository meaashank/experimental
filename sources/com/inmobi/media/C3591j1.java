package com.inmobi.media;

import com.inmobi.media.C3591j1;
import ed.InterfaceC4376a;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.InterfaceC4845e;

/* JADX INFO: renamed from: com.inmobi.media.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3591j1 implements InterfaceC4845e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4376a f153027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f153028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f153029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f153030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f153031e;

    public /* synthetic */ C3591j1(Integer num, InterfaceC4376a interfaceC4376a, boolean z10, int i10) {
        this((Object) num, interfaceC4376a, (i10 & 4) != 0 ? false : z10, false);
    }

    public final void a() {
        if (this.f153030d.compareAndSet(false, true)) {
            this.f153031e = true;
            int i10 = T3.f152448a;
            ((ScheduledThreadPoolExecutor) T3.f152449b.getValue()).submit(new Runnable() { // from class: F5.y1
                @Override // java.lang.Runnable
                public final void run() {
                    C3591j1.a(this.f34650a);
                }
            });
        }
    }

    @Override // kd.InterfaceC4845e
    public final Object getValue(Object obj, kotlin.reflect.n property) {
        kotlin.jvm.internal.G.p(property, "property");
        if (this.f153028b || !this.f153031e) {
            a();
        }
        return this.f153029c;
    }

    public C3591j1(Object obj, InterfaceC4376a refreshLogic, boolean z10, boolean z11) {
        kotlin.jvm.internal.G.p(refreshLogic, "refreshLogic");
        this.f153027a = refreshLogic;
        this.f153028b = z10;
        this.f153029c = obj;
        this.f153030d = new AtomicBoolean(false);
        if (z11) {
            a();
        }
    }

    public static final void a(C3591j1 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        try {
            this$0.f153029c = this$0.f153027a.invoke();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this$0.f153030d.set(false);
            throw th;
        }
        this$0.f153030d.set(false);
    }
}
