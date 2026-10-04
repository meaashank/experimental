package t5;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: t5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5615d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f239209a = "An error occurred: ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f239210b = "[Editor] ";

    public static void a(@NonNull String str, String str2) {
        Log.d(str, f239210b + str2);
    }

    public static void b(@NonNull String str, Exception exc) {
        Log.e(str, f239210b + f239209a, exc);
    }

    public static void c(@NonNull String str, String str2, Exception exc) {
        Log.e(str, f239210b + str2, exc);
    }
}
