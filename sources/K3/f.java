package k3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import g3.C4447e;
import java.io.IOException;
import java.io.InputStream;
import k3.m;
import x3.C5785e;

/* JADX INFO: loaded from: classes2.dex */
public final class f<DataT> implements m<Integer, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f214369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e<DataT> f214370b;

    public interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat) throws IOException;

        DataT c(@Nullable Resources.Theme theme, Resources resources, int i10);
    }

    public f(Context context, e<DataT> eVar) {
        this.f214369a = context.getApplicationContext();
        this.f214370b = eVar;
    }

    public static n<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static n<Integer, Drawable> e(Context context) {
        return new b(context);
    }

    public static n<Integer, InputStream> g(Context context) {
        return new c(context);
    }

    @Override // k3.m
    public /* bridge */ /* synthetic */ boolean b(@NonNull Integer num) {
        return true;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public m.a<DataT> a(@NonNull Integer num, int i10, int i11, @NonNull C4447e c4447e) {
        Resources.Theme theme = (Resources.Theme) c4447e.c(o3.m.f223215b);
        return new m.a<>(new C5785e(num), new d(theme, theme != null ? theme.getResources() : this.f214369a.getResources(), this.f214370b, num.intValue()));
    }

    public boolean f(@NonNull Integer num) {
        return true;
    }

    public static final class a implements n<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f214371a;

        public a(Context context) {
            this.f214371a = context;
        }

        @Override // k3.f.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // k3.f.e
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // k3.f.e
        public AssetFileDescriptor c(@Nullable Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }

        @Override // k3.n
        @NonNull
        public m<Integer, AssetFileDescriptor> e(@NonNull q qVar) {
            return new f(this.f214371a, this);
        }

        public void f(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        public AssetFileDescriptor g(@Nullable Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }

        @Override // k3.n
        public void d() {
        }
    }

    public static final class b implements n<Integer, Drawable>, e<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f214372a;

        public b(Context context) {
            this.f214372a = context;
        }

        @Override // k3.f.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // k3.f.e
        public /* bridge */ /* synthetic */ void b(Drawable drawable) throws IOException {
        }

        @Override // k3.f.e
        public Drawable c(@Nullable Resources.Theme theme, Resources resources, int i10) {
            Context context = this.f214372a;
            return o3.i.c(context, context, i10, theme);
        }

        @Override // k3.n
        @NonNull
        public m<Integer, Drawable> e(@NonNull q qVar) {
            return new f(this.f214372a, this);
        }

        public Drawable g(@Nullable Resources.Theme theme, Resources resources, int i10) {
            Context context = this.f214372a;
            return o3.i.c(context, context, i10, theme);
        }

        @Override // k3.n
        public void d() {
        }

        public void f(Drawable drawable) throws IOException {
        }
    }

    public static final class c implements n<Integer, InputStream>, e<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f214373a;

        public c(Context context) {
            this.f214373a = context;
        }

        @Override // k3.f.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // k3.f.e
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // k3.f.e
        public InputStream c(@Nullable Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }

        @Override // k3.n
        @NonNull
        public m<Integer, InputStream> e(@NonNull q qVar) {
            return new f(this.f214373a, this);
        }

        public void f(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        public InputStream g(@Nullable Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }

        @Override // k3.n
        public void d() {
        }
    }

    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Resources.Theme f214374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resources f214375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e<DataT> f214376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f214377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public DataT f214378e;

        public d(@Nullable Resources.Theme theme, Resources resources, e<DataT> eVar, int i10) {
            this.f214374a = theme;
            this.f214375b = resources;
            this.f214376c = eVar;
            this.f214377d = i10;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<DataT> a() {
            return this.f214376c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            DataT datat = this.f214378e;
            if (datat != null) {
                try {
                    this.f214376c.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource c() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull Priority priority, @NonNull d.a<? super DataT> aVar) {
            try {
                DataT datatC = this.f214376c.c(this.f214374a, this.f214375b, this.f214377d);
                this.f214378e = datatC;
                aVar.e(datatC);
            } catch (Resources.NotFoundException e10) {
                aVar.f(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
