package p5;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;
import t5.C5615d;

/* JADX INFO: renamed from: p5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5393a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f226340a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f226341b = "Roboto";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f226342c = "Roboto Light";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f226343d = "Source Code Pro";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f226344e = "Droid Sans Mono";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static HashMap<String, String> f226345f;

    static {
        HashMap<String, String> map = new HashMap<>();
        f226345f = map;
        map.put(f226341b, "fonts/roboto.ttf");
        f226345f.put(f226342c, "fonts/roboto_light.ttf");
        f226345f.put(f226343d, "fonts/source_code_pro.ttf");
        f226345f.put(f226344e, "fonts/droid_sans_mono.ttf");
    }

    public static Typeface a(Context context, String str) {
        if (str.equals(f226344e)) {
            return Typeface.MONOSPACE;
        }
        String str2 = f226345f.get(str);
        if (str2 == null) {
            return Typeface.MONOSPACE;
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str2);
        if (typefaceCreateFromAsset != null) {
            return typefaceCreateFromAsset;
        }
        C5615d.a(f226340a, "typeface is null, use monospace");
        return Typeface.MONOSPACE;
    }
}
