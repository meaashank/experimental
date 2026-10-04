package Y6;

import X6.s;
import Y6.b;
import Y6.c;
import Y6.d;
import android.app.Notification;
import android.content.Intent;
import android.content.UriMatcher;
import android.net.Uri;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.commons.utils.C3838b;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.client.hook.providers.ProviderProxyHandler;
import com.prism.gaia.remote.BadgerInfo;
import java.util.ArrayList;
import java.util.HashMap;
import v8.C5703m;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f79255a = "asdf-".concat(a.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HashMap<String, e> f79256b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList<f> f79257c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static g f79258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static UriMatcher f79259e;

    /* JADX INFO: renamed from: Y6.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0149a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79260a;

        static {
            int[] iArr = new int[ProviderProxyHandler.MethodType.values().length];
            f79260a = iArr;
            try {
                iArr[ProviderProxyHandler.MethodType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79260a[ProviderProxyHandler.MethodType.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        f79256b.put(c.a.f79270a, new c.a());
        f79256b.put(c.b.f79274a, new c.b());
        f79256b.put("android.intent.action.BADGE_COUNT_UPDATE", new c.C0151c());
        f79256b.put("android.intent.action.BADGE_COUNT_UPDATE", new c.d());
        f79256b.put(c.e.f79286a, new c.e());
        f79256b.put(c.f.f79289a, new c.f());
        f79256b.put(c.g.f79293a, new c.g());
        f79256b.put(b.C0150b.f79262b, new b.C0150b());
        f79256b.put(b.C0150b.f79261a, new b.a());
        f79256b.put(b.c.f79267a, new b.c());
        f79259e = new UriMatcher(-1);
        b(new d.b());
        b(new d.c());
        b(new d.C0152d());
        b(new d.e());
        b(new d.f());
        b(new d.g());
        b(new d.i());
        b(new d.h());
        b(new d.j());
        f79258d = new g();
    }

    public static void a(e eVar) {
        f79256b.put(eVar.a(), eVar);
    }

    public static void b(f fVar) {
        Uri uri = Uri.parse(fVar.getUri());
        String path = uri.getPath();
        if (path != null && path.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            path = path.substring(1);
        }
        uri.toString();
        uri.getAuthority();
        f79259e.addURI(uri.getAuthority(), path, f79257c.size());
        f79257c.add(fVar);
    }

    public static boolean c(Intent intent) {
        if (f79256b.containsKey(intent.getAction())) {
            return f(f79256b.get(intent.getAction()).b(intent));
        }
        return false;
    }

    public static boolean d(String str, Notification notification) {
        BadgerInfo badgerInfoA;
        if (notification == null) {
            badgerInfoA = new BadgerInfo();
            badgerInfoA.packageName = str;
            badgerInfoA.badgerCount = 0;
        } else {
            badgerInfoA = f79258d.a(str, notification);
        }
        if (badgerInfoA != null) {
            f(badgerInfoA);
        }
        return false;
    }

    public static boolean e(ProviderProxyHandler.MethodType methodType, Object... objArr) {
        Uri uriBuild;
        int iMatch;
        if (objArr == null) {
            return false;
        }
        try {
            int i10 = C0149a.f79260a[methodType.ordinal()];
            if (i10 == 1) {
                int iH = ProviderProxyHandler.h(methodType);
                uriBuild = new Uri.Builder().scheme("content").authority((String) (iH > 0 ? objArr[iH - 1] : objArr[iH])).path((String) objArr[iH]).build();
            } else {
                if (i10 == 2) {
                    return false;
                }
                int iJ = C3838b.j(objArr, Uri.class);
                uriBuild = iJ >= 0 ? (Uri) objArr[iJ] : null;
            }
            if (uriBuild != null && (iMatch = f79259e.match(uriBuild)) != -1 && iMatch < f79257c.size()) {
                f fVar = f79257c.get(iMatch);
                fVar.getClass();
                f(fVar.a(methodType, objArr));
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean f(BadgerInfo badgerInfo) {
        if (badgerInfo == null) {
            return false;
        }
        if (badgerInfo.packageName != null) {
            C5703m.o().g0(badgerInfo);
            return true;
        }
        if (s.u6() == null || GaiaContext.j().r() == null) {
            return true;
        }
        badgerInfo.packageName = GaiaContext.f164212y.r();
        C5703m.o().g0(badgerInfo);
        return true;
    }
}
