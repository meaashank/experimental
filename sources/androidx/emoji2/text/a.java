package androidx.emoji2.text;

import Q0.j;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.t;
import androidx.emoji2.text.c;
import e.T;
import e.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.emoji2.text.a$a, reason: collision with other inner class name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class C0297a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public static final String f113255b = "emoji2.text.DefaultEmojiConfig";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public static final String f113256c = "androidx.content.action.LOAD_EMOJI_FONT";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public static final String f113257d = "emojicompat-emoji-font";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f113258a;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public C0297a(@Nullable b bVar) {
            this.f113258a = bVar == null ? e() : bVar;
        }

        @NonNull
        public static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new c();
        }

        @Nullable
        public final c.d a(@NonNull Context context, @Nullable j jVar) {
            if (jVar == null) {
                return null;
            }
            return new e(context, jVar);
        }

        @NonNull
        public final List<List<byte[]>> b(@NonNull Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public c.d c(@NonNull Context context) {
            return a(context, h(context));
        }

        @NonNull
        public final j d(@NonNull ProviderInfo providerInfo, @NonNull PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new j(str, str2, f113257d, b(this.f113258a.b(packageManager, str2)));
        }

        public final boolean f(@Nullable ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        @Nullable
        public final ProviderInfo g(@NonNull PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f113258a.c(packageManager, new Intent(f113256c), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoA = this.f113258a.a(it.next());
                if (f(providerInfoA)) {
                    return providerInfoA;
                }
            }
            return null;
        }

        @Nullable
        @f0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public j h(@NonNull Context context) {
            PackageManager packageManager = context.getPackageManager();
            t.m(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoG = g(packageManager);
            if (providerInfoG == null) {
                return null;
            }
            try {
                return d(providerInfoG, packageManager);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf(f113255b, e10);
                return null;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class b {
        @Nullable
        public ProviderInfo a(@NonNull ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @NonNull
        public Signature[] b(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @NonNull
        public List<ResolveInfo> c(@NonNull PackageManager packageManager, @NonNull Intent intent, int i10) {
            return Collections.EMPTY_LIST;
        }
    }

    @T(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class c extends b {
        @Override // androidx.emoji2.text.a.b
        @Nullable
        public ProviderInfo a(@NonNull ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.a.b
        @NonNull
        public List<ResolveInfo> c(@NonNull PackageManager packageManager, @NonNull Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    @T(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class d extends c {
        @Override // androidx.emoji2.text.a.b
        @NonNull
        public Signature[] b(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    @Nullable
    public static e a(@NonNull Context context) {
        return (e) new C0297a(null).c(context);
    }
}
