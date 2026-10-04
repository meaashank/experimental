package Sa;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.prism.commons.file.FileType;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.file.exchange.ExchangeFile;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class b implements com.bumptech.glide.load.data.d<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f68150b = l0.b(b.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeFile f68151a;

    public b(ExchangeFile exchangeFile) {
        this.f68151a = exchangeFile;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<Object> a() {
        FileType type = this.f68151a.getType();
        if (type == FileType.IMAGE) {
            return InputStream.class;
        }
        if (type == FileType.VIDEO) {
            return Bitmap.class;
        }
        FileType fileType = FileType.AUDIO;
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public DataSource c() {
        return DataSource.LOCAL;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[SYNTHETIC] */
    @Override // com.bumptech.glide.load.data.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(@androidx.annotation.NonNull com.bumptech.glide.Priority r11, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super java.lang.Object> r12) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r11 = "retrieve thumbnail error: "
            com.prism.lib.pfs.file.exchange.ExchangeFile r0 = r10.f68151a
            com.prism.commons.file.FileType r1 = r0.getType()
            com.prism.commons.file.FileType r0 = com.prism.commons.file.FileType.IMAGE
            r2 = 0
            if (r1 != r0) goto L2f
            com.prism.lib.pfs.file.exchange.ExchangeFile r11 = r10.f68151a     // Catch: java.io.IOException -> L15
            java.io.InputStream r2 = r11.getInputStream()     // Catch: java.io.IOException -> L15
            goto L7f
        L15:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = Sa.b.f68150b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "load image error: "
            r3.<init>(r4)
            java.lang.String r4 = r11.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r0, r3, r11)
            goto L7f
        L2f:
            com.prism.commons.file.FileType r0 = com.prism.commons.file.FileType.VIDEO
            if (r1 == r0) goto L37
            com.prism.commons.file.FileType r0 = com.prism.commons.file.FileType.AUDIO
            if (r1 != r0) goto L7f
        L37:
            com.prism.lib.pfs.file.exchange.ExchangeFile r0 = r10.f68151a     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L65
            com.prism.lib.pfs.file.a r3 = r0.getFileDescriptorProxy()     // Catch: java.lang.Throwable -> L62 java.io.IOException -> L65
            java.io.FileDescriptor r5 = r3.a()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L60
            long r6 = r3.getOffset()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L60
            com.prism.lib.pfs.file.exchange.ExchangeFile r0 = r10.f68151a     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L60
            long r8 = r0.length()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L60
            long r8 = r8 - r6
            android.media.MediaMetadataRetriever r4 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L60
            r4.<init>()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L60
            r4.setDataSource(r5, r6, r8)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L60
            android.graphics.Bitmap r2 = r4.getFrameAtTime()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L60
        L58:
            r3.close()
            goto L7f
        L5c:
            r0 = move-exception
            r11 = r0
            r2 = r3
            goto L9c
        L60:
            r0 = move-exception
            goto L67
        L62:
            r0 = move-exception
            r11 = r0
            goto L9c
        L65:
            r0 = move-exception
            r3 = r2
        L67:
            java.lang.String r4 = Sa.b.f68150b     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r11 = r0.getMessage()     // Catch: java.lang.Throwable -> L5c
            r5.append(r11)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r11 = r5.toString()     // Catch: java.lang.Throwable -> L5c
            android.util.Log.e(r4, r11, r0)     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L7f
            goto L58
        L7f:
            if (r2 != 0) goto L85
            android.graphics.Bitmap r2 = com.prism.lib.pfs.PrivateFileSystem.getIcon(r1)
        L85:
            java.lang.String r11 = Sa.b.f68150b
            java.lang.Class r0 = r10.a()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "getDataClass: "
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.d(r11, r0)
            r12.e(r2)
            return
        L9c:
            if (r2 == 0) goto La1
            r2.close()
        La1:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Sa.b.d(com.bumptech.glide.Priority, com.bumptech.glide.load.data.d$a):void");
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
