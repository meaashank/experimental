package c7;

import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import com.prism.gaia.naked.metadata.android.content.AttributionSourceCAG;
import com.prism.gaia.naked.metadata.android.content.AttributionSourceStateCAG;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class x implements InterfaceC2957i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f131277a = "asdf-".concat(x.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, AttributionSource> f131278b = new ConcurrentHashMap();

    public static /* synthetic */ void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public static Object f(AttributionSource attributionSource) {
        if (AttributionSourceCAG.f165587C.mAttributionSourceState() == null) {
            return null;
        }
        return AttributionSourceCAG.f165587C.mAttributionSourceState().get(attributionSource);
    }

    public static boolean g(final Object obj, final String str, String str2, List<Runnable> list) {
        boolean z10;
        if (obj == null || AttributionSourceStateCAG.f165588C.packageName() == null || AttributionSourceStateCAG.f165588C.next() == null) {
            return false;
        }
        if (str.equals(AttributionSourceStateCAG.f165588C.packageName().get(obj))) {
            AttributionSourceStateCAG.f165588C.packageName().set(obj, str2);
            list.add(new Runnable() { // from class: c7.w
                @Override // java.lang.Runnable
                public final void run() {
                    AttributionSourceStateCAG.f165588C.packageName().set(obj, str);
                }
            });
            z10 = true;
        } else {
            z10 = false;
        }
        Object[] objArr = AttributionSourceStateCAG.f165588C.next().get(obj);
        return (objArr == null || objArr.length <= 0) ? z10 : g(objArr[0], str, str2, list) | z10;
    }

    @Nullable
    public static AttributionSource h(AttributionSource attributionSource, String str, String str2) {
        try {
            if (str.equals(attributionSource.getPackageName()) && attributionSource.getNext() == null) {
                String attributionTag = attributionSource.getAttributionTag();
                String str3 = attributionTag == null ? "" : attributionTag;
                Map<String, AttributionSource> map = f131278b;
                AttributionSource attributionSourceA = b7.b.a(map.get(str3));
                if (attributionSourceA == null) {
                    Context contextV = m.v();
                    if (contextV == null) {
                        return null;
                    }
                    if (attributionTag != null) {
                        contextV = contextV.createAttributionContext(attributionTag);
                    }
                    attributionSourceA = contextV.getAttributionSource();
                    if (attributionSourceA != null && str2.equals(attributionSourceA.getPackageName()) && attributionSourceA.getNext() == null && Objects.equals(attributionTag, attributionSourceA.getAttributionTag())) {
                        map.put(str3, attributionSourceA);
                    }
                    return null;
                }
                if (attributionSourceA.getUid() != attributionSource.getUid()) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    if (attributionSourceA.getDeviceId() != attributionSource.getDeviceId()) {
                        return null;
                    }
                }
                return attributionSourceA;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean i(Object obj) {
        Class clsORG_CLASS = AttributionSourceStateCAG.f165588C.ORG_CLASS();
        return clsORG_CLASS != null && clsORG_CLASS.isInstance(obj);
    }

    @Override // c7.InterfaceC2957i
    public Runnable a(Object[] objArr) {
        final ArrayList arrayList = new ArrayList(0);
        j(objArr, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Runnable() { // from class: c7.v
            @Override // java.lang.Runnable
            public final void run() {
                x.e(arrayList);
            }
        };
    }

    @Override // c7.InterfaceC2957i
    public void b(Object[] objArr) {
        a(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.Object[] r9, java.util.List<java.lang.Runnable> r10) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.x.j(java.lang.Object[], java.util.List):void");
    }
}
