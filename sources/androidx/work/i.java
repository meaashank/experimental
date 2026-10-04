package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static i f120265a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f120266b = "WM-";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f120267c = 23;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f120268d = 20;

    public static class a extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f120269e;

        public a(int loggingLevel) {
            this.f120269e = loggingLevel;
        }

        @Override // androidx.work.i
        public void a(String tag, String message, Throwable... throwables) {
            if (this.f120269e <= 3) {
                if (throwables == null || throwables.length < 1) {
                    Log.d(tag, message);
                } else {
                    Log.d(tag, message, throwables[0]);
                }
            }
        }

        @Override // androidx.work.i
        public void b(String tag, String message, Throwable... throwables) {
            if (this.f120269e <= 6) {
                if (throwables == null || throwables.length < 1) {
                    Log.e(tag, message);
                } else {
                    Log.e(tag, message, throwables[0]);
                }
            }
        }

        @Override // androidx.work.i
        public void d(String tag, String message, Throwable... throwables) {
            if (this.f120269e <= 4) {
                if (throwables == null || throwables.length < 1) {
                    Log.i(tag, message);
                } else {
                    Log.i(tag, message, throwables[0]);
                }
            }
        }

        @Override // androidx.work.i
        public void g(String tag, String message, Throwable... throwables) {
            if (this.f120269e <= 2) {
                if (throwables == null || throwables.length < 1) {
                    Log.v(tag, message);
                } else {
                    Log.v(tag, message, throwables[0]);
                }
            }
        }

        @Override // androidx.work.i
        public void h(String tag, String message, Throwable... throwables) {
            if (this.f120269e <= 5) {
                if (throwables == null || throwables.length < 1) {
                    Log.w(tag, message);
                } else {
                    Log.w(tag, message, throwables[0]);
                }
            }
        }
    }

    public i(int loggingLevel) {
    }

    public static synchronized i c() {
        try {
            if (f120265a == null) {
                f120265a = new a(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f120265a;
    }

    public static synchronized void e(i logger) {
        f120265a = logger;
    }

    public static String f(@NonNull String tag) {
        int length = tag.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(f120266b);
        int i10 = f120268d;
        if (length >= i10) {
            sb2.append(tag.substring(0, i10));
        } else {
            sb2.append(tag);
        }
        return sb2.toString();
    }

    public abstract void a(String tag, String message, Throwable... throwables);

    public abstract void b(String tag, String message, Throwable... throwables);

    public abstract void d(String tag, String message, Throwable... throwables);

    public abstract void g(String tag, String message, Throwable... throwables);

    public abstract void h(String tag, String message, Throwable... throwables);
}
