package D0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4326A;
import e.InterfaceC4329c;
import e.InterfaceC4337k;
import e.InterfaceC4339m;
import e.InterfaceC4342p;
import e.InterfaceC4346u;
import e.InterfaceC4349x;
import e.T;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17648a = "ResourcesCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f17649b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InterfaceC4326A("sColorStateCacheLock")
    public static final WeakHashMap<e, SparseArray<d>> f17650c = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f17651d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InterfaceC4329c
    public static final int f17652e = 0;

    @T(21)
    public static class a {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    @T(23)
    public static class b {
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        @NonNull
        public static ColorStateList b(@NonNull Resources resources, @InterfaceC4339m int i10, @Nullable Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    @T(29)
    public static class c {
        public static float a(@NonNull Resources resources, @InterfaceC4342p int i10) {
            return resources.getFloat(i10);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColorStateList f17653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Configuration f17654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17655c;

        public d(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, @Nullable Resources.Theme theme) {
            this.f17653a = colorStateList;
            this.f17654b = configuration;
            this.f17655c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f17656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resources.Theme f17657b;

        public e(@NonNull Resources resources, @Nullable Resources.Theme theme) {
            this.f17656a = resources;
            this.f17657b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f17656a.equals(eVar.f17656a) && Objects.equals(this.f17657b, eVar.f17657b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f17656a, this.f17657b);
        }
    }

    public static abstract class f {
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Handler getHandler(@Nullable Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(final int i10, @Nullable Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: D0.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17663a.onFontRetrievalFailed(i10);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(@NonNull final Typeface typeface, @Nullable Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: D0.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17661a.onFontRetrieved(typeface);
                }
            });
        }

        public abstract void onFontRetrievalFailed(int i10);

        public abstract void onFontRetrieved(@NonNull Typeface typeface);
    }

    public static final class g {

        @T(23)
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Object f17658a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static Method f17659b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static boolean f17660c;

            /* JADX WARN: Removed duplicated region for block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @android.annotation.SuppressLint({"BanUncheckedReflection"})
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static void a(@androidx.annotation.NonNull android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = D0.i.g.a.f17658a
                    monitor-enter(r0)
                    boolean r1 = D0.i.g.a.f17660c     // Catch: java.lang.Throwable -> L17
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    D0.i.g.a.f17659b = r3     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    goto L21
                L17:
                    r6 = move-exception
                    goto L39
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L17
                L21:
                    D0.i.g.a.f17660c = r1     // Catch: java.lang.Throwable -> L17
                L23:
                    java.lang.reflect.Method r1 = D0.i.g.a.f17659b     // Catch: java.lang.Throwable -> L17
                    if (r1 == 0) goto L37
                    r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L17 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
                    goto L37
                L2b:
                    r6 = move-exception
                    goto L2e
                L2d:
                    r6 = move-exception
                L2e:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r3 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r3, r6)     // Catch: java.lang.Throwable -> L17
                    D0.i.g.a.f17659b = r2     // Catch: java.lang.Throwable -> L17
                L37:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    return
                L39:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: D0.i.g.a.a(android.content.res.Resources$Theme):void");
            }
        }

        @T(29)
        public static class b {
            public static void a(@NonNull Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(@NonNull Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    public static void a(@NonNull e eVar, @InterfaceC4339m int i10, @NonNull ColorStateList colorStateList, @Nullable Resources.Theme theme) {
        synchronized (f17651d) {
            try {
                WeakHashMap<e, SparseArray<d>> weakHashMap = f17650c;
                SparseArray<d> sparseArray = weakHashMap.get(eVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(eVar, sparseArray);
                }
                sparseArray.append(i10, new d(colorStateList, eVar.f17656a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(@NonNull Resources.Theme theme) {
        synchronized (f17651d) {
            try {
                Iterator<e> it = f17650c.keySet().iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (next != null && theme.equals(next.f17657b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f17655c == r5.hashCode()) goto L22;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList c(@androidx.annotation.NonNull D0.i.e r5, @e.InterfaceC4339m int r6) {
        /*
            java.lang.Object r0 = D0.i.f17651d
            monitor-enter(r0)
            java.util.WeakHashMap<D0.i$e, android.util.SparseArray<D0.i$d>> r1 = D0.i.f17650c     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            D0.i$d r2 = (D0.i.d) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f17654b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f17656a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f17657b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f17655c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f17655c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f17653a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.i.c(D0.i$e, int):android.content.res.ColorStateList");
    }

    @Nullable
    public static Typeface d(@NonNull Context context, @InterfaceC4349x int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    @InterfaceC4337k
    public static int e(@NonNull Resources resources, @InterfaceC4339m int i10, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getColor(i10, theme);
    }

    @Nullable
    public static ColorStateList f(@NonNull Resources resources, @InterfaceC4339m int i10, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        e eVar = new e(resources, theme);
        ColorStateList colorStateListC = c(eVar, i10);
        if (colorStateListC != null) {
            return colorStateListC;
        }
        ColorStateList colorStateListN = n(resources, i10, theme);
        if (colorStateListN == null) {
            return resources.getColorStateList(i10, theme);
        }
        a(eVar, i10, colorStateListN, theme);
        return colorStateListN;
    }

    @Nullable
    public static Drawable g(@NonNull Resources resources, @InterfaceC4346u int i10, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawable(i10, theme);
    }

    @Nullable
    public static Drawable h(@NonNull Resources resources, @InterfaceC4346u int i10, int i11, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawableForDensity(i10, i11, theme);
    }

    public static float i(@NonNull Resources resources, @InterfaceC4342p int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(resources, i10);
        }
        TypedValue typedValueM = m();
        resources.getValue(i10, typedValueM, true);
        if (typedValueM.type == 4) {
            return typedValueM.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValueM.type) + " is not valid");
    }

    @Nullable
    public static Typeface j(@NonNull Context context, @InterfaceC4349x int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface k(@NonNull Context context, @InterfaceC4349x int i10, @NonNull TypedValue typedValue, int i11, @Nullable f fVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i10, typedValue, i11, fVar, null, true, false);
    }

    public static void l(@NonNull Context context, @InterfaceC4349x int i10, @NonNull f fVar, @Nullable Handler handler) throws Resources.NotFoundException {
        fVar.getClass();
        if (context.isRestricted()) {
            fVar.callbackFailAsync(-4, handler);
        } else {
            p(context, i10, new TypedValue(), 0, fVar, handler, false, false);
        }
    }

    @NonNull
    public static TypedValue m() {
        ThreadLocal<TypedValue> threadLocal = f17649b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @Nullable
    public static ColorStateList n(Resources resources, int i10, @Nullable Resources.Theme theme) {
        if (o(resources, i10)) {
            return null;
        }
        try {
            return D0.c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w(f17648a, "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    public static boolean o(@NonNull Resources resources, @InterfaceC4339m int i10) {
        TypedValue typedValueM = m();
        resources.getValue(i10, typedValueM, true);
        int i11 = typedValueM.type;
        return i11 >= 28 && i11 <= 31;
    }

    public static Typeface p(@NonNull Context context, int i10, @NonNull TypedValue typedValue, int i11, @Nullable f fVar, @Nullable Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface typefaceQ = q(context, resources, typedValue, i10, i11, fVar, handler, z10, z11);
        if (typefaceQ != null || fVar != null || z11) {
            return typefaceQ;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface q(@androidx.annotation.NonNull android.content.Context r13, android.content.res.Resources r14, @androidx.annotation.NonNull android.util.TypedValue r15, int r16, int r17, @androidx.annotation.Nullable D0.i.f r18, @androidx.annotation.Nullable android.os.Handler r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.i.q(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, D0.i$f, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
