package Q0;

import D0.i;
import G0.U;
import G0.V;
import G0.c0;
import Q0.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.D;
import e.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final String f65748a = "font_results";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final int f65749b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final int f65750c = -2;

    public static final class a implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f65751a = "file_id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f65752b = "font_ttc_index";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f65753c = "font_variation_settings";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f65754d = "font_weight";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f65755e = "font_italic";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f65756f = "result_code";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f65757g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f65758h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f65759i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f65760j = 3;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f65766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f65768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f65769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f65770e;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public c(@NonNull Uri uri, @D(from = 0) int i10, @D(from = 1, to = 1000) int i11, boolean z10, int i12) {
            uri.getClass();
            this.f65766a = uri;
            this.f65767b = i10;
            this.f65768c = i11;
            this.f65769d = z10;
            this.f65770e = i12;
        }

        public static c a(@NonNull Uri uri, @D(from = 0) int i10, @D(from = 1, to = 1000) int i11, boolean z10, int i12) {
            return new c(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f65770e;
        }

        @D(from = 0)
        public int c() {
            return this.f65767b;
        }

        @NonNull
        public Uri d() {
            return this.f65766a;
        }

        @D(from = 1, to = 1000)
        public int e() {
            return this.f65768c;
        }

        public boolean f() {
            return this.f65769d;
        }
    }

    @Nullable
    public static Typeface a(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull c[] cVarArr) {
        return V.d(context, cancellationSignal, cVarArr, 0);
    }

    @NonNull
    public static b b(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull j jVar) throws PackageManager.NameNotFoundException {
        return f.f(context, U.a(new Object[]{jVar}), cancellationSignal);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface c(Context context, j jVar, @Nullable i.f fVar, @Nullable Handler handler, boolean z10, int i10, int i11) {
        V.a aVar = new V.a(fVar);
        return g(context, U.a(new Object[]{jVar}), i11, z10, i10, i.f.getHandler(handler), aVar);
    }

    @Deprecated
    @Nullable
    @f0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ProviderInfo d(@NonNull PackageManager packageManager, @NonNull j jVar, @Nullable Resources resources) throws PackageManager.NameNotFoundException {
        return f.g(packageManager, jVar, resources);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Map<Uri, ByteBuffer> e(Context context, c[] cVarArr, CancellationSignal cancellationSignal) {
        return c0.h(context, cVarArr, cancellationSignal);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface f(@NonNull Context context, @NonNull j jVar, int i10, boolean z10, @D(from = 0) int i11, @NonNull Handler handler, @NonNull d dVar) {
        return g(context, U.a(new Object[]{jVar}), i10, z10, i11, handler, dVar);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface g(@NonNull Context context, @NonNull List<j> list, int i10, boolean z10, @D(from = 0) int i11, @NonNull Handler handler, @NonNull d dVar) {
        Q0.a aVar = new Q0.a(dVar, new m.b(handler));
        if (!z10) {
            return k.d(context, list, i10, null, aVar);
        }
        if (list.size() <= 1) {
            return k.e(context, list.get(0), aVar, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static void h(@NonNull Context context, @NonNull j jVar, int i10, @Nullable Executor executor, @NonNull Executor executor2, @NonNull d dVar) {
        k.d(context.getApplicationContext(), U.a(new Object[]{jVar}), i10, executor, new Q0.a(dVar, executor2));
    }

    @Deprecated
    public static void i(@NonNull Context context, @NonNull j jVar, @NonNull d dVar, @NonNull Handler handler) {
        Q0.a aVar = new Q0.a(dVar);
        k.d(context.getApplicationContext(), U.a(new Object[]{jVar}), 0, new m.b(handler), aVar);
    }

    public static void j(@NonNull Context context, @NonNull List<j> list, int i10, @Nullable Executor executor, @NonNull Executor executor2, @NonNull d dVar) {
        k.d(context.getApplicationContext(), list, i10, executor, new Q0.a(dVar, executor2));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static void k() {
        k.f();
    }

    @f0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void l() {
        k.f();
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f65761c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f65762d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f65763e = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<c[]> f65765b;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public b(int i10, @Nullable c[] cVarArr) {
            this.f65764a = i10;
            this.f65765b = Collections.singletonList(cVarArr);
        }

        public static b a(int i10, @Nullable List<c[]> list) {
            return new b(i10, list);
        }

        public static b b(int i10, @Nullable c[] cVarArr) {
            return new b(i10, cVarArr);
        }

        public c[] c() {
            return this.f65765b.get(0);
        }

        @NonNull
        public List<c[]> d() {
            return this.f65765b;
        }

        public int e() {
            return this.f65764a;
        }

        public boolean f() {
            return this.f65765b.size() > 1;
        }

        public b(int i10, @NonNull List<c[]> list) {
            this.f65764a = i10;
            this.f65765b = list;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static final int f65771a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f65772b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f65773c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f65774d = -2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f65775e = -3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f65776f = -4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f65777g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f65778h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f65779i = 3;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public @interface a {
        }

        public void a(int i10) {
        }

        public void b(Typeface typeface) {
        }
    }
}
