package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f160145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f160146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f160147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f160148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f160149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f160150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f160151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f160152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f160153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f160154j;

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p f160158d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f160162h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private w f160163i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f f160164j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f160155a = 50;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f160156b = 15000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f160157c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f160159e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f160160f = 50;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f160161g = 604800000;

        public b a(int i10, p pVar) {
            this.f160157c = i10;
            this.f160158d = pVar;
            return this;
        }

        public b b(int i10) {
            if (i10 <= 0) {
                this.f160155a = 50;
                return this;
            }
            this.f160155a = i10;
            return this;
        }

        public b c(int i10) {
            if (i10 < 0) {
                this.f160156b = 15000;
                return this;
            }
            this.f160156b = i10;
            return this;
        }

        public b d(int i10) {
            if (i10 < 0) {
                this.f160160f = 50;
                return this;
            }
            this.f160160f = i10;
            return this;
        }

        public b e(int i10) {
            if (i10 <= 0) {
                this.f160159e = 2;
                return this;
            }
            this.f160159e = i10;
            return this;
        }

        public b a(int i10) {
            if (i10 < 0) {
                this.f160161g = 604800000;
                return this;
            }
            this.f160161g = i10;
            return this;
        }

        public b a(d dVar) {
            this.f160162h = dVar;
            return this;
        }

        public b a(w wVar) {
            this.f160163i = wVar;
            return this;
        }

        public b a(f fVar) {
            this.f160164j = fVar;
            return this;
        }

        public x a() {
            if (y.b(this.f160162h) && com.mbridge.msdk.tracker.a.f159874a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.b(this.f160163i) && com.mbridge.msdk.tracker.a.f159874a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.b(this.f160158d) || y.b(this.f160158d.b())) && com.mbridge.msdk.tracker.a.f159874a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new x(this);
        }
    }

    private x(b bVar) {
        this.f160145a = bVar.f160155a;
        this.f160146b = bVar.f160156b;
        this.f160147c = bVar.f160157c;
        this.f160148d = bVar.f160159e;
        this.f160149e = bVar.f160160f;
        this.f160150f = bVar.f160161g;
        this.f160151g = bVar.f160158d;
        this.f160152h = bVar.f160162h;
        this.f160153i = bVar.f160163i;
        this.f160154j = bVar.f160164j;
    }
}
