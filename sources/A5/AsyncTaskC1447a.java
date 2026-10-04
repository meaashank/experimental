package a5;

import android.os.AsyncTask;
import android.util.Log;
import com.prism.commons.utils.l0;
import java.util.ArrayList;

/* JADX INFO: renamed from: a5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class AsyncTaskC1447a extends AsyncTask<Void, Void, ArrayList<P4.b>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f84727g = l0.b(AsyncTaskC1447a.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0159a f84729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R4.a<Long> f84730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R4.a<String> f84731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final R4.a<Long> f84732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f84733f;

    /* JADX INFO: renamed from: a5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0159a {
        void a(ArrayList<P4.b> arrayList);
    }

    public AsyncTaskC1447a(int i10, InterfaceC0159a interfaceC0159a) {
        this(i10, interfaceC0159a, null, null, null, false);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ArrayList<P4.b> doInBackground(Void... voidArr) {
        Log.d(f84727g, "doInBackground function: " + this.f84728a);
        C1448b c1448b = new C1448b(this.f84730c, this.f84731d, this.f84732e, this.f84733f);
        int i10 = this.f84728a;
        return i10 != 0 ? i10 != 1 ? c1448b.b() : c1448b.c() : c1448b.a();
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(ArrayList<P4.b> arrayList) {
        super.onPostExecute(arrayList);
        this.f84729b.a(arrayList);
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
    }

    public AsyncTaskC1447a(int i10, InterfaceC0159a interfaceC0159a, R4.a<Long> aVar, R4.a<String> aVar2, R4.a<Long> aVar3, boolean z10) {
        this.f84728a = i10;
        this.f84729b = interfaceC0159a;
        this.f84730c = aVar;
        this.f84731d = aVar2;
        this.f84732e = aVar3;
        this.f84733f = z10;
    }
}
