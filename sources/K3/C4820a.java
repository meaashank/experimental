package k3;

import U6.b;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import g3.C4447e;
import java.io.InputStream;
import k3.m;
import x3.C5785e;

/* JADX INFO: renamed from: k3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C4820a<Data> implements m<Uri, Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f214346c = "android_asset";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f214347d = "file:///android_asset/";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f214348e = 22;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f214349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0813a<Data> f214350b;

    /* JADX INFO: renamed from: k3.a$a, reason: collision with other inner class name */
    public interface InterfaceC0813a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    public C4820a(AssetManager assetManager, InterfaceC0813a<Data> interfaceC0813a) {
        this.f214349a = assetManager;
        this.f214350b = interfaceC0813a;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(@NonNull Uri uri, int i10, int i11, @NonNull C4447e c4447e) {
        return new m.a<>(new C5785e(uri), this.f214350b.a(this.f214349a, uri.toString().substring(f214348e)));
    }

    @Override // k3.m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return b.h.f68653a.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && f214346c.equals(uri.getPathSegments().get(0));
    }

    /* JADX INFO: renamed from: k3.a$b */
    public static class b implements n<Uri, AssetFileDescriptor>, InterfaceC0813a<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetManager f214351a;

        public b(AssetManager assetManager) {
            this.f214351a = assetManager;
        }

        @Override // k3.C4820a.InterfaceC0813a
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // k3.n
        @NonNull
        public m<Uri, AssetFileDescriptor> e(q qVar) {
            return new C4820a(this.f214351a, this);
        }

        @Override // k3.n
        public void d() {
        }
    }

    /* JADX INFO: renamed from: k3.a$c */
    public static class c implements n<Uri, InputStream>, InterfaceC0813a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetManager f214352a;

        public c(AssetManager assetManager) {
            this.f214352a = assetManager;
        }

        @Override // k3.C4820a.InterfaceC0813a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // k3.n
        @NonNull
        public m<Uri, InputStream> e(q qVar) {
            return new C4820a(this.f214352a, this);
        }

        @Override // k3.n
        public void d() {
        }
    }
}
