package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes7.dex */
public class c extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f194494a = "Cannot show ad that is not loaded for placement %s";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f194495b = "Missing queryInfoMetadata for ad %s";

    public c(GMAEvent gMAEvent, Object... objArr) {
        super(gMAEvent, null, objArr);
    }

    public static c a(Mb.c cVar) {
        String str = String.format(f194494a, cVar.c());
        return new c((Enum<?>) GMAEvent.AD_NOT_LOADED_ERROR, str, cVar.c(), cVar.d(), str);
    }

    public static c b(String str) {
        return new c((Enum<?>) GMAEvent.SCAR_UNSUPPORTED, str, new Object[0]);
    }

    public static c c(Mb.c cVar, String str) {
        return new c((Enum<?>) GMAEvent.INTERNAL_LOAD_ERROR, str, cVar.c(), cVar.d(), str);
    }

    public static c d(Mb.c cVar, String str) {
        return new c((Enum<?>) GMAEvent.INTERNAL_SHOW_ERROR, str, cVar.c(), cVar.d(), str);
    }

    public static c e(String str) {
        return new c((Enum<?>) GMAEvent.INTERNAL_SIGNALS_ERROR, str, str);
    }

    public static c f(String str, String str2, String str3) {
        return new c((Enum<?>) GMAEvent.NO_AD_ERROR, str3, str, str2, str3);
    }

    public static c g(Mb.c cVar) {
        String str = String.format(f194495b, cVar.c());
        return new c((Enum<?>) GMAEvent.QUERY_NOT_FOUND_ERROR, str, cVar.c(), cVar.d(), str);
    }

    @Override // com.unity3d.scar.adapter.common.m, com.unity3d.scar.adapter.common.i
    public String getDomain() {
        return "GMA";
    }

    public c(GMAEvent gMAEvent, String str, Object... objArr) {
        super(gMAEvent, str, objArr);
    }
}
