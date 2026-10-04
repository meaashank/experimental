package X4;

import android.util.Log;
import com.prism.commons.utils.l0;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f76782a = l0.b(c.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f76783b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f76784c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f76785d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f76786e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f76787f = 9;

    public int a(b bVar, a aVar) {
        if (aVar.a()) {
            if (bVar.a()) {
                return 9;
            }
            return (!aVar.e() || aVar.d() < aVar.b()) ? 5 : 2;
        }
        if (!bVar.a()) {
            throw new IllegalStateException("can not compare remote and local that are both NULL");
        }
        if (aVar.e()) {
            String str = f76782a;
            StringBuilder sb2 = new StringBuilder("remote.lastModified():");
            sb2.append(bVar.b());
            sb2.append(" local.lastModefiedSyncedFromServer():");
            sb2.append(aVar.c());
            sb2.append(" < : ");
            sb2.append(bVar.b() <= aVar.c());
            Log.d(str, sb2.toString());
            if (bVar.b() <= aVar.c()) {
                return 6;
            }
        }
        return 1;
    }
}
