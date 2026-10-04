package com.cookiegames.smartcookie.settings.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.cookiegames.smartcookie.p;
import com.google.android.material.slider.Slider;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.settings.fragment.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C3175j0 extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f148163b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Inject
    public u4.e f148164a;

    public C3175j0() {
        super(p.m.f145131K0);
    }

    public static final void n(C3175j0 c3175j0, LinearLayout.LayoutParams layoutParams, RelativeLayout relativeLayout, Slider slider, float f10, boolean z10) {
        kotlin.jvm.internal.G.p(slider, "slider");
        if (c3175j0.m().Q0()) {
            layoutParams.setMargins(0, 0, 0, ((int) f10) * 10);
        } else {
            layoutParams.setMargins(0, ((int) f10) * 10, 0, 0);
        }
        c3175j0.m().D1((int) f10);
        relativeLayout.setLayoutParams(layoutParams);
    }

    @NotNull
    public final u4.e m() {
        u4.e eVar = this.f148164a;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.G.S("userPreferences");
        throw null;
    }

    public final void o(@NotNull u4.e eVar) {
        kotlin.jvm.internal.G.p(eVar, "<set-?>");
        this.f148164a = eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Toast.makeText(getContext(), p.s.f145991rc, 1).show();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        kotlin.jvm.internal.G.p(view, "view");
        com.cookiegames.smartcookie.di.K.c(this).c(this);
        super.onViewCreated(view, bundle);
        int iV = m().Q0() ? 0 : m().v() * 10;
        int iV2 = m().Q0() ? m().v() * 10 : 0;
        if (!m().Q0()) {
            ((Space) view.findViewById(p.j.f144938va)).setVisibility(8);
        }
        final RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(p.j.f144280C3);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        kotlin.jvm.internal.G.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        final LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, iV, 0, iV2);
        relativeLayout.setLayoutParams(layoutParams2);
        ((Slider) view.findViewById(p.j.f144552V9)).addOnChangeListener(new Slider.OnChangeListener() { // from class: com.cookiegames.smartcookie.settings.fragment.i0
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.slider.Slider.OnChangeListener, com.google.android.material.slider.BaseOnChangeListener
            public final void onValueChange(Slider slider, float f10, boolean z10) {
                C3175j0.n(this.f148154a, layoutParams2, relativeLayout, slider, f10, z10);
            }
        });
    }
}
