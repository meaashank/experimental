package kotlin;

/* JADX INFO: renamed from: kotlin.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4848a0 {
    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <V> V a(kotlin.reflect.o<? extends V> oVar, Object obj, kotlin.reflect.n<?> property) {
        kotlin.jvm.internal.G.p(oVar, "<this>");
        kotlin.jvm.internal.G.p(property, "property");
        return oVar.get();
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, V> V b(kotlin.reflect.p<T, ? extends V> pVar, T t10, kotlin.reflect.n<?> property) {
        kotlin.jvm.internal.G.p(pVar, "<this>");
        kotlin.jvm.internal.G.p(property, "property");
        return pVar.get(t10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <V> void c(kotlin.reflect.k<V> kVar, Object obj, kotlin.reflect.n<?> property, V v10) {
        kotlin.jvm.internal.G.p(kVar, "<this>");
        kotlin.jvm.internal.G.p(property, "property");
        kVar.set(v10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final <T, V> void d(kotlin.reflect.l<T, V> lVar, T t10, kotlin.reflect.n<?> property, V v10) {
        kotlin.jvm.internal.G.p(lVar, "<this>");
        kotlin.jvm.internal.G.p(property, "property");
        lVar.D(t10, v10);
    }
}
