package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Message;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f111311a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f111312b = true;

    @e.T(22)
    public static class a {
        public static boolean a(Message message) {
            return message.isAsynchronous();
        }

        public static void b(Message message, boolean z10) {
            message.setAsynchronous(z10);
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean a(@NonNull Message message) {
        return message.isAsynchronous();
    }

    @SuppressLint({"NewApi"})
    public static void b(@NonNull Message message, boolean z10) {
        message.setAsynchronous(z10);
    }
}
