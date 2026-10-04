package com.cookiegames.smartcookie.view;

import B0.C0920d;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.cookiegames.smartcookie.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.view.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C3229a extends TransitionDrawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f148434b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f148435a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3229a(@NotNull Context context) {
        super(new Drawable[]{new ColorDrawable(C0920d.getColor(context, p.f.Ff)), new ColorDrawable(C4.r.d(context, p.d.xj))});
        kotlin.jvm.internal.G.p(context, "context");
    }

    @Override // android.graphics.drawable.TransitionDrawable
    public void reverseTransition(int i10) {
        if (this.f148435a) {
            super.reverseTransition(i10);
        }
        this.f148435a = false;
    }

    @Override // android.graphics.drawable.TransitionDrawable
    public void startTransition(int i10) {
        if (!this.f148435a) {
            super.startTransition(i10);
        }
        this.f148435a = true;
    }
}
