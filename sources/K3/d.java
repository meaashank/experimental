package k3;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import g3.C4447e;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import k3.m;
import x3.C5785e;
import y3.C5812a;

/* JADX INFO: loaded from: classes2.dex */
public class d implements m<File, ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f214359a = "ByteBufferFileLoader";

    @Override // k3.m
    public /* bridge */ /* synthetic */ boolean b(@NonNull File file) {
        return true;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<ByteBuffer> a(@NonNull File file, int i10, int i11, @NonNull C4447e c4447e) {
        return new m.a<>(new C5785e(file), new a(file));
    }

    public boolean d(@NonNull File file) {
        return true;
    }

    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f214360a;

        public a(File file) {
            this.f214360a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull Priority priority, @NonNull d.a<? super ByteBuffer> aVar) {
            try {
                aVar.e(C5812a.a(this.f214360a));
            } catch (IOException e10) {
                if (Log.isLoggable(d.f214359a, 3)) {
                    Log.d(d.f214359a, "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.f(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    public static class b implements n<File, ByteBuffer> {
        @Override // k3.n
        @NonNull
        public m<File, ByteBuffer> e(@NonNull q qVar) {
            return new d();
        }

        @Override // k3.n
        public void d() {
        }
    }
}
