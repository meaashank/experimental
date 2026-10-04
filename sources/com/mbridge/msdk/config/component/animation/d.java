package com.mbridge.msdk.config.component.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<String, f> f154159a = new ConcurrentHashMap<>();

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f154160a;

        public a(String str) {
            this.f154160a = str;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            f fVar = (f) d.f154159a.get(this.f154160a);
            if (fVar == null || fVar.a() != animator) {
                return;
            }
            d.f154159a.remove(this.f154160a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public void b(String str) {
        f fVar = f154159a.get(str);
        if (fVar == null || fVar.a() == null) {
            return;
        }
        fVar.a().pause();
    }

    public void c(String str) {
        f fVar = f154159a.get(str);
        if (fVar == null || fVar.a() == null) {
            return;
        }
        fVar.a().resume();
    }

    public void d(String str) {
        f fVar = f154159a.get(str);
        if (fVar == null || fVar.a() == null) {
            return;
        }
        fVar.a().start();
    }

    public void e(String str) {
        a(str, true);
    }

    public void a(String str, g gVar, View view, Animator animator, boolean z10) {
        if (animator == null || view == null) {
            return;
        }
        String strA = a(str, gVar, view);
        if (z10 && f154159a.containsKey(strA)) {
            a(strA);
        }
        f fVar = new f();
        fVar.a(strA);
        fVar.a(gVar);
        fVar.a(view);
        fVar.a(animator);
        fVar.a(i.a(view));
        a(strA, animator);
        f154159a.put(strA, fVar);
        animator.start();
    }

    public void a(String str, boolean z10) {
        f fVarRemove = f154159a.remove(str);
        if (fVarRemove == null) {
            return;
        }
        Animator animatorA = fVarRemove.a();
        if (animatorA != null) {
            animatorA.cancel();
        }
        if (!z10 || fVarRemove.b() == null) {
            return;
        }
        fVarRemove.b().b(fVarRemove.c());
    }

    public void a(String str) {
        Animator animatorA;
        f fVarRemove = f154159a.remove(str);
        if (fVarRemove == null || (animatorA = fVarRemove.a()) == null) {
            return;
        }
        animatorA.cancel();
        animatorA.removeAllListeners();
    }

    public void a(View view) {
        if (view != null) {
            ConcurrentHashMap<String, f> concurrentHashMap = f154159a;
            if (concurrentHashMap.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, f> entry : concurrentHashMap.entrySet()) {
                f value = entry.getValue();
                if (value != null && a(view, value.c())) {
                    arrayList.add(entry.getKey());
                }
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                a((String) obj);
            }
        }
    }

    private void a(String str, Animator animator) {
        animator.addListener(new a(str));
    }

    private String a(String str, g gVar, View view) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (gVar != null && !TextUtils.isEmpty(gVar.a())) {
            return gVar.a();
        }
        return String.valueOf(System.identityHashCode(view));
    }

    private boolean a(View view, View view2) {
        if (view != null && view2 != null) {
            if (view == view2) {
                return true;
            }
            while (view2 != null) {
                Object parent = view2.getParent();
                if (!(parent instanceof View)) {
                    return false;
                }
                if (parent == view) {
                    return true;
                }
                view2 = (View) parent;
            }
        }
        return false;
    }
}
