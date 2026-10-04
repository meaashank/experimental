package com.prism.hider.vault.calculator;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Objects;
import rb.C5548b;

/* JADX INFO: renamed from: com.prism.hider.vault.calculator.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4260l extends Fragment implements com.prism.hider.vault.commons.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4261m f168556a = new C4261m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.prism.hider.vault.commons.o f168557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f168558c;

    public final void A(View view, int i10, int i11, int i12, C4262n c4262n, float f10, final Runnable runnable, final boolean z10) {
        Button button = (Button) view.findViewById(i10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i11);
        gradientDrawable.setCornerRadius(c4262n.f168577n * f10);
        if (c4262n.f168578o != 0) {
            gradientDrawable.setStroke(Math.max(1, (int) (c4262n.f168579p * f10)), c4262n.f168578o);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadius(c4262n.f168577n * f10);
        button.setBackground(new RippleDrawable(ColorStateList.valueOf((16777215 & i12) | 1291845632), gradientDrawable, gradientDrawable2));
        button.setTextColor(i12);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.prism.hider.vault.calculator.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f168544a.x(runnable, z10, view2);
            }
        });
    }

    @Override // com.prism.hider.vault.commons.F
    public void g() {
        this.f168556a.a();
        z(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (!(context instanceof com.prism.hider.vault.commons.o)) {
            throw new IllegalStateException("Host activity must implement VaultCodeHost");
        }
        this.f168557b = (com.prism.hider.vault.commons.o) context;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(C5548b.k.f235671X, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f168557b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        C4262n c4262nY = y();
        float f10 = getResources().getDisplayMetrics().density;
        View viewFindViewById = view.findViewById(C5548b.h.f235300a1);
        if (c4262nY.f168565b != null) {
            viewFindViewById.setBackground(new GradientDrawable(GradientDrawable.Orientation.TL_BR, c4262nY.f168565b));
        } else {
            viewFindViewById.setBackgroundColor(c4262nY.f168564a);
        }
        int[] iArr = c4262nY.f168565b;
        O.d(getActivity(), iArr != null ? iArr[0] : c4262nY.f168564a, iArr != null ? iArr[iArr.length - 1] : c4262nY.f168564a);
        O.g(viewFindViewById, 520);
        TextView textView = (TextView) view.findViewById(C5548b.h.f235245U0);
        this.f168558c = textView;
        textView.setTextColor(c4262nY.f168566c);
        if (c4262nY.f168567d != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(c4262nY.f168567d);
            gradientDrawable.setCornerRadius(c4262nY.f168568e * f10);
            this.f168558c.setBackground(gradientDrawable);
        }
        for (final int i10 = 0; i10 <= 9; i10++) {
            A(view, r(i10), c4262nY.f168569f, c4262nY.f168570g, c4262nY, f10, new Runnable() { // from class: com.prism.hider.vault.calculator.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f168542a.s(i10);
                }
            }, true);
        }
        int i11 = C5548b.h.f235263W0;
        int i12 = c4262nY.f168569f;
        int i13 = c4262nY.f168570g;
        final C4261m c4261m = this.f168556a;
        Objects.requireNonNull(c4261m);
        A(view, i11, i12, i13, c4262nY, f10, new Runnable() { // from class: com.prism.hider.vault.calculator.c
            @Override // java.lang.Runnable
            public final void run() {
                c4261m.e();
            }
        }, true);
        int i14 = C5548b.h.f235137I0;
        int i15 = c4262nY.f168571h;
        int i16 = c4262nY.f168572i;
        final C4261m c4261m2 = this.f168556a;
        Objects.requireNonNull(c4261m2);
        A(view, i14, i15, i16, c4262nY, f10, new Runnable() { // from class: com.prism.hider.vault.calculator.d
            @Override // java.lang.Runnable
            public final void run() {
                c4261m2.a();
            }
        }, false);
        int i17 = C5548b.h.f235310b1;
        int i18 = c4262nY.f168571h;
        int i19 = c4262nY.f168572i;
        final C4261m c4261m3 = this.f168556a;
        Objects.requireNonNull(c4261m3);
        A(view, i17, i18, i19, c4262nY, f10, new Runnable() { // from class: com.prism.hider.vault.calculator.e
            @Override // java.lang.Runnable
            public final void run() {
                c4261m3.k();
            }
        }, false);
        int i20 = C5548b.h.f235290Z0;
        int i21 = c4262nY.f168571h;
        int i22 = c4262nY.f168572i;
        final C4261m c4261m4 = this.f168556a;
        Objects.requireNonNull(c4261m4);
        A(view, i20, i21, i22, c4262nY, f10, new Runnable() { // from class: com.prism.hider.vault.calculator.f
            @Override // java.lang.Runnable
            public final void run() {
                c4261m4.j();
            }
        }, false);
        A(view, C5548b.h.f235254V0, c4262nY.f168573j, c4262nY.f168574k, c4262nY, f10, new Runnable() { // from class: com.prism.hider.vault.calculator.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f168551a.t();
            }
        }, false);
        A(view, C5548b.h.f235281Y0, c4262nY.f168573j, c4262nY.f168574k, c4262nY, f10, new Runnable() { // from class: com.prism.hider.vault.calculator.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f168552a.u();
            }
        }, false);
        A(view, C5548b.h.f235320c1, c4262nY.f168573j, c4262nY.f168574k, c4262nY, f10, new Runnable() { // from class: com.prism.hider.vault.calculator.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f168553a.v();
            }
        }, false);
        A(view, C5548b.h.f235146J0, c4262nY.f168573j, c4262nY.f168574k, c4262nY, f10, new Runnable() { // from class: com.prism.hider.vault.calculator.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f168554a.w();
            }
        }, false);
        int i23 = C5548b.h.f235272X0;
        int i24 = c4262nY.f168575l;
        int i25 = c4262nY.f168576m;
        final C4261m c4261m5 = this.f168556a;
        Objects.requireNonNull(c4261m5);
        A(view, i23, i24, i25, c4262nY, f10, new Runnable() { // from class: com.prism.hider.vault.calculator.k
            @Override // java.lang.Runnable
            public final void run() {
                c4261m5.c();
            }
        }, false);
        z(false);
    }

    public final int r(int i10) {
        switch (i10) {
            case 0:
                return C5548b.h.f235155K0;
            case 1:
                return C5548b.h.f235164L0;
            case 2:
                return C5548b.h.f235173M0;
            case 3:
                return C5548b.h.f235182N0;
            case 4:
                return C5548b.h.f235191O0;
            case 5:
                return C5548b.h.f235200P0;
            case 6:
                return C5548b.h.f235209Q0;
            case 7:
                return C5548b.h.f235218R0;
            case 8:
                return C5548b.h.f235227S0;
            default:
                return C5548b.h.f235236T0;
        }
    }

    public final /* synthetic */ void s(int i10) {
        this.f168556a.f(i10);
    }

    public final /* synthetic */ void t() {
        this.f168556a.g(RemoteSettings.FORWARD_SLASH_STRING);
    }

    public final /* synthetic */ void u() {
        this.f168556a.g("*");
    }

    public final /* synthetic */ void v() {
        this.f168556a.g(com.prism.gaia.download.a.f164606q);
    }

    public final /* synthetic */ void w() {
        this.f168556a.g("+");
    }

    public final /* synthetic */ void x(Runnable runnable, boolean z10, View view) {
        runnable.run();
        z(z10);
    }

    public abstract C4262n y();

    public final void z(boolean z10) {
        com.prism.hider.vault.commons.o oVar;
        String strD = this.f168556a.d();
        this.f168558c.setText(strD);
        if (!z10 || (oVar = this.f168557b) == null) {
            return;
        }
        oVar.v0(strD);
    }
}
