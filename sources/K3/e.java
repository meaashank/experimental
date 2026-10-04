package k3;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import g3.C4447e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import k3.m;
import x3.C5785e;

/* JADX INFO: loaded from: classes2.dex */
public final class e<Model, Data> implements m<Model, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f214361b = "data:image";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f214362c = ";base64";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<Data> f214363a;

    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    public e(a<Data> aVar) {
        this.f214363a = aVar;
    }

    @Override // k3.m
    public m.a<Data> a(@NonNull Model model, int i10, int i11, @NonNull C4447e c4447e) {
        return new m.a<>(new C5785e(model), new b(model.toString(), this.f214363a));
    }

    @Override // k3.m
    public boolean b(@NonNull Model model) {
        return model.toString().startsWith(f214361b);
    }

    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f214364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a<Data> f214365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Data f214366c;

        public b(String str, a<Data> aVar) {
            this.f214364a = str;
            this.f214365b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            this.f214365b.getClass();
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f214365b.b(this.f214366c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource c() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull Priority priority, @NonNull d.a<? super Data> aVar) {
            try {
                Data dataC = this.f214365b.c(this.f214364a);
                this.f214366c = dataC;
                aVar.e(dataC);
            } catch (IllegalArgumentException e10) {
                aVar.f(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    public static final class c<Model> implements n<Model, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a<InputStream> f214367a = new a();

        public class a implements a<InputStream> {
            public a() {
            }

            @Override // k3.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // k3.e.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // k3.e.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith(e.f214361b)) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // k3.n
        @NonNull
        public m<Model, InputStream> e(@NonNull q qVar) {
            return new e(this.f214367a);
        }

        @Override // k3.n
        public void d() {
        }
    }
}
