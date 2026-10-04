package la;

import android.content.res.Resources;
import com.app.hider.master.promax.R;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f221063a = " · ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f221064b = 1024;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f221065c = 1048576;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f221066d = 1073741824;

    public static String a(long j10) {
        if (j10 <= 0) {
            return "0 B";
        }
        if (j10 >= 1073741824) {
            return String.format(Locale.US, "%.2f GB", Double.valueOf(j10 / 1.073741824E9d));
        }
        if (j10 >= 1048576) {
            return String.format(Locale.US, "%.0f MB", Double.valueOf(j10 / 1048576.0d));
        }
        if (j10 >= 1024) {
            return String.format(Locale.US, "%.0f KB", Double.valueOf(j10 / 1024.0d));
        }
        return j10 + " B";
    }

    public static String b(Resources resources, List<C5169I> list, boolean z10) {
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (C5169I c5169i : list) {
            hashSet.add(c5169i.j());
            if (c5169i.f()) {
                i10++;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(list.size() == hashSet.size() ? resources.getString(R.string.guest_apps_summary_apps, Integer.valueOf(list.size())) : resources.getString(R.string.guest_apps_summary_copies, Integer.valueOf(list.size()), Integer.valueOf(hashSet.size())));
        if (i10 > 0) {
            sb2.append(f221063a);
            sb2.append(resources.getString(R.string.guest_apps_summary_off, Integer.valueOf(i10)));
        }
        sb2.append(f221063a);
        sb2.append(z10 ? resources.getString(R.string.guest_apps_summary_disk, a(C5168H.b(list))) : resources.getString(R.string.guest_apps_summary_measuring));
        return sb2.toString();
    }
}
