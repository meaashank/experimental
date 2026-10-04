package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import e.T;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import y3.C5812a;

/* JADX INFO: loaded from: classes2.dex */
public interface C {

    public static final class a implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f139827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f139828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.bitmap_recycle.b f139829c;

        public a(byte[] bArr, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f139827a = bArr;
            this.f139828b = list;
            this.f139829c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public int b() throws IOException {
            return com.bumptech.glide.load.a.c(this.f139828b, ByteBuffer.wrap(this.f139827a), this.f139829c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        @Nullable
        public Bitmap c(BitmapFactory.Options options) {
            byte[] bArr = this.f139827a;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.g(this.f139828b, ByteBuffer.wrap(this.f139827a));
        }
    }

    public static final class b implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f139830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f139831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.bitmap_recycle.b f139832c;

        public b(ByteBuffer byteBuffer, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f139830a = byteBuffer;
            this.f139831b = list;
            this.f139832c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public int b() throws IOException {
            return com.bumptech.glide.load.a.c(this.f139831b, C5812a.d(this.f139830a), this.f139832c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        @Nullable
        public Bitmap c(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.g(this.f139831b, C5812a.d(this.f139830a));
        }

        public final InputStream e() {
            return new C5812a.C0909a(C5812a.d(this.f139830a));
        }
    }

    public static final class c implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f139833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f139834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.bitmap_recycle.b f139835c;

        public c(File file, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f139833a = file;
            this.f139834b = list;
            this.f139835c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public int b() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            Throwable th;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(this.f139833a), this.f139835c);
                try {
                    int iB = com.bumptech.glide.load.a.b(this.f139834b, recyclableBufferedInputStream, this.f139835c);
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    return iB;
                } catch (Throwable th2) {
                    th = th2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                recyclableBufferedInputStream = null;
                th = th3;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        @Nullable
        public Bitmap c(BitmapFactory.Options options) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.f139833a), this.f139835c);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(recyclableBufferedInputStream2, null, options);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return bitmapDecodeStream;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public ImageHeaderParser.ImageType d() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            Throwable th;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(this.f139833a), this.f139835c);
                try {
                    ImageHeaderParser.ImageType imageTypeF = com.bumptech.glide.load.a.f(this.f139834b, recyclableBufferedInputStream, this.f139835c);
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    return imageTypeF;
                } catch (Throwable th2) {
                    th = th2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                recyclableBufferedInputStream = null;
                th = th3;
            }
        }
    }

    public static final class d implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.data.k f139836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.bitmap_recycle.b f139837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<ImageHeaderParser> f139838c;

        public d(InputStream inputStream, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            y3.m.f(bVar, "Argument must not be null");
            this.f139837b = bVar;
            y3.m.f(list, "Argument must not be null");
            this.f139838c = list;
            this.f139836a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public void a() {
            this.f139836a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public int b() throws IOException {
            return com.bumptech.glide.load.a.b(this.f139838c, this.f139836a.a(), this.f139837b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        @Nullable
        public Bitmap c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f139836a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.f(this.f139838c, this.f139836a.a(), this.f139837b);
        }
    }

    @T(21)
    public static final class e implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.bitmap_recycle.b f139839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f139840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f139841c;

        public e(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            y3.m.f(bVar, "Argument must not be null");
            this.f139839a = bVar;
            y3.m.f(list, "Argument must not be null");
            this.f139840b = list;
            this.f139841c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public int b() throws IOException {
            return com.bumptech.glide.load.a.a(this.f139840b, this.f139841c, this.f139839a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        @Nullable
        public Bitmap c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f139841c.d().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.e(this.f139840b, this.f139841c, this.f139839a);
        }
    }

    void a();

    int b() throws IOException;

    @Nullable
    Bitmap c(BitmapFactory.Options options) throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}
