package vb;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: vb.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5720a implements InterfaceC5723d {
    @Override // vb.InterfaceC5723d
    public void a(int i10, @NonNull String str, @NonNull String str2, @Nullable Throwable th) {
        if (i10 == 2) {
            f(str, str2, th);
            return;
        }
        if (i10 == 3) {
            c(str, str2, th);
            return;
        }
        if (i10 == 4) {
            e(str, str2, th);
        } else if (i10 == 5) {
            g(str, str2, th);
        } else {
            if (i10 != 6) {
                return;
            }
            d(str, str2, th);
        }
    }

    @Override // vb.InterfaceC5723d
    public boolean b(int i10, @Nullable String str) {
        if (TextUtils.isEmpty(str) || str.length() >= 23) {
            return false;
        }
        return Log.isLoggable(str, i10);
    }

    public final int c(String str, String str2, @Nullable Throwable th) {
        return th == null ? Log.d(str, str2) : Log.d(str, str2, th);
    }

    public final int d(String str, String str2, @Nullable Throwable th) {
        return th == null ? Log.e(str, str2) : Log.e(str, str2, th);
    }

    public final int e(String str, String str2, @Nullable Throwable th) {
        return th == null ? Log.i(str, str2) : Log.i(str, str2, th);
    }

    public final int f(String str, String str2, @Nullable Throwable th) {
        return th == null ? Log.v(str, str2) : Log.v(str, str2, th);
    }

    public final int g(String str, String str2, @Nullable Throwable th) {
        return th == null ? Log.w(str, str2) : Log.w(str, str2, th);
    }
}
