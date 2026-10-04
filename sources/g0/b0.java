package G0;

import D0.f;
import Q0.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f40091b = "TypefaceCompatBaseImpl";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40092c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, f.d> f40093a = new ConcurrentHashMap<>();

    public class a implements d<l.c> {
        public a() {
        }

        @Override // G0.b0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(l.c cVar) {
            return cVar.e();
        }

        @Override // G0.b0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(l.c cVar) {
            return cVar.f();
        }
    }

    public class b implements d<f.e> {
        public b() {
        }

        @Override // G0.b0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(f.e eVar) {
            return eVar.f17633b;
        }

        @Override // G0.b0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(f.e eVar) {
            return eVar.f17634c;
        }
    }

    public class c implements d<f.e> {
        public c() {
        }

        @Override // G0.b0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(f.e eVar) {
            return eVar.f17633b;
        }

        @Override // G0.b0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(f.e eVar) {
            return eVar.f17634c;
        }
    }

    public interface d<T> {
        int a(T t10);

        boolean b(T t10);
    }

    public static <T> T k(T[] tArr, int i10, d<T> dVar) {
        return (T) l(tArr, (i10 & 1) == 0 ? 400 : x.h.f238407j, (i10 & 2) != 0, dVar);
    }

    public static <T> T l(T[] tArr, int i10, boolean z10, d<T> dVar) {
        T t10 = null;
        int i11 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int iAbs = (Math.abs(dVar.a(t11) - i10) * 2) + (dVar.b(t11) == z10 ? 0 : 1);
            if (t10 == null || i11 > iAbs) {
                t10 = t11;
                i11 = iAbs;
            }
        }
        return t10;
    }

    public static long o(@Nullable Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e10) {
            Log.e(f40091b, "Could not retrieve font from family.", e10);
            return 0L;
        } catch (NoSuchFieldException e11) {
            Log.e(f40091b, "Could not retrieve font from family.", e11);
            return 0L;
        }
    }

    public final void a(Typeface typeface, f.d dVar) {
        long jO = o(typeface);
        if (jO != 0) {
            this.f40093a.put(Long.valueOf(jO), dVar);
        }
    }

    @Nullable
    public Typeface b(Context context, f.d dVar, Resources resources, int i10) {
        f.e eVarI = i(dVar, i10);
        if (eVarI == null) {
            return null;
        }
        Typeface typefaceI = V.i(context, resources, eVarI.f17637f, eVarI.f17632a, 0, i10);
        a(typefaceI, dVar);
        return typefaceI;
    }

    @Nullable
    public Typeface c(Context context, f.d dVar, Resources resources, int i10, boolean z10) {
        f.e eVarJ = j(dVar, i10, z10);
        if (eVarJ == null) {
            return null;
        }
        Typeface typefaceI = V.i(context, resources, eVarJ.f17637f, eVarJ.f17632a, 0, 0);
        a(typefaceI, dVar);
        return typefaceI;
    }

    @Nullable
    public Typeface d(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull l.c[] cVarArr, int i10) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(m(cVarArr, i10).d());
            try {
                Typeface typefaceF = f(context, inputStreamOpenInputStream);
                c0.a(inputStreamOpenInputStream);
                return typefaceF;
            } catch (IOException unused) {
                c0.a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                c0.a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Nullable
    @e.T(29)
    public Typeface e(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull List<l.c[]> list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface f(Context context, InputStream inputStream) {
        File fileE = c0.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (c0.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    @Nullable
    public Typeface g(Context context, Resources resources, int i10, String str, int i11) {
        File fileE = c0.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (c0.c(fileE, resources, i10)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    @NonNull
    public Typeface h(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        Typeface typefaceA;
        try {
            typefaceA = d0.a(this, context, typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        return typefaceA == null ? typeface : typefaceA;
    }

    public final f.e i(f.d dVar, int i10) {
        return (f.e) k(dVar.f17631a, i10, new b());
    }

    public final f.e j(f.d dVar, int i10, boolean z10) {
        return (f.e) l(dVar.f17631a, i10, z10, new c());
    }

    public l.c m(l.c[] cVarArr, int i10) {
        return (l.c) k(cVarArr, i10, new a());
    }

    @Nullable
    public f.d n(Typeface typeface) {
        long jO = o(typeface);
        if (jO == 0) {
            return null;
        }
        return this.f40093a.get(Long.valueOf(jO));
    }
}
