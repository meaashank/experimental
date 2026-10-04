package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2523f0;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2527h0 implements InterfaceC2525g0 {
    public static <K, V> int i(int i10, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C2523f0 c2523f0 = (C2523f0) obj2;
        int iA = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            iA += c2523f0.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    public static <K, V> MapFieldLite<K, V> j(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLiteT = (MapFieldLite) obj;
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteT.f112662a) {
                mapFieldLiteT = mapFieldLiteT.t();
            }
            mapFieldLiteT.r(mapFieldLite);
        }
        return mapFieldLiteT;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525g0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525g0
    public C2523f0.b<?, ?> b(Object obj) {
        return ((C2523f0) obj).d();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525g0
    public Object c(Object obj) {
        ((MapFieldLite) obj).f112662a = false;
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525g0
    public int d(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525g0
    public Map<?, ?> e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525g0
    public Object f(Object obj) {
        return MapFieldLite.i().t();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525g0
    public Map<?, ?> g(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2525g0
    public boolean h(Object obj) {
        return !((MapFieldLite) obj).f112662a;
    }
}
