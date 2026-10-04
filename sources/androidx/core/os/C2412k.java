package androidx.core.os;

import android.os.Handler;
import ed.InterfaceC4376a;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.core.os.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2412k {

    /* JADX INFO: renamed from: androidx.core.os.k$a */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a<L0> f111297a;

        public a(InterfaceC4376a<L0> interfaceC4376a) {
            this.f111297a = interfaceC4376a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f111297a.invoke();
        }
    }

    /* JADX INFO: renamed from: androidx.core.os.k$b */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a<L0> f111298a;

        public b(InterfaceC4376a<L0> interfaceC4376a) {
            this.f111298a = interfaceC4376a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f111298a.invoke();
        }
    }

    @NotNull
    public static final Runnable a(@NotNull Handler handler, long j10, @Nullable Object obj, @NotNull InterfaceC4376a<L0> interfaceC4376a) {
        a aVar = new a(interfaceC4376a);
        handler.postAtTime(aVar, obj, j10);
        return aVar;
    }

    public static /* synthetic */ Runnable b(Handler handler, long j10, Object obj, InterfaceC4376a interfaceC4376a, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        a aVar = new a(interfaceC4376a);
        handler.postAtTime(aVar, obj, j10);
        return aVar;
    }

    @NotNull
    public static final Runnable c(@NotNull Handler handler, long j10, @Nullable Object obj, @NotNull InterfaceC4376a<L0> interfaceC4376a) {
        b bVar = new b(interfaceC4376a);
        if (obj == null) {
            handler.postDelayed(bVar, j10);
            return bVar;
        }
        C2411j.d(handler, bVar, obj, j10);
        return bVar;
    }

    public static /* synthetic */ Runnable d(Handler handler, long j10, Object obj, InterfaceC4376a interfaceC4376a, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        b bVar = new b(interfaceC4376a);
        if (obj == null) {
            handler.postDelayed(bVar, j10);
            return bVar;
        }
        C2411j.d(handler, bVar, obj, j10);
        return bVar;
    }
}
