package com.cookiegames.smartcookie.settings.fragment;

import Z3.f;
import android.R;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import com.cookiegames.smartcookie.p;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import ed.InterfaceC4376a;
import io.reactivex.internal.functions.Functions;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import nc.InterfaceC5271g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class ExtensionsSettingsFragment extends AbstractC3170i {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final a f147916u = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f147917v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f147918w = "remove_userscript";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Inject
    public u4.e f147919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Inject
    public Z3.h f147920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Inject
    public hc.H f147921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Inject
    public hc.H f147922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String[] f147923t;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.settings.fragment.ExtensionsSettingsFragment$onCreate$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements InterfaceC4376a<kotlin.L0> {
        public AnonymousClass1(Object obj) {
            super(0, obj, ExtensionsSettingsFragment.class, "uninstallUserScript", "uninstallUserScript()V", 0);
        }

        public final void V() {
            ((ExtensionsSettingsFragment) this.receiver).k0();
        }

        @Override // ed.InterfaceC4376a
        public /* bridge */ /* synthetic */ kotlin.L0 invoke() {
            V();
            return kotlin.L0.f217464a;
        }
    }

    public static void X(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.L0 l0(Ref.ObjectRef objectRef, List list) {
        kotlin.jvm.internal.G.m(list);
        objectRef.f217904a = list;
        return kotlin.L0.f217464a;
    }

    public static final void n0(ed.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void o0(ExtensionsSettingsFragment extensionsSettingsFragment, Ref.ObjectRef objectRef, DialogInterface dialogInterface, int i10) {
        extensionsSettingsFragment.c0().b(((f.b) ((List) objectRef.f217904a).get(i10)).f79426a).G0(extensionsSettingsFragment.b0()).k0(extensionsSettingsFragment.d0()).C0();
    }

    public static final void p0(DialogInterface dialog, int i10) {
        kotlin.jvm.internal.G.p(dialog, "dialog");
        dialog.dismiss();
    }

    @NotNull
    public final hc.H b0() {
        hc.H h10 = this.f147921r;
        if (h10 != null) {
            return h10;
        }
        kotlin.jvm.internal.G.S("databaseScheduler");
        throw null;
    }

    @NotNull
    public final Z3.h c0() {
        Z3.h hVar = this.f147920q;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.G.S("javascriptRepository");
        throw null;
    }

    @NotNull
    public final hc.H d0() {
        hc.H h10 = this.f147922s;
        if (h10 != null) {
            return h10;
        }
        kotlin.jvm.internal.G.S("mainScheduler");
        throw null;
    }

    @NotNull
    public final u4.e e0() {
        u4.e eVar = this.f147919p;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.G.S("userPreferences");
        throw null;
    }

    public final void g0(@NotNull hc.H h10) {
        kotlin.jvm.internal.G.p(h10, "<set-?>");
        this.f147921r = h10;
    }

    public final void h0(@NotNull Z3.h hVar) {
        kotlin.jvm.internal.G.p(hVar, "<set-?>");
        this.f147920q = hVar;
    }

    public final void i0(@NotNull hc.H h10) {
        kotlin.jvm.internal.G.p(h10, "<set-?>");
        this.f147922s = h10;
    }

    public final void j0(@NotNull u4.e eVar) {
        kotlin.jvm.internal.G.p(eVar, "<set-?>");
        this.f147919p = eVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, kotlin.collections.EmptyList] */
    public final void k0() {
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(requireContext());
        materialAlertDialogBuilder.setTitle((CharSequence) (getResources().getString(p.s.f145490K) + com.prism.gaia.server.accounts.b.f166434b0));
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.select_dialog_singlechoice);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f217904a = EmptyList.f217510a;
        hc.I<List<f.b>> iK = c0().k();
        final ed.l lVar = new ed.l() { // from class: com.cookiegames.smartcookie.settings.fragment.W0
            @Override // ed.l
            public final Object invoke(Object obj) {
                return ExtensionsSettingsFragment.l0(objectRef, (List) obj);
            }
        };
        iK.X0(new InterfaceC5271g() { // from class: com.cookiegames.smartcookie.settings.fragment.X0
            @Override // nc.InterfaceC5271g
            public final void accept(Object obj) {
                lVar.invoke(obj);
            }
        }, Functions.f202952f);
        Iterator it = ((List) objectRef.f217904a).iterator();
        while (it.hasNext()) {
            arrayAdapter.add(kotlin.text.F.B2(new Regex("\\s").p(((f.b) it.next()).f79426a, ""), "\\n", "", false, 4, null));
        }
        materialAlertDialogBuilder.setAdapter((ListAdapter) arrayAdapter, new DialogInterface.OnClickListener() { // from class: com.cookiegames.smartcookie.settings.fragment.Y0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ExtensionsSettingsFragment.o0(this.f148109a, objectRef, dialogInterface, i10);
            }
        });
        materialAlertDialogBuilder.setPositiveButton((CharSequence) getResources().getString(p.s.f145460I), (DialogInterface.OnClickListener) new Z0());
        materialAlertDialogBuilder.show();
    }

    @Override // com.cookiegames.smartcookie.settings.fragment.AbstractC3170i, androidx.preference.n, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.cookiegames.smartcookie.di.K.c(this).a(this);
        AbstractC3170i.P(this, f147918w, false, null, new AnonymousClass1(this), 6, null);
    }

    @Override // androidx.preference.n
    public void u(@Nullable Bundle bundle, @Nullable String str) {
        l(p.v.f147670j);
    }
}
