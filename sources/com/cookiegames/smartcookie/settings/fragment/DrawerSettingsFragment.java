package com.cookiegames.smartcookie.settings.fragment;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import c4.C2902i;
import com.cookiegames.smartcookie.browser.DrawerLineChoice;
import com.cookiegames.smartcookie.browser.DrawerSizeChoice;
import com.cookiegames.smartcookie.p;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.V({"SMAP\nDrawerSettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawerSettingsFragment.kt\ncom/cookiegames/smartcookie/settings/fragment/DrawerSettingsFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,111:1\n11065#2:112\n11400#2,3:113\n11065#2:116\n11400#2,3:117\n*S KotlinDebug\n*F\n+ 1 DrawerSettingsFragment.kt\ncom/cookiegames/smartcookie/settings/fragment/DrawerSettingsFragment\n*L\n64#1:112\n64#1:113,3\n86#1:116\n86#1:117,3\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class DrawerSettingsFragment extends AbstractC3170i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f147869q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f147870r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f147871s = "cb_drawertabs";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f147872t = "cb_swapdrawers";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f147873u = "drawer_lines";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f147874v = "drawer_size";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f147875w = "stack_from_bottom";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Inject
    public u4.e f147876p;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f147877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f147878b;

        static {
            int[] iArr = new int[DrawerSizeChoice.values().length];
            try {
                iArr[DrawerSizeChoice.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DrawerSizeChoice.ONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DrawerSizeChoice.TWO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DrawerSizeChoice.THREE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f147877a = iArr;
            int[] iArr2 = new int[DrawerLineChoice.values().length];
            try {
                iArr2[DrawerLineChoice.ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DrawerLineChoice.TWO.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DrawerLineChoice.THREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f147878b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.settings.fragment.DrawerSettingsFragment$onCreate$4, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements InterfaceC4376a<kotlin.L0> {
        public AnonymousClass4(Object obj) {
            super(0, obj, DrawerSettingsFragment.class, "showDrawerLines", "showDrawerLines()V", 0);
        }

        public final void V() {
            ((DrawerSettingsFragment) this.receiver).p0();
        }

        @Override // ed.InterfaceC4376a
        public /* bridge */ /* synthetic */ kotlin.L0 invoke() {
            V();
            return kotlin.L0.f217464a;
        }
    }

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.settings.fragment.DrawerSettingsFragment$onCreate$5, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements InterfaceC4376a<kotlin.L0> {
        public AnonymousClass5(Object obj) {
            super(0, obj, DrawerSettingsFragment.class, "showDrawerSize", "showDrawerSize()V", 0);
        }

        public final void V() {
            ((DrawerSettingsFragment) this.receiver).t0();
        }

        @Override // ed.InterfaceC4376a
        public /* bridge */ /* synthetic */ kotlin.L0 invoke() {
            V();
            return kotlin.L0.f217464a;
        }
    }

    public static final kotlin.L0 k0(DrawerSettingsFragment drawerSettingsFragment, boolean z10) {
        drawerSettingsFragment.j0().T2(z10);
        return kotlin.L0.f217464a;
    }

    public static final kotlin.L0 l0(DrawerSettingsFragment drawerSettingsFragment, boolean z10) {
        drawerSettingsFragment.j0().X2(z10);
        Toast.makeText(drawerSettingsFragment.getActivity(), p.s.f145991rc, 1).show();
        return kotlin.L0.f217464a;
    }

    public static final kotlin.L0 n0(DrawerSettingsFragment drawerSettingsFragment, boolean z10) {
        drawerSettingsFragment.j0().o1(z10);
        return kotlin.L0.f217464a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        C2902i.f126148a.n(getActivity(), new ed.p() { // from class: com.cookiegames.smartcookie.settings.fragment.r0
            @Override // ed.p
            public final Object invoke(Object obj, Object obj2) {
                return DrawerSettingsFragment.q0(this.f148212a, (MaterialAlertDialogBuilder) obj, (Activity) obj2);
            }
        });
    }

    public static final kotlin.L0 q0(final DrawerSettingsFragment drawerSettingsFragment, MaterialAlertDialogBuilder showCustomDialog, Activity it) {
        String str;
        kotlin.jvm.internal.G.p(showCustomDialog, "$this$showCustomDialog");
        kotlin.jvm.internal.G.p(it, "it");
        showCustomDialog.setTitle(p.s.f145938o4);
        String[] stringArray = drawerSettingsFragment.getResources().getStringArray(p.c.f141473e);
        kotlin.jvm.internal.G.o(stringArray, "getStringArray(...)");
        DrawerLineChoice[] drawerLineChoiceArrValues = DrawerLineChoice.values();
        ArrayList arrayList = new ArrayList(drawerLineChoiceArrValues.length);
        for (DrawerLineChoice drawerLineChoice : drawerLineChoiceArrValues) {
            int i10 = b.f147878b[drawerLineChoice.ordinal()];
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
            arrayList.add(new Pair(drawerLineChoice, str));
        }
        d4.c.c(showCustomDialog, arrayList, drawerSettingsFragment.j0().u(), new ed.l() { // from class: com.cookiegames.smartcookie.settings.fragment.s0
            @Override // ed.l
            public final Object invoke(Object obj) {
                return DrawerSettingsFragment.r0(this.f148222a, (DrawerLineChoice) obj);
            }
        });
        showCustomDialog.setPositiveButton(p.s.f145769d0, new DialogInterface.OnClickListener() { // from class: com.cookiegames.smartcookie.settings.fragment.t0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                DrawerSettingsFragment.s0(this.f148229a, dialogInterface, i11);
            }
        });
        return kotlin.L0.f217464a;
    }

    public static final kotlin.L0 r0(DrawerSettingsFragment drawerSettingsFragment, DrawerLineChoice it) {
        kotlin.jvm.internal.G.p(it, "it");
        drawerSettingsFragment.j0().C1(it);
        return kotlin.L0.f217464a;
    }

    public static final void s0(DrawerSettingsFragment drawerSettingsFragment, DialogInterface dialogInterface, int i10) {
        Toast.makeText(drawerSettingsFragment.getActivity(), p.s.f145991rc, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0() {
        C2902i.f126148a.n(getActivity(), new ed.p() { // from class: com.cookiegames.smartcookie.settings.fragment.o0
            @Override // ed.p
            public final Object invoke(Object obj, Object obj2) {
                return DrawerSettingsFragment.u0(this.f148198a, (MaterialAlertDialogBuilder) obj, (Activity) obj2);
            }
        });
    }

    public static final kotlin.L0 u0(final DrawerSettingsFragment drawerSettingsFragment, MaterialAlertDialogBuilder showCustomDialog, Activity it) {
        String str;
        kotlin.jvm.internal.G.p(showCustomDialog, "$this$showCustomDialog");
        kotlin.jvm.internal.G.p(it, "it");
        showCustomDialog.setTitle(p.s.f146073x4);
        String[] stringArray = drawerSettingsFragment.getResources().getStringArray(p.c.f141474f);
        kotlin.jvm.internal.G.o(stringArray, "getStringArray(...)");
        DrawerSizeChoice[] drawerSizeChoiceArrValues = DrawerSizeChoice.values();
        ArrayList arrayList = new ArrayList(drawerSizeChoiceArrValues.length);
        for (DrawerSizeChoice drawerSizeChoice : drawerSizeChoiceArrValues) {
            int i10 = b.f147877a[drawerSizeChoice.ordinal()];
            if (i10 == 1) {
                str = stringArray[0];
            } else if (i10 == 2) {
                str = stringArray[1];
            } else if (i10 == 3) {
                str = stringArray[2];
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str = stringArray[3];
            }
            arrayList.add(new Pair(drawerSizeChoice, str));
        }
        d4.c.c(showCustomDialog, arrayList, drawerSettingsFragment.j0().w(), new ed.l() { // from class: com.cookiegames.smartcookie.settings.fragment.p0
            @Override // ed.l
            public final Object invoke(Object obj) {
                return DrawerSettingsFragment.v0(this.f148203a, (DrawerSizeChoice) obj);
            }
        });
        showCustomDialog.setPositiveButton(p.s.f145769d0, new DialogInterface.OnClickListener() { // from class: com.cookiegames.smartcookie.settings.fragment.q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                DrawerSettingsFragment.w0(this.f148207a, dialogInterface, i11);
            }
        });
        return kotlin.L0.f217464a;
    }

    public static final kotlin.L0 v0(DrawerSettingsFragment drawerSettingsFragment, DrawerSizeChoice it) {
        kotlin.jvm.internal.G.p(it, "it");
        drawerSettingsFragment.j0().E1(it);
        return kotlin.L0.f217464a;
    }

    public static final void w0(DrawerSettingsFragment drawerSettingsFragment, DialogInterface dialogInterface, int i10) {
        Toast.makeText(drawerSettingsFragment.getActivity(), p.s.f145991rc, 1).show();
    }

    @NotNull
    public final u4.e j0() {
        u4.e eVar = this.f147876p;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.G.S("userPreferences");
        throw null;
    }

    public final void o0(@NotNull u4.e eVar) {
        kotlin.jvm.internal.G.p(eVar, "<set-?>");
        this.f147876p = eVar;
    }

    @Override // com.cookiegames.smartcookie.settings.fragment.AbstractC3170i, androidx.preference.n, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.cookiegames.smartcookie.di.K.c(this).p(this);
        AbstractC3170i.S(this, "cb_drawertabs", j0().M0(), false, null, new ed.l() { // from class: com.cookiegames.smartcookie.settings.fragment.l0
            @Override // ed.l
            public final Object invoke(Object obj) {
                return DrawerSettingsFragment.k0(this.f148178a, ((Boolean) obj).booleanValue());
            }
        }, 12, null);
        AbstractC3170i.S(this, f147875w, j0().Q0(), false, null, new ed.l() { // from class: com.cookiegames.smartcookie.settings.fragment.m0
            @Override // ed.l
            public final Object invoke(Object obj) {
                return DrawerSettingsFragment.l0(this.f148184a, ((Boolean) obj).booleanValue());
            }
        }, 12, null);
        AbstractC3170i.S(this, "cb_swapdrawers", j0().g(), false, null, new ed.l() { // from class: com.cookiegames.smartcookie.settings.fragment.n0
            @Override // ed.l
            public final Object invoke(Object obj) {
                return DrawerSettingsFragment.n0(this.f148193a, ((Boolean) obj).booleanValue());
            }
        }, 12, null);
        AbstractC3170i.P(this, "drawer_lines", false, null, new AnonymousClass4(this), 6, null);
        AbstractC3170i.P(this, "drawer_size", false, null, new AnonymousClass5(this), 6, null);
    }

    @Override // androidx.preference.n
    public void u(@Nullable Bundle bundle, @Nullable String str) {
        l(p.v.f147669i);
    }
}
