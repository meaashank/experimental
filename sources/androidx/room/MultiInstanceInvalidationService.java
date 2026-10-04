package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.A;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC2684v
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f117135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<Integer, String> f117136b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RemoteCallbackList<InterfaceC2688z> f117137c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final A.b f117138d = new a();

    public static final class a extends A.b {
        public a() {
        }

        @Override // androidx.room.A
        public void O5(@NotNull InterfaceC2688z callback, int i10) {
            kotlin.jvm.internal.G.p(callback, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f117137c) {
                multiInstanceInvalidationService.f117137c.unregister(callback);
                multiInstanceInvalidationService.f117136b.remove(Integer.valueOf(i10));
            }
        }

        @Override // androidx.room.A
        public void T3(int i10, @NotNull String[] tables) {
            kotlin.jvm.internal.G.p(tables, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f117137c) {
                String str = multiInstanceInvalidationService.f117136b.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w(w0.f117306b, "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.f117137c.beginBroadcast();
                for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.f117137c.getBroadcastCookie(i11);
                        kotlin.jvm.internal.G.n(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = multiInstanceInvalidationService.f117136b.get(num);
                        if (i10 != iIntValue && str.equals(str2)) {
                            try {
                                ((InterfaceC2688z) multiInstanceInvalidationService.f117137c.getBroadcastItem(i11)).v(tables);
                            } catch (RemoteException e10) {
                                Log.w(w0.f117306b, "Error invoking a remote callback", e10);
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService.f117137c.finishBroadcast();
                    }
                }
            }
        }

        @Override // androidx.room.A
        public int w4(@NotNull InterfaceC2688z callback, @Nullable String str) {
            kotlin.jvm.internal.G.p(callback, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f117137c) {
                try {
                    int i11 = multiInstanceInvalidationService.f117135a + 1;
                    multiInstanceInvalidationService.f117135a = i11;
                    if (multiInstanceInvalidationService.f117137c.register(callback, Integer.valueOf(i11))) {
                        multiInstanceInvalidationService.f117136b.put(Integer.valueOf(i11), str);
                        i10 = i11;
                    } else {
                        multiInstanceInvalidationService.f117135a--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i10;
        }
    }

    public static final class b extends RemoteCallbackList<InterfaceC2688z> {
        public b() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(@NotNull InterfaceC2688z callback, @NotNull Object cookie) {
            kotlin.jvm.internal.G.p(callback, "callback");
            kotlin.jvm.internal.G.p(cookie, "cookie");
            MultiInstanceInvalidationService.this.f117136b.remove((Integer) cookie);
        }
    }

    @NotNull
    public final RemoteCallbackList<InterfaceC2688z> a() {
        return this.f117137c;
    }

    @NotNull
    public final Map<Integer, String> b() {
        return this.f117136b;
    }

    public final int c() {
        return this.f117135a;
    }

    public final void d(int i10) {
        this.f117135a = i10;
    }

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@NotNull Intent intent) {
        kotlin.jvm.internal.G.p(intent, "intent");
        return this.f117138d;
    }
}
