package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3477b;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3477b extends AbstractC3565h3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RunnableC3463a f152715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f152716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f152717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f152718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledExecutorService f152719g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3477b(long j10, InterfaceC3551g3 listener) {
        super(listener);
        kotlin.jvm.internal.G.p(listener, "listener");
        this.f152714b = j10;
        this.f152715c = new RunnableC3463a(this);
        this.f152716d = new AtomicBoolean(false);
        this.f152717e = new AtomicBoolean(false);
        this.f152718f = new Handler(Looper.getMainLooper());
    }

    public static final StackTraceElement[] a(C3477b c3477b) {
        c3477b.getClass();
        return Looper.getMainLooper().getThread().getStackTrace();
    }

    public static final void b(C3477b this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        if (this$0.f152716d.getAndSet(true)) {
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this$0.f152719g;
        if (scheduledExecutorService == null || scheduledExecutorService.scheduleAtFixedRate(this$0.f152715c, 0L, this$0.f152714b, TimeUnit.MILLISECONDS) == null) {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new V4("ANRWatchDog"));
            this$0.f152719g = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            if (scheduledExecutorServiceNewSingleThreadScheduledExecutor != null) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(this$0.f152715c, 0L, this$0.f152714b, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3565h3
    public final void a() {
        Cc.f151826a.execute(new Runnable() { // from class: F5.R0
            @Override // java.lang.Runnable
            public final void run() {
                C3477b.b(this.f34385a);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3565h3
    public final void b() {
        if (this.f152716d.getAndSet(false)) {
            this.f152716d.set(false);
            this.f152717e.set(false);
            ScheduledExecutorService scheduledExecutorService = this.f152719g;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            this.f152719g = null;
        }
    }
}
