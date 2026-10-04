package T9;

import android.content.Context;
import androidx.compose.runtime.changelist.j;
import com.prism.commons.utils.C3861z;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C3861z<File, Context> f68356a = new C3861z<>(new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f68357b = "GAMEBOX_TEMP";

    public static String b(String str) {
        return j.a(str, ".gamedata");
    }

    public static String c(Context context, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f68356a.a(context).getPath());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(f68357b);
        sb2.append(str2);
        sb2.append(b(str));
        return sb2.toString();
    }
}
