package r3;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.s;
import g3.C4447e;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: r3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5525a implements e<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f227159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f227160b;

    public C5525a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // r3.e
    @Nullable
    public s<byte[]> a(@NonNull s<Bitmap> sVar, @NonNull C4447e c4447e) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sVar.get().compress(this.f227159a, this.f227160b, byteArrayOutputStream);
        sVar.a();
        return new n3.b(byteArrayOutputStream.toByteArray());
    }

    public C5525a(@NonNull Bitmap.CompressFormat compressFormat, int i10) {
        this.f227159a = compressFormat;
        this.f227160b = i10;
    }
}
