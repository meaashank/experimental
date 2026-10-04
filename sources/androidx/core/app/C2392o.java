package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.core.app.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2392o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f111054b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f111055c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f111056d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f111057e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f111058f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f111059g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f111060h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f111061i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f111062j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f111063k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f111064l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f111065m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f111066n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f111067o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f111068p = 16;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f111069q = 32;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f111070r = 64;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f111071s = 128;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f111072t = 256;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f111073u = 511;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f111074a;

    /* JADX INFO: renamed from: androidx.core.app.o$a */
    @e.T(24)
    public static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f111075e = 1000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f111076f = 500000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static HandlerThread f111077g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static Handler f111078h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f111079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseIntArray[] f111080b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<WeakReference<Activity>> f111081c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Window$OnFrameMetricsAvailableListener f111082d = new WindowOnFrameMetricsAvailableListenerC0278a();

        /* JADX INFO: renamed from: androidx.core.app.o$a$a, reason: collision with other inner class name */
        public class WindowOnFrameMetricsAvailableListenerC0278a implements Window$OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0278a() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f111079a & 1) != 0) {
                    aVar.f(aVar.f111080b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f111079a & 2) != 0) {
                    aVar2.f(aVar2.f111080b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f111079a & 4) != 0) {
                    aVar3.f(aVar3.f111080b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f111079a & 8) != 0) {
                    aVar4.f(aVar4.f111080b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f111079a & 16) != 0) {
                    aVar5.f(aVar5.f111080b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f111079a & 64) != 0) {
                    aVar6.f(aVar6.f111080b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f111079a & 32) != 0) {
                    aVar7.f(aVar7.f111080b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f111079a & 128) != 0) {
                    aVar8.f(aVar8.f111080b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f111079a & 256) != 0) {
                    aVar9.f(aVar9.f111080b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i10) {
            this.f111079a = i10;
        }

        @Override // androidx.core.app.C2392o.b
        public void a(Activity activity) {
            if (f111077g == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f111077g = handlerThread;
                handlerThread.start();
                f111078h = new Handler(f111077g.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f111080b;
                if (sparseIntArrayArr[i10] == null && (this.f111079a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f111082d, f111078h);
            this.f111081c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.C2392o.b
        public SparseIntArray[] b() {
            return this.f111080b;
        }

        @Override // androidx.core.app.C2392o.b
        public SparseIntArray[] c(Activity activity) {
            ArrayList<WeakReference<Activity>> arrayList = this.f111081c;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                WeakReference<Activity> weakReference = arrayList.get(i10);
                i10++;
                WeakReference<Activity> weakReference2 = weakReference;
                if (weakReference2.get() == activity) {
                    this.f111081c.remove(weakReference2);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f111082d);
            return this.f111080b;
        }

        @Override // androidx.core.app.C2392o.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f111080b;
            this.f111080b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.C2392o.b
        public SparseIntArray[] e() {
            for (int size = this.f111081c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f111081c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f111082d);
                    this.f111081c.remove(size);
                }
            }
            return this.f111080b;
        }

        public void f(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.o$b */
    public static class b {
        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.o$c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public C2392o() {
        this(1);
    }

    public void a(@NonNull Activity activity) {
        this.f111074a.a(activity);
    }

    @Nullable
    public SparseIntArray[] b() {
        return this.f111074a.b();
    }

    @Nullable
    public SparseIntArray[] c(@NonNull Activity activity) {
        return this.f111074a.c(activity);
    }

    @Nullable
    public SparseIntArray[] d() {
        return this.f111074a.d();
    }

    @Nullable
    public SparseIntArray[] e() {
        return this.f111074a.e();
    }

    public C2392o(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f111074a = new a(i10);
        } else {
            this.f111074a = new b();
        }
    }
}
