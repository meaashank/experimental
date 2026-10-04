package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.collection.C1545m0;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.C;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import e.T;
import e.f0;
import g3.C4446d;
import g3.C4447e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f139956f = "Downsampler";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C4446d<DecodeFormat> f139957g = C4446d.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C4446d<PreferredColorSpace> f139958h = C4446d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final C4446d<DownsampleStrategy> f139959i = DownsampleStrategy.f139880h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C4446d<Boolean> f139960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C4446d<Boolean> f139961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f139962l = "image/vnd.wap.wbmp";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f139963m = "image/x-ico";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Set<String> f139964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f139965o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f139966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f139967q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f139968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f139969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f139970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<ImageHeaderParser> f139971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B f139972e = B.c();

    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.v.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v.b
        public void b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) {
        }
    }

    public interface b {
        void a();

        void b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f139960j = C4446d.g("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f139961k = C4446d.g("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f139964n = Collections.unmodifiableSet(new HashSet(Arrays.asList(f139962l, f139963m)));
        f139965o = new a();
        f139966p = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f139967q = y3.o.g(0);
    }

    public v(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f139971d = list;
        y3.m.f(displayMetrics, "Argument must not be null");
        this.f139969b = displayMetrics;
        y3.m.f(eVar, "Argument must not be null");
        this.f139968a = eVar;
        y3.m.f(bVar, "Argument must not be null");
        this.f139970c = bVar;
    }

    public static int A(double d10) {
        return (int) (d10 + 0.5d);
    }

    @TargetApi(26)
    public static void B(BitmapFactory.Options options, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.g(i10, i11, config);
    }

    public static int a(double d10) {
        int iO = o(d10);
        int i10 = (int) ((((double) iO) * d10) + 0.5d);
        return (int) (((d10 / ((double) (i10 / iO))) * ((double) i10)) + 0.5d);
    }

    public static void c(ImageHeaderParser.ImageType imageType, C c10, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, DownsampleStrategy downsampleStrategy, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) throws IOException {
        int i15;
        int i16;
        int i17;
        int i18;
        int iFloor;
        double dFloor;
        int iRound;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable(f139956f, 3)) {
                Log.d(f139956f, "Unable to determine dimensions for: " + imageType + " with target [" + i13 + "x" + i14 + "]");
                return;
            }
            return;
        }
        if (u(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float fB = downsampleStrategy.b(i15, i16, i13, i14);
        if (fB <= 0.0f) {
            StringBuilder sb2 = new StringBuilder("Cannot scale with factor: ");
            sb2.append(fB);
            sb2.append(" from: ");
            sb2.append(downsampleStrategy);
            sb2.append(", source: [");
            androidx.viewpager.widget.a.a(sb2, i11, "x", i12, "], target: [");
            sb2.append(i13);
            sb2.append("x");
            sb2.append(i14);
            sb2.append("]");
            throw new IllegalArgumentException(sb2.toString());
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingA = downsampleStrategy.a(i15, i16, i13, i14);
        if (sampleSizeRoundingA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int i19 = i15;
        int i20 = i16;
        int i21 = i19 / ((int) (((double) (fB * f10)) + 0.5d));
        int i22 = i20 / ((int) (((double) (fB * f11)) + 0.5d));
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = sampleSizeRoundingA == sampleSizeRounding ? Math.max(i21, i22) : Math.min(i21, i22);
        int i23 = Build.VERSION.SDK_INT;
        int i24 = iMax;
        if (i23 > 23 || !f139964n.contains(options.outMimeType)) {
            int iMax2 = Math.max(1, Integer.highestOneBit(i24));
            i17 = (sampleSizeRoundingA != sampleSizeRounding || ((float) iMax2) >= 1.0f / fB) ? iMax2 : iMax2 << 1;
        } else {
            i17 = 1;
        }
        options.inSampleSize = i17;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(i17, 8);
            i18 = 0;
            iFloor = (int) Math.ceil(f10 / fMin);
            iRound = (int) Math.ceil(f11 / fMin);
            int i25 = i17 / 8;
            if (i25 > 0) {
                iFloor /= i25;
                iRound /= i25;
            }
        } else {
            i18 = 0;
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f12 = i17;
                iFloor = (int) Math.floor(f10 / f12);
                dFloor = Math.floor(f11 / f12);
            } else if (imageType.isWebp()) {
                if (i23 >= 24) {
                    float f13 = i17;
                    iFloor = Math.round(f10 / f13);
                    iRound = Math.round(f11 / f13);
                } else {
                    float f14 = i17;
                    iFloor = (int) Math.floor(f10 / f14);
                    dFloor = Math.floor(f11 / f14);
                }
            } else if (i19 % i17 == 0 && i20 % i17 == 0) {
                iFloor = i19 / i17;
                iRound = i20 / i17;
            } else {
                int[] iArrP = p(c10, options, bVar, eVar);
                iFloor = iArrP[0];
                iRound = iArrP[1];
            }
            iRound = (int) dFloor;
        }
        double dB = downsampleStrategy.b(iFloor, iRound, i13, i14);
        options.inTargetDensity = a(dB);
        options.inDensity = o(dB);
        if (v(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = i18;
            options.inDensity = i18;
        }
        if (Log.isLoggable(f139956f, 2)) {
            StringBuilder sbA = C1545m0.a("Calculate scaling, source: [", i11, "x", i12, "], degreesToRotate: ");
            androidx.viewpager.widget.a.a(sbA, i10, ", target: [", i13, "x");
            androidx.viewpager.widget.a.a(sbA, i14, "], power of two scaled: [", iFloor, "x");
            sbA.append(iRound);
            sbA.append("], exact scale factor: ");
            sbA.append(fB);
            sbA.append(", power of 2 sample size: ");
            sbA.append(i17);
            sbA.append(", adjusted scale factor: ");
            sbA.append(dB);
            sbA.append(", target density: ");
            sbA.append(options.inTargetDensity);
            sbA.append(", density: ");
            sbA.append(options.inDensity);
            Log.v(f139956f, sbA.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap l(com.bumptech.glide.load.resource.bitmap.C r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.v.b r7, com.bumptech.glide.load.engine.bitmap_recycle.e r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.a()
            r5.a()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.K.i()
            r4.lock()
            android.graphics.Bitmap r5 = r5.c(r6)     // Catch: java.lang.IllegalArgumentException -> L23 java.lang.Throwable -> L45
        L1d:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.K.f139905h
            r6.unlock()
            return r5
        L23:
            r4 = move-exception
            java.io.IOException r1 = x(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L45
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L34
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L45
        L34:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L44
            r8.d(r0)     // Catch: java.io.IOException -> L43 java.lang.Throwable -> L45
            r0 = 0
            r6.inBitmap = r0     // Catch: java.io.IOException -> L43 java.lang.Throwable -> L45
            android.graphics.Bitmap r5 = l(r5, r6, r7, r8)     // Catch: java.io.IOException -> L43 java.lang.Throwable -> L45
            goto L1d
        L43:
            throw r1     // Catch: java.lang.Throwable -> L45
        L44:
            throw r1     // Catch: java.lang.Throwable -> L45
        L45:
            r5 = move-exception
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.K.f139905h
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.v.l(com.bumptech.glide.load.resource.bitmap.C, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.v$b, com.bumptech.glide.load.engine.bitmap_recycle.e):android.graphics.Bitmap");
    }

    @Nullable
    @TargetApi(19)
    public static String m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static synchronized BitmapFactory.Options n() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f139967q;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            z(optionsPoll);
        }
        return optionsPoll;
    }

    public static int o(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    public static int[] p(C c10, BitmapFactory.Options options, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        l(c10, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static String q(BitmapFactory.Options options) {
        return m(options.inBitmap);
    }

    public static boolean u(int i10) {
        return i10 == 90 || i10 == 270;
    }

    public static boolean v(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    public static void w(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        StringBuilder sb2 = new StringBuilder("Decoded ");
        sb2.append(m(bitmap));
        sb2.append(" from [");
        sb2.append(i10);
        sb2.append("x");
        androidx.compose.runtime.changelist.c.a(sb2, i11, "] ", str, " with inBitmap ");
        sb2.append(m(options.inBitmap));
        sb2.append(" for [");
        sb2.append(i12);
        sb2.append("x");
        sb2.append(i13);
        sb2.append("], sample size: ");
        sb2.append(options.inSampleSize);
        sb2.append(", density: ");
        sb2.append(options.inDensity);
        sb2.append(", target density: ");
        sb2.append(options.inTargetDensity);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        sb2.append(", duration: ");
        sb2.append(y3.i.a(j10));
        Log.v(f139956f, sb2.toString());
    }

    public static IOException x(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        StringBuilder sbA = C1545m0.a("Exception decoding bitmap, outWidth: ", i10, ", outHeight: ", i11, ", outMimeType: ");
        sbA.append(str);
        sbA.append(", inBitmap: ");
        sbA.append(m(options.inBitmap));
        return new IOException(sbA.toString(), illegalArgumentException);
    }

    public static void y(BitmapFactory.Options options) {
        z(options);
        Queue<BitmapFactory.Options> queue = f139967q;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void z(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final boolean C(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public final void b(C c10, DecodeFormat decodeFormat, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean zHasAlpha;
        if (this.f139972e.h(i10, i11, options, z10, z11)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = c10.d().hasAlpha();
        } catch (IOException e10) {
            if (Log.isLoggable(f139956f, 3)) {
                Log.d(f139956f, "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e10);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    @T(21)
    public com.bumptech.glide.load.engine.s<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C4447e c4447e) throws IOException {
        return e(new C.e(parcelFileDescriptor, this.f139971d, this.f139970c), i10, i11, c4447e, f139965o);
    }

    public final com.bumptech.glide.load.engine.s<Bitmap> e(C c10, int i10, int i11, C4447e c4447e, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.f139970c.c(65536, byte[].class);
        BitmapFactory.Options optionsN = n();
        optionsN.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) c4447e.c(f139957g);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) c4447e.c(f139958h);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c4447e.c(DownsampleStrategy.f139880h);
        boolean zBooleanValue = ((Boolean) c4447e.c(f139960j)).booleanValue();
        C4446d<Boolean> c4446d = f139961k;
        try {
            return C3096h.d(k(c10, optionsN, downsampleStrategy, decodeFormat, preferredColorSpace, c4447e.c(c4446d) != null && ((Boolean) c4447e.c(c4446d)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f139968a);
        } finally {
            y(optionsN);
            this.f139970c.put(bArr);
        }
    }

    public com.bumptech.glide.load.engine.s<Bitmap> f(InputStream inputStream, int i10, int i11, C4447e c4447e) throws IOException {
        return g(inputStream, i10, i11, c4447e, f139965o);
    }

    public com.bumptech.glide.load.engine.s<Bitmap> g(InputStream inputStream, int i10, int i11, C4447e c4447e, b bVar) throws IOException {
        return e(new C.d(inputStream, this.f139971d, this.f139970c), i10, i11, c4447e, bVar);
    }

    public com.bumptech.glide.load.engine.s<Bitmap> h(ByteBuffer byteBuffer, int i10, int i11, C4447e c4447e) throws IOException {
        return e(new C.b(byteBuffer, this.f139971d, this.f139970c), i10, i11, c4447e, f139965o);
    }

    @f0
    public void i(File file, int i10, int i11, C4447e c4447e) throws IOException {
        e(new C.c(file, this.f139971d, this.f139970c), i10, i11, c4447e, f139965o);
    }

    @f0
    public void j(byte[] bArr, int i10, int i11, C4447e c4447e) throws IOException {
        e(new C.a(bArr, this.f139971d, this.f139970c), i10, i11, c4447e, f139965o);
    }

    public final Bitmap k(C c10, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z10, int i10, int i11, boolean z11, b bVar) throws IOException {
        boolean z12;
        int i12;
        String str;
        String str2;
        int i13;
        long jB = y3.i.b();
        int[] iArrP = p(c10, options, bVar, this.f139968a);
        int i14 = iArrP[0];
        int i15 = iArrP[1];
        String str3 = options.outMimeType;
        boolean z13 = (i14 == -1 || i15 == -1) ? false : z10;
        int iB = c10.b();
        int iJ = K.j(iB);
        switch (iB) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z12 = true;
                break;
            default:
                z12 = false;
                break;
        }
        int i16 = i10;
        if (i16 != Integer.MIN_VALUE) {
            i12 = i11;
        } else if (u(iJ)) {
            i12 = i11;
            i16 = i15;
        } else {
            i12 = i11;
            i16 = i14;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = u(iJ) ? i14 : i15;
        }
        c(c10.d(), c10, bVar, this.f139968a, downsampleStrategy, iJ, i14, i15, i16, i12, options);
        int i17 = i16;
        int i18 = i12;
        b(c10, decodeFormat, z13, z12, options, i17, i18);
        int i19 = Build.VERSION.SDK_INT;
        if (i14 < 0 || i15 < 0 || !z11) {
            float f10 = v(options) ? options.inTargetDensity / options.inDensity : 1.0f;
            int i20 = options.inSampleSize;
            float f11 = i20;
            int iCeil = (int) Math.ceil(i14 / f11);
            int iCeil2 = (int) Math.ceil(i15 / f11);
            int iRound = Math.round(iCeil * f10);
            int iRound2 = Math.round(iCeil2 * f10);
            str = f139956f;
            if (Log.isLoggable(str, 2)) {
                str2 = str3;
                i13 = iB;
                StringBuilder sbA = C1545m0.a("Calculated target [", iRound, "x", iRound2, "] for source [");
                androidx.viewpager.widget.a.a(sbA, i14, "x", i15, "], sampleSize: ");
                sbA.append(i20);
                sbA.append(", targetDensity: ");
                sbA.append(options.inTargetDensity);
                sbA.append(", density: ");
                sbA.append(options.inDensity);
                sbA.append(", density multiplier: ");
                sbA.append(f10);
                Log.v(str, sbA.toString());
            } else {
                str2 = str3;
                i13 = iB;
            }
            i17 = iRound;
            i18 = iRound2;
        } else {
            i13 = iB;
            str2 = str3;
            str = f139956f;
        }
        if (i17 > 0 && i18 > 0) {
            B(options, this.f139968a, i17, i18);
        }
        if (preferredColorSpace != null) {
            if (i19 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i19 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapL = l(c10, options, bVar, this.f139968a);
        bVar.b(this.f139968a, bitmapL);
        if (Log.isLoggable(str, 2)) {
            w(i14, i15, str2, options, bitmapL, i10, i11, jB);
        }
        if (bitmapL == null) {
            return null;
        }
        bitmapL.setDensity(this.f139969b.densityDpi);
        Bitmap bitmapO = K.o(this.f139968a, bitmapL, i13);
        if (!bitmapL.equals(bitmapO)) {
            this.f139968a.d(bitmapL);
        }
        return bitmapO;
    }

    public boolean r(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean s(InputStream inputStream) {
        return true;
    }

    public boolean t(ByteBuffer byteBuffer) {
        return true;
    }
}
