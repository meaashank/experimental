package androidx.core.os;

import android.os.Environment;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: renamed from: androidx.core.os.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2409h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final String f111294a = "unknown";

    /* JADX INFO: renamed from: androidx.core.os.h$a */
    @e.T(21)
    public static class a {
        public static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    @NonNull
    public static String a(@NonNull File file) {
        return Environment.getExternalStorageState(file);
    }
}
