package K9;

import android.app.Notification;
import android.app.NotificationChannel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.utils.C3841e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f58500i = "gaia.type";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f58501j = "gaia.package";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f58502k = "gaia.vuserId";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f58503l = "gaia.id";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f58504m = "gaia.tag";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f58505n = "gaia.priority";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f58506o = "gaia.original";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f58507p = "gaia.packages";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f58508q = "gaia.not_reads";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f58509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f58510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f58511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f58512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f58513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, Integer> f58514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Notification f58515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Notification f58516h;

    public static m a(@Nullable Notification notification, @Nullable Notification notification2, @Nullable NotificationChannel notificationChannel, int i10, String str, String str2, int i11) {
        m mVar = new m();
        mVar.f58509a = str2;
        mVar.f58510b = i11;
        mVar.f58511c = i10;
        mVar.f58512d = str;
        mVar.f58516h = notification2;
        mVar.f58515g = notification;
        mVar.b(notificationChannel);
        return mVar;
    }

    public static String e() {
        return "gaia#guest#total";
    }

    public static boolean f(String str) {
        return str != null && str.startsWith("gaia#guest#");
    }

    public static m h(@NonNull Notification notification) {
        m mVar = new m();
        mVar.f58515g = notification;
        mVar.g();
        return mVar;
    }

    public static void j(@NonNull Notification notification, @NonNull Map<String, Integer> map) {
        notification.extras.putInt(f58500i, 1);
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        int[] iArr = new int[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Integer num = map.get(strArr[i10]);
            iArr[i10] = num == null ? 0 : num.intValue();
        }
        notification.extras.putStringArray(f58507p, strArr);
        notification.extras.putIntArray(f58508q, iArr);
    }

    public final void b(NotificationChannel notificationChannel) {
        if (C3841e.s() && notificationChannel != null) {
            this.f58513e = notificationChannel.getImportance();
            return;
        }
        Notification notification = this.f58515g;
        if (notification == null) {
            this.f58513e = 0;
        } else {
            this.f58513e = notification.priority + 3;
        }
    }

    public int c() {
        return 1000;
    }

    public String d() {
        if (this.f58514f != null) {
            return "gaia#guest#total";
        }
        return "gaia#guest#" + this.f58509a + "@" + this.f58510b + "#" + this.f58511c + "#" + this.f58512d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f58511c == mVar.f58511c && TextUtils.equals(this.f58509a, mVar.f58509a) && this.f58510b == mVar.f58510b && TextUtils.equals(this.f58512d, mVar.f58512d)) {
                return true;
            }
        }
        return false;
    }

    public final void g() {
        Notification notification = this.f58515g;
        if (notification == null) {
            return;
        }
        if (notification.extras.getInt(f58500i, 0) == 1) {
            this.f58509a = null;
            this.f58510b = 0;
            this.f58511c = 0;
            this.f58512d = null;
            String[] stringArray = this.f58515g.extras.getStringArray(f58507p);
            int[] intArray = this.f58515g.extras.getIntArray(f58508q);
            if (stringArray.length == intArray.length) {
                this.f58514f = new HashMap();
                for (int i10 = 0; i10 < stringArray.length; i10++) {
                    this.f58514f.put(stringArray[i10], Integer.valueOf(intArray[i10]));
                }
            }
        }
        if (this.f58514f == null) {
            this.f58509a = this.f58515g.extras.getString("gaia.package");
            this.f58510b = this.f58515g.extras.getInt(f58502k, 0);
            this.f58511c = this.f58515g.extras.getInt(f58503l, 0);
            this.f58512d = this.f58515g.extras.getString(f58504m);
            this.f58513e = this.f58515g.extras.getInt(f58505n, 0);
            this.f58516h = (Notification) this.f58515g.extras.getParcelable(f58506o);
        }
    }

    public int hashCode() {
        int i10 = ((this.f58510b * 31) + this.f58511c) * 31;
        String str = this.f58509a;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58512d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public void i() {
        Notification notification = this.f58515g;
        if (notification == null) {
            return;
        }
        Map<String, Integer> map = this.f58514f;
        if (map != null) {
            j(notification, map);
            return;
        }
        notification.extras.putInt(f58500i, 0);
        this.f58515g.extras.putString("gaia.package", this.f58509a);
        this.f58515g.extras.putInt(f58502k, this.f58510b);
        this.f58515g.extras.putInt(f58503l, this.f58511c);
        this.f58515g.extras.putString(f58504m, this.f58512d);
        this.f58515g.extras.putInt(f58505n, this.f58513e);
        this.f58515g.extras.putParcelable(f58506o, this.f58516h);
    }
}
