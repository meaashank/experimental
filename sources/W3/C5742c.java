package w3;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import w3.InterfaceC5744e;

/* JADX INFO: renamed from: w3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5742c implements InterfaceC5744e<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f240080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f240081b;

    public C5742c(int i10, boolean z10) {
        this.f240080a = i10;
        this.f240081b = z10;
    }

    @Override // w3.InterfaceC5744e
    public /* bridge */ /* synthetic */ boolean a(Drawable drawable, InterfaceC5744e.a aVar) {
        b(drawable, aVar);
        return true;
    }

    public boolean b(Drawable drawable, InterfaceC5744e.a aVar) {
        Drawable drawableA = aVar.a();
        if (drawableA == null) {
            drawableA = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableA, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f240081b);
        transitionDrawable.startTransition(this.f240080a);
        aVar.b(transitionDrawable);
        return true;
    }
}
