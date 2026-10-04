package com.cookiegames.smartcookie.download;

import androidx.compose.runtime.internal.r;
import java.io.Closeable;
import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f141228a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f141229b = 0;

    public final void a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    @NotNull
    public final String b(long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("####.00");
        if (j10 >= 1024) {
            return j10 < 1048576 ? androidx.compose.runtime.changelist.j.a(decimalFormat.format(Float.valueOf(j10 / 1024.0f)), "KB") : j10 < 1073741824 ? androidx.compose.runtime.changelist.j.a(decimalFormat.format(Float.valueOf((j10 / 1024.0f) / 1024.0f)), "MB") : j10 < 0 ? androidx.compose.runtime.changelist.j.a(decimalFormat.format(Float.valueOf(((j10 / 1024.0f) / 1024.0f) / 1024.0f)), "GB") : "size: error";
        }
        return j10 + "bytes";
    }
}
