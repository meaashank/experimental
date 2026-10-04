package androidx.databinding;

import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewStub f112257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B f112258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f112259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewStub.OnInflateListener f112260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B f112261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewStub.OnInflateListener f112262f;

    public class a implements ViewStub.OnInflateListener {
        public a() {
        }

        @Override // android.view.ViewStub.OnInflateListener
        public void onInflate(ViewStub viewStub, View view) {
            C c10 = C.this;
            c10.f112259c = view;
            c10.f112258b = l.c(c10.f112261e.f112239k, view, viewStub.getLayoutResource());
            C c11 = C.this;
            c11.f112257a = null;
            ViewStub.OnInflateListener onInflateListener = c11.f112260d;
            if (onInflateListener != null) {
                onInflateListener.onInflate(viewStub, view);
                C.this.f112260d = null;
            }
            C.this.f112261e.T();
            C.this.f112261e.r();
        }
    }

    public C(@NonNull ViewStub viewStub) {
        a aVar = new a();
        this.f112262f = aVar;
        this.f112257a = viewStub;
        viewStub.setOnInflateListener(aVar);
    }

    @Nullable
    public B g() {
        return this.f112258b;
    }

    public View h() {
        return this.f112259c;
    }

    @Nullable
    public ViewStub i() {
        return this.f112257a;
    }

    public boolean j() {
        return this.f112259c != null;
    }

    public void k(@NonNull B b10) {
        this.f112261e = b10;
    }

    public void l(@Nullable ViewStub.OnInflateListener onInflateListener) {
        if (this.f112257a != null) {
            this.f112260d = onInflateListener;
        }
    }
}
