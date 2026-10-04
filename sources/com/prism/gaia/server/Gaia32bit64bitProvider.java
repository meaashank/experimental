package com.prism.gaia.server;

import B0.C0922f;
import android.app.ActivityManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.gaia.helper.GUri;
import com.prism.gaia.helper.compat.bit32bit64.RemoteRunnable;
import com.prism.gaia.server.am.z;

/* JADX INFO: loaded from: classes6.dex */
public class Gaia32bit64bitProvider extends ContentProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f166084b = "asdf-".concat("Gaia32bit64bitProvider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f166085c = "._gaia_32bit_64bit_provider";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HandlerThread f166086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static GUri f166087e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f166088f = "md_getAliveTaskIds";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f166089g = "md_getRecentTasks";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f166090h = "md_getRunningAppProcess";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f166091i = "md_remoteRunnable";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f166092j = "md_broadcast";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f166093k = "rd_common";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Gaia32bit64bitProvider f166094l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActivityManager f166095a;

    public interface a {
        void a(Bundle bundle, Bundle bundle2);
    }

    static {
        HandlerThread handlerThread = new HandlerThread("msg_handler_32bit64bit");
        f166086d = handlerThread;
        handlerThread.start();
    }

    public static Gaia32bit64bitProvider a() {
        return f166094l;
    }

    public static Looper c() {
        return f166086d.getLooper();
    }

    public static String d(GUri gUri) {
        return C0922f.a(gUri.getAuthority(), 27, 0);
    }

    public static GUri e(String str) {
        return new GUri(androidx.compose.runtime.changelist.j.a(str, f166085c));
    }

    public static GUri f() {
        GUri gUri = f166087e;
        if (gUri != null) {
            return gUri;
        }
        synchronized (Gaia32bit64bitProvider.class) {
            try {
                GUri gUri2 = f166087e;
                if (gUri2 != null) {
                    return gUri2;
                }
                GUri gUriE = e(U6.c.d());
                f166087e = gUriE;
                return gUriE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static GUri g() {
        return e("com.app.hider.master.promax");
    }

    public static boolean h(String str) {
        return str != null && str.contains(f166085c);
    }

    public static boolean i(GUri gUri) {
        return f().equals(gUri);
    }

    public ActivityManager b() {
        return this.f166095a;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        f166094l = this;
        Bundle bundle2 = new Bundle();
        if (str.equalsIgnoreCase(f166088f)) {
            new com.prism.gaia.helper.compat.bit32bit64.a().a(bundle, bundle2);
            return bundle2;
        }
        if (str.equals(f166089g)) {
            new com.prism.gaia.helper.compat.bit32bit64.f().a(bundle, bundle2);
            return bundle2;
        }
        if (str.equals(f166090h)) {
            new com.prism.gaia.helper.compat.bit32bit64.g().a(bundle, bundle2);
            return bundle2;
        }
        if (str.equals(f166091i)) {
            RemoteRunnable.onRemoteReceivedRunnable(bundle, bundle2);
            return bundle2;
        }
        if (str.equals(f166092j)) {
            new z.c().a(bundle, bundle2);
        }
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f166095a = (ActivityManager) getContext().getSystemService("activity");
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
