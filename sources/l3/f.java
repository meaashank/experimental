package l3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.prism.gaia.download.j;
import e.T;
import g3.C4447e;
import h3.C4488b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import k3.m;
import k3.n;
import k3.q;
import x3.C5785e;

/* JADX INFO: loaded from: classes2.dex */
@T(29)
public final class f<DataT> implements m<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f220926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m<File, DataT> f220927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m<Uri, DataT> f220928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<DataT> f220929d;

    @T(29)
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @T(29)
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String[] f220932k = {j.b.f164768t};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f220933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m<File, DataT> f220934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m<Uri, DataT> f220935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f220936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f220937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f220938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final C4447e f220939g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Class<DataT> f220940h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f220941i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public volatile com.bumptech.glide.load.data.d<DataT> f220942j;

        public d(Context context, m<File, DataT> mVar, m<Uri, DataT> mVar2, Uri uri, int i10, int i11, C4447e c4447e, Class<DataT> cls) {
            this.f220933a = context.getApplicationContext();
            this.f220934b = mVar;
            this.f220935c = mVar2;
            this.f220936d = uri;
            this.f220937e = i10;
            this.f220938f = i11;
            this.f220939g = c4447e;
            this.f220940h = cls;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<DataT> a() {
            return this.f220940h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f220942j;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f220941i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f220942j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull Priority priority, @NonNull d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> dVarF = f();
                if (dVarF == null) {
                    aVar.f(new IllegalArgumentException("Failed to build fetcher for: " + this.f220936d));
                } else {
                    this.f220942j = dVarF;
                    if (this.f220941i) {
                        cancel();
                    } else {
                        dVarF.d(priority, aVar);
                    }
                }
            } catch (FileNotFoundException e10) {
                aVar.f(e10);
            }
        }

        @Nullable
        public final m.a<DataT> e() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f220934b.a(h(this.f220936d), this.f220937e, this.f220938f, this.f220939g);
            }
            if (C4488b.a(this.f220936d)) {
                return this.f220935c.a(this.f220936d, this.f220937e, this.f220938f, this.f220939g);
            }
            return this.f220935c.a(g() ? MediaStore.setRequireOriginal(this.f220936d) : this.f220936d, this.f220937e, this.f220938f, this.f220939g);
        }

        @Nullable
        public final com.bumptech.glide.load.data.d<DataT> f() throws FileNotFoundException {
            m.a<DataT> aVarE = e();
            if (aVarE != null) {
                return aVarE.f214407c;
            }
            return null;
        }

        public final boolean g() {
            return this.f220933a.checkSelfPermission(U6.b.f68586w) == 0;
        }

        @NonNull
        public final File h(Uri uri) throws FileNotFoundException {
            try {
                Cursor cursorQuery = this.f220933a.getContentResolver().query(uri, f220932k, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(j.b.f164768t));
                if (TextUtils.isEmpty(string)) {
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                File file = new File(string);
                cursorQuery.close();
                return file;
            } finally {
            }
        }
    }

    public f(Context context, m<File, DataT> mVar, m<Uri, DataT> mVar2, Class<DataT> cls) {
        this.f220926a = context.getApplicationContext();
        this.f220927b = mVar;
        this.f220928c = mVar2;
        this.f220929d = cls;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<DataT> a(@NonNull Uri uri, int i10, int i11, @NonNull C4447e c4447e) {
        return new m.a<>(new C5785e(uri), new d(this.f220926a, this.f220927b, this.f220928c, uri, i10, i11, c4447e, this.f220929d));
    }

    @Override // k3.m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C4488b.c(uri);
    }

    public static abstract class a<DataT> implements n<Uri, DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f220930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<DataT> f220931b;

        public a(Context context, Class<DataT> cls) {
            this.f220930a = context;
            this.f220931b = cls;
        }

        @Override // k3.n
        @NonNull
        public final m<Uri, DataT> e(@NonNull q qVar) {
            return new f(this.f220930a, qVar.d(File.class, this.f220931b), qVar.d(Uri.class, this.f220931b), this.f220931b);
        }

        @Override // k3.n
        public final void d() {
        }
    }
}
