package n3;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.s;
import y3.m;

/* JADX INFO: loaded from: classes2.dex */
public class b implements s<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f221215a;

    public b(byte[] bArr) {
        m.f(bArr, "Argument must not be null");
        this.f221215a = bArr;
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    public Class<byte[]> b() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f221215a;
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return this.f221215a.length;
    }

    @Override // com.bumptech.glide.load.engine.s
    public void a() {
    }
}
