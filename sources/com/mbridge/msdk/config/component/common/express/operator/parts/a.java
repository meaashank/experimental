package com.mbridge.msdk.config.component.common.express.operator.parts;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f154291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f154292b;

    private a(boolean z10, Object obj) {
        this.f154291a = z10;
        this.f154292b = obj;
    }

    public static a a(Object obj) {
        return new a(true, obj);
    }

    public static a c() {
        return new a(false, null);
    }

    public boolean b() {
        return this.f154291a;
    }

    public Object a() {
        Object obj = this.f154292b;
        return obj instanceof Boolean ? Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0) : obj instanceof Integer ? String.valueOf(obj) : obj;
    }
}
