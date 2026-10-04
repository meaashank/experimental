package k3;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import g3.C4447e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import k3.m;
import x3.C5785e;

/* JADX INFO: loaded from: classes2.dex */
public class g<Data> implements m<File, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f214379b = "FileLoader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<Data> f214380a;

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            @Override // k3.g.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // k3.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // k3.g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    public static class e extends a<InputStream> {

        public class a implements d<InputStream> {
            @Override // k3.g.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // k3.g.d
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // k3.g.d
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d<Data> dVar) {
        this.f214380a = dVar;
    }

    @Override // k3.m
    public /* bridge */ /* synthetic */ boolean b(@NonNull File file) {
        return true;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(@NonNull File file, int i10, int i11, @NonNull C4447e c4447e) {
        return new m.a<>(new C5785e(file), new c(file, this.f214380a));
    }

    public boolean d(@NonNull File file) {
        return true;
    }

    public static class a<Data> implements n<File, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<Data> f214381a;

        public a(d<Data> dVar) {
            this.f214381a = dVar;
        }

        @Override // k3.n
        @NonNull
        public final m<File, Data> e(@NonNull q qVar) {
            return new g(this.f214381a);
        }

        @Override // k3.n
        public final void d() {
        }
    }

    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f214382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d<Data> f214383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Data f214384c;

        public c(File file, d<Data> dVar) {
            this.f214382a = file;
            this.f214383b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.f214383b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f214384c;
            if (data != null) {
                try {
                    this.f214383b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource c() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull Priority priority, @NonNull d.a<? super Data> aVar) {
            try {
                Data dataC = this.f214383b.c(this.f214382a);
                this.f214384c = dataC;
                aVar.e(dataC);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable(g.f214379b, 3)) {
                    Log.d(g.f214379b, "Failed to open file", e10);
                }
                aVar.f(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
