package Xb;

import Zb.e;
import ac.C1469b;
import android.content.Context;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.common.g;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.k;
import com.unity3d.scar.adapter.common.l;

/* JADX INFO: loaded from: classes7.dex */
public class c extends k implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Yb.a f79074e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Zb.c f79075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Mb.c f79076b;

        /* JADX INFO: renamed from: Xb.c$a$a, reason: collision with other inner class name */
        public class C0143a implements Mb.b {
            public C0143a() {
            }

            @Override // Mb.b
            public void onAdLoaded() {
                a aVar = a.this;
                c.this.f194497b.put(aVar.f79076b.c(), a.this.f79075a);
            }
        }

        public a(Zb.c cVar, Mb.c cVar2) {
            this.f79075a = cVar;
            this.f79076b = cVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f79075a.a(new C0143a());
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f79079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Mb.c f79080b;

        public class a implements Mb.b {
            public a() {
            }

            @Override // Mb.b
            public void onAdLoaded() {
                b bVar = b.this;
                c.this.f194497b.put(bVar.f79080b.c(), b.this.f79079a);
            }
        }

        public b(e eVar, Mb.c cVar) {
            this.f79079a = eVar;
            this.f79080b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f79079a.a(new a());
        }
    }

    public c(d dVar, String str) {
        super(dVar);
        Yb.a aVar = new Yb.a(new Lb.a(str));
        this.f79074e = aVar;
        this.f194496a = new C1469b(aVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void c(Context context, Mb.c cVar, h hVar) {
        l.a(new b(new e(context, this.f79074e, cVar, this.f194499d, hVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void d(Context context, Mb.c cVar, g gVar) {
        l.a(new a(new Zb.c(context, this.f79074e, cVar, this.f194499d, gVar), cVar));
    }
}
