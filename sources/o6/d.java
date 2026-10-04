package O6;

import android.content.Context;
import android.os.Handler;
import androidx.activity.result.i;
import com.prism.fusionadsdk.internal.config.AdPlaceItems;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class d implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65196h = com.prism.fusionadsdkbase.a.f162373j.concat(d.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<AdPlaceItems> f65197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J6.c f65198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f65199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f65200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f65201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f65202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f65203g = 0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f65204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f65205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f65206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AdPlaceItems f65207d;

        public a(int i10, String str, Object obj, AdPlaceItems adPlaceItems) {
            this.f65204a = i10;
            this.f65205b = str;
            this.f65206c = obj;
            this.f65207d = adPlaceItems;
        }

        @Override // java.lang.Runnable
        public void run() {
            String unused = d.f65196h;
            StringBuilder sb2 = new StringBuilder("to call onLoaded: haveShow");
            sb2.append(d.this.f65202f);
            sb2.append("idx=");
            sb2.append(this.f65204a);
            if (d.this.f65202f) {
                return;
            }
            d.this.f65202f = true;
            d.this.f65199c.e(this.f65205b, this.f65206c, this.f65207d);
        }
    }

    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f65209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f65210b;

        public /* synthetic */ b(d dVar, c cVar, int i10, a aVar) {
            this(cVar, i10);
        }

        @Override // O6.c
        public void a(String str) {
            this.f65209a.a(str);
            String unused = d.f65196h;
            StringBuilder sb2 = new StringBuilder("onAdOpened, who=");
            sb2.append(str);
            sb2.append("; idx=");
            sb2.append(this.f65210b);
        }

        @Override // O6.c
        public void b(String str) {
            this.f65209a.b(str);
            String unused = d.f65196h;
            StringBuilder sb2 = new StringBuilder("onAdClosed, who=");
            sb2.append(str);
            sb2.append("; idx=");
            sb2.append(this.f65210b);
        }

        @Override // O6.c
        public void c(String str) {
            this.f65209a.c(str);
            String unused = d.f65196h;
            StringBuilder sb2 = new StringBuilder("onAdClicked, who=");
            sb2.append(str);
            sb2.append("; idx=");
            sb2.append(this.f65210b);
        }

        @Override // O6.c
        public void d(String str) {
            this.f65209a.d(str);
            String unused = d.f65196h;
            StringBuilder sb2 = new StringBuilder("onAdImpression, who=");
            sb2.append(str);
            sb2.append("; idx=");
            sb2.append(this.f65210b);
        }

        @Override // O6.c
        public void e(String str, Object obj, AdPlaceItems adPlaceItems) {
            d.this.h(obj, this.f65210b, str, adPlaceItems);
            String str2 = d.f65196h;
            i.a("onAdLoaded, who=", str, "; idx=").append(this.f65210b);
        }

        @Override // O6.c
        public void f(String str) {
            this.f65209a.f(str);
            String unused = d.f65196h;
            StringBuilder sb2 = new StringBuilder("onAdLeftApplication, who=");
            sb2.append(str);
            sb2.append("; idx=");
            sb2.append(this.f65210b);
        }

        @Override // O6.c
        public void onAdFailedToLoad(int i10) {
            d.this.g(this.f65210b, i10);
            String str = d.f65196h;
            android.support.v4.media.a.a("onAdFailedToLoad, code=", i10, "; idx=").append(this.f65210b);
        }

        public b(c cVar, int i10) {
            this.f65210b = i10;
            this.f65209a = cVar;
        }
    }

    public d(ArrayList<AdPlaceItems> arrayList, Context context, c cVar) {
        if (this.f65197a == null) {
            this.f65197a = new ArrayList<>();
        }
        this.f65201e = context;
        this.f65199c = cVar;
        this.f65197a.addAll(arrayList);
        this.f65200d = new Handler();
    }

    public final void g(int i10, int i11) {
        c cVar;
        this.f65203g++;
        if (!this.f65202f && this.f65203g >= this.f65197a.size() && (cVar = this.f65199c) != null) {
            cVar.onAdFailedToLoad(com.prism.fusionadsdkbase.a.f162366c);
            return;
        }
        StringBuilder sb2 = new StringBuilder("onAdFailed, idx=");
        sb2.append(i10);
        sb2.append("; code=");
        sb2.append(i11);
        sb2.append(" have same ad not return, do nothing");
    }

    public final void h(Object obj, int i10, String str, AdPlaceItems adPlaceItems) {
        if (i10 == 0 && !this.f65202f) {
            this.f65202f = true;
            this.f65199c.e(str, obj, adPlaceItems);
        } else {
            if (this.f65202f || i10 == 0) {
                return;
            }
            this.f65200d.postDelayed(new a(i10, str, obj, adPlaceItems), i10 * 3000);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i10 = 0; i10 < this.f65197a.size(); i10++) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f65197a.get(i10));
            new O6.b(arrayList, this.f65201e, new b(this.f65199c, i10)).run();
        }
    }
}
