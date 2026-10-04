package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.C1545m0;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import t1.C5596a;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f139843A = 1635150182;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f139844B = 1635150195;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f139845b = "DfltImageHeaderParser";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f139846c = 4671814;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f139847d = -1991225785;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f139848e = 65496;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f139849f = 19789;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f139850g = 18761;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f139853j = 218;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f139854k = 217;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f139855l = 255;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f139856m = 225;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f139857n = 274;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f139859p = 1380533830;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f139860q = 1464156752;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f139861r = 1448097792;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f139862s = -256;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f139863t = 255;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f139864u = 88;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f139865v = 76;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f139866w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f139867x = 16;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f139868y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f139869z = 1718909296;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f139851h = "Exif\u0000\u0000";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f139852i = f139851h.getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f139858o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        int b(byte[] bArr, int i10) throws IOException;

        short c() throws IOException;

        long skip(long j10) throws IOException;
    }

    public static final class a implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f139870a;

        public a(ByteBuffer byteBuffer) {
            this.f139870a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() throws Reader.EndOfFileException {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i10) {
            int iMin = Math.min(i10, this.f139870a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f139870a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() throws Reader.EndOfFileException {
            if (this.f139870a.remaining() >= 1) {
                return (short) (this.f139870a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j10) {
            int iMin = (int) Math.min(this.f139870a.remaining(), j10);
            ByteBuffer byteBuffer = this.f139870a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f139871a;

        public b(byte[] bArr, int i10) {
            this.f139871a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public short a(int i10) {
            if (c(i10, 2)) {
                return this.f139871a.getShort(i10);
            }
            return (short) -1;
        }

        public int b(int i10) {
            if (c(i10, 4)) {
                return this.f139871a.getInt(i10);
            }
            return -1;
        }

        public final boolean c(int i10, int i11) {
            return this.f139871a.remaining() - i10 >= i11;
        }

        public int d() {
            return this.f139871a.remaining();
        }

        public void e(ByteOrder byteOrder) {
            this.f139871a.order(byteOrder);
        }
    }

    public static final class c implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f139872a;

        public c(InputStream inputStream) {
            this.f139872a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() throws IOException {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i10) throws IOException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f139872a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() throws IOException {
            int i10 = this.f139872a.read();
            if (i10 != -1) {
                return (short) i10;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long jSkip = this.f139872a.skip(j11);
                if (jSkip <= 0) {
                    if (this.f139872a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j11 -= jSkip;
            }
            return j10 - j11;
        }
    }

    public static int e(int i10, int i11) {
        return (i11 * 12) + i10 + 2;
    }

    public static boolean h(int i10) {
        return (i10 & f139848e) == 65496 || i10 == 19789 || i10 == 18761;
    }

    public static int k(b bVar) {
        ByteOrder byteOrder;
        short sA = bVar.a(6);
        if (sA != 18761) {
            if (sA != 19789 && Log.isLoggable(f139845b, 3)) {
                C5596a.a("Unknown endianness = ", sA, f139845b);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int iB = bVar.b(10) + 6;
        short sA2 = bVar.a(iB);
        for (int i10 = 0; i10 < sA2; i10++) {
            int iE = e(iB, i10);
            short sA3 = bVar.a(iE);
            if (sA3 == 274) {
                short sA4 = bVar.a(iE + 2);
                if (sA4 >= 1 && sA4 <= 12) {
                    int iB2 = bVar.b(iE + 4);
                    if (iB2 >= 0) {
                        if (Log.isLoggable(f139845b, 3)) {
                            StringBuilder sbA = C1545m0.a("Got tagIndex=", i10, " tagType=", sA3, " formatCode=");
                            sbA.append((int) sA4);
                            sbA.append(" componentCount=");
                            sbA.append(iB2);
                            Log.d(f139845b, sbA.toString());
                        }
                        int i11 = iB2 + f139858o[sA4];
                        if (i11 <= 4) {
                            int i12 = iE + 8;
                            if (i12 >= 0 && i12 <= bVar.f139871a.remaining()) {
                                if (i11 >= 0 && i11 + i12 <= bVar.f139871a.remaining()) {
                                    return bVar.a(i12);
                                }
                                if (Log.isLoggable(f139845b, 3)) {
                                    C5596a.a("Illegal number of bytes for TI tag data tagType=", sA3, f139845b);
                                }
                            } else if (Log.isLoggable(f139845b, 3)) {
                                Log.d(f139845b, "Illegal tagValueOffset=" + i12 + " tagType=" + ((int) sA3));
                            }
                        } else if (Log.isLoggable(f139845b, 3)) {
                            C5596a.a("Got byte count > 4, not orientation, continuing, formatCode=", sA4, f139845b);
                        }
                    } else if (Log.isLoggable(f139845b, 3)) {
                        Log.d(f139845b, "Negative tiff component count");
                    }
                } else if (Log.isLoggable(f139845b, 3)) {
                    C5596a.a("Got invalid format code = ", sA4, f139845b);
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(@NonNull ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        y3.m.f(byteBuffer, "Argument must not be null");
        a aVar = new a(byteBuffer);
        y3.m.f(bVar, "Argument must not be null");
        return f(aVar, bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType b(@NonNull InputStream inputStream) throws IOException {
        y3.m.f(inputStream, "Argument must not be null");
        return g(new c(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        y3.m.f(inputStream, "Argument must not be null");
        c cVar = new c(inputStream);
        y3.m.f(bVar, "Argument must not be null");
        return f(cVar, bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType d(@NonNull ByteBuffer byteBuffer) throws IOException {
        y3.m.f(byteBuffer, "Argument must not be null");
        return g(new a(byteBuffer));
    }

    public final int f(Reader reader, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        try {
            int iA = reader.a();
            if (h(iA)) {
                int iJ = j(reader);
                if (iJ != -1) {
                    byte[] bArr = (byte[]) bVar.c(iJ, byte[].class);
                    try {
                        return l(reader, bArr, iJ);
                    } finally {
                        bVar.put(bArr);
                    }
                }
                if (Log.isLoggable(f139845b, 3)) {
                    Log.d(f139845b, "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable(f139845b, 3)) {
                Log.d(f139845b, "Parser doesn't handle magic number: " + iA);
                return -1;
            }
        } catch (Reader.EndOfFileException unused) {
        }
        return -1;
    }

    @NonNull
    public final ImageHeaderParser.ImageType g(Reader reader) throws IOException {
        try {
            int iA = reader.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iC = (iA << 8) | reader.c();
            if (iC == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iC2 = (iC << 8) | reader.c();
            if (iC2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iC2 != 1380533830) {
                return m(reader, iC2);
            }
            reader.skip(4L);
            if (((reader.a() << 16) | reader.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA2 = (reader.a() << 16) | reader.a();
            if ((iA2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = iA2 & 255;
            if (i10 == 88) {
                reader.skip(4L);
                short sC = reader.c();
                return (sC & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sC & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i10 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public final boolean i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f139852i.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f139852i;
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
        return z10;
    }

    public final int j(Reader reader) throws IOException {
        short sC;
        int iA;
        long j10;
        long jSkip;
        do {
            short sC2 = reader.c();
            if (sC2 != 255) {
                if (Log.isLoggable(f139845b, 3)) {
                    C5596a.a("Unknown segmentId=", sC2, f139845b);
                }
                return -1;
            }
            sC = reader.c();
            if (sC == 218) {
                return -1;
            }
            if (sC == 217) {
                if (Log.isLoggable(f139845b, 3)) {
                    Log.d(f139845b, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iA = reader.a() - 2;
            if (sC == 225) {
                return iA;
            }
            j10 = iA;
            jSkip = reader.skip(j10);
        } while (jSkip == j10);
        if (Log.isLoggable(f139845b, 3)) {
            StringBuilder sbA = C1545m0.a("Unable to skip enough data, type: ", sC, ", wanted to skip: ", iA, ", but actually skipped: ");
            sbA.append(jSkip);
            Log.d(f139845b, sbA.toString());
        }
        return -1;
    }

    public final int l(Reader reader, byte[] bArr, int i10) throws IOException {
        int iB = reader.b(bArr, i10);
        if (iB == i10) {
            if (i(bArr, i10)) {
                return k(new b(bArr, i10));
            }
            if (Log.isLoggable(f139845b, 3)) {
                Log.d(f139845b, "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable(f139845b, 3)) {
            Log.d(f139845b, "Unable to read exif segment data, length: " + i10 + ", actually read: " + iB);
        }
        return -1;
    }

    public final ImageHeaderParser.ImageType m(Reader reader, int i10) throws IOException {
        if (((reader.a() << 16) | reader.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iA = (reader.a() << 16) | reader.a();
        if (iA == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i11 = 0;
        boolean z10 = iA == 1635150182;
        reader.skip(4L);
        int i12 = i10 - 16;
        if (i12 % 4 == 0) {
            while (i11 < 5 && i12 > 0) {
                int iA2 = (reader.a() << 16) | reader.a();
                if (iA2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iA2 == 1635150182) {
                    z10 = true;
                }
                i11++;
                i12 -= 4;
            }
        }
        return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }
}
