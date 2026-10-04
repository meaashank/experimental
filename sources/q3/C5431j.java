package q3;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.s;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: q3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5431j implements InterfaceC4448f<InputStream, C5424c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f226799d = "StreamGifDecoder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f226800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4448f<ByteBuffer, C5424c> f226801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f226802c;

    public C5431j(List<ImageHeaderParser> list, InterfaceC4448f<ByteBuffer, C5424c> interfaceC4448f, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f226800a = list;
        this.f226801b = interfaceC4448f;
        this.f226802c = bVar;
    }

    public static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e10) {
            if (!Log.isLoggable(f226799d, 5)) {
                return null;
            }
            Log.w(f226799d, "Error reading data from stream", e10);
            return null;
        }
    }

    @Override // g3.InterfaceC4448f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<C5424c> a(@NonNull InputStream inputStream, int i10, int i11, @NonNull C4447e c4447e) throws IOException {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f226801b.a(ByteBuffer.wrap(bArrE), i10, i11, c4447e);
    }

    @Override // g3.InterfaceC4448f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull InputStream inputStream, @NonNull C4447e c4447e) throws IOException {
        return !((Boolean) c4447e.c(C5430i.f226798b)).booleanValue() && com.bumptech.glide.load.a.f(this.f226800a, inputStream, this.f226802c) == ImageHeaderParser.ImageType.GIF;
    }
}
