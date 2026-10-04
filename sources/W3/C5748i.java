package w3;

import android.view.View;
import w3.InterfaceC5744e;

/* JADX INFO: renamed from: w3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5748i<R> implements InterfaceC5744e<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f240090a;

    /* JADX INFO: renamed from: w3.i$a */
    public interface a {
        void a(View view);
    }

    public C5748i(a aVar) {
        this.f240090a = aVar;
    }

    @Override // w3.InterfaceC5744e
    public boolean a(R r10, InterfaceC5744e.a aVar) {
        if (aVar.getView() == null) {
            return false;
        }
        this.f240090a.a(aVar.getView());
        return false;
    }
}
