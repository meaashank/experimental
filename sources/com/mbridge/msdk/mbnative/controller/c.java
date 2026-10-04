package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f157403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<View> f157404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f157405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f157406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f157407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f157408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f157409g;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            c.this.b();
            return true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.c$c, reason: collision with other inner class name */
    public class RunnableC0589c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f157412a;

        public RunnableC0589c(View view) {
            this.f157412a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewTreeObserver viewTreeObserver = this.f157412a.getViewTreeObserver();
            if (viewTreeObserver == null || viewTreeObserver.isAlive()) {
                c.this.f157403a = new WeakReference(viewTreeObserver);
                if (c.this.f157405c != null) {
                    viewTreeObserver.addOnPreDrawListener(c.this.f157405c);
                }
            }
        }
    }

    public interface d {
        void a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public c(List<View> list, d dVar, Handler handler, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f157404b = arrayList;
        this.f157405c = null;
        this.f157406d = dVar;
        this.f157407e = handler;
        this.f157409g = i10;
        if (list != null) {
            this.f157404b = list;
        } else {
            arrayList.clear();
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f157408f = false;
            List<View> list = this.f157404b;
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            for (int i10 = 0; i10 < this.f157404b.size(); i10++) {
                View view = this.f157404b.get(i10);
                if (b(view)) {
                    arrayList.add(view);
                } else {
                    arrayList2.add(view);
                }
            }
            d dVar = this.f157406d;
            if (dVar != null) {
                dVar.a(arrayList, arrayList2);
            }
            if (arrayList.size() > 0) {
                a();
            }
            arrayList.clear();
            arrayList2.clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f157408f) {
            return;
        }
        Handler handler = this.f157407e;
        if (handler != null) {
            if (this.f157409g == 1) {
                d();
            } else {
                handler.postDelayed(new b(), 100L);
            }
        }
        this.f157408f = true;
    }

    private void c() {
        try {
            b();
        } catch (Throwable th) {
            q0.b("ImpressionTracker", th.getMessage(), th);
        }
        try {
            this.f157405c = new a();
        } catch (Throwable th2) {
            q0.b("ImpressionTracker", th2.getMessage(), th2);
        }
    }

    public void a(View view) {
        View viewA;
        View view2;
        if (view != null) {
            viewA = f.a(view.getContext(), view);
            this.f157404b.add(view);
        } else {
            List<View> list = this.f157404b;
            viewA = null;
            if (list != null && list.size() > 0) {
                for (int i10 = 0; i10 < this.f157404b.size() && ((view2 = this.f157404b.get(i10)) == null || (viewA = f.a(view2.getContext(), view2)) == null); i10++) {
                }
            }
        }
        if (viewA == null) {
            return;
        }
        viewA.post(new RunnableC0589c(viewA));
    }

    private boolean b(View view) {
        return !e1.a(view, this.f157409g);
    }

    public void a() {
        try {
            this.f157408f = false;
            WeakReference<ViewTreeObserver> weakReference = this.f157403a;
            if (weakReference != null && weakReference.get() != null) {
                ViewTreeObserver viewTreeObserver = this.f157403a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f157405c);
                }
                this.f157403a.clear();
            }
            this.f157406d = null;
            this.f157405c = null;
            List<View> list = this.f157404b;
            if (list != null) {
                list.clear();
            }
            this.f157404b = null;
        } catch (Throwable unused) {
        }
    }
}
