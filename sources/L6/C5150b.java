package l6;

import com.android.launcher3.IconCache;
import java.io.File;

/* JADX INFO: renamed from: l6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5150b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f220953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f220954b;

    public C5150b(String str, String str2) {
        this.f220953a = str;
        this.f220954b = str2;
    }

    public static C5150b e(String str) {
        String name = new File(str).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf <= 0) {
            return new C5150b(str, null);
        }
        return new C5150b(str.substring(0, (str.length() - r0.length()) - 1), name.substring(iLastIndexOf + 1));
    }

    public String a() {
        return this.f220953a;
    }

    public String b() {
        return a() + c();
    }

    public String c() {
        if (this.f220954b == null) {
            return "";
        }
        return IconCache.EMPTY_CLASS_NAME + this.f220954b;
    }

    public String d() {
        return this.f220954b;
    }
}
