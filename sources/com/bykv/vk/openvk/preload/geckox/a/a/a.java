package com.bykv.vk.openvk.preload.geckox.a.a;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f140453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f140454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f140455c;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    public static final class C0379a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f140456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f140457b = b.f140458a;

        public final C0379a a() {
            this.f140456a = 20;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }

        public final C0379a a(b bVar) {
            if (bVar == null) {
                bVar = b.f140458a;
            }
            this.f140457b = bVar;
            return this;
        }
    }

    public /* synthetic */ a(C0379a c0379a, byte b10) {
        this(c0379a);
    }

    public final b a() {
        return this.f140454b;
    }

    private a(C0379a c0379a) {
        this.f140453a = c0379a.f140456a;
        this.f140454b = c0379a.f140457b;
        this.f140455c = null;
    }
}
