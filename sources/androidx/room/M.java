package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.A;
import androidx.room.G;
import androidx.room.InterfaceC2688z;
import androidx.room.M;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nMultiInstanceInvalidationClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,130:1\n37#2,2:131\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient\n*L\n95#1:131,2\n*E\n"})
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f117120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final G f117121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Executor f117122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f117123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f117124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public G.c f117125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public A f117126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final InterfaceC2688z f117127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f117128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ServiceConnection f117129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Runnable f117130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Runnable f117131l;

    @kotlin.jvm.internal.V({"SMAP\nMultiInstanceInvalidationClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,130:1\n37#2,2:131\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.kt\nandroidx/room/MultiInstanceInvalidationClient$1\n*L\n102#1:131,2\n*E\n"})
    public static final class a extends G.c {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.G.c
        public void c(@NotNull Set<String> tables) {
            kotlin.jvm.internal.G.p(tables, "tables");
            if (M.this.f117128i.get()) {
                return;
            }
            try {
                M m10 = M.this;
                A a10 = m10.f117126g;
                if (a10 != null) {
                    a10.T3(m10.f117124e, (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w(w0.f117306b, "Cannot broadcast invalidation", e10);
            }
        }
    }

    public static final class b extends InterfaceC2688z.b {
        public b() {
        }

        public static final void v5(M this$0, String[] tables) {
            kotlin.jvm.internal.G.p(this$0, "this$0");
            kotlin.jvm.internal.G.p(tables, "$tables");
            this$0.f117121b.p((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.InterfaceC2688z
        public void v(@NotNull final String[] tables) {
            kotlin.jvm.internal.G.p(tables, "tables");
            final M m10 = M.this;
            m10.f117122c.execute(new Runnable() { // from class: androidx.room.N
                @Override // java.lang.Runnable
                public final void run() {
                    M.b.v5(m10, tables);
                }
            });
        }
    }

    public static final class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
            kotlin.jvm.internal.G.p(name, "name");
            kotlin.jvm.internal.G.p(service, "service");
            M.this.f117126g = A.b.U0(service);
            M m10 = M.this;
            m10.f117122c.execute(m10.f117130k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName name) {
            kotlin.jvm.internal.G.p(name, "name");
            M m10 = M.this;
            m10.f117122c.execute(m10.f117131l);
            M.this.f117126g = null;
        }
    }

    public M(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent, @NotNull G invalidationTracker, @NotNull Executor executor) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(name, "name");
        kotlin.jvm.internal.G.p(serviceIntent, "serviceIntent");
        kotlin.jvm.internal.G.p(invalidationTracker, "invalidationTracker");
        kotlin.jvm.internal.G.p(executor, "executor");
        this.f117120a = name;
        this.f117121b = invalidationTracker;
        this.f117122c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f117123d = applicationContext;
        this.f117127h = new b();
        this.f117128i = new AtomicBoolean(false);
        c cVar = new c();
        this.f117129j = cVar;
        this.f117130k = new Runnable() { // from class: androidx.room.K
            @Override // java.lang.Runnable
            public final void run() {
                M.r(this.f117118a);
            }
        };
        this.f117131l = new Runnable() { // from class: androidx.room.L
            @Override // java.lang.Runnable
            public final void run() {
                M.n(this.f117119a);
            }
        };
        this.f117125f = new a((String[]) invalidationTracker.f117083d.keySet().toArray(new String[0]));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    public static final void n(M this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.f117121b.t(this$0.h());
    }

    public static final void r(M this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        try {
            A a10 = this$0.f117126g;
            if (a10 != null) {
                this$0.f117124e = a10.w4(this$0.f117127h, this$0.f117120a);
                this$0.f117121b.c(this$0.h());
            }
        } catch (RemoteException e10) {
            Log.w(w0.f117306b, "Cannot register multi-instance invalidation callback", e10);
        }
    }

    @NotNull
    public final InterfaceC2688z c() {
        return this.f117127h;
    }

    public final int d() {
        return this.f117124e;
    }

    @NotNull
    public final Executor e() {
        return this.f117122c;
    }

    @NotNull
    public final G f() {
        return this.f117121b;
    }

    @NotNull
    public final String g() {
        return this.f117120a;
    }

    @NotNull
    public final G.c h() {
        G.c cVar = this.f117125f;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.G.S("observer");
        throw null;
    }

    @NotNull
    public final Runnable i() {
        return this.f117131l;
    }

    @Nullable
    public final A j() {
        return this.f117126g;
    }

    @NotNull
    public final ServiceConnection k() {
        return this.f117129j;
    }

    @NotNull
    public final Runnable l() {
        return this.f117130k;
    }

    @NotNull
    public final AtomicBoolean m() {
        return this.f117128i;
    }

    public final void o(int i10) {
        this.f117124e = i10;
    }

    public final void p(@NotNull G.c cVar) {
        kotlin.jvm.internal.G.p(cVar, "<set-?>");
        this.f117125f = cVar;
    }

    public final void q(@Nullable A a10) {
        this.f117126g = a10;
    }

    public final void s() {
        if (this.f117128i.compareAndSet(false, true)) {
            this.f117121b.t(h());
            try {
                A a10 = this.f117126g;
                if (a10 != null) {
                    a10.O5(this.f117127h, this.f117124e);
                }
            } catch (RemoteException e10) {
                Log.w(w0.f117306b, "Cannot unregister multi-instance invalidation callback", e10);
            }
            this.f117123d.unbindService(this.f117129j);
        }
    }
}
