package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.Q;
import e.T;
import e.f0;
import g3.C4446d;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VideoDecoder<T> implements InterfaceC4448f<T, Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f139918d = "VideoDecoder";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f139919e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @f0
    public static final int f139920f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C4446d<Long> f139921g = new C4446d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C4446d<Integer> f139922h = new C4446d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f139923i = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List<String> f139924j = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f139925k = "video/webm";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<T> f139926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f139927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f139928c;

    public static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public class a implements C4446d.b<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f139929a = ByteBuffer.allocate(8);

        @Override // g3.C4446d.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull byte[] bArr, @NonNull Long l10, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f139929a) {
                this.f139929a.position(0);
                messageDigest.update(this.f139929a.putLong(l10.longValue()).array());
            }
        }
    }

    public class b implements C4446d.b<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f139930a = ByteBuffer.allocate(4);

        @Override // g3.C4446d.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f139930a) {
                this.f139930a.position(0);
                messageDigest.update(this.f139930a.putInt(num.intValue()).array());
            }
        }
    }

    @T(16)
    public static final class c implements e<AssetFileDescriptor> {
        public c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public c(a aVar) {
        }
    }

    @T(23)
    public static final class d implements e<ByteBuffer> {

        public class a extends MediaDataSource {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ByteBuffer f139931a;

            public a(ByteBuffer byteBuffer) {
                this.f139931a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f139931a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f139931a.limit()) {
                    return -1;
                }
                this.f139931a.position((int) j10);
                int iMin = Math.min(i11, this.f139931a.remaining());
                this.f139931a.get(bArr, i10, iMin);
                return iMin;
            }
        }

        public final MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new a(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    @f0
    public interface e<T> {
        @T(16)
        void a(MediaExtractor mediaExtractor, T t10) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    @f0
    public static class f {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    public static final class g implements e<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        @T(16)
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, e<T> eVar2) {
        this(eVar, eVar2, f139923i);
    }

    @T(16)
    public static InterfaceC4448f<AssetFileDescriptor, Bitmap> c(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new VideoDecoder(eVar, new c());
    }

    @T(api = 23)
    public static InterfaceC4448f<ByteBuffer, Bitmap> d(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new VideoDecoder(eVar, new d());
    }

    @TargetApi(30)
    public static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (j()) {
            try {
                if (i(mediaMetadataRetriever)) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) != 180) {
                        return bitmap;
                    }
                    if (Log.isLoggable(f139918d, 3)) {
                        Log.d(f139918d, "Applying HDR 180 deg thumbnail correction");
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (NumberFormatException unused) {
                if (!Log.isLoggable(f139918d, 3)) {
                    return bitmap;
                }
                Log.d(f139918d, "Exception trying to extract HDR transfer function or rotation");
                return bitmap;
            }
        }
        return bitmap;
    }

    public static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    @Nullable
    @TargetApi(27)
    public static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, DownsampleStrategy downsampleStrategy) {
        try {
            int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i15 == 90 || i15 == 270) {
                i14 = i13;
                i13 = i14;
            }
            float fB = downsampleStrategy.b(i13, i14, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i13 * fB), Math.round(fB * i14));
        } catch (Throwable th) {
            if (!Log.isLoggable(f139918d, 3)) {
                return null;
            }
            Log.d(f139918d, "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    @T(30)
    public static boolean i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i10 = Integer.parseInt(strExtractMetadata);
        return (i10 == 7 || i10 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    @f0
    public static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    public static boolean k() {
        Iterator<String> it = f139924j.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static InterfaceC4448f<ParcelFileDescriptor, Bitmap> m(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new VideoDecoder(eVar, new g());
    }

    @Override // g3.InterfaceC4448f
    public com.bumptech.glide.load.engine.s<Bitmap> a(@NonNull T t10, int i10, int i11, @NonNull C4447e c4447e) throws Exception {
        long jLongValue = ((Long) c4447e.c(f139921g)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(Q.a("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue));
        }
        Integer num = (Integer) c4447e.c(f139922h);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c4447e.c(DownsampleStrategy.f139880h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f139879g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f139928c.a();
        try {
            this.f139926a.b(mediaMetadataRetrieverA, t10);
            try {
                Bitmap bitmapF = f(t10, mediaMetadataRetrieverA, jLongValue, num.intValue(), i10, i11, downsampleStrategy2);
                if (Build.VERSION.SDK_INT >= 29) {
                    Q0.g.a(mediaMetadataRetrieverA);
                } else {
                    mediaMetadataRetrieverA.release();
                }
                return C3096h.d(bitmapF, this.f139927b);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    Q0.g.a(mediaMetadataRetrieverA);
                    throw th2;
                }
                mediaMetadataRetrieverA.release();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // g3.InterfaceC4448f
    public boolean b(@NonNull T t10, @NonNull C4447e c4447e) {
        return true;
    }

    @Nullable
    public final Bitmap f(@NonNull T t10, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, DownsampleStrategy downsampleStrategy) {
        if (l(t10, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapH = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f139878f) ? null : h(mediaMetadataRetriever, j10, i10, i11, i12, downsampleStrategy);
        if (bitmapH == null) {
            bitmapH = mediaMetadataRetriever.getFrameAtTime(j10, i10);
        }
        Bitmap bitmapE = e(mediaMetadataRetriever, bitmapH);
        if (bitmapE != null) {
            return bitmapE;
        }
        throw new VideoDecoderException();
    }

    public final boolean l(@NonNull T t10, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            MediaExtractor mediaExtractor = null;
            try {
                if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    MediaExtractor mediaExtractor2 = new MediaExtractor();
                    try {
                        this.f139926a.a(mediaExtractor2, t10);
                        int trackCount = mediaExtractor2.getTrackCount();
                        for (int i10 = 0; i10 < trackCount; i10++) {
                            if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i10).getString("mime"))) {
                                mediaExtractor2.release();
                                return true;
                            }
                        }
                        mediaExtractor2.release();
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        mediaExtractor = mediaExtractor2;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (Log.isLoggable(f139918d, 3)) {
                    Log.d(f139918d, "Exception trying to extract track info for a webm video on CrOS.", th);
                }
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    @f0
    public VideoDecoder(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, e<T> eVar2, f fVar) {
        this.f139927b = eVar;
        this.f139926a = eVar2;
        this.f139928c = fVar;
    }
}
