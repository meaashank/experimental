package k3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g3.C4447e;
import java.io.InputStream;
import java.util.List;
import k3.m;

/* JADX INFO: loaded from: classes2.dex */
public final class s<DataT> implements m<Uri, DataT> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f214437c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f214438d = "ResourceUriLoader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f214439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m<Integer, DataT> f214440b;

    public s(Context context, m<Integer, DataT> mVar) {
        this.f214439a = context.getApplicationContext();
        this.f214440b = mVar;
    }

    public static n<Uri, AssetFileDescriptor> e(Context context) {
        return new a(context);
    }

    public static n<Uri, InputStream> f(Context context) {
        return new b(context);
    }

    @Override // k3.m
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<DataT> a(@NonNull Uri uri, int i10, int i11, @NonNull C4447e c4447e) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i10, i11, c4447e);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i10, i11, c4447e);
        }
        if (!Log.isLoggable(f214438d, 5)) {
            return null;
        }
        Log.w(f214438d, "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f214439a.getPackageName().equals(uri.getAuthority());
    }

    @Nullable
    public final m.a<DataT> g(@NonNull Uri uri, int i10, int i11, @NonNull C4447e c4447e) {
        int i12;
        try {
            i12 = Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            if (Log.isLoggable(f214438d, 5)) {
                Log.w(f214438d, "Failed to parse resource id from: " + uri, e10);
            }
        }
        if (i12 != 0) {
            return this.f214440b.a(Integer.valueOf(i12), i10, i11, c4447e);
        }
        if (Log.isLoggable(f214438d, 5)) {
            Log.w(f214438d, "Failed to parse a valid non-0 resource id from: " + uri);
            return null;
        }
        return null;
    }

    @Nullable
    public final m.a<DataT> h(@NonNull Uri uri, int i10, int i11, @NonNull C4447e c4447e) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f214439a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f214439a.getPackageName());
        if (identifier != 0) {
            return this.f214440b.a(Integer.valueOf(identifier), i10, i11, c4447e);
        }
        if (!Log.isLoggable(f214438d, 5)) {
            return null;
        }
        Log.w(f214438d, "Failed to find resource id for: " + uri);
        return null;
    }

    public static final class a implements n<Uri, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f214441a;

        public a(Context context) {
            this.f214441a = context;
        }

        @Override // k3.n
        @NonNull
        public m<Uri, AssetFileDescriptor> e(@NonNull q qVar) {
            return new s(this.f214441a, qVar.d(Integer.class, AssetFileDescriptor.class));
        }

        @Override // k3.n
        public void d() {
        }
    }

    public static final class b implements n<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f214442a;

        public b(Context context) {
            this.f214442a = context;
        }

        @Override // k3.n
        @NonNull
        public m<Uri, InputStream> e(@NonNull q qVar) {
            return new s(this.f214442a, qVar.d(Integer.class, InputStream.class));
        }

        @Override // k3.n
        public void d() {
        }
    }
}
