package i3;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: i3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4546a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f202822a = "GlideRuntimeCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f202823b = "cpu[0-9]+";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f202824c = "/sys/devices/system/cpu/";

    /* JADX INFO: renamed from: i3.a$a, reason: collision with other inner class name */
    public class C0752a implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Pattern f202825a;

        public C0752a(Pattern pattern) {
            this.f202825a = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f202825a.matcher(str).matches();
        }
    }

    public static int a() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static int b() {
        File[] fileArrListFiles;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArrListFiles = new File(f202824c).listFiles(new C0752a(Pattern.compile(f202823b)));
        } catch (Throwable th) {
            try {
                if (Log.isLoggable(f202822a, 6)) {
                    Log.e(f202822a, "Failed to calculate accurate cpu count", th);
                }
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                fileArrListFiles = null;
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
        return Math.max(1, fileArrListFiles != null ? fileArrListFiles.length : 0);
    }
}
