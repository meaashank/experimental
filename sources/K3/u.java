package k3;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g3.C4447e;
import java.io.File;
import java.io.InputStream;
import k3.m;

/* JADX INFO: loaded from: classes2.dex */
public class u<Data> implements m<String, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m<Uri, Data> f214445a;

    public u(m<Uri, Data> mVar) {
        this.f214445a = mVar;
    }

    @Nullable
    public static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? f(str) : uri;
    }

    public static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // k3.m
    public /* bridge */ /* synthetic */ boolean b(@NonNull String str) {
        return true;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(@NonNull String str, int i10, int i11, @NonNull C4447e c4447e) {
        Uri uriE = e(str);
        if (uriE == null || !this.f214445a.b(uriE)) {
            return null;
        }
        return this.f214445a.a(uriE, i10, i11, c4447e);
    }

    public boolean d(@NonNull String str) {
        return true;
    }

    public static final class a implements n<String, AssetFileDescriptor> {
        @Override // k3.n
        public m<String, AssetFileDescriptor> e(@NonNull q qVar) {
            return new u(qVar.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // k3.n
        public void d() {
        }
    }

    public static class b implements n<String, ParcelFileDescriptor> {
        @Override // k3.n
        @NonNull
        public m<String, ParcelFileDescriptor> e(@NonNull q qVar) {
            return new u(qVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // k3.n
        public void d() {
        }
    }

    public static class c implements n<String, InputStream> {
        @Override // k3.n
        @NonNull
        public m<String, InputStream> e(@NonNull q qVar) {
            return new u(qVar.d(Uri.class, InputStream.class));
        }

        @Override // k3.n
        public void d() {
        }
    }
}
