package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import e.T;
import e.f0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
@T(19)
public class n implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f139555d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f139556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f139557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f139558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f139559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Bitmap.Config[] f139560i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f139561a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<b, Bitmap> f139562b = new h<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f139563c = new HashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139564a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f139564a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f139564a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f139564a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f139564a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @f0
    public static class c extends d<b> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVarB = b();
            bVarB.f139566b = i10;
            bVarB.f139567c = config;
            return bVarB;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f139556e = configArr;
        f139557f = configArr;
        f139558g = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f139559h = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f139560i = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f139557f;
        }
        int i10 = a.f139564a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f139560i : f139559h : f139558g : f139556e;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int i10, int i11, Bitmap.Config config) {
        return h(y3.o.h(i10, i11, config), config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap) {
        return y3.o.i(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap) {
        return h(y3.o.i(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void d(Bitmap bitmap) {
        b bVarE = this.f139561a.e(y3.o.i(bitmap), bitmap.getConfig());
        this.f139562b.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num = navigableMapJ.get(Integer.valueOf(bVarE.f139566b));
        navigableMapJ.put(Integer.valueOf(bVarE.f139566b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final void e(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num2 = navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(bitmap) + ", this: " + this);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @Nullable
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        b bVarG = g(y3.o.h(i10, i11, config), config);
        Bitmap bitmapA = this.f139562b.a(bVarG);
        if (bitmapA != null) {
            e(Integer.valueOf(bVarG.f139566b), bitmapA);
            bitmapA.reconfigure(i10, i11, config);
        }
        return bitmapA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bumptech.glide.load.engine.bitmap_recycle.n.b g(int r9, android.graphics.Bitmap.Config r10) {
        /*
            r8 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.n$c r0 = r8.f139561a
            com.bumptech.glide.load.engine.bitmap_recycle.n$b r0 = r0.e(r9, r10)
            android.graphics.Bitmap$Config[] r1 = i(r10)
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            java.util.NavigableMap r5 = r8.j(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r5.ceilingKey(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L49
            int r6 = r5.intValue()
            int r7 = r9 * 8
            if (r6 > r7) goto L49
            int r1 = r5.intValue()
            if (r1 != r9) goto L39
            if (r4 != 0) goto L33
            if (r10 == 0) goto L4c
            goto L39
        L33:
            boolean r9 = r4.equals(r10)
            if (r9 != 0) goto L4c
        L39:
            com.bumptech.glide.load.engine.bitmap_recycle.n$c r9 = r8.f139561a
            r9.c(r0)
            com.bumptech.glide.load.engine.bitmap_recycle.n$c r9 = r8.f139561a
            int r10 = r5.intValue()
            com.bumptech.glide.load.engine.bitmap_recycle.n$b r9 = r9.e(r10, r4)
            return r9
        L49:
            int r3 = r3 + 1
            goto Lc
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.bitmap_recycle.n.g(int, android.graphics.Bitmap$Config):com.bumptech.glide.load.engine.bitmap_recycle.n$b");
    }

    public final NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f139563c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f139563c.put(config, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f139562b.f();
        if (bitmapF != null) {
            e(Integer.valueOf(y3.o.i(bitmapF)), bitmapF);
        }
        return bitmapF;
    }

    public String toString() {
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a("SizeConfigStrategy{groupedMap=");
        sbA.append(this.f139562b);
        sbA.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f139563c.entrySet()) {
            sbA.append(entry.getKey());
            sbA.append('[');
            sbA.append(entry.getValue());
            sbA.append("], ");
        }
        if (!this.f139563c.isEmpty()) {
            sbA.replace(sbA.length() - 2, sbA.length(), "");
        }
        sbA.append(")}");
        return sbA.toString();
    }

    @f0
    public static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f139565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f139566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap.Config f139567c;

        public b(c cVar) {
            this.f139565a = cVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f139565a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f139566b = i10;
            this.f139567c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f139566b == bVar.f139566b && y3.o.e(this.f139567c, bVar.f139567c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f139566b * 31;
            Bitmap.Config config = this.f139567c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return n.h(this.f139566b, this.f139567c);
        }

        @f0
        public b(c cVar, int i10, Bitmap.Config config) {
            this(cVar);
            this.f139566b = i10;
            this.f139567c = config;
        }
    }
}
