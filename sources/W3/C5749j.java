package w3;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import w3.InterfaceC5744e;

/* JADX INFO: renamed from: w3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5749j<R> implements InterfaceC5744e<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f240091a;

    /* JADX INFO: renamed from: w3.j$a */
    public interface a {
        Animation a(Context context);
    }

    public C5749j(a aVar) {
        this.f240091a = aVar;
    }

    @Override // w3.InterfaceC5744e
    public boolean a(R r10, InterfaceC5744e.a aVar) {
        View view = aVar.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.f240091a.a(view.getContext()));
        return false;
    }
}
