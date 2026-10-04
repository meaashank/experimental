package k3;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import g3.C4447e;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k3.m;
import x3.C5785e;

/* JADX INFO: renamed from: k3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C4821b<Data> implements m<byte[], Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0815b<Data> f214353a;

    /* JADX INFO: renamed from: k3.b$b, reason: collision with other inner class name */
    public interface InterfaceC0815b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public C4821b(InterfaceC0815b<Data> interfaceC0815b) {
        this.f214353a = interfaceC0815b;
    }

    @Override // k3.m
    public /* bridge */ /* synthetic */ boolean b(@NonNull byte[] bArr) {
        return true;
    }

    @Override // k3.m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(@NonNull byte[] bArr, int i10, int i11, @NonNull C4447e c4447e) {
        return new m.a<>(new C5785e(bArr), new c(bArr, this.f214353a));
    }

    public boolean d(@NonNull byte[] bArr) {
        return true;
    }

    /* JADX INFO: renamed from: k3.b$a */
    public static class a implements n<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: k3.b$a$a, reason: collision with other inner class name */
        public class C0814a implements InterfaceC0815b<ByteBuffer> {
            public C0814a() {
            }

            @Override // k3.C4821b.InterfaceC0815b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // k3.C4821b.InterfaceC0815b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // k3.n
        @NonNull
        public m<byte[], ByteBuffer> e(@NonNull q qVar) {
            return new C4821b(new C0814a());
        }

        @Override // k3.n
        public void d() {
        }
    }

    /* JADX INFO: renamed from: k3.b$c */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f214355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC0815b<Data> f214356b;

        public c(byte[] bArr, InterfaceC0815b<Data> interfaceC0815b) {
            this.f214355a = bArr;
            this.f214356b = interfaceC0815b;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.f214356b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull Priority priority, @NonNull d.a<? super Data> aVar) {
            aVar.e(this.f214356b.b(this.f214355a));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    /* JADX INFO: renamed from: k3.b$d */
    public static class d implements n<byte[], InputStream> {

        /* JADX INFO: renamed from: k3.b$d$a */
        public class a implements InterfaceC0815b<InputStream> {
            public a() {
            }

            @Override // k3.C4821b.InterfaceC0815b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // k3.C4821b.InterfaceC0815b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // k3.n
        @NonNull
        public m<byte[], InputStream> e(@NonNull q qVar) {
            return new C4821b(new a());
        }

        @Override // k3.n
        public void d() {
        }
    }
}
