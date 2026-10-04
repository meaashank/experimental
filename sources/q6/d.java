package Q6;

import K9.h;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f67644b;

        public a(String str, int i10) {
            this.f67644b = i10;
            if (str.equalsIgnoreCase(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                this.f67643a = 0;
                return;
            }
            if (str.equalsIgnoreCase(h.f58477a)) {
                this.f67643a = 1;
                return;
            }
            if (str.equalsIgnoreCase("t")) {
                this.f67643a = 2;
            } else if (str.equalsIgnoreCase("p")) {
                this.f67643a = 3;
            } else {
                this.f67643a = 4;
                this.f67644b = 0;
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f67645b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f67646c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f67647d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f67648e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f67649f = 4;
    }
}
