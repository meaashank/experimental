package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.media.k;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class t implements k.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f114659c = "MediaSessionManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f114660d = k.f114651c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f114661e = "android.permission.STATUS_BAR_SERVICE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f114662f = "android.permission.MEDIA_CONTENT_CONTROL";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f114663g = "enabled_notification_listeners";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f114664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContentResolver f114665b;

    public static class a implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f114666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f114667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f114668c;

        public a(String str, int i10, int i11) {
            this.f114666a = str;
            this.f114667b = i10;
            this.f114668c = i11;
        }

        @Override // androidx.media.k.c
        public int c() {
            return this.f114667b;
        }

        @Override // androidx.media.k.c
        public int d() {
            return this.f114668c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.f114666a, aVar.f114666a) && this.f114667b == aVar.f114667b && this.f114668c == aVar.f114668c;
        }

        @Override // androidx.media.k.c
        public String getPackageName() {
            return this.f114666a;
        }

        public int hashCode() {
            return Objects.hash(this.f114666a, Integer.valueOf(this.f114667b), Integer.valueOf(this.f114668c));
        }
    }

    public t(Context context) {
        this.f114664a = context;
        this.f114665b = context.getContentResolver();
    }

    @Override // androidx.media.k.a
    public boolean a(@NonNull k.c cVar) {
        try {
            if (this.f114664a.getPackageManager().getApplicationInfo(cVar.getPackageName(), 0).uid == cVar.d()) {
                return c(cVar, f114661e) || c(cVar, f114662f) || cVar.d() == 1000 || b(cVar);
            }
            if (f114660d) {
                Log.d("MediaSessionManager", "Package name " + cVar.getPackageName() + " doesn't match with the uid " + cVar.d());
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            if (f114660d) {
                Log.d("MediaSessionManager", "Package " + cVar.getPackageName() + " doesn't exist");
            }
            return false;
        }
    }

    public boolean b(@NonNull k.c cVar) {
        String string = Settings.Secure.getString(this.f114665b, "enabled_notification_listeners");
        if (string != null) {
            for (String str : string.split(com.prism.gaia.server.accounts.b.f166434b0)) {
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(cVar.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c(k.c cVar, String str) {
        return cVar.c() < 0 ? this.f114664a.getPackageManager().checkPermission(str, cVar.getPackageName()) == 0 : this.f114664a.checkPermission(str, cVar.c(), cVar.d()) == 0;
    }

    @Override // androidx.media.k.a
    public Context getContext() {
        return this.f114664a;
    }
}
