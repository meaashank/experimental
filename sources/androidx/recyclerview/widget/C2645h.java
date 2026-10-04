package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.activity.C1477d;
import androidx.annotation.NonNull;
import androidx.core.view.C2507z0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2645h extends C {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static TimeInterpolator f116633A = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final boolean f116634z = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<RecyclerView.C> f116635o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<RecyclerView.C> f116636p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<j> f116637q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<i> f116638r = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.C>> f116639s = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList<ArrayList<j>> f116640t = new ArrayList<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<ArrayList<i>> f116641u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList<RecyclerView.C> f116642v = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList<RecyclerView.C> f116643w = new ArrayList<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<RecyclerView.C> f116644x = new ArrayList<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList<RecyclerView.C> f116645y = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f116646a;

        public a(ArrayList arrayList) {
            this.f116646a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f116646a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j jVar = (j) obj;
                C2645h.this.b0(jVar.f116680a, jVar.f116681b, jVar.f116682c, jVar.f116683d, jVar.f116684e);
            }
            this.f116646a.clear();
            C2645h.this.f116640t.remove(this.f116646a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f116648a;

        public b(ArrayList arrayList) {
            this.f116648a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f116648a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                C2645h.this.a0((i) obj);
            }
            this.f116648a.clear();
            C2645h.this.f116641u.remove(this.f116648a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f116650a;

        public c(ArrayList arrayList) {
            this.f116650a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f116650a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                C2645h.this.Z((RecyclerView.C) obj);
            }
            this.f116650a.clear();
            C2645h.this.f116639s.remove(this.f116650a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$d */
    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.C f116652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f116653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f116654c;

        public d(RecyclerView.C c10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f116652a = c10;
            this.f116653b = viewPropertyAnimator;
            this.f116654c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f116653b.setListener(null);
            this.f116654c.setAlpha(1.0f);
            C2645h.this.h(this.f116652a);
            C2645h.this.f116644x.remove(this.f116652a);
            C2645h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2645h.this.getClass();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$e */
    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.C f116656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f116657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f116658c;

        public e(RecyclerView.C c10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f116656a = c10;
            this.f116657b = view;
            this.f116658c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f116657b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f116658c.setListener(null);
            C2645h.this.h(this.f116656a);
            C2645h.this.f116642v.remove(this.f116656a);
            C2645h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2645h.this.getClass();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$f */
    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.C f116660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f116661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f116662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f116663d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f116664e;

        public f(RecyclerView.C c10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f116660a = c10;
            this.f116661b = i10;
            this.f116662c = view;
            this.f116663d = i11;
            this.f116664e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f116661b != 0) {
                this.f116662c.setTranslationX(0.0f);
            }
            if (this.f116663d != 0) {
                this.f116662c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f116664e.setListener(null);
            C2645h.this.h(this.f116660a);
            C2645h.this.f116643w.remove(this.f116660a);
            C2645h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2645h.this.getClass();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$g */
    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f116666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f116667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f116668c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f116666a = iVar;
            this.f116667b = viewPropertyAnimator;
            this.f116668c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f116667b.setListener(null);
            this.f116668c.setAlpha(1.0f);
            this.f116668c.setTranslationX(0.0f);
            this.f116668c.setTranslationY(0.0f);
            C2645h.this.h(this.f116666a.f116674a);
            C2645h.this.f116645y.remove(this.f116666a.f116674a);
            C2645h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2645h c2645h = C2645h.this;
            RecyclerView.C c10 = this.f116666a.f116674a;
            c2645h.getClass();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$h, reason: collision with other inner class name */
    public class C0325h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f116670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f116671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f116672c;

        public C0325h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f116670a = iVar;
            this.f116671b = viewPropertyAnimator;
            this.f116672c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f116671b.setListener(null);
            this.f116672c.setAlpha(1.0f);
            this.f116672c.setTranslationX(0.0f);
            this.f116672c.setTranslationY(0.0f);
            C2645h.this.h(this.f116670a.f116675b);
            C2645h.this.f116645y.remove(this.f116670a.f116675b);
            C2645h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2645h c2645h = C2645h.this;
            RecyclerView.C c10 = this.f116670a.f116675b;
            c2645h.getClass();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$j */
    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.C f116680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f116682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f116683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f116684e;

        public j(RecyclerView.C c10, int i10, int i11, int i12, int i13) {
            this.f116680a = c10;
            this.f116681b = i10;
            this.f116682c = i11;
            this.f116683d = i12;
            this.f116684e = i13;
        }
    }

    @Override // androidx.recyclerview.widget.C
    public boolean D(RecyclerView.C c10) {
        i0(c10);
        c10.itemView.setAlpha(0.0f);
        this.f116636p.add(c10);
        return true;
    }

    @Override // androidx.recyclerview.widget.C
    public boolean E(RecyclerView.C c10, RecyclerView.C c11, int i10, int i11, int i12, int i13) {
        if (c10 == c11) {
            return F(c10, i10, i11, i12, i13);
        }
        float translationX = c10.itemView.getTranslationX();
        float translationY = c10.itemView.getTranslationY();
        float alpha = c10.itemView.getAlpha();
        i0(c10);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        c10.itemView.setTranslationX(translationX);
        c10.itemView.setTranslationY(translationY);
        c10.itemView.setAlpha(alpha);
        if (c11 != null) {
            i0(c11);
            c11.itemView.setTranslationX(-i14);
            c11.itemView.setTranslationY(-i15);
            c11.itemView.setAlpha(0.0f);
        }
        this.f116638r.add(new i(c10, c11, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.C
    public boolean F(RecyclerView.C c10, int i10, int i11, int i12, int i13) {
        View view = c10.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) c10.itemView.getTranslationY());
        i0(c10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            h(c10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f116637q.add(new j(c10, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.C
    public boolean G(RecyclerView.C c10) {
        i0(c10);
        this.f116635o.add(c10);
        return true;
    }

    public void Z(RecyclerView.C c10) {
        View view = c10.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f116642v.add(c10);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(m()).setListener(new e(c10, view, viewPropertyAnimatorAnimate)).start();
    }

    public void a0(i iVar) {
        RecyclerView.C c10 = iVar.f116674a;
        View view = c10 == null ? null : c10.itemView;
        RecyclerView.C c11 = iVar.f116675b;
        View view2 = c11 != null ? c11.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(n());
            this.f116645y.add(iVar.f116674a);
            duration.translationX(iVar.f116678e - iVar.f116676c);
            duration.translationY(iVar.f116679f - iVar.f116677d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f116645y.add(iVar.f116675b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(n()).alpha(1.0f).setListener(new C0325h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public void b0(RecyclerView.C c10, int i10, int i11, int i12, int i13) {
        View view = c10.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f116643w.add(c10);
        viewPropertyAnimatorAnimate.setDuration(o()).setListener(new f(c10, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    public final void c0(RecyclerView.C c10) {
        View view = c10.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f116644x.add(c10);
        viewPropertyAnimatorAnimate.setDuration(p()).alpha(0.0f).setListener(new d(c10, viewPropertyAnimatorAnimate, view)).start();
    }

    public void d0(List<RecyclerView.C> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public void e0() {
        if (q()) {
            return;
        }
        j();
    }

    public final void f0(List<i> list, RecyclerView.C c10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (h0(iVar, c10) && iVar.f116674a == null && iVar.f116675b == null) {
                list.remove(iVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(@NonNull RecyclerView.C c10, @NonNull List<Object> list) {
        return !list.isEmpty() || f(c10);
    }

    public final void g0(i iVar) {
        RecyclerView.C c10 = iVar.f116674a;
        if (c10 != null) {
            h0(iVar, c10);
        }
        RecyclerView.C c11 = iVar.f116675b;
        if (c11 != null) {
            h0(iVar, c11);
        }
    }

    public final boolean h0(i iVar, RecyclerView.C c10) {
        if (iVar.f116675b == c10) {
            iVar.f116675b = null;
        } else {
            if (iVar.f116674a != c10) {
                return false;
            }
            iVar.f116674a = null;
        }
        c10.itemView.setAlpha(1.0f);
        c10.itemView.setTranslationX(0.0f);
        c10.itemView.setTranslationY(0.0f);
        h(c10);
        return true;
    }

    public final void i0(RecyclerView.C c10) {
        if (f116633A == null) {
            f116633A = new ValueAnimator().getInterpolator();
        }
        c10.itemView.animate().setInterpolator(f116633A);
        k(c10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k(RecyclerView.C c10) {
        View view = c10.itemView;
        view.animate().cancel();
        int size = this.f116637q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f116637q.get(size).f116680a == c10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(c10);
                this.f116637q.remove(size);
            }
        }
        f0(this.f116638r, c10);
        if (this.f116635o.remove(c10)) {
            view.setAlpha(1.0f);
            h(c10);
        }
        if (this.f116636p.remove(c10)) {
            view.setAlpha(1.0f);
            h(c10);
        }
        for (int size2 = this.f116641u.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f116641u.get(size2);
            f0(arrayList, c10);
            if (arrayList.isEmpty()) {
                this.f116641u.remove(size2);
            }
        }
        for (int size3 = this.f116640t.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f116640t.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f116680a == c10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    h(c10);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f116640t.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f116639s.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.C> arrayList3 = this.f116639s.get(size5);
            if (arrayList3.remove(c10)) {
                view.setAlpha(1.0f);
                h(c10);
                if (arrayList3.isEmpty()) {
                    this.f116639s.remove(size5);
                }
            }
        }
        this.f116644x.remove(c10);
        this.f116642v.remove(c10);
        this.f116645y.remove(c10);
        this.f116643w.remove(c10);
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void l() {
        int size = this.f116637q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f116637q.get(size);
            View view = jVar.f116680a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(jVar.f116680a);
            this.f116637q.remove(size);
        }
        for (int size2 = this.f116635o.size() - 1; size2 >= 0; size2--) {
            h(this.f116635o.get(size2));
            this.f116635o.remove(size2);
        }
        int size3 = this.f116636p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C c10 = this.f116636p.get(size3);
            c10.itemView.setAlpha(1.0f);
            h(c10);
            this.f116636p.remove(size3);
        }
        for (int size4 = this.f116638r.size() - 1; size4 >= 0; size4--) {
            g0(this.f116638r.get(size4));
        }
        this.f116638r.clear();
        if (q()) {
            for (int size5 = this.f116640t.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f116640t.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f116680a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    h(jVar2.f116680a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f116640t.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f116639s.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.C> arrayList2 = this.f116639s.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C c11 = arrayList2.get(size8);
                    c11.itemView.setAlpha(1.0f);
                    h(c11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f116639s.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f116641u.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f116641u.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    g0(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f116641u.remove(arrayList3);
                    }
                }
            }
            d0(this.f116644x);
            d0(this.f116643w);
            d0(this.f116642v);
            d0(this.f116645y);
            j();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean q() {
        return (this.f116636p.isEmpty() && this.f116638r.isEmpty() && this.f116637q.isEmpty() && this.f116635o.isEmpty() && this.f116643w.isEmpty() && this.f116644x.isEmpty() && this.f116642v.isEmpty() && this.f116645y.isEmpty() && this.f116640t.isEmpty() && this.f116639s.isEmpty() && this.f116641u.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void x() {
        boolean zIsEmpty = this.f116635o.isEmpty();
        boolean zIsEmpty2 = this.f116637q.isEmpty();
        boolean zIsEmpty3 = this.f116638r.isEmpty();
        boolean zIsEmpty4 = this.f116636p.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        ArrayList<RecyclerView.C> arrayList = this.f116635o;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            RecyclerView.C c10 = arrayList.get(i10);
            i10++;
            c0(c10);
        }
        this.f116635o.clear();
        if (!zIsEmpty2) {
            ArrayList<j> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f116637q);
            this.f116640t.add(arrayList2);
            this.f116637q.clear();
            a aVar = new a(arrayList2);
            if (zIsEmpty) {
                aVar.run();
            } else {
                C2507z0.v1(arrayList2.get(0).f116680a.itemView, aVar, p());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<i> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.f116638r);
            this.f116641u.add(arrayList3);
            this.f116638r.clear();
            b bVar = new b(arrayList3);
            if (zIsEmpty) {
                bVar.run();
            } else {
                C2507z0.v1(arrayList3.get(0).f116674a.itemView, bVar, p());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.C> arrayList4 = new ArrayList<>();
        arrayList4.addAll(this.f116636p);
        this.f116639s.add(arrayList4);
        this.f116636p.clear();
        c cVar = new c(arrayList4);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            C2507z0.v1(arrayList4.get(0).itemView, cVar, Math.max(!zIsEmpty2 ? o() : 0L, zIsEmpty3 ? 0L : n()) + (!zIsEmpty ? p() : 0L));
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$i */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.C f116674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.C f116675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f116676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f116677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f116678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f116679f;

        public i(RecyclerView.C c10, RecyclerView.C c11) {
            this.f116674a = c10;
            this.f116675b = c11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
            sb2.append(this.f116674a);
            sb2.append(", newHolder=");
            sb2.append(this.f116675b);
            sb2.append(", fromX=");
            sb2.append(this.f116676c);
            sb2.append(", fromY=");
            sb2.append(this.f116677d);
            sb2.append(", toX=");
            sb2.append(this.f116678e);
            sb2.append(", toY=");
            return C1477d.a(sb2, this.f116679f, '}');
        }

        public i(RecyclerView.C c10, RecyclerView.C c11, int i10, int i11, int i12, int i13) {
            this(c10, c11);
            this.f116676c = i10;
            this.f116677d = i11;
            this.f116678e = i12;
            this.f116679f = i13;
        }
    }
}
