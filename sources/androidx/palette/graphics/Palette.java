package androidx.palette.graphics;

import G0.C1162y;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C1520a;
import e.InterfaceC4337k;
import e.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Palette {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f115350f = 12544;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f115351g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f115352h = 3.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f115353i = 4.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f115354j = "Palette";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f115355k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f115356l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f115357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Target> f115358b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f115360d = new SparseBooleanArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Target, d> f115359c = new C1520a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final d f115361e = a();

    public static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final float f115364a = 0.05f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final float f115365b = 0.95f;

        @Override // androidx.palette.graphics.Palette.b
        public boolean a(int i10, float[] fArr) {
            return (d(fArr) || b(fArr) || c(fArr)) ? false : true;
        }

        public final boolean b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        public final boolean c(float[] fArr) {
            float f10 = fArr[0];
            return f10 >= 10.0f && f10 <= 37.0f && fArr[1] <= 0.82f;
        }

        public final boolean d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    public interface b {
        boolean a(@InterfaceC4337k int i10, @NonNull float[] fArr);
    }

    public interface c {
        void a(@Nullable Palette palette);
    }

    public Palette(List<d> list, List<Target> list2) {
        this.f115357a = list;
        this.f115358b = list2;
    }

    @NonNull
    public static Builder b(@NonNull Bitmap bitmap) {
        return new Builder(bitmap);
    }

    @NonNull
    public static Palette c(@NonNull List<d> list) {
        return new Builder(list).generate();
    }

    @Deprecated
    public static Palette d(Bitmap bitmap) {
        return new Builder(bitmap).generate();
    }

    @Deprecated
    public static Palette e(Bitmap bitmap, int i10) {
        return new Builder(bitmap).maximumColorCount(i10).generate();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> g(Bitmap bitmap, int i10, c cVar) {
        return new Builder(bitmap).maximumColorCount(i10).generate(cVar);
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> h(Bitmap bitmap, c cVar) {
        return new Builder(bitmap).generate(cVar);
    }

    @NonNull
    public List<Target> A() {
        return Collections.unmodifiableList(this.f115358b);
    }

    @InterfaceC4337k
    public int B(@InterfaceC4337k int i10) {
        return k(Target.f115400z, i10);
    }

    @Nullable
    public d C() {
        return y(Target.f115400z);
    }

    public final boolean D(d dVar, Target target) {
        float[] fArrC = dVar.c();
        float f10 = fArrC[1];
        float[] fArr = target.f115401a;
        if (f10 >= fArr[0] && f10 <= fArr[2]) {
            float f11 = fArrC[2];
            float[] fArr2 = target.f115402b;
            if (f11 >= fArr2[0] && f11 <= fArr2[2] && !this.f115360d.get(dVar.f115369d)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final d a() {
        int size = this.f115357a.size();
        int i10 = Integer.MIN_VALUE;
        d dVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar2 = this.f115357a.get(i11);
            int i12 = dVar2.f115370e;
            if (i12 > i10) {
                dVar = dVar2;
                i10 = i12;
            }
        }
        return dVar;
    }

    public void f() {
        int size = this.f115358b.size();
        for (int i10 = 0; i10 < size; i10++) {
            Target target = this.f115358b.get(i10);
            target.k();
            this.f115359c.put(target, j(target));
        }
        this.f115360d.clear();
    }

    public final float i(d dVar, Target target) {
        float[] fArrC = dVar.c();
        d dVar2 = this.f115361e;
        int i10 = dVar2 != null ? dVar2.f115370e : 1;
        float f10 = target.f115403c[0];
        float fAbs = f10 > 0.0f ? (1.0f - Math.abs(fArrC[1] - target.f115401a[1])) * f10 : 0.0f;
        float f11 = target.f115403c[1];
        float fAbs2 = f11 > 0.0f ? (1.0f - Math.abs(fArrC[2] - target.f115402b[1])) * f11 : 0.0f;
        float f12 = target.f115403c[2];
        return fAbs + fAbs2 + (f12 > 0.0f ? (dVar.f115370e / i10) * f12 : 0.0f);
    }

    @Nullable
    public final d j(Target target) {
        d dVarV = v(target);
        if (dVarV != null && target.f115404d) {
            this.f115360d.append(dVarV.f115369d, true);
        }
        return dVarV;
    }

    @InterfaceC4337k
    public int k(@NonNull Target target, @InterfaceC4337k int i10) {
        d dVarY = y(target);
        return dVarY != null ? dVarY.f115369d : i10;
    }

    @InterfaceC4337k
    public int l(@InterfaceC4337k int i10) {
        return k(Target.f115378D, i10);
    }

    @Nullable
    public d m() {
        return y(Target.f115378D);
    }

    @InterfaceC4337k
    public int n(@InterfaceC4337k int i10) {
        return k(Target.f115375A, i10);
    }

    @Nullable
    public d o() {
        return y(Target.f115375A);
    }

    @InterfaceC4337k
    public int p(@InterfaceC4337k int i10) {
        d dVar = this.f115361e;
        return dVar != null ? dVar.f115369d : i10;
    }

    @Nullable
    public d q() {
        return this.f115361e;
    }

    @InterfaceC4337k
    public int r(@InterfaceC4337k int i10) {
        return k(Target.f115376B, i10);
    }

    @Nullable
    public d s() {
        return y(Target.f115376B);
    }

    @InterfaceC4337k
    public int t(@InterfaceC4337k int i10) {
        return k(Target.f115399y, i10);
    }

    @Nullable
    public d u() {
        return y(Target.f115399y);
    }

    @Nullable
    public final d v(Target target) {
        int size = this.f115357a.size();
        float f10 = 0.0f;
        d dVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar2 = this.f115357a.get(i10);
            if (D(dVar2, target)) {
                float fI = i(dVar2, target);
                if (dVar == null || fI > f10) {
                    dVar = dVar2;
                    f10 = fI;
                }
            }
        }
        return dVar;
    }

    @InterfaceC4337k
    public int w(@InterfaceC4337k int i10) {
        return k(Target.f115377C, i10);
    }

    @Nullable
    public d x() {
        return y(Target.f115377C);
    }

    @Nullable
    public d y(@NonNull Target target) {
        return this.f115359c.get(target);
    }

    @NonNull
    public List<d> z() {
        return Collections.unmodifiableList(this.f115357a);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f115366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f115367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f115368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f115369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f115370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f115371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f115372g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f115373h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public float[] f115374i;

        public d(@InterfaceC4337k int i10, int i11) {
            this.f115366a = Color.red(i10);
            this.f115367b = Color.green(i10);
            this.f115368c = Color.blue(i10);
            this.f115369d = i10;
            this.f115370e = i11;
        }

        public final void a() {
            if (this.f115371f) {
                return;
            }
            int iO = C1162y.o(-1, this.f115369d, 4.5f);
            int iO2 = C1162y.o(-1, this.f115369d, 3.0f);
            if (iO != -1 && iO2 != -1) {
                this.f115373h = C1162y.D(-1, iO);
                this.f115372g = C1162y.D(-1, iO2);
                this.f115371f = true;
                return;
            }
            int iO3 = C1162y.o(-16777216, this.f115369d, 4.5f);
            int iO4 = C1162y.o(-16777216, this.f115369d, 3.0f);
            if (iO3 == -1 || iO4 == -1) {
                this.f115373h = iO != -1 ? C1162y.D(-1, iO) : C1162y.D(-16777216, iO3);
                this.f115372g = iO2 != -1 ? C1162y.D(-1, iO2) : C1162y.D(-16777216, iO4);
                this.f115371f = true;
            } else {
                this.f115373h = C1162y.D(-16777216, iO3);
                this.f115372g = C1162y.D(-16777216, iO4);
                this.f115371f = true;
            }
        }

        @InterfaceC4337k
        public int b() {
            a();
            return this.f115373h;
        }

        @NonNull
        public float[] c() {
            if (this.f115374i == null) {
                this.f115374i = new float[3];
            }
            C1162y.e(this.f115366a, this.f115367b, this.f115368c, this.f115374i);
            return this.f115374i;
        }

        public int d() {
            return this.f115370e;
        }

        @InterfaceC4337k
        public int e() {
            return this.f115369d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f115370e == dVar.f115370e && this.f115369d == dVar.f115369d) {
                    return true;
                }
            }
            return false;
        }

        @InterfaceC4337k
        public int f() {
            a();
            return this.f115372g;
        }

        public int hashCode() {
            return (this.f115369d * 31) + this.f115370e;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
            sb2.append(" [RGB: #");
            sb2.append(Integer.toHexString(this.f115369d));
            sb2.append("] [HSL: ");
            sb2.append(Arrays.toString(c()));
            sb2.append("] [Population: ");
            sb2.append(this.f115370e);
            sb2.append("] [Title Text: #");
            a();
            sb2.append(Integer.toHexString(this.f115372g));
            sb2.append("] [Body Text: #");
            a();
            sb2.append(Integer.toHexString(this.f115373h));
            sb2.append(']');
            return sb2.toString();
        }

        public d(int i10, int i11, int i12, int i13) {
            this.f115366a = i10;
            this.f115367b = i11;
            this.f115368c = i12;
            this.f115369d = Color.rgb(i10, i11, i12);
            this.f115370e = i13;
        }

        public d(float[] fArr, int i10) {
            this(C1162y.a(fArr), i10);
            this.f115374i = fArr;
        }
    }

    public static final class Builder {

        @Nullable
        private final Bitmap mBitmap;
        private final List<b> mFilters;
        private int mMaxColors;

        @Nullable
        private Rect mRegion;
        private int mResizeArea;
        private int mResizeMaxDimension;

        @Nullable
        private final List<d> mSwatches;
        private final List<Target> mTargets;

        public class a extends AsyncTask<Bitmap, Void, Palette> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f115362a;

            public a(c cVar) {
                this.f115362a = cVar;
            }

            @Override // android.os.AsyncTask
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Palette doInBackground(Bitmap... bitmapArr) {
                try {
                    return Builder.this.generate();
                } catch (Exception e10) {
                    Log.e(Palette.f115354j, "Exception thrown during async generate", e10);
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(@Nullable Palette palette) {
                this.f115362a.a(palette);
            }
        }

        public Builder(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.mTargets = arrayList;
            this.mMaxColors = 16;
            this.mResizeArea = Palette.f115350f;
            this.mResizeMaxDimension = -1;
            ArrayList arrayList2 = new ArrayList();
            this.mFilters = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(Palette.f115356l);
            this.mBitmap = bitmap;
            this.mSwatches = null;
            arrayList.add(Target.f115399y);
            arrayList.add(Target.f115400z);
            arrayList.add(Target.f115375A);
            arrayList.add(Target.f115376B);
            arrayList.add(Target.f115377C);
            arrayList.add(Target.f115378D);
        }

        private int[] getPixelsFromBitmap(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.mRegion;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.mRegion.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i10 = 0; i10 < iHeight; i10++) {
                Rect rect2 = this.mRegion;
                System.arraycopy(iArr, ((rect2.top + i10) * width) + rect2.left, iArr2, i10 * iWidth, iWidth);
            }
            return iArr2;
        }

        private Bitmap scaleBitmapDown(Bitmap bitmap) {
            int iMax;
            int i10;
            double dSqrt = -1.0d;
            if (this.mResizeArea > 0) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                int i11 = this.mResizeArea;
                if (height > i11) {
                    dSqrt = Math.sqrt(((double) i11) / ((double) height));
                }
            } else if (this.mResizeMaxDimension > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i10 = this.mResizeMaxDimension)) {
                dSqrt = ((double) i10) / ((double) iMax);
            }
            return dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        }

        @NonNull
        public Builder addFilter(b bVar) {
            if (bVar != null) {
                this.mFilters.add(bVar);
            }
            return this;
        }

        @NonNull
        public Builder addTarget(@NonNull Target target) {
            if (!this.mTargets.contains(target)) {
                this.mTargets.add(target);
            }
            return this;
        }

        @NonNull
        public Builder clearFilters() {
            this.mFilters.clear();
            return this;
        }

        @NonNull
        public Builder clearRegion() {
            this.mRegion = null;
            return this;
        }

        @NonNull
        public Builder clearTargets() {
            List<Target> list = this.mTargets;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        @NonNull
        public Palette generate() {
            List<d> list;
            b[] bVarArr;
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null) {
                Bitmap bitmapScaleBitmapDown = scaleBitmapDown(bitmap);
                Rect rect = this.mRegion;
                if (bitmapScaleBitmapDown != this.mBitmap && rect != null) {
                    double width = ((double) bitmapScaleBitmapDown.getWidth()) / ((double) this.mBitmap.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), bitmapScaleBitmapDown.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), bitmapScaleBitmapDown.getHeight());
                }
                int[] pixelsFromBitmap = getPixelsFromBitmap(bitmapScaleBitmapDown);
                int i10 = this.mMaxColors;
                if (this.mFilters.isEmpty()) {
                    bVarArr = null;
                } else {
                    List<b> list2 = this.mFilters;
                    bVarArr = (b[]) list2.toArray(new b[list2.size()]);
                }
                androidx.palette.graphics.a aVar = new androidx.palette.graphics.a(pixelsFromBitmap, i10, bVarArr);
                if (bitmapScaleBitmapDown != this.mBitmap) {
                    bitmapScaleBitmapDown.recycle();
                }
                list = aVar.f115415c;
            } else {
                list = this.mSwatches;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            Palette palette = new Palette(list, this.mTargets);
            palette.f();
            return palette;
        }

        @NonNull
        public Builder maximumColorCount(int i10) {
            this.mMaxColors = i10;
            return this;
        }

        @NonNull
        public Builder resizeBitmapArea(int i10) {
            this.mResizeArea = i10;
            this.mResizeMaxDimension = -1;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder resizeBitmapSize(int i10) {
            this.mResizeMaxDimension = i10;
            this.mResizeArea = -1;
            return this;
        }

        @NonNull
        public Builder setRegion(@P int i10, @P int i11, @P int i12, @P int i13) {
            if (this.mBitmap != null) {
                if (this.mRegion == null) {
                    this.mRegion = new Rect();
                }
                this.mRegion.set(0, 0, this.mBitmap.getWidth(), this.mBitmap.getHeight());
                if (!this.mRegion.intersect(i10, i11, i12, i13)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }

        public Builder(@NonNull List<d> list) {
            this.mTargets = new ArrayList();
            this.mMaxColors = 16;
            this.mResizeArea = Palette.f115350f;
            this.mResizeMaxDimension = -1;
            ArrayList arrayList = new ArrayList();
            this.mFilters = arrayList;
            if (list != null && !list.isEmpty()) {
                arrayList.add(Palette.f115356l);
                this.mSwatches = list;
                this.mBitmap = null;
                return;
            }
            throw new IllegalArgumentException("List of Swatches is not valid");
        }

        @NonNull
        public AsyncTask<Bitmap, Void, Palette> generate(@NonNull c cVar) {
            if (cVar != null) {
                return new a(cVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.mBitmap);
            }
            throw new IllegalArgumentException("listener can not be null");
        }
    }
}
