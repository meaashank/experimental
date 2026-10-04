package a5;

import android.content.ContentResolver;
import android.content.Context;
import com.prism.commons.utils.l0;
import com.prism.gaia.download.j;
import e.g0;
import java.util.ArrayList;
import java.util.HashMap;
import s0.x;

/* JADX INFO: renamed from: a5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1448b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f84734e = l0.b(C1448b.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f84735f = {"_id", j.b.f164768t, "_display_name", "title", "bucket_id", "bucket_display_name", "mime_type", "date_added", "date_modified", "latitude", "longitude", "_size"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f84736g = {"_id", j.b.f164768t, "_display_name", "title", "bucket_id", "bucket_display_name", "mime_type", "date_added", "date_modified", "latitude", "longitude", "_size", x.h.f238399b, "resolution"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R4.a<Long> f84737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4.a<String> f84738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R4.a<Long> f84739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f84740d;

    public C1448b(R4.a<Long> aVar, R4.a<String> aVar2, R4.a<Long> aVar3, boolean z10) {
        this.f84737a = aVar;
        this.f84738b = aVar2;
        this.f84739c = aVar3;
        this.f84740d = z10;
    }

    @g0
    public ArrayList<P4.b> a() {
        HashMap map = new HashMap();
        f(map);
        ArrayList<P4.b> arrayList = new ArrayList<>(map.size());
        arrayList.addAll(map.values());
        return arrayList;
    }

    @g0
    public ArrayList<P4.b> b() {
        HashMap map = new HashMap();
        f(map);
        g(map);
        ArrayList<P4.b> arrayList = new ArrayList<>(map.size());
        arrayList.addAll(map.values());
        return arrayList;
    }

    @g0
    public ArrayList<P4.b> c() {
        HashMap map = new HashMap();
        g(map);
        ArrayList<P4.b> arrayList = new ArrayList<>(map.size());
        arrayList.addAll(map.values());
        return arrayList;
    }

    public final ContentResolver d() {
        return N4.d.i().getContentResolver();
    }

    public final Context e() {
        return N4.d.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x014d  */
    @e.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.util.Map<java.lang.String, P4.b> r21) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.C1448b.f(java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b0  */
    @e.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.util.Map<java.lang.String, P4.b> r27) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.C1448b.g(java.util.Map):void");
    }
}
