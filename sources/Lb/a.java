package Lb;

import android.os.Bundle;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f58775b = "query_info_type";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f58776c = "requester_type_5";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f58777d = "UnityScar";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f58778a;

    public a(String str) {
        this.f58778a = f58777d + str;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f58775b, f58776c);
        return bundle;
    }

    public String b() {
        return this.f58778a;
    }
}
