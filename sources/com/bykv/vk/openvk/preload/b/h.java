package com.bykv.vk.openvk.preload.b;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class<? extends d> f140413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.b.b.a f140414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f140415c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Class<? extends d> f140416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.b.b.a f140417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object[] f140418c;

        private a() {
        }

        public static a a() {
            return new a();
        }

        public final h b() {
            return new h(this, (byte) 0);
        }

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.f140416a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final a a(com.bykv.vk.openvk.preload.b.b.a aVar) {
            this.f140417b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.f140418c = objArr;
            return this;
        }
    }

    public /* synthetic */ h(a aVar, byte b10) {
        this(aVar);
    }

    public final com.bykv.vk.openvk.preload.b.b.a a() {
        return this.f140414b;
    }

    public final Object[] b() {
        return this.f140415c;
    }

    private h(a aVar) {
        this.f140413a = aVar.f140416a;
        this.f140414b = aVar.f140417b;
        this.f140415c = aVar.f140418c;
        if (this.f140413a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
