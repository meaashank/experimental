package K9;

import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Class f58429a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class f58430b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f58431c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f58432d = "ReflectionAction";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f58433e = "ViewGroupAction";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f58434f = "SetEmptyView";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f58435g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f58436h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f58437i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f58438j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f58439k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f58440l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f58441m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f58442n = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f58443o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f58444p = 9;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f58445q = 10;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f58446r = 11;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f58447s = 12;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f58448t = 13;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f58449u = 14;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f58450v = 15;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f58451w = 16;

    static {
        try {
            f58429a = Class.forName(RemoteViews.class.getName().concat("$ReflectionAction"));
            f58430b = Class.forName(RemoteViews.class.getName().concat("$ViewGroupAction"));
            f58431c = Class.forName(RemoteViews.class.getName().concat("$SetEmptyView"));
        } catch (ClassNotFoundException unused) {
        }
    }

    public static boolean a(Object obj) {
        Class cls = f58429a;
        return cls != null && cls.isInstance(obj);
    }

    public static boolean b(Object obj) {
        Class cls = f58431c;
        return cls != null && cls.isInstance(obj);
    }

    public static boolean c(Object obj) {
        Class cls = f58430b;
        return cls != null && cls.isInstance(obj);
    }
}
