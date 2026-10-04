package k3;

import U6.b;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import g3.C4447e;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k3.m;
import x3.C5785e;

/* JADX INFO: loaded from: classes2.dex */
public class w<Data> implements m<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f214449b = Collections.unmodifiableSet(new HashSet(Arrays.asList(b.h.f68653a, "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<Data> f214450a;

    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    public w(c<Data> cVar) {
        this.f214450a = cVar;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(@NonNull Uri uri, int i10, int i11, @NonNull C4447e c4447e) {
        return new m.a<>(new C5785e(uri), this.f214450a.a(uri));
    }

    @Override // k3.m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return f214449b.contains(uri.getScheme());
    }

    public static final class a implements n<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f214451a;

        public a(ContentResolver contentResolver) {
            this.f214451a = contentResolver;
        }

        @Override // k3.w.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f214451a, uri);
        }

        @Override // k3.n
        public m<Uri, AssetFileDescriptor> e(q qVar) {
            return new w(this);
        }

        @Override // k3.n
        public void d() {
        }
    }

    public static class b implements n<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f214452a;

        public b(ContentResolver contentResolver) {
            this.f214452a = contentResolver;
        }

        @Override // k3.w.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f214452a, uri);
        }

        @Override // k3.n
        @NonNull
        public m<Uri, ParcelFileDescriptor> e(q qVar) {
            return new w(this);
        }

        @Override // k3.n
        public void d() {
        }
    }

    public static class d implements n<Uri, InputStream>, c<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f214453a;

        public d(ContentResolver contentResolver) {
            this.f214453a = contentResolver;
        }

        @Override // k3.w.c
        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f214453a, uri);
        }

        @Override // k3.n
        @NonNull
        public m<Uri, InputStream> e(q qVar) {
            return new w(this);
        }

        @Override // k3.n
        public void d() {
        }
    }
}
