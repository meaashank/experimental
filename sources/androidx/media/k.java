package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.media.s;
import androidx.media.t;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f114650b = "MediaSessionManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f114651c = Log.isLoggable("MediaSessionManager", 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f114652d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile k f114653e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f114654a;

    public interface a {
        boolean a(c cVar);

        Context getContext();
    }

    public interface c {
        int c();

        int d();

        String getPackageName();
    }

    public k(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f114654a = new s(context);
        } else {
            this.f114654a = new l(context);
        }
    }

    @NonNull
    public static k b(@NonNull Context context) {
        k kVar;
        k kVar2 = f114653e;
        if (kVar2 != null) {
            return kVar2;
        }
        synchronized (f114652d) {
            try {
                kVar = f114653e;
                if (kVar == null) {
                    f114653e = new k(context.getApplicationContext());
                    kVar = f114653e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public Context a() {
        return this.f114654a.getContext();
    }

    public boolean c(@NonNull b bVar) {
        if (bVar != null) {
            return this.f114654a.a(bVar.f114656a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f114655b = "android.media.session.MediaController";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f114656a;

        public b(@NonNull String str, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f114656a = new s.a(str, i10, i11);
            } else {
                this.f114656a = new t.a(str, i10, i11);
            }
        }

        @NonNull
        public String a() {
            return this.f114656a.getPackageName();
        }

        public int b() {
            return this.f114656a.c();
        }

        public int c() {
            return this.f114656a.d();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f114656a.equals(((b) obj).f114656a);
            }
            return false;
        }

        public int hashCode() {
            return this.f114656a.hashCode();
        }

        @T(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f114656a = new s.a(remoteUserInfo);
        }
    }
}
