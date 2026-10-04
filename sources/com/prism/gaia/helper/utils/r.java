package com.prism.gaia.helper.utils;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f165212a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f165213b;

    public interface a {
        void a(ViewGroup viewGroup);

        void b(View view);
    }

    public r(a aVar) {
        this.f165213b = aVar;
    }

    public static r a(a aVar) {
        return new r(aVar);
    }

    public void b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        this.f165212a++;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            this.f165213b.b(childAt);
            if (childAt instanceof ViewGroup) {
                b((ViewGroup) childAt);
            }
        }
        int i11 = this.f165212a - 1;
        this.f165212a = i11;
        if (i11 == 0) {
            this.f165213b.a(viewGroup);
        }
    }
}
