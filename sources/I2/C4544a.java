package i2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.graphics.colorspace.C2016d;
import e.T;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: i2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4544a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f202778g = "PrintHelper";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f202779h = 3500;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f202780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f202781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f202782k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f202783l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f202784m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f202785n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f202786o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f202787p = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f202788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BitmapFactory.Options f202789b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f202790c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f202791d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f202792e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f202793f = 1;

    /* JADX INFO: renamed from: i2.a$a, reason: collision with other inner class name */
    public class AsyncTaskC0749a extends AsyncTask<Void, Void, Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellationSignal f202794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PrintAttributes f202795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bitmap f202796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ PrintAttributes f202797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f202798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptor f202799f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f202800g;

        public AsyncTaskC0749a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i10, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f202794a = cancellationSignal;
            this.f202795b = printAttributes;
            this.f202796c = bitmap;
            this.f202797d = printAttributes2;
            this.f202798e = i10;
            this.f202799f = parcelFileDescriptor;
            this.f202800g = writeResultCallback;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f202794a.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(C4544a.this.f202788a, this.f202795b);
                Bitmap bitmapA = C4544a.a(this.f202796c, this.f202795b.getColorMode());
                if (this.f202794a.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page pageStartPage = printedPdfDocument.startPage(1);
                    boolean z10 = C4544a.f202781j;
                    if (z10) {
                        rectF = new RectF(pageStartPage.getInfo().getContentRect());
                    } else {
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(C4544a.this.f202788a, this.f202797d);
                        PdfDocument.Page pageStartPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(pageStartPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(pageStartPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    Matrix matrixD = C4544a.d(bitmapA.getWidth(), bitmapA.getHeight(), rectF, this.f202798e);
                    if (!z10) {
                        matrixD.postTranslate(rectF.left, rectF.top);
                        pageStartPage.getCanvas().clipRect(rectF);
                    }
                    pageStartPage.getCanvas().drawBitmap(bitmapA, matrixD, null);
                    printedPdfDocument.finishPage(pageStartPage);
                    if (this.f202794a.isCanceled()) {
                        printedPdfDocument.close();
                        ParcelFileDescriptor parcelFileDescriptor = this.f202799f;
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (bitmapA != this.f202796c) {
                            bitmapA.recycle();
                        }
                        return null;
                    }
                    printedPdfDocument.writeTo(new FileOutputStream(this.f202799f.getFileDescriptor()));
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor2 = this.f202799f;
                    if (parcelFileDescriptor2 != null) {
                        try {
                            parcelFileDescriptor2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (bitmapA != this.f202796c) {
                        bitmapA.recycle();
                    }
                    return null;
                } finally {
                }
            } catch (Throwable th) {
                return th;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Throwable th) {
            if (this.f202794a.isCanceled()) {
                this.f202800g.onWriteCancelled();
            } else if (th == null) {
                this.f202800g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                Log.e(C4544a.f202778g, "Error writing printed content", th);
                this.f202800g.onWriteFailed(null);
            }
        }
    }

    /* JADX INFO: renamed from: i2.a$b */
    public interface b {
        void onFinish();
    }

    /* JADX INFO: renamed from: i2.a$c */
    @T(19)
    public class c extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f202802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f202803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bitmap f202804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f202805d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public PrintAttributes f202806e;

        public c(String str, int i10, Bitmap bitmap, b bVar) {
            this.f202802a = str;
            this.f202803b = i10;
            this.f202804c = bitmap;
            this.f202805d = bVar;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            b bVar = this.f202805d;
            if (bVar != null) {
                bVar.onFinish();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f202806e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f202802a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            C4544a.this.r(this.f202806e, this.f202803b, this.f202804c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    /* JADX INFO: renamed from: i2.a$d */
    @T(19)
    public class d extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f202808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f202809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f202810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f202811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public PrintAttributes f202812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public AsyncTask<Uri, Boolean, Bitmap> f202813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bitmap f202814g = null;

        /* JADX INFO: renamed from: i2.a$d$a, reason: collision with other inner class name */
        public class AsyncTaskC0750a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CancellationSignal f202816a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f202817b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f202818c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f202819d;

            /* JADX INFO: renamed from: i2.a$d$a$a, reason: collision with other inner class name */
            public class C0751a implements CancellationSignal.OnCancelListener {
                public C0751a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    d.this.a();
                    AsyncTaskC0750a.this.cancel(false);
                }
            }

            public AsyncTaskC0750a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f202816a = cancellationSignal;
                this.f202817b = printAttributes;
                this.f202818c = printAttributes2;
                this.f202819d = layoutResultCallback;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    d dVar = d.this;
                    return C4544a.this.i(dVar.f202809b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onCancelled(Bitmap bitmap) {
                this.f202819d.onLayoutCancelled();
                d.this.f202813f = null;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onPostExecute(android.graphics.Bitmap r10) {
                /*
                    r9 = this;
                    super.onPostExecute(r10)
                    if (r10 == 0) goto L12
                    boolean r0 = i2.C4544a.f202780i
                    if (r0 == 0) goto L14
                    i2.a$d r0 = i2.C4544a.d.this
                    i2.a r0 = i2.C4544a.this
                    int r0 = r0.f202793f
                    if (r0 != 0) goto L12
                    goto L14
                L12:
                    r2 = r10
                    goto L49
                L14:
                    monitor-enter(r9)
                    i2.a$d r0 = i2.C4544a.d.this     // Catch: java.lang.Throwable -> L45
                    android.print.PrintAttributes r0 = r0.f202812e     // Catch: java.lang.Throwable -> L45
                    android.print.PrintAttributes$MediaSize r0 = r0.getMediaSize()     // Catch: java.lang.Throwable -> L45
                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L45
                    if (r0 == 0) goto L12
                    boolean r0 = r0.isPortrait()
                    boolean r1 = i2.C4544a.g(r10)
                    if (r0 == r1) goto L12
                    android.graphics.Matrix r7 = new android.graphics.Matrix
                    r7.<init>()
                    r0 = 1119092736(0x42b40000, float:90.0)
                    r7.postRotate(r0)
                    int r5 = r10.getWidth()
                    int r6 = r10.getHeight()
                    r8 = 1
                    r3 = 0
                    r4 = 0
                    r2 = r10
                    android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)
                    goto L4a
                L45:
                    r0 = move-exception
                    r10 = r0
                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L45
                    throw r10
                L49:
                    r10 = r2
                L4a:
                    i2.a$d r0 = i2.C4544a.d.this
                    r0.f202814g = r10
                    r0 = 0
                    if (r10 == 0) goto L76
                    android.print.PrintDocumentInfo$Builder r10 = new android.print.PrintDocumentInfo$Builder
                    i2.a$d r1 = i2.C4544a.d.this
                    java.lang.String r1 = r1.f202808a
                    r10.<init>(r1)
                    r1 = 1
                    android.print.PrintDocumentInfo$Builder r10 = r10.setContentType(r1)
                    android.print.PrintDocumentInfo$Builder r10 = r10.setPageCount(r1)
                    android.print.PrintDocumentInfo r10 = r10.build()
                    android.print.PrintAttributes r2 = r9.f202817b
                    android.print.PrintAttributes r3 = r9.f202818c
                    boolean r2 = r2.equals(r3)
                    r1 = r1 ^ r2
                    android.print.PrintDocumentAdapter$LayoutResultCallback r2 = r9.f202819d
                    r2.onLayoutFinished(r10, r1)
                    goto L7b
                L76:
                    android.print.PrintDocumentAdapter$LayoutResultCallback r10 = r9.f202819d
                    r10.onLayoutFailed(r0)
                L7b:
                    i2.a$d r10 = i2.C4544a.d.this
                    r10.f202813f = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: i2.C4544a.d.AsyncTaskC0750a.onPostExecute(android.graphics.Bitmap):void");
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
                this.f202816a.setOnCancelListener(new C0751a());
            }
        }

        public d(String str, Uri uri, b bVar, int i10) {
            this.f202808a = str;
            this.f202809b = uri;
            this.f202810c = bVar;
            this.f202811d = i10;
        }

        public void a() {
            synchronized (C4544a.this.f202790c) {
                try {
                    BitmapFactory.Options options = C4544a.this.f202789b;
                    if (options != null) {
                        if (Build.VERSION.SDK_INT < 24) {
                            options.requestCancelDecode();
                        }
                        C4544a.this.f202789b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f202813f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            b bVar = this.f202810c;
            if (bVar != null) {
                bVar.onFinish();
            }
            Bitmap bitmap = this.f202814g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f202814g = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) throws Throwable {
            synchronized (this) {
                try {
                    this.f202812e = printAttributes2;
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f202814g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f202808a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f202813f = new AsyncTaskC0750a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            C4544a.this.r(this.f202812e, this.f202811d, this.f202814g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f202780i = i10 > 23;
        f202781j = i10 != 23;
    }

    public C4544a(@NonNull Context context) {
        this.f202788a = context;
    }

    public static Bitmap a(Bitmap bitmap, int i10) {
        if (i10 != 1) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @T(19)
    public static PrintAttributes.Builder b(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    public static Matrix d(int i10, int i11, RectF rectF, int i12) {
        Matrix matrix = new Matrix();
        float f10 = i10;
        float fWidth = rectF.width() / f10;
        float fMax = i12 == 2 ? Math.max(fWidth, rectF.height() / i11) : Math.min(fWidth, rectF.height() / i11);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(C2016d.a(f10, fMax, rectF.width(), 2.0f), C2016d.a(i11, fMax, rectF.height(), 2.0f));
        return matrix;
    }

    public static boolean g(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    public static boolean q() {
        return true;
    }

    public int c() {
        return this.f202792e;
    }

    public int e() {
        int i10 = this.f202793f;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public int f() {
        return this.f202791d;
    }

    public final Bitmap h(Uri uri, BitmapFactory.Options options) throws Throwable {
        Context context;
        if (uri == null || (context = this.f202788a) == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                        return bitmapDecodeStream;
                    } catch (IOException e10) {
                        Log.w(f202778g, "close fail ", e10);
                    }
                }
                return bitmapDecodeStream;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        Log.w(f202778g, "close fail ", e11);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Bitmap i(Uri uri) throws Throwable {
        BitmapFactory.Options options;
        if (uri == null || this.f202788a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        h(uri, options2);
        int i10 = options2.outWidth;
        int i11 = options2.outHeight;
        if (i10 > 0 && i11 > 0) {
            int iMax = Math.max(i10, i11);
            int i12 = 1;
            while (iMax > 3500) {
                iMax >>>= 1;
                i12 <<= 1;
            }
            if (i12 > 0 && Math.min(i10, i11) / i12 > 0) {
                synchronized (this.f202790c) {
                    options = new BitmapFactory.Options();
                    this.f202789b = options;
                    options.inMutable = true;
                    options.inSampleSize = i12;
                }
                try {
                    Bitmap bitmapH = h(uri, options);
                    synchronized (this.f202790c) {
                        this.f202789b = null;
                    }
                    return bitmapH;
                } catch (Throwable th) {
                    synchronized (this.f202790c) {
                        this.f202789b = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    public void j(@NonNull String str, @NonNull Bitmap bitmap) {
        k(str, bitmap, null);
    }

    public void k(@NonNull String str, @NonNull Bitmap bitmap, @Nullable b bVar) {
        if (bitmap == null) {
            return;
        }
        ((PrintManager) this.f202788a.getSystemService("print")).print(str, new c(str, this.f202791d, bitmap, bVar), new PrintAttributes.Builder().setMediaSize(g(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f202792e).build());
    }

    public void l(@NonNull String str, @NonNull Uri uri) throws FileNotFoundException {
        m(str, uri, null);
    }

    public void m(@NonNull String str, @NonNull Uri uri, @Nullable b bVar) throws FileNotFoundException {
        d dVar = new d(str, uri, bVar, this.f202791d);
        PrintManager printManager = (PrintManager) this.f202788a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f202792e);
        int i10 = this.f202793f;
        if (i10 == 1 || i10 == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i10 == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, dVar, builder.build());
    }

    public void n(int i10) {
        this.f202792e = i10;
    }

    public void o(int i10) {
        this.f202793f = i10;
    }

    public void p(int i10) {
        this.f202791d = i10;
    }

    @T(19)
    public void r(PrintAttributes printAttributes, int i10, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new AsyncTaskC0749a(cancellationSignal, f202781j ? printAttributes : b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i10, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}
