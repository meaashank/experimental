package y3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import kotlin.text.C5017i;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f241082a = 31;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f241083b = 17;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f241084c = C5017i.f218345a.toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f241085d = new char[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static volatile Handler f241086e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f241087a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f241087a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f241087a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f241087a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f241087a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f241087a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @NonNull
    public static String A(@NonNull byte[] bArr) {
        String strF;
        char[] cArr = f241085d;
        synchronized (cArr) {
            strF = f(bArr, cArr);
        }
        return strF;
    }

    public static void a() {
        if (!u()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (!v()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(@Nullable com.bumptech.glide.request.a<?> aVar, @Nullable com.bumptech.glide.request.a<?> aVar2) {
        return aVar == null ? aVar2 == null : aVar.d0(aVar2);
    }

    public static boolean d(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj instanceof k3.k ? ((k3.k) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean e(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @NonNull
    public static String f(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f241084c;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }

    @NonNull
    public static <T> Queue<T> g(int i10) {
        return new ArrayDeque(i10);
    }

    public static int h(int i10, int i11, @Nullable Bitmap.Config config) {
        return j(config) * i10 * i11;
    }

    @TargetApi(19)
    public static int i(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int j(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f241087a[config.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                return i10 != 4 ? 4 : 8;
            }
        }
        return i11;
    }

    @Deprecated
    public static int k(@NonNull Bitmap bitmap) {
        return i(bitmap);
    }

    @NonNull
    public static <T> List<T> l(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t10 : collection) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static Handler m() {
        if (f241086e == null) {
            synchronized (o.class) {
                try {
                    if (f241086e == null) {
                        f241086e = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f241086e;
    }

    public static int n(float f10) {
        return o(f10, 17);
    }

    public static int o(float f10, int i10) {
        return q(Float.floatToIntBits(f10), i10);
    }

    public static int p(int i10) {
        return q(i10, 17);
    }

    public static int q(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int r(@Nullable Object obj, int i10) {
        return q(obj == null ? 0 : obj.hashCode(), i10);
    }

    public static int s(boolean z10) {
        return q(z10 ? 1 : 0, 17);
    }

    public static int t(boolean z10, int i10) {
        return q(z10 ? 1 : 0, i10);
    }

    public static boolean u() {
        return !v();
    }

    public static boolean v() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean w(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    public static boolean x(int i10, int i11) {
        return w(i10) && w(i11);
    }

    public static void y(Runnable runnable) {
        m().post(runnable);
    }

    public static void z(Runnable runnable) {
        m().removeCallbacks(runnable);
    }
}
