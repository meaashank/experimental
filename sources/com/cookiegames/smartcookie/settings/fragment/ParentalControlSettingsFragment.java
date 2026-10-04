package com.cookiegames.smartcookie.settings.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import c4.C2902i;
import com.cookiegames.smartcookie.browser.PasswordChoice;
import com.cookiegames.smartcookie.browser.SiteBlockChoice;
import com.cookiegames.smartcookie.p;
import com.cookiegames.smartcookie.settings.activity.SettingsActivity;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.V({"SMAP\nParentalControlSettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParentalControlSettingsFragment.kt\ncom/cookiegames/smartcookie/settings/fragment/ParentalControlSettingsFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,243:1\n11065#2:244\n11400#2,3:245\n11065#2:248\n11400#2,3:249\n*S KotlinDebug\n*F\n+ 1 ParentalControlSettingsFragment.kt\ncom/cookiegames/smartcookie/settings/fragment/ParentalControlSettingsFragment\n*L\n117#1:244\n117#1:245,3\n179#1:248\n179#1:249,3\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class ParentalControlSettingsFragment extends AbstractC3170i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final a f148023r = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f148024s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f148025t = "siteblock";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f148026u = "password";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Inject
    public u4.e f148027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String[] f148028q;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f148030b;

        static {
            int[] iArr = new int[SiteBlockChoice.values().length];
            try {
                iArr[SiteBlockChoice.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SiteBlockChoice.WHITELIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SiteBlockChoice.BLACKLIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f148029a = iArr;
            int[] iArr2 = new int[PasswordChoice.values().length];
            try {
                iArr2[PasswordChoice.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PasswordChoice.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f148030b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.settings.fragment.ParentalControlSettingsFragment$onCreate$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ed.l<C2, kotlin.L0> {
        public AnonymousClass1(Object obj) {
            super(1, obj, ParentalControlSettingsFragment.class, "showSiteBlockPicker", "showSiteBlockPicker(Lcom/cookiegames/smartcookie/settings/fragment/SummaryUpdater;)V", 0);
        }

        public final void e(C2 p02) {
            kotlin.jvm.internal.G.p(p02, "p0");
            ((ParentalControlSettingsFragment) this.receiver).z0(p02);
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2 c22) {
            e(c22);
            return kotlin.L0.f217464a;
        }
    }

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.settings.fragment.ParentalControlSettingsFragment$onCreate$2, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements ed.l<C2, kotlin.L0> {
        public AnonymousClass2(Object obj) {
            super(1, obj, ParentalControlSettingsFragment.class, "showPasswordPicker", "showPasswordPicker(Lcom/cookiegames/smartcookie/settings/fragment/SummaryUpdater;)V", 0);
        }

        public final void e(C2 p02) {
            kotlin.jvm.internal.G.p(p02, "p0");
            ((ParentalControlSettingsFragment) this.receiver).t0(p02);
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2 c22) {
            e(c22);
            return kotlin.L0.f217464a;
        }
    }

    public static final kotlin.L0 A0(final ParentalControlSettingsFragment parentalControlSettingsFragment, final C2 c22, MaterialAlertDialogBuilder showCustomDialog, Activity it) {
        String str;
        kotlin.jvm.internal.G.p(showCustomDialog, "$this$showCustomDialog");
        kotlin.jvm.internal.G.p(it, "it");
        showCustomDialog.setTitle(p.s.f145770d1);
        String[] stringArray = parentalControlSettingsFragment.getResources().getStringArray(p.c.f141471c);
        kotlin.jvm.internal.G.o(stringArray, "getStringArray(...)");
        SiteBlockChoice[] siteBlockChoiceArrValues = SiteBlockChoice.values();
        ArrayList arrayList = new ArrayList(siteBlockChoiceArrValues.length);
        for (SiteBlockChoice siteBlockChoice : siteBlockChoiceArrValues) {
            int i10 = b.f148029a[siteBlockChoice.ordinal()];
            if (i10 == 1) {
                str = stringArray[0];
            } else if (i10 == 2) {
                str = stringArray[1];
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = stringArray[2];
            }
            arrayList.add(new Pair(siteBlockChoice, str));
        }
        d4.c.c(showCustomDialog, arrayList, parentalControlSettingsFragment.k0().N0(), new ed.l() { // from class: com.cookiegames.smartcookie.settings.fragment.S1
            @Override // ed.l
            public final Object invoke(Object obj) {
                return ParentalControlSettingsFragment.B0(this.f148068a, c22, (SiteBlockChoice) obj);
            }
        });
        showCustomDialog.setPositiveButton(p.s.f145769d0, (DialogInterface.OnClickListener) null);
        return kotlin.L0.f217464a;
    }

    public static final kotlin.L0 B0(ParentalControlSettingsFragment parentalControlSettingsFragment, C2 c22, SiteBlockChoice it) {
        kotlin.jvm.internal.G.p(it, "it");
        androidx.fragment.app.r activity = parentalControlSettingsFragment.getActivity();
        kotlin.jvm.internal.G.n(activity, "null cannot be cast to non-null type android.app.Activity");
        parentalControlSettingsFragment.F0(it, activity, c22);
        return kotlin.L0.f217464a;
    }

    public static final void n0(ParentalControlSettingsFragment parentalControlSettingsFragment, DialogInterface dialogInterface, int i10) {
        Intent intent = new Intent(parentalControlSettingsFragment.getActivity(), (Class<?>) SettingsActivity.class);
        intent.setFlags(67108864);
        parentalControlSettingsFragment.startActivity(intent);
    }

    public static final void o0(EditText editText, ParentalControlSettingsFragment parentalControlSettingsFragment, DialogInterface dialogInterface, int i10) {
        if (kotlin.jvm.internal.G.g(editText.getText().toString(), parentalControlSettingsFragment.k0().t0())) {
            return;
        }
        Toast.makeText(parentalControlSettingsFragment.getActivity(), parentalControlSettingsFragment.getResources().getString(p.s.Bi), 0).show();
        parentalControlSettingsFragment.l0();
    }

    public static final kotlin.L0 r0(View view, final TextView textView, final ParentalControlSettingsFragment parentalControlSettingsFragment, final SiteBlockChoice siteBlockChoice, final C2 c22, MaterialAlertDialogBuilder showCustomDialog, Activity it) {
        kotlin.jvm.internal.G.p(showCustomDialog, "$this$showCustomDialog");
        kotlin.jvm.internal.G.p(it, "it");
        showCustomDialog.setTitle(p.s.f145755c1);
        showCustomDialog.setView(view);
        showCustomDialog.setPositiveButton(p.s.f145769d0, new DialogInterface.OnClickListener() { // from class: com.cookiegames.smartcookie.settings.fragment.T1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ParentalControlSettingsFragment.s0(textView, parentalControlSettingsFragment, siteBlockChoice, c22, dialogInterface, i10);
            }
        });
        return kotlin.L0.f217464a;
    }

    public static final void s0(TextView textView, ParentalControlSettingsFragment parentalControlSettingsFragment, SiteBlockChoice siteBlockChoice, C2 c22, DialogInterface dialogInterface, int i10) {
        parentalControlSettingsFragment.k0().V2(textView.getText().toString());
        if (kotlin.jvm.internal.G.g(siteBlockChoice.toString(), "BLACKLIST")) {
            c22.a(parentalControlSettingsFragment.getText(p.s.f145562Ob).toString());
        } else {
            c22.a(parentalControlSettingsFragment.getText(p.s.f145668W0).toString());
        }
    }

    public static final kotlin.L0 u0(final ParentalControlSettingsFragment parentalControlSettingsFragment, final C2 c22, MaterialAlertDialogBuilder showCustomDialog, Activity it) {
        String string;
        kotlin.jvm.internal.G.p(showCustomDialog, "$this$showCustomDialog");
        kotlin.jvm.internal.G.p(it, "it");
        showCustomDialog.setTitle(p.s.f145510L4);
        String[] stringArray = parentalControlSettingsFragment.getResources().getStringArray(p.c.f141484p);
        kotlin.jvm.internal.G.o(stringArray, "getStringArray(...)");
        PasswordChoice[] passwordChoiceArrValues = PasswordChoice.values();
        ArrayList arrayList = new ArrayList(passwordChoiceArrValues.length);
        for (PasswordChoice passwordChoice : passwordChoiceArrValues) {
            int i10 = b.f148030b[passwordChoice.ordinal()];
            if (i10 == 1) {
                string = stringArray[0];
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                string = parentalControlSettingsFragment.getResources().getString(p.s.f145510L4);
            }
            arrayList.add(new Pair(passwordChoice, string));
        }
        d4.c.c(showCustomDialog, arrayList, parentalControlSettingsFragment.k0().r0(), new ed.l() { // from class: com.cookiegames.smartcookie.settings.fragment.W1
            @Override // ed.l
            public final Object invoke(Object obj) {
                return ParentalControlSettingsFragment.v0(this.f148103a, c22, (PasswordChoice) obj);
            }
        });
        showCustomDialog.setPositiveButton(p.s.f145769d0, (DialogInterface.OnClickListener) null);
        return kotlin.L0.f217464a;
    }

    public static final kotlin.L0 v0(ParentalControlSettingsFragment parentalControlSettingsFragment, C2 c22, PasswordChoice it) {
        kotlin.jvm.internal.G.p(it, "it");
        androidx.fragment.app.r activity = parentalControlSettingsFragment.getActivity();
        kotlin.jvm.internal.G.n(activity, "null cannot be cast to non-null type android.app.Activity");
        parentalControlSettingsFragment.E0(it, activity, c22);
        return kotlin.L0.f217464a;
    }

    public static final kotlin.L0 x0(View view, final TextView textView, final ParentalControlSettingsFragment parentalControlSettingsFragment, MaterialAlertDialogBuilder showCustomDialog, Activity it) {
        kotlin.jvm.internal.G.p(showCustomDialog, "$this$showCustomDialog");
        kotlin.jvm.internal.G.p(it, "it");
        showCustomDialog.setTitle(p.s.f145510L4);
        showCustomDialog.setView(view);
        showCustomDialog.setPositiveButton(p.s.f145769d0, new DialogInterface.OnClickListener() { // from class: com.cookiegames.smartcookie.settings.fragment.Q1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ParentalControlSettingsFragment.y0(textView, parentalControlSettingsFragment, dialogInterface, i10);
            }
        });
        return kotlin.L0.f217464a;
    }

    public static final void y0(TextView textView, ParentalControlSettingsFragment parentalControlSettingsFragment, DialogInterface dialogInterface, int i10) {
        parentalControlSettingsFragment.k0().A2(textView.getText().toString());
    }

    public final String C0(PasswordChoice passwordChoice) {
        String[] stringArray = getResources().getStringArray(p.c.f141484p);
        kotlin.jvm.internal.G.o(stringArray, "getStringArray(...)");
        int i10 = b.f148030b[passwordChoice.ordinal()];
        if (i10 == 1) {
            String str = stringArray[0];
            kotlin.jvm.internal.G.o(str, "get(...)");
            return str;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = stringArray[1];
        kotlin.jvm.internal.G.o(str2, "get(...)");
        return str2;
    }

    public final String D0(SiteBlockChoice siteBlockChoice) {
        String[] stringArray = getResources().getStringArray(p.c.f141471c);
        kotlin.jvm.internal.G.o(stringArray, "getStringArray(...)");
        int i10 = b.f148029a[siteBlockChoice.ordinal()];
        if (i10 == 1) {
            String str = stringArray[0];
            kotlin.jvm.internal.G.o(str, "get(...)");
            return str;
        }
        if (i10 == 2) {
            return k0().O0();
        }
        if (i10 == 3) {
            return k0().O0();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void E0(PasswordChoice passwordChoice, Activity activity, C2 c22) {
        if (passwordChoice == PasswordChoice.CUSTOM) {
            w0(activity, c22);
            SharedPreferences sharedPreferences = activity.getSharedPreferences(com.cookiegames.smartcookie.k.f141363b, 0);
            kotlin.jvm.internal.G.o(sharedPreferences, "getSharedPreferences(...)");
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            kotlin.jvm.internal.G.o(editorEdit, "edit(...)");
            editorEdit.putBoolean("noPassword", false);
            editorEdit.apply();
        } else {
            SharedPreferences sharedPreferences2 = activity.getSharedPreferences(com.cookiegames.smartcookie.k.f141363b, 0);
            kotlin.jvm.internal.G.o(sharedPreferences2, "getSharedPreferences(...)");
            SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
            kotlin.jvm.internal.G.o(editorEdit2, "edit(...)");
            editorEdit2.putBoolean("noPassword", true);
            editorEdit2.apply();
            String string = getResources().getString(p.s.f146080xb);
            kotlin.jvm.internal.G.o(string, "getString(...)");
            c22.a(string);
        }
        k0().y2(passwordChoice);
        c22.a(C0(passwordChoice));
    }

    public final void F0(SiteBlockChoice siteBlockChoice, Activity activity, C2 c22) {
        if (siteBlockChoice == SiteBlockChoice.WHITELIST || siteBlockChoice == SiteBlockChoice.BLACKLIST) {
            q0(activity, c22, siteBlockChoice);
        }
        k0().U2(siteBlockChoice);
        c22.a(D0(siteBlockChoice));
    }

    @NotNull
    public final u4.e k0() {
        u4.e eVar = this.f148027p;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.G.S("userPreferences");
        throw null;
    }

    public final void l0() {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(p.m.f145255m0, (ViewGroup) null);
        final EditText editText = (EditText) viewInflate.findViewById(p.j.f144601Z2);
        int i10 = p.s.f145510L4;
        editText.setHint(i10);
        MaterialAlertDialogBuilder positiveButton = new MaterialAlertDialogBuilder(requireContext()).setTitle(i10).setView(viewInflate).setCancelable(false).setNegativeButton(p.s.f145415F, new DialogInterface.OnClickListener() { // from class: com.cookiegames.smartcookie.settings.fragment.U1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                ParentalControlSettingsFragment.n0(this.f148087a, dialogInterface, i11);
            }
        }).setPositiveButton(p.s.f145769d0, new DialogInterface.OnClickListener() { // from class: com.cookiegames.smartcookie.settings.fragment.V1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                ParentalControlSettingsFragment.o0(editText, this, dialogInterface, i11);
            }
        });
        kotlin.jvm.internal.G.o(positiveButton, "setPositiveButton(...)");
        AlertDialog alertDialogShow = positiveButton.show();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.G.o(contextRequireContext, "requireContext(...)");
        kotlin.jvm.internal.G.m(alertDialogShow);
        C2902i.i(contextRequireContext, alertDialogShow);
    }

    @Override // com.cookiegames.smartcookie.settings.fragment.AbstractC3170i, androidx.preference.n, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.cookiegames.smartcookie.di.K.c(this).A(this);
        String[] stringArray = getResources().getStringArray(p.c.f141471c);
        kotlin.jvm.internal.G.o(stringArray, "getStringArray(...)");
        this.f148028q = stringArray;
        AbstractC3170i.M(this, f148025t, false, k0().N0() == SiteBlockChoice.BLACKLIST ? getText(p.s.f145562Ob).toString() : k0().N0() == SiteBlockChoice.NONE ? getText(p.s.f146080xb).toString() : getText(p.s.f145668W0).toString(), new AnonymousClass1(this), 2, null);
        AbstractC3170i.M(this, "password", false, C0(k0().r0()), new AnonymousClass2(this), 2, null);
        androidx.fragment.app.r activity = getActivity();
        SharedPreferences sharedPreferences = activity != null ? activity.getSharedPreferences(com.cookiegames.smartcookie.k.f141363b, 0) : null;
        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("noPassword", true)) : null;
        kotlin.jvm.internal.G.m(boolValueOf);
        if (boolValueOf.booleanValue()) {
            return;
        }
        l0();
    }

    public final void p0(@NotNull u4.e eVar) {
        kotlin.jvm.internal.G.p(eVar, "<set-?>");
        this.f148027p = eVar;
    }

    public final void q0(Activity activity, final C2 c22, final SiteBlockChoice siteBlockChoice) {
        final View viewInflate = activity.getLayoutInflater().inflate(p.m.f145258m3, (ViewGroup) null);
        final TextView textView = (TextView) viewInflate.findViewById(p.j.f144803ma);
        textView.setText(k0().O0());
        C2902i.f126148a.n(activity, new ed.p() { // from class: com.cookiegames.smartcookie.settings.fragment.N1
            @Override // ed.p
            public final Object invoke(Object obj, Object obj2) {
                return ParentalControlSettingsFragment.r0(viewInflate, textView, this, siteBlockChoice, c22, (MaterialAlertDialogBuilder) obj, (Activity) obj2);
            }
        });
    }

    public final void t0(final C2 c22) {
        C2902i.f126148a.n(getActivity(), new ed.p() { // from class: com.cookiegames.smartcookie.settings.fragment.P1
            @Override // ed.p
            public final Object invoke(Object obj, Object obj2) {
                return ParentalControlSettingsFragment.u0(this.f148021a, c22, (MaterialAlertDialogBuilder) obj, (Activity) obj2);
            }
        });
    }

    @Override // androidx.preference.n
    public void u(@Nullable Bundle bundle, @Nullable String str) {
        l(p.v.f147673m);
    }

    public final void w0(Activity activity, C2 c22) {
        final View viewInflate = activity.getLayoutInflater().inflate(p.m.f145133K2, (ViewGroup) null);
        final TextView textView = (TextView) viewInflate.findViewById(p.j.f144876r8);
        textView.setText(k0().t0());
        C2902i.f126148a.n(activity, new ed.p() { // from class: com.cookiegames.smartcookie.settings.fragment.R1
            @Override // ed.p
            public final Object invoke(Object obj, Object obj2) {
                return ParentalControlSettingsFragment.x0(viewInflate, textView, this, (MaterialAlertDialogBuilder) obj, (Activity) obj2);
            }
        });
    }

    public final void z0(final C2 c22) {
        C2902i.f126148a.n(getActivity(), new ed.p() { // from class: com.cookiegames.smartcookie.settings.fragment.O1
            @Override // ed.p
            public final Object invoke(Object obj, Object obj2) {
                return ParentalControlSettingsFragment.A0(this.f148017a, c22, (MaterialAlertDialogBuilder) obj, (Activity) obj2);
            }
        });
    }
}
